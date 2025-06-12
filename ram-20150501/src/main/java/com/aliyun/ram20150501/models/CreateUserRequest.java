// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The description of the RAM user.</p>
     * <p>The description must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a cloud computing engineer.</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The display name of the RAM user.</p>
     * <p>The name must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address of the RAM user.</p>
     * <blockquote>
     * <p> This parameter applies only to the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The mobile phone number of the RAM user.</p>
     * <p>Format: \<Country code>-\<Mobile phone number>.</p>
     * <blockquote>
     * <p> This parameter applies only to the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86-1868888****</p>
     */
    @NameInMap("MobilePhone")
    public String mobilePhone;

    /**
     * <p>The name of the RAM user.</p>
     * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, periods (.), hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public CreateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
