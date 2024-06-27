// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f5****afccd9e434a274</p>
     */
    @NameInMap("TransferUserId")
    public String transferUserId;

    /**
     * <p>Deletes a user from a specified organization.</p>
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
