// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BusinessLocations")
    @Validation(required = true)
    public String businessLocations;

    public static DescribeRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponse self = new DescribeRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponse setBusinessLocations(String businessLocations) {
        this.businessLocations = businessLocations;
        return this;
    }
    public String getBusinessLocations() {
        return this.businessLocations;
    }

}
