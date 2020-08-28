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

}
