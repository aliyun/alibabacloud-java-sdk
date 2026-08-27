// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetUserGroupResponseBody extends TeaModel {
    /**
     * <p><strong>The list of direct child user groups.</strong></p>
     */
    @NameInMap("childGroups")
    public java.util.List<?> childGroups;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p><strong>The list of direct members in the current user group.</strong></p>
     */
    @NameInMap("members")
    public java.util.List<?> members;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p><strong>The parent user group information. This is empty for the root node.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;userGroupId&quot;:&quot;b07fb0a4-0b7d-44a7-a3d5-a43a5964c8f0&quot;,&quot;userGroupName&quot;:&quot;Sales Center&quot;,&quot;parentId&quot;:null,&quot;level&quot;:1,&quot;description&quot;:&quot;Sales organization&quot;,&quot;childGroupCount&quot;:1,&quot;directMemberCount&quot;:0,&quot;sourceType&quot;:&quot;internal&quot;,&quot;externalSyncStatus&quot;:null,&quot;gmtCreate&quot;:&quot;2026-08-27T08:00:00Z&quot;,&quot;gmtModified&quot;:&quot;2026-08-27T08:00:00Z&quot;}</p>
     */
    @NameInMap("parentGroup")
    public Object parentGroup;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p><strong>The target user group information.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;userGroupId&quot;:&quot;7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11&quot;,&quot;userGroupName&quot;:&quot;South China Sales&quot;,&quot;parentId&quot;:&quot;b07fb0a4-0b7d-44a7-a3d5-a43a5964c8f0&quot;,&quot;level&quot;:2,&quot;description&quot;:&quot;South China Sales organization&quot;,&quot;childGroupCount&quot;:0,&quot;directMemberCount&quot;:2,&quot;sourceType&quot;:&quot;internal&quot;,&quot;externalSyncStatus&quot;:null,&quot;gmtCreate&quot;:&quot;2026-08-27T09:00:00Z&quot;,&quot;gmtModified&quot;:&quot;2026-08-27T10:00:00Z&quot;}</p>
     */
    @NameInMap("userGroup")
    public Object userGroup;

    public static GetUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupResponseBody self = new GetUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserGroupResponseBody setChildGroups(java.util.List<?> childGroups) {
        this.childGroups = childGroups;
        return this;
    }
    public java.util.List<?> getChildGroups() {
        return this.childGroups;
    }

    public GetUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserGroupResponseBody setMembers(java.util.List<?> members) {
        this.members = members;
        return this;
    }
    public java.util.List<?> getMembers() {
        return this.members;
    }

    public GetUserGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserGroupResponseBody setParentGroup(Object parentGroup) {
        this.parentGroup = parentGroup;
        return this;
    }
    public Object getParentGroup() {
        return this.parentGroup;
    }

    public GetUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserGroupResponseBody setUserGroup(Object userGroup) {
        this.userGroup = userGroup;
        return this;
    }
    public Object getUserGroup() {
        return this.userGroup;
    }

}
