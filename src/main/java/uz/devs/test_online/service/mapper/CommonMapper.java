package uz.devs.test_online.service.mapper;

public interface CommonMapper<D, E>{
    E toEntity(D d);
    D toDto(E e);
}
