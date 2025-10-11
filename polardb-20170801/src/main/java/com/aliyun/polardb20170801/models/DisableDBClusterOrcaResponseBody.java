// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterOrcaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-***************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD86******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDBClusterOrcaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterOrcaResponseBody self = new DisableDBClusterOrcaResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterOrcaResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DisableDBClusterOrcaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
