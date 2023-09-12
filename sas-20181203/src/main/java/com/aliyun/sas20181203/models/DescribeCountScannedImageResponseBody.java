// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCountScannedImageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of images that are scanned.</p>
     */
    @NameInMap("ScannedCount")
    public Integer scannedCount;

    public static DescribeCountScannedImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCountScannedImageResponseBody self = new DescribeCountScannedImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCountScannedImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCountScannedImageResponseBody setScannedCount(Integer scannedCount) {
        this.scannedCount = scannedCount;
        return this;
    }
    public Integer getScannedCount() {
        return this.scannedCount;
    }

}
