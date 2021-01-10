// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDWSUsersRequest extends TeaModel {
    @NameInMap("DemoUserModelJsonStr")
    public String demoUserModelJsonStr;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserName")
    public String userName;

    public static UpdateDWSUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDWSUsersRequest self = new UpdateDWSUsersRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDWSUsersRequest setDemoUserModelJsonStr(String demoUserModelJsonStr) {
        this.demoUserModelJsonStr = demoUserModelJsonStr;
        return this;
    }
    public String getDemoUserModelJsonStr() {
        return this.demoUserModelJsonStr;
    }

    public UpdateDWSUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDWSUsersRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
