// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class CancelSparkStatementResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>341ADFA1-4A68-4707-9CA7-FA86523A5F14</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelSparkStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelSparkStatementResponseBody self = new CancelSparkStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelSparkStatementResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CancelSparkStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
