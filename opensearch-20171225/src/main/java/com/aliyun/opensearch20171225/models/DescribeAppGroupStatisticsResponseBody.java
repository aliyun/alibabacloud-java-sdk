// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppGroupStatisticsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static DescribeAppGroupStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppGroupStatisticsResponseBody self = new DescribeAppGroupStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppGroupStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppGroupStatisticsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
