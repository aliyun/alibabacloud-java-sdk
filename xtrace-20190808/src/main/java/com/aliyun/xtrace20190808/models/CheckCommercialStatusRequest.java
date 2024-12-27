// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class CheckCommercialStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xtrace</p>
     */
    @NameInMap("Service")
    public String service;

    public static CheckCommercialStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCommercialStatusRequest self = new CheckCommercialStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckCommercialStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckCommercialStatusRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
