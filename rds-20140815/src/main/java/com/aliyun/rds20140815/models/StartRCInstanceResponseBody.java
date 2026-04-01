// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartRCInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B993DA9-5272-5414-94E3-4CA8BA0146C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartRCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRCInstanceResponseBody self = new StartRCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
