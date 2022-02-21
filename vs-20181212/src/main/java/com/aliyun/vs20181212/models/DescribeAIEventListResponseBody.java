// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAIEventListResponseBody extends TeaModel {
    @NameInMap("AIEventList")
    public String AIEventList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAIEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIEventListResponseBody self = new DescribeAIEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIEventListResponseBody setAIEventList(String AIEventList) {
        this.AIEventList = AIEventList;
        return this;
    }
    public String getAIEventList() {
        return this.AIEventList;
    }

    public DescribeAIEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
