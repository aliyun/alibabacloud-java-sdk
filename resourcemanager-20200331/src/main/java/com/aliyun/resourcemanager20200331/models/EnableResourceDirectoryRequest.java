// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableResourceDirectoryRequest extends TeaModel {
    /**
     * <p>The mode in which you enable a resource directory. Valid values:</p>
     * <ul>
     * <li>CurrentAccount: indicates that the current account is used to enable a resource directory.</li>
     * <li>NewManagementAccount: indicates that a newly created account is used to enable a resource directory. If you select this mode, you must configure the <code>MAName</code>, <code>MASecureMobilePhone</code>, and <code>VerificationCode</code> parameters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CurrentAccount</p>
     */
    @NameInMap("EnableMode")
    public String enableMode;

    /**
     * <p>The name of the newly created account.</p>
     * <p>Specify the name in the <code>&lt;Prefix&gt;@rdadmin.aliyunid.com</code> format. The prefix can contain letters, digits, and special characters but cannot contain consecutive special characters. The prefix must start with a letter or digit and end with a letter or digit. Valid special characters include underscores (_), periods (.), and hyphens (-). The prefix must be 2 to 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:user01@rdadmin.aliyunid.com">user01@rdadmin.aliyunid.com</a></p>
     */
    @NameInMap("MAName")
    public String MAName;

    /**
     * <p>The mobile phone number that is bound to the newly created account.</p>
     * <p>If you leave this parameter empty, the mobile phone number that is bound to the current account is used. The mobile phone number you specify must be the same as the mobile phone number that you specify when you call the <a href="https://help.aliyun.com/document_detail/364248.html">SendVerificationCodeForEnableRD</a> operation to obtain a verification code.</p>
     * <p>Specify the mobile phone number in the <code>&lt;Country code&gt;-&lt;Mobile phone number&gt;</code> format.</p>
     * <blockquote>
     * <p> Mobile phone numbers in the <code>86-&lt;Mobile phone number&gt;</code> format in the Chinese mainland are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xx-13900001234</p>
     */
    @NameInMap("MASecureMobilePhone")
    public String MASecureMobilePhone;

    /**
     * <p>The verification code.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/364248.html">SendVerificationCodeForEnableRD</a> operation to obtain the verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
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
