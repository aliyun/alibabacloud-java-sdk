// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeScheduledTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>922DC0D9-31B5-45F9-47B7-37DC678D61A8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the scheduled task.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static DescribeScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTaskResponseBody self = new DescribeScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduledTaskResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
