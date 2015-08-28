package com.lzg.dao;

import java.util.List;
import java.util.Map;

import com.lzg.entity.User;

public interface IUserDao {
	public List<Map<String, Object>> findAll();

	public void save(User user);

	public void update(User user);

	public void delete(User user);

	public User findUser(User user);
}
