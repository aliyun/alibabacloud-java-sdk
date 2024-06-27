// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSimulationTaskCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static DescribeSimulationTaskCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimulationTaskCountResponseBody self = new DescribeSimulationTaskCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSimulationTaskCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSimulationTaskCountResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
