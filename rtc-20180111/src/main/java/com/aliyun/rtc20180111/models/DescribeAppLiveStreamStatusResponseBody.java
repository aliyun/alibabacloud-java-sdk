// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppLiveStreamStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("Result")
    public String result;

    public static DescribeAppLiveStreamStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppLiveStreamStatusResponseBody self = new DescribeAppLiveStreamStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppLiveStreamStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppLiveStreamStatusResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
