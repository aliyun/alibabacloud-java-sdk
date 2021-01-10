// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPInstancesUsersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UpdatePrivileges")
    public Boolean updatePrivileges;

    @NameInMap("UserJsonStr")
    public String userJsonStr;

    public static UpdateODPInstancesUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPInstancesUsersRequest self = new UpdateODPInstancesUsersRequest();
        return TeaModel.build(map, self);
    }

    public UpdateODPInstancesUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateODPInstancesUsersRequest setUpdatePrivileges(Boolean updatePrivileges) {
        this.updatePrivileges = updatePrivileges;
        return this;
    }
    public Boolean getUpdatePrivileges() {
        return this.updatePrivileges;
    }

    public UpdateODPInstancesUsersRequest setUserJsonStr(String userJsonStr) {
        this.userJsonStr = userJsonStr;
        return this;
    }
    public String getUserJsonStr() {
        return this.userJsonStr;
    }

}
