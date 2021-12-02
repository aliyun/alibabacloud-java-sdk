// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateEciConfigRequest extends TeaModel {
    // appEnvId
    @NameInMap("AppEnvId")
    public Long appEnvId;

    // eipBandwidth
    @NameInMap("EipBandwidth")
    public Integer eipBandwidth;

    // enableEciSchedulePolicy
    @NameInMap("EnableEciSchedulePolicy")
    public Boolean enableEciSchedulePolicy;

    // mirrorCache
    @NameInMap("MirrorCache")
    public Boolean mirrorCache;

    // normalInstanceLimit
    @NameInMap("NormalInstanceLimit")
    public Integer normalInstanceLimit;

    // scheduleVirtualNode
    @NameInMap("ScheduleVirtualNode")
    public Boolean scheduleVirtualNode;

    public static CreateEciConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEciConfigRequest self = new CreateEciConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateEciConfigRequest setAppEnvId(Long appEnvId) {
        this.appEnvId = appEnvId;
        return this;
    }
    public Long getAppEnvId() {
        return this.appEnvId;
    }

    public CreateEciConfigRequest setEipBandwidth(Integer eipBandwidth) {
        this.eipBandwidth = eipBandwidth;
        return this;
    }
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    public CreateEciConfigRequest setEnableEciSchedulePolicy(Boolean enableEciSchedulePolicy) {
        this.enableEciSchedulePolicy = enableEciSchedulePolicy;
        return this;
    }
    public Boolean getEnableEciSchedulePolicy() {
        return this.enableEciSchedulePolicy;
    }

    public CreateEciConfigRequest setMirrorCache(Boolean mirrorCache) {
        this.mirrorCache = mirrorCache;
        return this;
    }
    public Boolean getMirrorCache() {
        return this.mirrorCache;
    }

    public CreateEciConfigRequest setNormalInstanceLimit(Integer normalInstanceLimit) {
        this.normalInstanceLimit = normalInstanceLimit;
        return this;
    }
    public Integer getNormalInstanceLimit() {
        return this.normalInstanceLimit;
    }

    public CreateEciConfigRequest setScheduleVirtualNode(Boolean scheduleVirtualNode) {
        this.scheduleVirtualNode = scheduleVirtualNode;
        return this;
    }
    public Boolean getScheduleVirtualNode() {
        return this.scheduleVirtualNode;
    }

}
