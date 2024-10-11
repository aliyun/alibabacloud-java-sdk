// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetSparkSessionStateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9AD49396-8F80-5511-9268-A6360B205136</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>killed</p>
     */
    @NameInMap("State")
    public String state;

    public static GetSparkSessionStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkSessionStateResponseBody self = new GetSparkSessionStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkSessionStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSparkSessionStateResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
