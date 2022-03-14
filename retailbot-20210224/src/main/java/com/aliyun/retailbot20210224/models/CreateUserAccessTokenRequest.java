// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateUserAccessTokenRequest extends TeaModel {
    // 用户的阿里云账号ID。下单购买时的主账号ID
    @NameInMap("AliyunUid")
    public String aliyunUid;

    // 自定义token的失效时间。单位秒
    @NameInMap("ExpireTime")
    public Long expireTime;

    // 额外信息，必须是JSON String格式
    @NameInMap("ExtraInfo")
    public String extraInfo;

    // 系统颁发的sourceId
    @NameInMap("SourceId")
    public Long sourceId;

    // 系统颁发的sourceKey。鉴权使用
    @NameInMap("SourceKey")
    public String sourceKey;

    // User dto
    @NameInMap("UserDto")
    public CreateUserAccessTokenRequestUserDto userDto;

    public static CreateUserAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAccessTokenRequest self = new CreateUserAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserAccessTokenRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public CreateUserAccessTokenRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public CreateUserAccessTokenRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateUserAccessTokenRequest setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
    }

    public CreateUserAccessTokenRequest setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
        return this;
    }
    public String getSourceKey() {
        return this.sourceKey;
    }

    public CreateUserAccessTokenRequest setUserDto(CreateUserAccessTokenRequestUserDto userDto) {
        this.userDto = userDto;
        return this;
    }
    public CreateUserAccessTokenRequestUserDto getUserDto() {
        return this.userDto;
    }

    public static class CreateUserAccessTokenRequestUserDto extends TeaModel {
        // 客户业务系统ID
        @NameInMap("ForeignId")
        public String foreignId;

        // 客户业务系统昵称
        @NameInMap("Nick")
        public String nick;

        public static CreateUserAccessTokenRequestUserDto build(java.util.Map<String, ?> map) throws Exception {
            CreateUserAccessTokenRequestUserDto self = new CreateUserAccessTokenRequestUserDto();
            return TeaModel.build(map, self);
        }

        public CreateUserAccessTokenRequestUserDto setForeignId(String foreignId) {
            this.foreignId = foreignId;
            return this;
        }
        public String getForeignId() {
            return this.foreignId;
        }

        public CreateUserAccessTokenRequestUserDto setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

    }

}
