package com.circus.jpastudy.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;

    public void save(StoreRegisterDTO storeRegisterDTO) {
        storeRepository.save(Store.builder()
                .storeName(storeRegisterDTO.getStoreName())
                .storePhone(storeRegisterDTO.getStorePhone())
                .bossName(storeRegisterDTO.getBossName())
                .address(storeRegisterDTO.getAddress())
                .number(storeRegisterDTO.getNumber())
                .build());
    }

    @Transactional // sql 쿼리가 일어나야 함을 스프링에게 알려줌
    public void update(Long id, StoreRegisterDTO storeRegisterDTO) {
        Store store = storeRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        store.update(storeRegisterDTO);
    }
}
