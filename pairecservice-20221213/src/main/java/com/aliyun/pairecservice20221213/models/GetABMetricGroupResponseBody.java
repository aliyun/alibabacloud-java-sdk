// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetABMetricGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("ABMetricIds")
    public String ABMetricIds;

    /**
     * <strong>example:</strong>
     * <p>pv,uv</p>
     */
    @NameInMap("ABMetricNames")
    public String ABMetricNames;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>visits</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>2799614***</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Realtime")
    public Boolean realtime;

    /**
     * <strong>example:</strong>
     * <p>01D22D08-BA20-5F35-8302-99115F288220</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
