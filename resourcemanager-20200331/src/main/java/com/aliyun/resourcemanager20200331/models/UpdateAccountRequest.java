// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAccountRequest extends TeaModel {
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    @NameInMap("NewAccountType")
    public String newAccountType;

    @NameInMap("AccountId")
    public String accountId;

    public static UpdateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountRequest self = new UpdateAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccountRequest setNewDisplayName(String newDisplayName) {
        this.newDisplayName = newDisplayName;
        return this;
    }
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    public UpdateAccountRequest setNewAccountType(String newAccountType) {
        this.newAccountType = newAccountType;
        return this;
    }
    public String getNewAccountType() {
        return this.newAccountType;
    }

    public UpdateAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
