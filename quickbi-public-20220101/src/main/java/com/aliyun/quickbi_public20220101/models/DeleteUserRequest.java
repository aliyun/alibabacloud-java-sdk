// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserRequest extends TeaModel {
    /**
     * <p>The ID of the successor. If not empty, the report resources in the workspace of the deleted user will be transferred to the successor; otherwise, they will be transferred to the space owner.</p>
     * <ul>
     * <li>The successor cannot be an organization visitor</li>
     * <li>The permissions of the successor in the workspace must not be less than those of the deleted user, with management permissions &gt; development permissions &gt; sharing permissions &gt; viewing permissions</li>
     * <li>If the successor is not in the workspace, they will be automatically added to the workspace</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f5****afccd9e434a274</p>
     */
    @NameInMap("TransferUserId")
    public String transferUserId;

    /**
     * <p>The ID of the user to be deleted. This user ID is the Quick BI UserID, not the Alibaba Cloud UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe67f61a35a94b7da1a34ba174a7****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeleteUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRequest self = new DeleteUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserRequest setTransferUserId(String transferUserId) {
        this.transferUserId = transferUserId;
        return this;
    }
    public String getTransferUserId() {
        return this.transferUserId;
    }

    public DeleteUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
