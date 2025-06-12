// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ChangePasswordRequest extends TeaModel {
    /**
     * <p>The new password that is used to log on to the console.</p>
     * <p>The password must meet the complexity requirements. For more information, see <a href="https://help.aliyun.com/document_detail/28739.html">SetPasswordPolicy</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>aw$2****</p>
     */
    @NameInMap("NewPassword")
    public String newPassword;

    /**
     * <p>The old password that is used to log on to the console.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("OldPassword")
    public String oldPassword;

    public static ChangePasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangePasswordRequest self = new ChangePasswordRequest();
        return TeaModel.build(map, self);
    }

    public ChangePasswordRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
    public String getNewPassword() {
        return this.newPassword;
    }

    public ChangePasswordRequest setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }
    public String getOldPassword() {
        return this.oldPassword;
    }

}
