// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserRequest extends TeaModel {
    @NameInMap("TransferUserId")
    public String transferUserId;

    /**
     * <p>Deletes a user from a specified organization.</p>
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
