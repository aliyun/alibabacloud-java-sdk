// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetAuthInfoRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("ForeignId")
    public String foreignId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAuthInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthInfoRequest self = new GetAuthInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthInfoRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetAuthInfoRequest setForeignId(String foreignId) {
        this.foreignId = foreignId;
        return this;
    }
    public String getForeignId() {
        return this.foreignId;
    }

    public GetAuthInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
