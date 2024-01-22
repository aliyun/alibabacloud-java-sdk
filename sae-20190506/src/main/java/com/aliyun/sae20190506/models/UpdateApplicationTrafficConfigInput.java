// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationTrafficConfigInput extends TeaModel {
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    @NameInMap("resolvePolicy")
    public String resolvePolicy;

    @NameInMap("routePolicy")
    public RoutePolicy routePolicy;

    @NameInMap("versionId")
    public String versionId;

    public static UpdateApplicationTrafficConfigInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationTrafficConfigInput self = new UpdateApplicationTrafficConfigInput();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationTrafficConfigInput setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
        this.additionalVersionWeight = additionalVersionWeight;
        return this;
    }
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    public UpdateApplicationTrafficConfigInput setResolvePolicy(String resolvePolicy) {
        this.resolvePolicy = resolvePolicy;
        return this;
    }
    public String getResolvePolicy() {
        return this.resolvePolicy;
    }

    public UpdateApplicationTrafficConfigInput setRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }
    public RoutePolicy getRoutePolicy() {
        return this.routePolicy;
    }

    public UpdateApplicationTrafficConfigInput setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
