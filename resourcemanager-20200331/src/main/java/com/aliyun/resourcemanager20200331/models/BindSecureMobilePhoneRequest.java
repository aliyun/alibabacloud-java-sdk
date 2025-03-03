// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class BindSecureMobilePhoneRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>138660628348****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The mobile phone number that you want to bind to the member for security purposes.</p>
     * <p>The mobile phone number you specify must be the same as the mobile phone number that you specify when you call the <a href="https://help.aliyun.com/document_detail/372556.html">SendVerificationCodeForBindSecureMobilePhone</a> operation to obtain a verification code.</p>
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

    /**
     * <p>The verification code.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/372556.html">SendVerificationCodeForBindSecureMobilePhone</a> operation to obtain the verification code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
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
