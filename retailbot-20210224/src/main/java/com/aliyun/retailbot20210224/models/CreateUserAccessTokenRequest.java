// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateUserAccessTokenRequest extends TeaModel {
    @NameInMap("AliyunUid")
    public String aliyunUid;

    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    @NameInMap("SourceId")
    public Long sourceId;

    @NameInMap("SourceKey")
    public String sourceKey;

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
        @NameInMap("ForeignId")
        public String foreignId;

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
