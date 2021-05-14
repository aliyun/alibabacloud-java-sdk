// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartImageVulScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartImageVulScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartImageVulScanResponseBody self = new StartImageVulScanResponseBody();
        return TeaModel.build(map, self);
    }

    public StartImageVulScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
