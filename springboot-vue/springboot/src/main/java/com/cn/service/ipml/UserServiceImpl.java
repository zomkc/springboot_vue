package com.cn.service.ipml;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cn.common.Result;
import com.cn.entity.User;
import com.cn.service.UserService;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    @Override
    public int insert(User entity) {
        return 0;
    }

    @Override
    public int deleteById(Serializable id) {
        return 0;
    }

    @Override
    public int deleteByMap(Map<String, Object> columnMap) {
        return 0;
    }

    @Override
    public int delete(Wrapper<User> queryWrapper) {
        return 0;
    }

    @Override
    public int deleteBatchIds(Collection<? extends Serializable> idList) {
        return 0;
    }

    @Override
    public int updateById(User entity) {
        return 0;
    }

    @Override
    public int update(User entity, Wrapper<User> updateWrapper) {
        return 0;
    }

    @Override
    public User selectById(Serializable id) {
        return null;
    }

    @Override
    public List<User> selectBatchIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public List<User> selectByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public User selectOne(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public Integer selectCount(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public List<User> selectList(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public List<Object> selectObjs(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <P extends IPage<User>> P selectPage(P page, Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <P extends IPage<Map<String, Object>>> P selectMapsPage(P page, Wrapper<User> queryWrapper) {
        return null;
    }

}
