// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlanSpecificationForLicenseResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPlanSpecificationForLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPlanSpecificationForLicenseResponseBody self = new GetPlanSpecificationForLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPlanSpecificationForLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetPlanSpecificationForLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
