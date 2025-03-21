// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SetMemberDisplayNameSyncStatusResponseBody extends TeaModel {
    /**
     * <p>The status of the Member Display Name Synchronization feature. Valid values:</p>
     * <ul>
     * <li>Enabled</li>
     * <li>Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("MemberAccountDisplayNameSyncStatus")
    public String memberAccountDisplayNameSyncStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetMemberDisplayNameSyncStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetMemberDisplayNameSyncStatusResponseBody self = new SetMemberDisplayNameSyncStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetMemberDisplayNameSyncStatusResponseBody setMemberAccountDisplayNameSyncStatus(String memberAccountDisplayNameSyncStatus) {
        this.memberAccountDisplayNameSyncStatus = memberAccountDisplayNameSyncStatus;
        return this;
    }
    public String getMemberAccountDisplayNameSyncStatus() {
        return this.memberAccountDisplayNameSyncStatus;
    }

    public SetMemberDisplayNameSyncStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
