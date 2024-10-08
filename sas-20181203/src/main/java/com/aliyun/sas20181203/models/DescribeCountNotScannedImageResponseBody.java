// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCountNotScannedImageResponseBody extends TeaModel {
    /**
     * <p>The number of images that are not scanned.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("NotScannedCnt")
    public Integer notScannedCnt;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCountNotScannedImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCountNotScannedImageResponseBody self = new DescribeCountNotScannedImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCountNotScannedImageResponseBody setNotScannedCnt(Integer notScannedCnt) {
        this.notScannedCnt = notScannedCnt;
        return this;
    }
    public Integer getNotScannedCnt() {
        return this.notScannedCnt;
    }

    public DescribeCountNotScannedImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
