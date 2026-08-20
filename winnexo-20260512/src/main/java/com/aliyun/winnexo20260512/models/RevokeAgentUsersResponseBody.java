// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RevokeAgentUsersResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* / InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error description. This is empty when the call succeeds.</p>
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
     * <p>The number of records successfully revoked in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("revokedCount")
    public Long revokedCount;

    public static RevokeAgentUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeAgentUsersResponseBody self = new RevokeAgentUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeAgentUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RevokeAgentUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RevokeAgentUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokeAgentUsersResponseBody setRevokedCount(Long revokedCount) {
        this.revokedCount = revokedCount;
        return this;
    }
    public Long getRevokedCount() {
        return this.revokedCount;
    }

}
