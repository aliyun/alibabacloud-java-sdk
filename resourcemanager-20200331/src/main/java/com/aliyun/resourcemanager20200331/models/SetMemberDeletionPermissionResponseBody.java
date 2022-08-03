// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SetMemberDeletionPermissionResponseBody extends TeaModel {
    @NameInMap("ManagementAccountId")
    public String managementAccountId;

    @NameInMap("MemberDeletionStatus")
    public String memberDeletionStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceDirectoryId")
    public String resourceDirectoryId;

    public static SetMemberDeletionPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetMemberDeletionPermissionResponseBody self = new SetMemberDeletionPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetMemberDeletionPermissionResponseBody setManagementAccountId(String managementAccountId) {
        this.managementAccountId = managementAccountId;
        return this;
    }
    public String getManagementAccountId() {
        return this.managementAccountId;
    }

    public SetMemberDeletionPermissionResponseBody setMemberDeletionStatus(String memberDeletionStatus) {
        this.memberDeletionStatus = memberDeletionStatus;
        return this;
    }
    public String getMemberDeletionStatus() {
        return this.memberDeletionStatus;
    }

    public SetMemberDeletionPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetMemberDeletionPermissionResponseBody setResourceDirectoryId(String resourceDirectoryId) {
        this.resourceDirectoryId = resourceDirectoryId;
        return this;
    }
    public String getResourceDirectoryId() {
        return this.resourceDirectoryId;
    }

}
