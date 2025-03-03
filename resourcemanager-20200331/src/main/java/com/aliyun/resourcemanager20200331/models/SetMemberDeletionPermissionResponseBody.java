// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SetMemberDeletionPermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the management account of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>151266687691****</p>
     */
    @NameInMap("ManagementAccountId")
    public String managementAccountId;

    /**
     * <p>The status of the member deletion feature. Valid values:</p>
     * <ul>
     * <li>Enabled: The feature is enabled.</li>
     * <li>Disabled: The feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("MemberDeletionStatus")
    public String memberDeletionStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C55A4CAA-9039-1DDF-91CE-FCC134513D29</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>rd-3G****</p>
     */
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
