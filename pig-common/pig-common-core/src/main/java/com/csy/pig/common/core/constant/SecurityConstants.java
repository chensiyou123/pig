package com.csy.pig.common.core.constant;

public interface SecurityConstants {
    String ROLE = "ROLE_";//角色前缀
    String PROJECT_PREFIX = "pig_";//前缀
    String OAUTH_PREFIX = "oauth:";// 相关前缀
    String PROJECT_LICENSE = "made by pig";//项目的license
    String FROM_IN = "Y";// 内部
    String FROM = "from";//标志
    String MOBILE_TOKEN_URL = "/mobile/token";//手机号登录URL
    String OAUTH_TOKEN_URL = "/oauth/token";//默认登录URL
    String REFRESH_TOKEN = "refresh_token";// grant_type
    String CLIENT_DETAILS_KEY = PROJECT_PREFIX + OAUTH_PREFIX + "client:details";//客户端信息
    String BCRYPT = "{bcrypt}";//{bcrypt} 加密的特征码
    //sys_oauth_client_details 表的字段，不包括client_id、client_secret
    String CLIENT_FIELDS = "client_id, CONCAT('{noop}',client_secret) as client_secret, resource_ids, scope, "
            + "authorized_grant_types, web_server_redirect_uri, authorities, access_token_validity, "
            + "refresh_token_validity, additional_information, autoapprove";
    String BASE_FIND_STATEMENT = "select " + CLIENT_FIELDS + " from sys_oauth_client_details";//JdbcClientDetailsService 查询语句

    String DEFAULT_FIND_STATEMENT = BASE_FIND_STATEMENT + " order by client_id";// 默认的查询语句
    String DEFAULT_SELECT_STATEMENT = BASE_FIND_STATEMENT + " where client_id = ?";//按条件client_id 查询
    String RESOURCE_SERVER_CONFIGURER = "resourceServerConfigurerAdapter";// 资源服务器默认bean名称
    String DETAILS_USER_ID = "user_id";//用户ID字段
    String DETAILS_USERNAME = "username";// 用户名字段
    String DETAILS_DEPT_ID = "dept_id";//用户部门字段
    String DETAILS_LICENSE = "license";// 协议字段
}
