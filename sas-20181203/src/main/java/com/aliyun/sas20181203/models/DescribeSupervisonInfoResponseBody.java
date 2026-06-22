// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSupervisonInfoResponseBody extends TeaModel {
    /**
     * <p>The system vulnerability scanning time. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1721134553000</p>
     */
    @NameInMap("LatestScanTime")
    public Long latestScanTime;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E10BAF1C-A6C5-51E2-866C-76D5922E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSupervisonInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupervisonInfoResponseBody self = new DescribeSupervisonInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupervisonInfoResponseBody setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }
    public Long getLatestScanTime() {
        return this.latestScanTime;
    }

    public DescribeSupervisonInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
