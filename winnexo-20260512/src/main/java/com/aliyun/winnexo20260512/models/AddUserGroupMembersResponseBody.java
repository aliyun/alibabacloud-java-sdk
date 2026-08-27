// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class AddUserGroupMembersResponseBody extends TeaModel {
    /**
     * <p>The number of user group member relationships that were actually added.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("affectedCount")
    public Long affectedCount;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the status code.</p>
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
     * <p>The number of requested members before deduplication.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("requestedCount")
    public Long requestedCount;

    /**
     * <p>The ID of the target user group.</p>
     * 
     * <strong>example:</strong>
     * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
     */
    @NameInMap("userGroupId")
    public String userGroupId;

    public static AddUserGroupMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMembersResponseBody self = new AddUserGroupMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMembersResponseBody setAffectedCount(Long affectedCount) {
        this.affectedCount = affectedCount;
        return this;
    }
    public Long getAffectedCount() {
        return this.affectedCount;
    }

    public AddUserGroupMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddUserGroupMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddUserGroupMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddUserGroupMembersResponseBody setRequestedCount(Long requestedCount) {
        this.requestedCount = requestedCount;
        return this;
    }
    public Long getRequestedCount() {
        return this.requestedCount;
    }

    public AddUserGroupMembersResponseBody setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
