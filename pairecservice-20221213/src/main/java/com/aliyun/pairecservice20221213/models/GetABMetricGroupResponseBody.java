// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetABMetricGroupResponseBody extends TeaModel {
    @NameInMap("ABMetricIds")
    public String ABMetricIds;

    @NameInMap("ABMetricNames")
    public String ABMetricNames;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("Realtime")
    public Boolean realtime;

    @NameInMap("RequestId")
    public String requestId;

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
