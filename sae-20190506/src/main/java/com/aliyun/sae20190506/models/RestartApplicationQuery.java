// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartApplicationQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    public static RestartApplicationQuery build(java.util.Map<String, ?> map) throws Exception {
        RestartApplicationQuery self = new RestartApplicationQuery();
        return TeaModel.build(map, self);
    }

    public RestartApplicationQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RestartApplicationQuery setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

}
