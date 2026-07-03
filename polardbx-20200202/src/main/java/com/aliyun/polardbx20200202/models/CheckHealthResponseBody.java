// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CheckHealthResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the component is healthy. A return value of UP indicates healthy. Any other value or an empty value indicates an exception.</p>
     * 
     * <strong>example:</strong>
     * <p>UP</p>
     */
    @NameInMap("Status")
    public String status;

    public static CheckHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckHealthResponseBody self = new CheckHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckHealthResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
