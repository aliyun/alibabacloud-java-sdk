// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddDWSUsersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserJsonStr")
    public String userJsonStr;

    public static AddDWSUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDWSUsersRequest self = new AddDWSUsersRequest();
        return TeaModel.build(map, self);
    }

    public AddDWSUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDWSUsersRequest setUserJsonStr(String userJsonStr) {
        this.userJsonStr = userJsonStr;
        return this;
    }
    public String getUserJsonStr() {
        return this.userJsonStr;
    }

}
