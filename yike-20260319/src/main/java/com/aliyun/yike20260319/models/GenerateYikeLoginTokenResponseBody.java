// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GenerateYikeLoginTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1782008128000</p>
     */
    @NameInMap("ExpiresAt")
    public String expiresAt;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>*<em><strong><strong>d6931ff7e89b5eb19484</strong></strong></em></p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <strong>example:</strong>
     * <p>23253**</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GenerateYikeLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateYikeLoginTokenResponseBody self = new GenerateYikeLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateYikeLoginTokenResponseBody setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public GenerateYikeLoginTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateYikeLoginTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GenerateYikeLoginTokenResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
