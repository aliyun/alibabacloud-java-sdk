// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetDeploymentBySelectorShrinkRequest extends TeaModel {
    /**
     * <p>The name of the cluster.</p>
     */
    @NameInMap("GuestCluster")
    public String guestCluster;

    /**
     * <p>The label selector information.</p>
     */
    @NameInMap("LabelSelector")
    public String labelSelectorShrink;

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

    public static GetDeploymentBySelectorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentBySelectorShrinkRequest self = new GetDeploymentBySelectorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentBySelectorShrinkRequest setGuestCluster(String guestCluster) {
        this.guestCluster = guestCluster;
        return this;
    }
    public String getGuestCluster() {
        return this.guestCluster;
    }

    public GetDeploymentBySelectorShrinkRequest setLabelSelectorShrink(String labelSelectorShrink) {
        this.labelSelectorShrink = labelSelectorShrink;
        return this;
    }
    public String getLabelSelectorShrink() {
        return this.labelSelectorShrink;
    }

    public GetDeploymentBySelectorShrinkRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetDeploymentBySelectorShrinkRequest setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public GetDeploymentBySelectorShrinkRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public GetDeploymentBySelectorShrinkRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
