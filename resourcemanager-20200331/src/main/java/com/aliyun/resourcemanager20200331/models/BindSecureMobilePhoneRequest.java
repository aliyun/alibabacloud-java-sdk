// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class BindSecureMobilePhoneRequest extends TeaModel {
    /**
     * <p>The member ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>138660628348****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The secure phone number.</p>
     * <p>The phone number must be the same as the one that you specified when you called <a href="https://help.aliyun.com/document_detail/372556.html">SendVerificationCodeForBindSecureMobilePhone</a> to authenticate and obtain the verification code.</p>
     * <p>Format: <Country code>-<Phone number>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>Only the Chinese mainland phone numbers in the <code>86-&lt;Phone number&gt;</code> format are supported.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>The Chinese mainland phone numbers in the <code>86-&lt;Phone number&gt;</code> format are not supported.</p>
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
     * <p>You can call <a href="https://help.aliyun.com/document_detail/372556.html">SendVerificationCodeForBindSecureMobilePhone</a> to obtain the verification code.</p>
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
