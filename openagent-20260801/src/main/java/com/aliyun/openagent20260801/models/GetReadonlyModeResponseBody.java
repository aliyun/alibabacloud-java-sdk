// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class GetReadonlyModeResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetReadonlyModeResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetReadonlyModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReadonlyModeResponseBody self = new GetReadonlyModeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReadonlyModeResponseBody setData(GetReadonlyModeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetReadonlyModeResponseBodyData getData() {
        return this.data;
    }

    public GetReadonlyModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetReadonlyModeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetReadonlyModeResponseBodyData extends TeaModel {
        /**
         * <p>The configuration name. The value is fixed to readonly.</p>
         * 
         * <strong>example:</strong>
         * <p>readonly</p>
         */
        @NameInMap("configName")
        public String configName;

        /**
         * <p>Indicates whether a configuration record exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("exists")
        public Boolean exists;

        /**
         * <p>The last update time in ISO 8601 format. The value is null if no configuration record exists.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtUpdate")
        public String gmtUpdate;

        /**
         * <p>The current effective read-only mode, returned as a string. A value of true indicates that the mode is enabled, and a value of false indicates that the mode is disabled. The value is true if not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("value")
        public String value;

        /**
         * <p>The configuration value type. The value is fixed to BOOL.</p>
         * 
         * <strong>example:</strong>
         * <p>BOOL</p>
         */
        @NameInMap("valueType")
        public String valueType;

        public static GetReadonlyModeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetReadonlyModeResponseBodyData self = new GetReadonlyModeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetReadonlyModeResponseBodyData setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public GetReadonlyModeResponseBodyData setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }
        public Boolean getExists() {
            return this.exists;
        }

        public GetReadonlyModeResponseBodyData setGmtUpdate(String gmtUpdate) {
            this.gmtUpdate = gmtUpdate;
            return this;
        }
        public String getGmtUpdate() {
            return this.gmtUpdate;
        }

        public GetReadonlyModeResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetReadonlyModeResponseBodyData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

}
