// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAgentInstallRecordsResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is active for end-to-end diagnostics.</p>
     * 
     * <strong>example:</strong>
     * <p>E8CDFBA1-0564-5897-B070-D3C85002AF2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If <code>code == Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization has failed. Check the <code>message</code> field for the detailed fault information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("data")
    public java.util.List<ListAgentInstallRecordsResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the error message for the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The total number of records.</p>
     * 
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
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-27T16:37:53</p>
         */
        @NameInMap("created_at")
        public String createdAt;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp118piqcio9tiwgh84b</p>
         */
        @NameInMap("instance_id")
        public String instanceId;

        /**
         * <p>The component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        @NameInMap("plugin_id")
        public String pluginId;

        /**
         * <p>The plug-in version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.4.0-1</p>
         */
        @NameInMap("plugin_version")
        public String pluginVersion;

        /**
         * <p>The component status.</p>
         * 
         * <strong>example:</strong>
         * <p>Installed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-27T16:37:53</p>
         */
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
