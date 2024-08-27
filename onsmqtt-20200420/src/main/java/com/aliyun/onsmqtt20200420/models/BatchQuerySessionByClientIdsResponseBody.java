// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class BatchQuerySessionByClientIdsResponseBody extends TeaModel {
    /**
     * <p>The status list of all queried ApsaraMQ for MQTT clients.</p>
     */
    @NameInMap("OnlineStatusList")
    public java.util.List<BatchQuerySessionByClientIdsResponseBodyOnlineStatusList> onlineStatusList;

    /**
     * <p>The request ID. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>63309FDB-ED6C-46AE-B31C-A172FBA0****</p>
     */
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
        /**
         * <p>The ID of the ApsaraMQ for MQTT client. For more information about client IDs, see <a href="https://help.aliyun.com/document_detail/42420.html">Terms</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test@0001</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>Indicates whether the ApsaraMQ for MQTT client is online. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
