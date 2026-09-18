// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StartRayHistoryServerResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartRayHistoryServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRayHistoryServerResponseBody self = new StartRayHistoryServerResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRayHistoryServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
