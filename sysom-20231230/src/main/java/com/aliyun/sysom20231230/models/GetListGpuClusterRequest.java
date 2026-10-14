// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetListGpuClusterRequest extends TeaModel {
    /**
     * <p>The ID of the region to query.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The query time range, in milliseconds, in the format of [start, end]. Example: [13254125000, 52451241000].</p>
     * 
     * <strong>example:</strong>
     * <p>[1757820000, 1757823600]</p>
     */
    @NameInMap("timeRegion")
    public Object timeRegion;

    public static GetListGpuClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListGpuClusterRequest self = new GetListGpuClusterRequest();
        return TeaModel.build(map, self);
    }

    public GetListGpuClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetListGpuClusterRequest setTimeRegion(Object timeRegion) {
        this.timeRegion = timeRegion;
        return this;
    }
    public Object getTimeRegion() {
        return this.timeRegion;
    }

}
