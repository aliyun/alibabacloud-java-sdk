// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SetMemberDisplayNameSyncStatusRequest extends TeaModel {
    /**
     * <p>The status of the Member Display Name Synchronization feature. Valid values:</p>
     * <ul>
     * <li>Enabled: The feature is enabled. This indicates that the display names specified by the management account for the members will be synchronized to the basic account information of the members. The display name information will be visible and perceptible to the members. If a notification is sent to a member, the display name of the member will be used as the appellation of the member.</li>
     * <li>Disabled: The feature is disabled. This indicates that the display names specified by the management account for the members are valid only in the resource directory and will not be updated to the basic account information of the members.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static SetMemberDisplayNameSyncStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMemberDisplayNameSyncStatusRequest self = new SetMemberDisplayNameSyncStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetMemberDisplayNameSyncStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
