// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ChangeAccountEmailRequest extends TeaModel {
    /**
     * <p>The member account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>181761095690****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The email address of the member account.</p>
     * <blockquote>
     * <p>The system automatically sends a verification email to the specified email address. The modification takes effect only after the verification is complete. After the verification is complete, the system synchronously updates the email address and security email address of the account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
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
