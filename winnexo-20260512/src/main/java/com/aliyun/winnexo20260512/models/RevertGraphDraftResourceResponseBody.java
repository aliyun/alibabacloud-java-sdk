// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RevertGraphDraftResourceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the draft is actually revoked (true / false).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("reverted")
    public Boolean reverted;

    public static RevertGraphDraftResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevertGraphDraftResourceResponseBody self = new RevertGraphDraftResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public RevertGraphDraftResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RevertGraphDraftResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RevertGraphDraftResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevertGraphDraftResourceResponseBody setReverted(Boolean reverted) {
        this.reverted = reverted;
        return this;
    }
    public Boolean getReverted() {
        return this.reverted;
    }

}
