// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class BindSecureMobilePhoneRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The mobile phone number that you want to bind to the member for security purposes.</p>
     * <br>
     * <p>The mobile phone number you specify must be the same as the mobile phone number that you specify when you call the [SendVerificationCodeForBindSecureMobilePhone](~~372556~~) operation to obtain a verification code.</p>
     * <br>
     * <p>Specify the mobile phone number in the \<Country code>-\<Mobile phone number> format.</p>
     * <br>
     * <p>>  Mobile phone numbers in the `86-<Mobile phone number>` format in the Chinese mainland are not supported.</p>
     */
    @NameInMap("SecureMobilePhone")
    public String secureMobilePhone;

    /**
     * <p>The verification code.</p>
     * <br>
     * <p>You can call the [SendVerificationCodeForBindSecureMobilePhone](~~372556~~) operation to obtain the verification code.</p>
     */
    @NameInMap("VerificationCode")
    public String verificationCode;

    public static BindSecureMobilePhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        BindSecureMobilePhoneRequest self = new BindSecureMobilePhoneRequest();
        return TeaModel.build(map, self);
    }

    public BindSecureMobilePhoneRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BindSecureMobilePhoneRequest setSecureMobilePhone(String secureMobilePhone) {
        this.secureMobilePhone = secureMobilePhone;
        return this;
    }
    public String getSecureMobilePhone() {
        return this.secureMobilePhone;
    }

    public BindSecureMobilePhoneRequest setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }
    public String getVerificationCode() {
        return this.verificationCode;
    }

}
