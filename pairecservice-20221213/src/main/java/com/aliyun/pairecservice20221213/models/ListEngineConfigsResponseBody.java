// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListEngineConfigsResponseBody extends TeaModel {
    /**
     * <p>A list of engine configurations.</p>
     */
    @NameInMap("EngineConfigs")
    public java.util.List<ListEngineConfigsResponseBodyEngineConfigs> engineConfigs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>74D958EF-3598-56FA-8296-FF1575CE43DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListEngineConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEngineConfigsResponseBody self = new ListEngineConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEngineConfigsResponseBody setEngineConfigs(java.util.List<ListEngineConfigsResponseBodyEngineConfigs> engineConfigs) {
        this.engineConfigs = engineConfigs;
        return this;
    }
    public java.util.List<ListEngineConfigsResponseBodyEngineConfigs> getEngineConfigs() {
        return this.engineConfigs;
    }

    public ListEngineConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEngineConfigsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListEngineConfigsResponseBodyEngineConfigs extends TeaModel {
        /**
         * <p>The content of the engine configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>The description of the engine configuration.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the engine configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EngineConfigId")
        public String engineConfigId;

        /**
         * <p>The environment. Valid values:</p>
         * <ul>
         * <li><p><strong>Daily</strong>: the development and test environment.</p>
         * </li>
         * <li><p><strong>Pre</strong>: the pre-production environment.</p>
         * </li>
         * <li><p><strong>Prod</strong>: the production environment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pre</p>
         */
        @NameInMap("Environment")
        public String environment;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-07T01:43:42Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-27T12:00:00Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The release time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-29 12:00:00</p>
         */
        @NameInMap("GmtReleasedTime")
        public String gmtReleasedTime;

        /**
         * <p>The name of the engine configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>engine_config_v1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the engine configuration. Valid values:</p>
         * <ul>
         * <li><p><strong>Released</strong>: The configuration has been released.</p>
         * </li>
         * <li><p><strong>Unreleased</strong>: The configuration has not been released.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Released</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version of the currently released or most recently updated engine configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>20230509161300</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListEngineConfigsResponseBodyEngineConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListEngineConfigsResponseBodyEngineConfigs self = new ListEngineConfigsResponseBodyEngineConfigs();
            return TeaModel.build(map, self);
        }

        public ListEngineConfigsResponseBodyEngineConfigs setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ListEngineConfigsResponseBodyEngineConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEngineConfigsResponseBodyEngineConfigs setEngineConfigId(String engineConfigId) {
            this.engineConfigId = engineConfigId;
            return this;
        }
        public String getEngineConfigId() {
            return this.engineConfigId;
        }

        public ListEngineConfigsResponseBodyEngineConfigs setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public ListEngineConfigsResponseBodyEngineConfigs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListEngineConfigsResponseBodyEngineConfigs setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListEngineConfigsResponseBodyEngineConfigs setGmtReleasedTime(String gmtReleasedTime) {
            this.gmtReleasedTime = gmtReleasedTime;
            return this;
        }
        public String getGmtReleasedTime() {
            return this.gmtReleasedTime;
        }

        public ListEngineConfigsResponseBodyEngineConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEngineConfigsResponseBodyEngineConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEngineConfigsResponseBodyEngineConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
