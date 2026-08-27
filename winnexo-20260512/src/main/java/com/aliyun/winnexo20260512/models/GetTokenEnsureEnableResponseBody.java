// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTokenEnsureEnableResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-25T10:00:00+08:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The temporary access credential for the data catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>example_token_value</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <p>The masked token value.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("tokenMasked")
    public String tokenMasked;

    public static GetTokenEnsureEnableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenEnsureEnableResponseBody self = new GetTokenEnsureEnableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenEnsureEnableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTokenEnsureEnableResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetTokenEnsureEnableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTokenEnsureEnableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenEnsureEnableResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GetTokenEnsureEnableResponseBody setTokenMasked(String tokenMasked) {
        this.tokenMasked = tokenMasked;
        return this;
    }
    public String getTokenMasked() {
        return this.tokenMasked;
    }

}
