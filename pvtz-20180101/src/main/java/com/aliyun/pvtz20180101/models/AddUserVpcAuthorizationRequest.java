// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddUserVpcAuthorizationRequest extends TeaModel {
    @NameInMap("AuthChannel")
    public String authChannel;

    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("AuthorizedUserId")
    public Long authorizedUserId;

    public static AddUserVpcAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserVpcAuthorizationRequest self = new AddUserVpcAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public AddUserVpcAuthorizationRequest setAuthChannel(String authChannel) {
        this.authChannel = authChannel;
        return this;
    }
    public String getAuthChannel() {
        return this.authChannel;
    }

    public AddUserVpcAuthorizationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public AddUserVpcAuthorizationRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public AddUserVpcAuthorizationRequest setAuthorizedUserId(Long authorizedUserId) {
        this.authorizedUserId = authorizedUserId;
        return this;
    }
    public Long getAuthorizedUserId() {
        return this.authorizedUserId;
    }

}
