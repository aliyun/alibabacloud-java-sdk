// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    public static DeleteAccessKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyRequest self = new DeleteAccessKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DeleteAccessKeyRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

}
