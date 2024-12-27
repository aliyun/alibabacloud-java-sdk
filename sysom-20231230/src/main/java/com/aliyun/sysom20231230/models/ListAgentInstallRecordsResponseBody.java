// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAgentInstallRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListAgentInstallRecordsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAgentInstallRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstallRecordsResponseBody self = new ListAgentInstallRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentInstallRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentInstallRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentInstallRecordsResponseBody setData(java.util.List<ListAgentInstallRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentInstallRecordsResponseBodyData> getData() {
        return this.data;
    }

    public ListAgentInstallRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentInstallRecordsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAgentInstallRecordsResponseBodyData extends TeaModel {
        @NameInMap("created_at")
        public String createdAt;

        @NameInMap("instance_id")
        public String instanceId;

        @NameInMap("plugin_id")
        public String pluginId;

        @NameInMap("plugin_version")
        public String pluginVersion;

        @NameInMap("status")
        public String status;

        @NameInMap("updated_at")
        public String updatedAt;

        public static ListAgentInstallRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentInstallRecordsResponseBodyData self = new ListAgentInstallRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentInstallRecordsResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListAgentInstallRecordsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentInstallRecordsResponseBodyData setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListAgentInstallRecordsResponseBodyData setPluginVersion(String pluginVersion) {
            this.pluginVersion = pluginVersion;
            return this;
        }
        public String getPluginVersion() {
            return this.pluginVersion;
        }

        public ListAgentInstallRecordsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAgentInstallRecordsResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
