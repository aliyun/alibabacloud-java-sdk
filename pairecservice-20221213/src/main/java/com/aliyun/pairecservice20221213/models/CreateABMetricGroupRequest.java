// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateABMetricGroupRequest extends TeaModel {
    /**
     * <p>The A/B metric IDs. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("ABMetricIds")
    public String ABMetricIds;

    /**
     * <p>The description of the metric group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>访问量相关指标</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the metric group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>visits</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether the metric group is a real-time metric group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Realtime")
    public Boolean realtime;

    /**
     * <p>The ID of the scene. You can call the <a href="https://help.aliyun.com/document_detail/2402581.html">ListScenes</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
