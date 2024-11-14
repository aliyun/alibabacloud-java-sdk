// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class StopBEClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BC854513-E85E-54F3-9842-B9CCD3308CDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopBEClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopBEClusterResponseBody self = new StopBEClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public StopBEClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
