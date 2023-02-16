// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class BindSecureMobilePhoneRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("SecureMobilePhone")
    public String secureMobilePhone;

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
