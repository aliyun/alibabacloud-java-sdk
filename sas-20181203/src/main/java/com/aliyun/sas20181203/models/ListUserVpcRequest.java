// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUserVpcRequest extends TeaModel {
    /**
     * <p>Region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("K8sRegionId")
    public String k8sRegionId;

    public static ListUserVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserVpcRequest self = new ListUserVpcRequest();
        return TeaModel.build(map, self);
    }

    public ListUserVpcRequest setK8sRegionId(String k8sRegionId) {
        this.k8sRegionId = k8sRegionId;
        return this;
    }
    public String getK8sRegionId() {
        return this.k8sRegionId;
    }

}
