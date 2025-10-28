// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class EnableServicesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceNames")
    public String serviceNamesShrink;

    public static EnableServicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableServicesShrinkRequest self = new EnableServicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EnableServicesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableServicesShrinkRequest setServiceNamesShrink(String serviceNamesShrink) {
        this.serviceNamesShrink = serviceNamesShrink;
        return this;
    }
    public String getServiceNamesShrink() {
        return this.serviceNamesShrink;
    }

}
