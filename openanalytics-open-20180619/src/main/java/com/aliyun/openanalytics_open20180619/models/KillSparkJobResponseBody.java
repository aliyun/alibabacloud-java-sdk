// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class KillSparkJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>deleted</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>3970ACB5-3E30-4A3A-B63A-1790FCC261F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static KillSparkJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillSparkJobResponseBody self = new KillSparkJobResponseBody();
        return TeaModel.build(map, self);
    }

    public KillSparkJobResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public KillSparkJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
