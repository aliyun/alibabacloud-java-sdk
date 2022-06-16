// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class RestartAppInstanceRequest extends TeaModel {
    // appId
    @NameInMap("AppId")
    public Long appId;

    // appInstanceIdList
    @NameInMap("AppInstanceIdList")
    public java.util.List<Long> appInstanceIdList;

    // envId
    @NameInMap("EnvId")
    public Long envId;

    public static RestartAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartAppInstanceRequest self = new RestartAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartAppInstanceRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public RestartAppInstanceRequest setAppInstanceIdList(java.util.List<Long> appInstanceIdList) {
        this.appInstanceIdList = appInstanceIdList;
        return this;
    }
    public java.util.List<Long> getAppInstanceIdList() {
        return this.appInstanceIdList;
    }

    public RestartAppInstanceRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

}
