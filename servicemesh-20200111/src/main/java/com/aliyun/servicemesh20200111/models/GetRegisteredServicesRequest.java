// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServicesRequest extends TeaModel {
    @NameInMap("GuestClusters")
    public String guestClusters;

    @NameInMap("GuestLimits")
    public String guestLimits;

    @NameInMap("GuestMarkers")
    public String guestMarkers;

    @NameInMap("MeshLimit")
    public Long meshLimit;

    @NameInMap("MeshMarker")
    public String meshMarker;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetRegisteredServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServicesRequest self = new GetRegisteredServicesRequest();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServicesRequest setGuestClusters(String guestClusters) {
        this.guestClusters = guestClusters;
        return this;
    }
    public String getGuestClusters() {
        return this.guestClusters;
    }

    public GetRegisteredServicesRequest setGuestLimits(String guestLimits) {
        this.guestLimits = guestLimits;
        return this;
    }
    public String getGuestLimits() {
        return this.guestLimits;
    }

    public GetRegisteredServicesRequest setGuestMarkers(String guestMarkers) {
        this.guestMarkers = guestMarkers;
        return this;
    }
    public String getGuestMarkers() {
        return this.guestMarkers;
    }

    public GetRegisteredServicesRequest setMeshLimit(Long meshLimit) {
        this.meshLimit = meshLimit;
        return this;
    }
    public Long getMeshLimit() {
        return this.meshLimit;
    }

    public GetRegisteredServicesRequest setMeshMarker(String meshMarker) {
        this.meshMarker = meshMarker;
        return this;
    }
    public String getMeshMarker() {
        return this.meshMarker;
    }

    public GetRegisteredServicesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetRegisteredServicesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
