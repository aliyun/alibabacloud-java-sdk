// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetABMetricGroupResponseBody extends TeaModel {
    /**
     * <p>A comma-separated list of A/B testing metric IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("ABMetricIds")
    public String ABMetricIds;

    /**
     * <p>A comma-separated list of A/B testing metric names.</p>
     * 
     * <strong>example:</strong>
     * <p>pv,uv</p>
     */
    @NameInMap("ABMetricNames")
    public String ABMetricNames;

    /**
     * <p>The metric group description.</p>
     * 
     * <strong>example:</strong>
     * <p>访问量相关指标</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The metric group name.</p>
     * 
     * <strong>example:</strong>
     * <p>visits</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The owner.</p>
     * 
     * <strong>example:</strong>
     * <p>2799614***</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>Whether the metric group is a real-time metric group.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Realtime")
    public Boolean realtime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01D22D08-BA20-5F35-8302-99115F288220</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scene ID. You can get this ID by calling the <a href="https://icms.alibaba-inc.com/content/learn/pai?l=1%5C&m=16768%5C&n=4298955">ListScenes</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static GetABMetricGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetABMetricGroupResponseBody self = new GetABMetricGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetABMetricGroupResponseBody setABMetricIds(String ABMetricIds) {
        this.ABMetricIds = ABMetricIds;
        return this;
    }
    public String getABMetricIds() {
        return this.ABMetricIds;
    }

    public GetABMetricGroupResponseBody setABMetricNames(String ABMetricNames) {
        this.ABMetricNames = ABMetricNames;
        return this;
    }
    public String getABMetricNames() {
        return this.ABMetricNames;
    }

    public GetABMetricGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetABMetricGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetABMetricGroupResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetABMetricGroupResponseBody setRealtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }
    public Boolean getRealtime() {
        return this.realtime;
    }

    public GetABMetricGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetABMetricGroupResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
