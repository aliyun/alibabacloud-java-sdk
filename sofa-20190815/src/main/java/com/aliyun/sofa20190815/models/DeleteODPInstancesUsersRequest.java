// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteODPInstancesUsersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Username")
    public String username;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static DeleteODPInstancesUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteODPInstancesUsersRequest self = new DeleteODPInstancesUsersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteODPInstancesUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteODPInstancesUsersRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public DeleteODPInstancesUsersRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
