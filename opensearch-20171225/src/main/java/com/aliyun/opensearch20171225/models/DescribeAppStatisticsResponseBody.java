// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppStatisticsResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeAppStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppStatisticsResponseBody self = new DescribeAppStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppStatisticsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public DescribeAppStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
