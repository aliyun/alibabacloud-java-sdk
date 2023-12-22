// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateABMetricGroupRequest extends TeaModel {
    @NameInMap("ABMetricIds")
    public String ABMetricIds;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Realtime")
    public Boolean realtime;

    @NameInMap("SceneId")
    public String sceneId;

    public static CreateABMetricGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateABMetricGroupRequest self = new CreateABMetricGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateABMetricGroupRequest setABMetricIds(String ABMetricIds) {
        this.ABMetricIds = ABMetricIds;
        return this;
    }
    public String getABMetricIds() {
        return this.ABMetricIds;
    }

    public CreateABMetricGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateABMetricGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateABMetricGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateABMetricGroupRequest setRealtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }
    public Boolean getRealtime() {
        return this.realtime;
    }

    public CreateABMetricGroupRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
