// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningCountResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9693CBA1-1EC4-5B5A-8D96-34010D9DXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCheckWarningCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningCountResponseBody self = new DescribeCheckWarningCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningCountResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeCheckWarningCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
