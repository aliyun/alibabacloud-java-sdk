// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GrantAgentUsersResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The number of authorization records processed in this request, including both newly created and updated records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("grantedCount")
    public Long grantedCount;

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

    public static GrantAgentUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantAgentUsersResponseBody self = new GrantAgentUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantAgentUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GrantAgentUsersResponseBody setGrantedCount(Long grantedCount) {
        this.grantedCount = grantedCount;
        return this;
    }
    public Long getGrantedCount() {
        return this.grantedCount;
    }

    public GrantAgentUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GrantAgentUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
