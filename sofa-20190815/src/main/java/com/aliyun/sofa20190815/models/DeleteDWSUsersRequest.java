// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSUsersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserName")
    public String userName;

    public static DeleteDWSUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSUsersRequest self = new DeleteDWSUsersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDWSUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDWSUsersRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
