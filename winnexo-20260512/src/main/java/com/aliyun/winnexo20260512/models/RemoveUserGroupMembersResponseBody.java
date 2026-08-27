// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RemoveUserGroupMembersResponseBody extends TeaModel {
    /**
     * <p>The number of member relationships actually removed.</p>
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
     * <p>ok</p>
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

    public static RemoveUserGroupMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserGroupMembersResponseBody self = new RemoveUserGroupMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUserGroupMembersResponseBody setAffectedCount(Long affectedCount) {
        this.affectedCount = affectedCount;
        return this;
    }
    public Long getAffectedCount() {
        return this.affectedCount;
    }

    public RemoveUserGroupMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveUserGroupMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveUserGroupMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveUserGroupMembersResponseBody setRequestedCount(Long requestedCount) {
        this.requestedCount = requestedCount;
        return this;
    }
    public Long getRequestedCount() {
        return this.requestedCount;
    }

    public RemoveUserGroupMembersResponseBody setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
