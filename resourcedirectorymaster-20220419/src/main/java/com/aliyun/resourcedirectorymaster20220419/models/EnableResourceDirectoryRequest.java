// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class EnableResourceDirectoryRequest extends TeaModel {
    @NameInMap("EnableMode")
    public String enableMode;

    @NameInMap("MAName")
    public String MAName;

    @NameInMap("MASecureMobilePhone")
    public String MASecureMobilePhone;

    @NameInMap("VerificationCode")
    public String verificationCode;

    public static EnableResourceDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceDirectoryRequest self = new EnableResourceDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public EnableResourceDirectoryRequest setEnableMode(String enableMode) {
        this.enableMode = enableMode;
        return this;
    }
    public String getEnableMode() {
        return this.enableMode;
    }

    public EnableResourceDirectoryRequest setMAName(String MAName) {
        this.MAName = MAName;
        return this;
    }
    public String getMAName() {
        return this.MAName;
    }

    public EnableResourceDirectoryRequest setMASecureMobilePhone(String MASecureMobilePhone) {
        this.MASecureMobilePhone = MASecureMobilePhone;
        return this;
    }
    public String getMASecureMobilePhone() {
        return this.MASecureMobilePhone;
    }

    public EnableResourceDirectoryRequest setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }
    public String getVerificationCode() {
        return this.verificationCode;
    }

}
