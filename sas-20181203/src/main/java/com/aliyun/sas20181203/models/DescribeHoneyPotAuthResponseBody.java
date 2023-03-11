// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHoneyPotAuthResponseBody extends TeaModel {
    /**
     * <p>The total quota.</p>
     */
    @NameInMap("HoneyPotAuthCount")
    public Long honeyPotAuthCount;

    /**
     * <p>The quota that is consumed.</p>
     */
    @NameInMap("HoneyPotCount")
    public Integer honeyPotCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHoneyPotAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHoneyPotAuthResponseBody self = new DescribeHoneyPotAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHoneyPotAuthResponseBody setHoneyPotAuthCount(Long honeyPotAuthCount) {
        this.honeyPotAuthCount = honeyPotAuthCount;
        return this;
    }
    public Long getHoneyPotAuthCount() {
        return this.honeyPotAuthCount;
    }

    public DescribeHoneyPotAuthResponseBody setHoneyPotCount(Integer honeyPotCount) {
        this.honeyPotCount = honeyPotCount;
        return this;
    }
    public Integer getHoneyPotCount() {
        return this.honeyPotCount;
    }

    public DescribeHoneyPotAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
