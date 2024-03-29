// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateSubCrowdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Source")
    public String source;

    @NameInMap("Users")
    public String users;

    public static CreateSubCrowdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCrowdRequest self = new CreateSubCrowdRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubCrowdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSubCrowdRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateSubCrowdRequest setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

}
