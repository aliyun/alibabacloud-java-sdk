// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAccountRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account that corresponds to the member.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The new type of the member. Valid values:</p>
     * <br>
     * <p>*   ResourceAccount: resource account</p>
     * <p>*   CloudAccount: cloud account</p>
     * <br>
     * <p>>  You can configure either the `NewDisplayName` or `NewAccountType` parameter.</p>
     */
    @NameInMap("NewAccountType")
    public String newAccountType;

    /**
     * <p>The new display name of the member.</p>
     * <br>
     * <p>>  You can configure either the `NewDisplayName` or `NewAccountType` parameter.</p>
     */
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    public static UpdateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountRequest self = new UpdateAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UpdateAccountRequest setNewAccountType(String newAccountType) {
        this.newAccountType = newAccountType;
        return this;
    }
    public String getNewAccountType() {
        return this.newAccountType;
    }

    public UpdateAccountRequest setNewDisplayName(String newDisplayName) {
        this.newDisplayName = newDisplayName;
        return this;
    }
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

}
