// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class BatchQuerySessionByClientIdsResponseBody extends TeaModel {
    @NameInMap("OnlineStatusList")
    public java.util.List<BatchQuerySessionByClientIdsResponseBodyOnlineStatusList> onlineStatusList;

    @NameInMap("RequestId")
    public String requestId;

    public static BatchQuerySessionByClientIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQuerySessionByClientIdsResponseBody self = new BatchQuerySessionByClientIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQuerySessionByClientIdsResponseBody setOnlineStatusList(java.util.List<BatchQuerySessionByClientIdsResponseBodyOnlineStatusList> onlineStatusList) {
        this.onlineStatusList = onlineStatusList;
        return this;
    }
    public java.util.List<BatchQuerySessionByClientIdsResponseBodyOnlineStatusList> getOnlineStatusList() {
        return this.onlineStatusList;
    }

    public BatchQuerySessionByClientIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchQuerySessionByClientIdsResponseBodyOnlineStatusList extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("OnlineStatus")
        public Boolean onlineStatus;

        public static BatchQuerySessionByClientIdsResponseBodyOnlineStatusList build(java.util.Map<String, ?> map) throws Exception {
            BatchQuerySessionByClientIdsResponseBodyOnlineStatusList self = new BatchQuerySessionByClientIdsResponseBodyOnlineStatusList();
            return TeaModel.build(map, self);
        }

        public BatchQuerySessionByClientIdsResponseBodyOnlineStatusList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public BatchQuerySessionByClientIdsResponseBodyOnlineStatusList setOnlineStatus(Boolean onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Boolean getOnlineStatus() {
            return this.onlineStatus;
        }

    }

}
