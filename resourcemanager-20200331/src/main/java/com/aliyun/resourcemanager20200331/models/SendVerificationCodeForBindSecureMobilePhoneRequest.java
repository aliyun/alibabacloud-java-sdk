// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForBindSecureMobilePhoneRequest extends TeaModel {
    /**
     * <p>The ID of the resource account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>138660628348****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The mobile phone number that you want to bind to the resource account.</p>
     * <p>Specify the mobile phone number in the \<Country code>-\<Mobile phone number> format.</p>
     * <blockquote>
     * <p> Mobile phone numbers in the <code>86-&lt;Mobile phone number&gt;</code> format in the Chinese mainland are not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx-13900001234</p>
     */
    @NameInMap("SecureMobilePhone")
    public String secureMobilePhone;

    public static SendVerificationCodeForBindSecureMobilePhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationCodeForBindSecureMobilePhoneRequest self = new SendVerificationCodeForBindSecureMobilePhoneRequest();
        return TeaModel.build(map, self);
    }

    public SendVerificationCodeForBindSecureMobilePhoneRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SendVerificationCodeForBindSecureMobilePhoneRequest setSecureMobilePhone(String secureMobilePhone) {
        this.secureMobilePhone = secureMobilePhone;
        return this;
    }
    public String getSecureMobilePhone() {
        return this.secureMobilePhone;
    }

}
