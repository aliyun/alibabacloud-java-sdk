// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForEnableRDRequest extends TeaModel {
    /**
     * <p>The secure phone number of the newly created management account. If you leave this parameter empty, the secure phone number of the current logon account is used.</p>
     * <p>Format: <code>&lt;country code&gt;-&lt;phone number&gt;</code>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>You cannot enter a phone number in the Chinese mainland in the <code>86-&lt;phone number&gt;</code> format.</p>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>You can only enter a phone number in the Chinese mainland in the <code>86-&lt;phone number&gt;</code> format.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xx-13900001234</p>
     */
    @NameInMap("SecureMobilePhone")
    public String secureMobilePhone;

    public static SendVerificationCodeForEnableRDRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationCodeForEnableRDRequest self = new SendVerificationCodeForEnableRDRequest();
        return TeaModel.build(map, self);
    }

    public SendVerificationCodeForEnableRDRequest setSecureMobilePhone(String secureMobilePhone) {
        this.secureMobilePhone = secureMobilePhone;
        return this;
    }
    public String getSecureMobilePhone() {
        return this.secureMobilePhone;
    }

}
