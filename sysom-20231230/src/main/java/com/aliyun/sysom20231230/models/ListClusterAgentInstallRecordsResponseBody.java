// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListClusterAgentInstallRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B149FD9C-ED5C-5765-B3AD-05AA4A4D64D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListClusterAgentInstallRecordsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListClusterAgentInstallRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAgentInstallRecordsResponseBody self = new ListClusterAgentInstallRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterAgentInstallRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterAgentInstallRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListClusterAgentInstallRecordsResponseBody setData(java.util.List<ListClusterAgentInstallRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClusterAgentInstallRecordsResponseBodyData> getData() {
        return this.data;
    }

    public ListClusterAgentInstallRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterAgentInstallRecordsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListClusterAgentInstallRecordsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cbf7a37bc905d4682a3338b3744810269</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>2024-12-25T15:08:19</p>
         */
        @NameInMap("created_at")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        @NameInMap("plugin_id")
        public String pluginId;

        /**
         * <strong>example:</strong>
         * <p>3.4.0-1</p>
         */
        @NameInMap("plugin_version")
        public String pluginVersion;

        /**
         * <strong>example:</strong>
         * <p>2024-12-25T15:08:19</p>
         */
        @NameInMap("updated_at")
        public String updatedAt;

        public static ListClusterAgentInstallRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterAgentInstallRecordsResponseBodyData self = new ListClusterAgentInstallRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClusterAgentInstallRecordsResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterAgentInstallRecordsResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListClusterAgentInstallRecordsResponseBodyData setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListClusterAgentInstallRecordsResponseBodyData setPluginVersion(String pluginVersion) {
            this.pluginVersion = pluginVersion;
            return this;
        }
        public String getPluginVersion() {
            return this.pluginVersion;
        }

        public ListClusterAgentInstallRecordsResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
