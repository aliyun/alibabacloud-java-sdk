// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableResourceDirectoryRequest extends TeaModel {
    /**
     * <p>The method used to enable the resource directory. Valid values:</p>
     * <ul>
     * <li>CurrentAccount: enables the resource directory by using the current logon account.</li>
     * <li>NewManagementAccount: enables the resource directory by creating a new management account. If you select this method, you must configure <code>MAName</code>, <code>MASecureMobilePhone</code>, and <code>VerificationCode</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CurrentAccount</p>
     */
    @NameInMap("EnableMode")
    public String enableMode;

    /**
     * <p>The name of the new management account.</p>
     * <p>Format: <code>&lt;Prefix&gt;@rdadmin.aliyunid.com</code>. The prefix can contain letters, digits, and the special characters <code>_.-</code>. The prefix must start and end with a letter or digit, and cannot contain consecutive special characters. The prefix must be 2 to 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:user01@rdadmin.aliyunid.com">user01@rdadmin.aliyunid.com</a></p>
     */
    @NameInMap("MAName")
    public String MAName;

    /**
     * <p>The secure phone number of the new management account.</p>
     * <p>If you leave this parameter empty, the secure phone number of the current logon account is used. The phone number must be the same as the one used to authenticate and obtain the verification code in <a href="https://help.aliyun.com/document_detail/364248.html">SendVerificationCodeForEnableRD</a>.</p>
     * <p>Format: <code>&lt;Country code&gt;-&lt;Phone number&gt;</code>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>Phone numbers from the Chinese mainland in the format <code>86-&lt;Phone number&gt;</code> are not supported.</p>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>Only phone numbers from the Chinese mainland in the format <code>86-&lt;Phone number&gt;</code> are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xx-13900001234</p>
     */
    @NameInMap("MASecureMobilePhone")
    public String MASecureMobilePhone;

    /**
     * <p>The verification code.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/364248.html">SendVerificationCodeForEnableRD</a> to obtain the verification code.</p>
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
