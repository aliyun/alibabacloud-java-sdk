// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>The new description of the RAM user.</p>
     * <p>The description must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a cloud computing engineer.</p>
     */
    @NameInMap("NewComments")
    public String newComments;

    /**
     * <p>The new display name of the RAM user.</p>
     * <p>The name must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaoq****</p>
     */
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    /**
     * <p>The new email address of the RAM user.</p>
     * <blockquote>
     * <p> This parameter applies only to the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xiaoq****@example.com</p>
     */
    @NameInMap("NewEmail")
    public String newEmail;

    /**
     * <p>The new mobile phone number of the RAM user.</p>
     * <p>Format: \<Country code>-\<Mobile phone number>.</p>
     * <blockquote>
     * <p> This parameter applies only to the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86-1860000****</p>
     */
    @NameInMap("NewMobilePhone")
    public String newMobilePhone;

    /**
     * <p>The new username of the RAM user.</p>
     * <p>The username must be 1 to 64 characters in length, and can contain letters, digits, periods (.), hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>xiaoq****</p>
     */
    @NameInMap("NewUserName")
    public String newUserName;

    /**
     * <p>The username of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangq****</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setNewComments(String newComments) {
        this.newComments = newComments;
        return this;
    }
    public String getNewComments() {
        return this.newComments;
    }

    public UpdateUserRequest setNewDisplayName(String newDisplayName) {
        this.newDisplayName = newDisplayName;
        return this;
    }
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    public UpdateUserRequest setNewEmail(String newEmail) {
        this.newEmail = newEmail;
        return this;
    }
    public String getNewEmail() {
        return this.newEmail;
    }

    public UpdateUserRequest setNewMobilePhone(String newMobilePhone) {
        this.newMobilePhone = newMobilePhone;
        return this;
    }
    public String getNewMobilePhone() {
        return this.newMobilePhone;
    }

    public UpdateUserRequest setNewUserName(String newUserName) {
        this.newUserName = newUserName;
        return this;
    }
    public String getNewUserName() {
        return this.newUserName;
    }

    public UpdateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
