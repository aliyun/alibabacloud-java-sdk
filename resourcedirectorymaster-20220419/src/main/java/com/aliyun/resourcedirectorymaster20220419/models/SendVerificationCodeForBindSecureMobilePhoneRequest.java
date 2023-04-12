// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForBindSecureMobilePhoneRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The mobile phone number that you want to bind to the member for security purposes.</p>
     * <br>
     * <p>Specify the mobile phone number in the \<Country code>-\<Mobile phone number> format.</p>
     * <br>
     * <p>> Mobile phone numbers in the `86-<Mobile phone number>` format in the Chinese mainland are not supported.</p>
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
