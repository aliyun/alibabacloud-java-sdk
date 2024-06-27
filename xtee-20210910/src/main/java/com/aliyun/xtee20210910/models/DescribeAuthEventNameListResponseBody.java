// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthEventNameListResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static DescribeAuthEventNameListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthEventNameListResponseBody self = new DescribeAuthEventNameListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuthEventNameListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuthEventNameListResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
