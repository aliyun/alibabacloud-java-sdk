// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class HeartBeatRequest extends TeaModel {
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("sessionStatus")
    public String sessionStatus;

    public static HeartBeatRequest build(java.util.Map<String, ?> map) throws Exception {
        HeartBeatRequest self = new HeartBeatRequest();
        return TeaModel.build(map, self);
    }

    public HeartBeatRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public HeartBeatRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public HeartBeatRequest setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public String getSessionStatus() {
        return this.sessionStatus;
    }

}
