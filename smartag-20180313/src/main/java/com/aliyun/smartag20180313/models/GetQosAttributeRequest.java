// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetQosAttributeRequest extends TeaModel {
    /**
     * <p>The instance ID of the QoS policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-1iqifund3gcno5****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The region ID of the QoS policy instance. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetQosAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQosAttributeRequest self = new GetQosAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetQosAttributeRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public GetQosAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
