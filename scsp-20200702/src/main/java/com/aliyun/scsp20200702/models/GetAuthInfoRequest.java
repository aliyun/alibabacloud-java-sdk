// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAuthInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ForeignId")
    public String foreignId;

    @NameInMap("AppKey")
    public String appKey;

    public static GetAuthInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthInfoRequest self = new GetAuthInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAuthInfoRequest setForeignId(String foreignId) {
        this.foreignId = foreignId;
        return this;
    }
    public String getForeignId() {
        return this.foreignId;
    }

    public GetAuthInfoRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
