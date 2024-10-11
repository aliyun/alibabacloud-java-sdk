// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ExecuteSparkStatementResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>0DC5B6F080E8-0DC5B6F080E8-0DC5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteSparkStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSparkStatementResponseBody self = new ExecuteSparkStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteSparkStatementResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExecuteSparkStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
