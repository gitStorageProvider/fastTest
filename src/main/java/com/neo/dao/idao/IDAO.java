package com.neo.dao.idao;

import com.neo.beans.BaseEntity;

import java.util.List;

public interface IDAO <T extends BaseEntity>{
    List<T> findAll();
    T findById(int id);
    int create(T entity);
    void update(T entity);
    boolean deleteById(int id);
}
