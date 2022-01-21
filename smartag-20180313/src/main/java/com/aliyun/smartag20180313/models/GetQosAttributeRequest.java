// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetQosAttributeRequest extends TeaModel {
    @NameInMap("QosId")
    public String qosId;

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
