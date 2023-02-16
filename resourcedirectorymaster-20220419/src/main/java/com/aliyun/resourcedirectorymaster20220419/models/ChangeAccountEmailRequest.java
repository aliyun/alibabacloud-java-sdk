// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ChangeAccountEmailRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Email")
    public String email;

    public static ChangeAccountEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAccountEmailRequest self = new ChangeAccountEmailRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAccountEmailRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ChangeAccountEmailRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
