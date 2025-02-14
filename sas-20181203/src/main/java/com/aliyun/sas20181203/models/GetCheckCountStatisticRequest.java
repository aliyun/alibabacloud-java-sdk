// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckCountStatisticRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("StatisticType")
    public String statisticType;

    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static GetCheckCountStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckCountStatisticRequest self = new GetCheckCountStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckCountStatisticRequest setStatisticType(String statisticType) {
        this.statisticType = statisticType;
        return this;
    }
    public String getStatisticType() {
        return this.statisticType;
    }

    public GetCheckCountStatisticRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

}
