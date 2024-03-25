// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QuerySessionByClientIdResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the ApsaraMQ for MQTT client is connected to the ApsaraMQ for MQTT broker. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("OnlineStatus")
    public Boolean onlineStatus;

    /**
     * <p>The request ID. This parameter is a common parameter.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QuerySessionByClientIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionByClientIdResponseBody self = new QuerySessionByClientIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySessionByClientIdResponseBody setOnlineStatus(Boolean onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }
    public Boolean getOnlineStatus() {
        return this.onlineStatus;
    }

    public QuerySessionByClientIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
