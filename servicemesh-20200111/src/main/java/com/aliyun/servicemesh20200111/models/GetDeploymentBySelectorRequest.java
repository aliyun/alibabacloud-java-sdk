// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetDeploymentBySelectorRequest extends TeaModel {
    @NameInMap("GuestCluster")
    public String guestCluster;

    @NameInMap("LabelSelector")
    public java.util.Map<String, String> labelSelector;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("Mark")
    public String mark;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetDeploymentBySelectorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentBySelectorRequest self = new GetDeploymentBySelectorRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentBySelectorRequest setGuestCluster(String guestCluster) {
        this.guestCluster = guestCluster;
        return this;
    }
    public String getGuestCluster() {
        return this.guestCluster;
    }

    public GetDeploymentBySelectorRequest setLabelSelector(java.util.Map<String, String> labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public java.util.Map<String, String> getLabelSelector() {
        return this.labelSelector;
    }

    public GetDeploymentBySelectorRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetDeploymentBySelectorRequest setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public GetDeploymentBySelectorRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public GetDeploymentBySelectorRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
