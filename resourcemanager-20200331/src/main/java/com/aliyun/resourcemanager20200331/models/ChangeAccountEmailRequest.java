// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ChangeAccountEmailRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The email address to be bound to the member.</p>
     * <br>
     * <p>>  The system automatically sends a verification email to the email address. After the verification is passed, the email address takes effect, and the system changes both the logon email address and secure email address of the member.</p>
     */
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
