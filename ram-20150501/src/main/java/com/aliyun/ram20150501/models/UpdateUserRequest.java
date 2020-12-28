// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("NewUserName")
    public String newUserName;

    @NameInMap("NewDisplayName")
    public String newDisplayName;

    @NameInMap("NewMobilePhone")
    public String newMobilePhone;

    @NameInMap("NewEmail")
    public String newEmail;

    @NameInMap("NewComments")
    public String newComments;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdateUserRequest setNewUserName(String newUserName) {
        this.newUserName = newUserName;
        return this;
    }
    public String getNewUserName() {
        return this.newUserName;
    }

    public UpdateUserRequest setNewDisplayName(String newDisplayName) {
        this.newDisplayName = newDisplayName;
        return this;
    }
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    public UpdateUserRequest setNewMobilePhone(String newMobilePhone) {
        this.newMobilePhone = newMobilePhone;
        return this;
    }
    public String getNewMobilePhone() {
        return this.newMobilePhone;
    }

    public UpdateUserRequest setNewEmail(String newEmail) {
        this.newEmail = newEmail;
        return this;
    }
    public String getNewEmail() {
        return this.newEmail;
    }

    public UpdateUserRequest setNewComments(String newComments) {
        this.newComments = newComments;
        return this;
    }
    public String getNewComments() {
        return this.newComments;
    }

}
