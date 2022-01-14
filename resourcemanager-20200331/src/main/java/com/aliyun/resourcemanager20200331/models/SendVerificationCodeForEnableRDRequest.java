// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForEnableRDRequest extends TeaModel {
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
