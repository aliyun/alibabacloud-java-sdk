// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class MoveAccountRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("DestinationFolderId")
    public String destinationFolderId;

    public static MoveAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveAccountRequest self = new MoveAccountRequest();
        return TeaModel.build(map, self);
    }

    public MoveAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public MoveAccountRequest setDestinationFolderId(String destinationFolderId) {
        this.destinationFolderId = destinationFolderId;
        return this;
    }
    public String getDestinationFolderId() {
        return this.destinationFolderId;
    }

}
