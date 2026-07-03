// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetAdvancedMonitorStateRequest extends TeaModel {
    /**
     * <p>The ID of the region where the Smart Access Gateway instance is deployed.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Smart Access Gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-asdfz6ac74oj5v****</p>
     */
    @NameInMap("SagId")
    public String sagId;

    public static GetAdvancedMonitorStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdvancedMonitorStateRequest self = new GetAdvancedMonitorStateRequest();
        return TeaModel.build(map, self);
    }

    public GetAdvancedMonitorStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAdvancedMonitorStateRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

}
