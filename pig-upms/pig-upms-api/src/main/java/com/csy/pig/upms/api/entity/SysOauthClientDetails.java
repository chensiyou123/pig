package com.csy.pig.upms.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysOauthClientDetails extends Model<SysOauthClientDetails> {
    @NotBlank(message = "client_id 不能为空")
    @TableId(value = "client_id", type = IdType.INPUT)
    private String clientId;
    @NotBlank(message = "client_secret 不能为空")
    private String clientSecret;
    private String resourceIds;
    @NotBlank(message = "scope 不能为空")
    private String scope;
    private String authorizedGrantTypes;
    private String webServerRedirectUri;
    private String authorities;

    private Integer accessTokenValidity;

    private Integer refreshTokenValidity;

    private String additionalInformation;
    private String autoapprove;

    @Override
    protected Serializable pkVal() {
        return this.clientId;
    }

}
