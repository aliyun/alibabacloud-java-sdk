// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetDeploymentBySelectorRequest extends TeaModel {
    /**
     * <p>The name of the cluster.</p>
     */
    @NameInMap("GuestCluster")
    public String guestCluster;

    /**
     * <p>The label selector information.</p>
     */
    @NameInMap("LabelSelector")
    public java.util.Map<String, String> labelSelector;

    /**
     * <p>The maximum number of returned data entries.</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The marker of data queried last time.</p>
     */
    @NameInMap("Mark")
    public String mark;

    /**
     * <p>The namespace.</p>
     */
    @NameInMap("NameSpace")
    public String nameSpace;

    /**
     * <p>The ID of the Alibaba Cloud Service Mesh (ASM) instance.</p>
     */
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
