package spring.boot.demo.mapper;

import spring.boot.demo.entity.UserInfo;

public interface UserInfoMapper {

    UserInfo selectByPrimaryKey(Integer id);

}