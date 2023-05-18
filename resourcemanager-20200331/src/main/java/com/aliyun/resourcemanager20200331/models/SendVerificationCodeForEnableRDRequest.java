// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForEnableRDRequest extends TeaModel {
    /**
     * <p>The mobile phone number that is bound to the newly created account. If you leave this parameter empty, the mobile phone number that is bound to the current account is used.</p>
     * <br>
     * <p>Specify the mobile phone number in the `<Country code>-<Mobile phone number>` format.</p>
     * <br>
     * <p>>  Mobile phone numbers in the `86-<Mobile phone number>` format in the Chinese mainland are not supported.</p>
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
