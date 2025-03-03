// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAccountRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account that corresponds to the member.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The new type of the member. Valid values:</p>
     * <ul>
     * <li>ResourceAccount: resource account</li>
     * <li>CloudAccount: cloud account</li>
     * </ul>
     * <blockquote>
     * <p> You can configure either the <code>NewDisplayName</code> or <code>NewAccountType</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ResourceAccount</p>
     */
    @NameInMap("NewAccountType")
    public String newAccountType;

    /**
     * <p>The new display name of the member.</p>
     * <blockquote>
     * <p> You can configure either the <code>NewDisplayName</code> or <code>NewAccountType</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
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
