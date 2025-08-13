// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOssAuthStatusResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("resultObject")
    public String resultObject;

    public static DescribeOssAuthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssAuthStatusResponseBody self = new DescribeOssAuthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssAuthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssAuthStatusResponseBody setResultObject(String resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public String getResultObject() {
        return this.resultObject;
    }

}
