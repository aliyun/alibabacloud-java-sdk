// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("MobilePhone")
    public String mobilePhone;

    @NameInMap("Email")
    public String email;

    @NameInMap("Comments")
    public String comments;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

}
