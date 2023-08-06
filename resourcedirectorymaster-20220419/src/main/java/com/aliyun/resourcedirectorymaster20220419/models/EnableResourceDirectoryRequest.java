// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class EnableResourceDirectoryRequest extends TeaModel {
    /**
     * <p>The mode in which you enable a resource directory. Valid values:</p>
     * <br>
     * <p>*   CurrentAccount: The current account is used to enable a resource directory.</p>
     * <p>*   NewManagementAccount: A newly created account is used to enable a resource directory. If you select this mode, you must configure the `MAName`, `MASecureMobilePhone`, and `VerificationCode` parameters.</p>
     */
    @NameInMap("EnableMode")
    public String enableMode;

    /**
     * <p>The name of the newly created account.</p>
     * <br>
     * <p>Specify the name in the `<Prefix>@rdadmin.aliyunid.com` format. The prefix can contain letters, digits, and special characters but cannot contain consecutive special characters. The prefix must start and end with a letter or digit. Valid special characters include underscores (`_`), periods (.), and hyphens (-). The prefix must be 2 to 50 characters in length.</p>
     */
    @NameInMap("MAName")
    public String MAName;

    /**
     * <p>The mobile phone number that is bound to the newly created account.</p>
     * <br>
     * <p>If you leave this parameter empty, the mobile phone number that is bound to the current account is used. The mobile phone number you specify must be the same as the mobile phone number that you specify when you call the [SendVerificationCodeForEnableRD](~~SendVerificationCodeForEnableRD~~) operation to obtain a verification code.</p>
     * <br>
     * <p>Specify the mobile phone number in the `<Country code>-<Mobile phone number>` format.</p>
     * <br>
     * <p>> Mobile phone numbers in the `86-<Mobile phone number>` format in the Chinese mainland are not supported.</p>
     */
    @NameInMap("MASecureMobilePhone")
    public String MASecureMobilePhone;

    /**
     * <p>The verification code.</p>
     * <br>
     * <p>You can call the [SendVerificationCodeForEnableRD](~~SendVerificationCodeForEnableRD~~) operation to obtain the verification code.</p>
     */
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
