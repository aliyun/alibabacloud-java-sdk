// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppCallStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>20A6D1E3-1F5F-5440-A4F1-EC7831646FE4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("Result")
    public String result;

    public static DescribeAppCallStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppCallStatusResponseBody self = new DescribeAppCallStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppCallStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppCallStatusResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
