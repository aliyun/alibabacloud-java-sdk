// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCountNotScannedImageResponseBody extends TeaModel {
    @NameInMap("NotScannedCnt")
    public Integer notScannedCnt;

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
