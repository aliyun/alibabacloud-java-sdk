// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateWarmPoolResponseBody extends TeaModel {
    /**
     * <p>The business code in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>01234567-89AB-CDEF-0123-456789ABCDEF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The warm pool configuration or current status.</p>
     */
    @NameInMap("warmPool")
    public PublicWarmPoolConfig warmPool;

    public static UpdateWarmPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarmPoolResponseBody self = new UpdateWarmPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWarmPoolResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateWarmPoolResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateWarmPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWarmPoolResponseBody setWarmPool(PublicWarmPoolConfig warmPool) {
        this.warmPool = warmPool;
        return this;
    }
    public PublicWarmPoolConfig getWarmPool() {
        return this.warmPool;
    }

}
