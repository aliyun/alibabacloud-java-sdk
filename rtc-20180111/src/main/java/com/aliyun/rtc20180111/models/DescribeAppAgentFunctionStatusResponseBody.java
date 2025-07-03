// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppAgentFunctionStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("Result")
    public String result;

    public static DescribeAppAgentFunctionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppAgentFunctionStatusResponseBody self = new DescribeAppAgentFunctionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppAgentFunctionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppAgentFunctionStatusResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
