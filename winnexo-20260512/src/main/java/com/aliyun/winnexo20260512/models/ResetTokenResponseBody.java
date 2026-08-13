// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResetTokenResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>新 Token 明文（仅本次返回，请妥善保管）</p>
     * 
     * <strong>example:</strong>
     * <p>example_token_value</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <p>脱敏后的新 Token 值</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("tokenMasked")
    public String tokenMasked;

    public static ResetTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetTokenResponseBody self = new ResetTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResetTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResetTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ResetTokenResponseBody setTokenMasked(String tokenMasked) {
        this.tokenMasked = tokenMasked;
        return this;
    }
    public String getTokenMasked() {
        return this.tokenMasked;
    }

}
