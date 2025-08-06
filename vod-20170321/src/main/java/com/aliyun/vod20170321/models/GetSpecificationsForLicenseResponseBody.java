// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetSpecificationsForLicenseResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSpecificationsForLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpecificationsForLicenseResponseBody self = new GetSpecificationsForLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpecificationsForLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetSpecificationsForLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
