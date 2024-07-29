// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppRecordStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("Result")
    public String result;

    public static DescribeAppRecordStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppRecordStatusResponseBody self = new DescribeAppRecordStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppRecordStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppRecordStatusResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
