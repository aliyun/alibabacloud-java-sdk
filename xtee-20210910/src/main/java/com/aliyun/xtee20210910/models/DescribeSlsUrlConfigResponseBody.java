// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSlsUrlConfigResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public String resultObject;

    public static DescribeSlsUrlConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsUrlConfigResponseBody self = new DescribeSlsUrlConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsUrlConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsUrlConfigResponseBody setResultObject(String resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public String getResultObject() {
        return this.resultObject;
    }

}
