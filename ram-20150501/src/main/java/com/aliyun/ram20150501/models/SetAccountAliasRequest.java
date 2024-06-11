// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetAccountAliasRequest extends TeaModel {
    /**
     * <p>The alias of the Alibaba Cloud account.</p>
     * <br>
     * <p>The alias must be 3 to 32 characters in length, and can contain lowercase letters, digits, and hyphens (-).</p>
     * <br>
     * <p>> It cannot start or end with a hyphen (-), and cannot contain consecutive hyphens (-).</p>
     */
    @NameInMap("AccountAlias")
    public String accountAlias;

    public static SetAccountAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAccountAliasRequest self = new SetAccountAliasRequest();
        return TeaModel.build(map, self);
    }

    public SetAccountAliasRequest setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
        return this;
    }
    public String getAccountAlias() {
        return this.accountAlias;
    }

}
