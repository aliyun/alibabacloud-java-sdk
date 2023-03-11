// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAutoDelConfigResponseBody extends TeaModel {
    /**
     * <p>The number of days during which a detected vulnerability is retained before the vulnerability is automatically deleted.</p>
     */
    @NameInMap("Days")
    public Integer days;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAutoDelConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoDelConfigResponseBody self = new DescribeAutoDelConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoDelConfigResponseBody setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

    public DescribeAutoDelConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
