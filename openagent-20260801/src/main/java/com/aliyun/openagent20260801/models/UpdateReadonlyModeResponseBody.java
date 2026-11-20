// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class UpdateReadonlyModeResponseBody extends TeaModel {
    /**
     * <p>The current effective configuration information.</p>
     */
    @NameInMap("data")
    public UpdateReadonlyModeResponseBodyData data;

    /**
     * <p>The request ID used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateReadonlyModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateReadonlyModeResponseBody self = new UpdateReadonlyModeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateReadonlyModeResponseBody setData(UpdateReadonlyModeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateReadonlyModeResponseBodyData getData() {
        return this.data;
    }

    public UpdateReadonlyModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateReadonlyModeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateReadonlyModeResponseBodyData extends TeaModel {
        /**
         * <p>The configuration name. The value is fixed as readonly.</p>
         * 
         * <strong>example:</strong>
         * <p>readonly</p>
         */
        @NameInMap("configName")
        public String configName;

        /**
         * <p>Indicates whether a configuration record already exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("exists")
        public Boolean exists;

        /**
         * <p>The last update time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtUpdate")
        public String gmtUpdate;

        /**
         * <p>The current effective configuration value. The value is returned as a string, either true or false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("value")
        public String value;

        /**
         * <p>The type of the configuration value. For this operation, the value is BOOL.</p>
         * 
         * <strong>example:</strong>
         * <p>BOOL</p>
         */
        @NameInMap("valueType")
        public String valueType;

        public static UpdateReadonlyModeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateReadonlyModeResponseBodyData self = new UpdateReadonlyModeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateReadonlyModeResponseBodyData setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public UpdateReadonlyModeResponseBodyData setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }
        public Boolean getExists() {
            return this.exists;
        }

        public UpdateReadonlyModeResponseBodyData setGmtUpdate(String gmtUpdate) {
            this.gmtUpdate = gmtUpdate;
            return this;
        }
        public String getGmtUpdate() {
            return this.gmtUpdate;
        }

        public UpdateReadonlyModeResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateReadonlyModeResponseBodyData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

}
