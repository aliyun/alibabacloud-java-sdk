// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateUserGroupResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error description. This value is empty when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
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
     * <p>The updated user group information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;userGroupId&quot;:&quot;7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11&quot;,&quot;userGroupName&quot;:&quot;华南销售&quot;,&quot;parentId&quot;:null,&quot;level&quot;:1,&quot;description&quot;:&quot;华南销售组织&quot;,&quot;childGroupCount&quot;:0,&quot;directMemberCount&quot;:2,&quot;sourceType&quot;:&quot;internal&quot;,&quot;externalSyncStatus&quot;:null,&quot;gmtCreate&quot;:&quot;2026-08-27T09:00:00Z&quot;,&quot;gmtModified&quot;:&quot;2026-08-27T10:00:00Z&quot;}</p>
     */
    @NameInMap("userGroup")
    public Object userGroup;

    public static UpdateUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupResponseBody self = new UpdateUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateUserGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserGroupResponseBody setUserGroup(Object userGroup) {
        this.userGroup = userGroup;
        return this;
    }
    public Object getUserGroup() {
        return this.userGroup;
    }

}
