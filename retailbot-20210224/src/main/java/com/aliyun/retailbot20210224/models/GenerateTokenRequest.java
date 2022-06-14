// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GenerateTokenRequest extends TeaModel {
    // 自定义token的失效时间。单位秒
    @NameInMap("ExpireTime")
    public Integer expireTime;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("UserDto")
    public GenerateTokenRequestUserDto userDto;

    public static GenerateTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTokenRequest self = new GenerateTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTokenRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public GenerateTokenRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public GenerateTokenRequest setUserDto(GenerateTokenRequestUserDto userDto) {
        this.userDto = userDto;
        return this;
    }
    public GenerateTokenRequestUserDto getUserDto() {
        return this.userDto;
    }

    public static class GenerateTokenRequestUserDto extends TeaModel {
        // 额外信息，必须是JSON String格式
        @NameInMap("ExtraInfo")
        public String extraInfo;

        // 第三方业务系统用户ID
        @NameInMap("ForeignId")
        public String foreignId;

        // 用户昵称
        @NameInMap("Nick")
        public String nick;

        @NameInMap("Telephone")
        public String telephone;

        public static GenerateTokenRequestUserDto build(java.util.Map<String, ?> map) throws Exception {
            GenerateTokenRequestUserDto self = new GenerateTokenRequestUserDto();
            return TeaModel.build(map, self);
        }

        public GenerateTokenRequestUserDto setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GenerateTokenRequestUserDto setForeignId(String foreignId) {
            this.foreignId = foreignId;
            return this;
        }
        public String getForeignId() {
            return this.foreignId;
        }

        public GenerateTokenRequestUserDto setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GenerateTokenRequestUserDto setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

    }

}
