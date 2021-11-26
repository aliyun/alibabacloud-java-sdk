// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    public static RestartApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartApplicationRequest self = new RestartApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RestartApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RestartApplicationRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

}
