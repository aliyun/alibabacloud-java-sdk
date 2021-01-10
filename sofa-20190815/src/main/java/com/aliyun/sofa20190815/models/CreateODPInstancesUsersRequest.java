// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPInstancesUsersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserJsonStr")
    public String userJsonStr;

    public static CreateODPInstancesUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateODPInstancesUsersRequest self = new CreateODPInstancesUsersRequest();
        return TeaModel.build(map, self);
    }

    public CreateODPInstancesUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateODPInstancesUsersRequest setUserJsonStr(String userJsonStr) {
        this.userJsonStr = userJsonStr;
        return this;
    }
    public String getUserJsonStr() {
        return this.userJsonStr;
    }

}
