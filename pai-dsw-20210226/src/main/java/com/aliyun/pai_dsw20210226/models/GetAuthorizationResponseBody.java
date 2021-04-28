// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetAuthorizationResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 是否已经给DSW服务账号授权
    @NameInMap("Authorized")
    public Boolean authorized;

    // 授权失败错误代码
    @NameInMap("AuthorizationFailedCode")
    public String authorizationFailedCode;

    // 授权失败错误消息
    @NameInMap("AuthorizationFailedMessage")
    public String authorizationFailedMessage;

    public static GetAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationResponseBody self = new GetAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthorizationResponseBody setAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }
    public Boolean getAuthorized() {
        return this.authorized;
    }

    public GetAuthorizationResponseBody setAuthorizationFailedCode(String authorizationFailedCode) {
        this.authorizationFailedCode = authorizationFailedCode;
        return this;
    }
    public String getAuthorizationFailedCode() {
        return this.authorizationFailedCode;
    }

    public GetAuthorizationResponseBody setAuthorizationFailedMessage(String authorizationFailedMessage) {
        this.authorizationFailedMessage = authorizationFailedMessage;
        return this;
    }
    public String getAuthorizationFailedMessage() {
        return this.authorizationFailedMessage;
    }

}
