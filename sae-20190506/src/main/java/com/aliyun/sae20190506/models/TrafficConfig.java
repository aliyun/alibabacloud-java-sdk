// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class TrafficConfig extends TeaModel {
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resolvePolicy")
    public String resolvePolicy;

    @NameInMap("routePolicy")
    public RoutePolicy routePolicy;

    @NameInMap("versionId")
    public String versionId;

    public static TrafficConfig build(java.util.Map<String, ?> map) throws Exception {
        TrafficConfig self = new TrafficConfig();
        return TeaModel.build(map, self);
    }

    public TrafficConfig setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
        this.additionalVersionWeight = additionalVersionWeight;
        return this;
    }
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    public TrafficConfig setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public TrafficConfig setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public TrafficConfig setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrafficConfig setResolvePolicy(String resolvePolicy) {
        this.resolvePolicy = resolvePolicy;
        return this;
    }
    public String getResolvePolicy() {
        return this.resolvePolicy;
    }

    public TrafficConfig setRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }
    public RoutePolicy getRoutePolicy() {
        return this.routePolicy;
    }

    public TrafficConfig setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
