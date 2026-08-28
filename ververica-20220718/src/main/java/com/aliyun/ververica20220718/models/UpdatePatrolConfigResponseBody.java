// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdatePatrolConfigResponseBody extends TeaModel {
    /**
     * <p>The inspection configuration response data.</p>
     */
    @NameInMap("data")
    public UpdatePatrolConfigResponseBodyData data;

    /**
     * <p>The error code. This parameter is not empty when success is false. This parameter is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message. This parameter is not empty when success is false. This parameter is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code, which is always 200. Use the success parameter to determine whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdatePatrolConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePatrolConfigResponseBody self = new UpdatePatrolConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePatrolConfigResponseBody setData(UpdatePatrolConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdatePatrolConfigResponseBodyData getData() {
        return this.data;
    }

    public UpdatePatrolConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdatePatrolConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdatePatrolConfigResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdatePatrolConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePatrolConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdatePatrolConfigResponseBodyDataScopeConfig extends TeaModel {
        /**
         * <p>The list of deployment IDs. This parameter is valid only when scopeType is set to DEPLOYMENTS.</p>
         */
        @NameInMap("deploymentIds")
        public java.util.List<String> deploymentIds;

        /**
         * <p>The tag mapping. This parameter is valid only when scopeType is set to TAGS. The key is the tag name, and the value is a list of tag values.</p>
         */
        @NameInMap("tags")
        public java.util.Map<String, java.util.List<String>> tags;

        public static UpdatePatrolConfigResponseBodyDataScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdatePatrolConfigResponseBodyDataScopeConfig self = new UpdatePatrolConfigResponseBodyDataScopeConfig();
            return TeaModel.build(map, self);
        }

        public UpdatePatrolConfigResponseBodyDataScopeConfig setDeploymentIds(java.util.List<String> deploymentIds) {
            this.deploymentIds = deploymentIds;
            return this;
        }
        public java.util.List<String> getDeploymentIds() {
            return this.deploymentIds;
        }

        public UpdatePatrolConfigResponseBodyDataScopeConfig setTags(java.util.Map<String, java.util.List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getTags() {
            return this.tags;
        }

    }

    public static class UpdatePatrolConfigResponseBodyData extends TeaModel {
        /**
         * <p>The configuration creation time, in milliseconds (UNIX timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1756200000000</p>
         */
        @NameInMap("configCreatedAt")
        public Long configCreatedAt;

        /**
         * <p>The configuration update time, in milliseconds (UNIX timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1756250000000</p>
         */
        @NameInMap("configUpdatedAt")
        public Long configUpdatedAt;

        /**
         * <p>The cron expression that defines the inspection scheduling time.</p>
         * 
         * <strong>example:</strong>
         * <p>0 2 * * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>Specifies whether to enable the inspection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The next inspection time, in milliseconds (UNIX timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1756260000000</p>
         */
        @NameInMap("nextPatrolAt")
        public Long nextPatrolAt;

        /**
         * <p>The inspection scope configuration.</p>
         */
        @NameInMap("scopeConfig")
        public UpdatePatrolConfigResponseBodyDataScopeConfig scopeConfig;

        /**
         * <p>The inspection scope type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("scopeType")
        public String scopeType;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bda1c4a****</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static UpdatePatrolConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdatePatrolConfigResponseBodyData self = new UpdatePatrolConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdatePatrolConfigResponseBodyData setConfigCreatedAt(Long configCreatedAt) {
            this.configCreatedAt = configCreatedAt;
            return this;
        }
        public Long getConfigCreatedAt() {
            return this.configCreatedAt;
        }

        public UpdatePatrolConfigResponseBodyData setConfigUpdatedAt(Long configUpdatedAt) {
            this.configUpdatedAt = configUpdatedAt;
            return this;
        }
        public Long getConfigUpdatedAt() {
            return this.configUpdatedAt;
        }

        public UpdatePatrolConfigResponseBodyData setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdatePatrolConfigResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdatePatrolConfigResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdatePatrolConfigResponseBodyData setNextPatrolAt(Long nextPatrolAt) {
            this.nextPatrolAt = nextPatrolAt;
            return this;
        }
        public Long getNextPatrolAt() {
            return this.nextPatrolAt;
        }

        public UpdatePatrolConfigResponseBodyData setScopeConfig(UpdatePatrolConfigResponseBodyDataScopeConfig scopeConfig) {
            this.scopeConfig = scopeConfig;
            return this;
        }
        public UpdatePatrolConfigResponseBodyDataScopeConfig getScopeConfig() {
            return this.scopeConfig;
        }

        public UpdatePatrolConfigResponseBodyData setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public UpdatePatrolConfigResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public UpdatePatrolConfigResponseBodyData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
