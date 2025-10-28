// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class EnableServicesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceNames")
    public java.util.List<String> serviceNames;

    public static EnableServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableServicesRequest self = new EnableServicesRequest();
        return TeaModel.build(map, self);
    }

    public EnableServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableServicesRequest setServiceNames(java.util.List<String> serviceNames) {
        this.serviceNames = serviceNames;
        return this;
    }
    public java.util.List<String> getServiceNames() {
        return this.serviceNames;
    }

}
