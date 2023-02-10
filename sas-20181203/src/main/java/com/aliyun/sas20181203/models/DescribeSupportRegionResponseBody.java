// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSupportRegionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportRegion")
    public java.util.List<String> supportRegion;

    public static DescribeSupportRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportRegionResponseBody self = new DescribeSupportRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupportRegionResponseBody setSupportRegion(java.util.List<String> supportRegion) {
        this.supportRegion = supportRegion;
        return this;
    }
    public java.util.List<String> getSupportRegion() {
        return this.supportRegion;
    }

}
