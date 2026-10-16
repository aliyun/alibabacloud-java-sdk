// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForBindSecureMobilePhoneRequest extends TeaModel {
    /**
     * <p>The account ID of the member.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>138660628348****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The secure phone number.</p>
     * <p>Format: <Country code>-<Phone number>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>Only phone numbers in the Chinese mainland in the format of <code>86-&lt;Phone number&gt;</code> are supported.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>Phone numbers in the Chinese mainland in the format of <code>86-&lt;Phone number&gt;</code> are not supported.</p>
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
