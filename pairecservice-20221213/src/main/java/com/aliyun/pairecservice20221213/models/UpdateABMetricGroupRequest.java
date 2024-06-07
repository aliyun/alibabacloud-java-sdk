// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateABMetricGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ABMetricIds")
    public String ABMetricIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Realtime")
    public Boolean realtime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static UpdateABMetricGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateABMetricGroupRequest self = new UpdateABMetricGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateABMetricGroupRequest setABMetricIds(String ABMetricIds) {
        this.ABMetricIds = ABMetricIds;
        return this;
    }
    public String getABMetricIds() {
        return this.ABMetricIds;
    }

    public UpdateABMetricGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateABMetricGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateABMetricGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateABMetricGroupRequest setRealtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }
    public Boolean getRealtime() {
        return this.realtime;
    }

    public UpdateABMetricGroupRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
