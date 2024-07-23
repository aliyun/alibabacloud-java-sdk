// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneEngineConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EngineConfigId")
    public String engineConfigId;

    /**
     * <strong>example:</strong>
     * <p>A04CB8C0-E74A-5E83-BC61-64D153574EC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloneEngineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneEngineConfigResponseBody self = new CloneEngineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneEngineConfigResponseBody setEngineConfigId(String engineConfigId) {
        this.engineConfigId = engineConfigId;
        return this;
    }
    public String getEngineConfigId() {
        return this.engineConfigId;
    }

    public CloneEngineConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
