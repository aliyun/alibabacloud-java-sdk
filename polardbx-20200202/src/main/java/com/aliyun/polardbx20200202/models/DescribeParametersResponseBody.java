// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeParametersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersResponseBody self = new DescribeParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParametersResponseBody setData(DescribeParametersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeParametersResponseBodyData getData() {
        return this.data;
    }

    public DescribeParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParametersResponseBodyDataConfigParameters extends TeaModel {
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <strong>example:</strong>
         * <p>CONN_POOL_XPROTO_STORAGE_DB_PORT</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeParametersResponseBodyDataConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyDataConfigParameters self = new DescribeParametersResponseBodyDataConfigParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyDataConfigParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParametersResponseBodyDataConfigParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParametersResponseBodyDataConfigParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeParametersResponseBodyDataRunningParameters extends TeaModel {
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <strong>example:</strong>
         * <p>CONN_POOL_XPROTO_STORAGE_DB_PORT</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeParametersResponseBodyDataRunningParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyDataRunningParameters self = new DescribeParametersResponseBodyDataRunningParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyDataRunningParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParametersResponseBodyDataRunningParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParametersResponseBodyDataRunningParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeParametersResponseBodyData extends TeaModel {
        @NameInMap("ConfigParameters")
        public java.util.List<DescribeParametersResponseBodyDataConfigParameters> configParameters;

        /**
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("RunningParameters")
        public java.util.List<DescribeParametersResponseBodyDataRunningParameters> runningParameters;

        public static DescribeParametersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyData self = new DescribeParametersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyData setConfigParameters(java.util.List<DescribeParametersResponseBodyDataConfigParameters> configParameters) {
            this.configParameters = configParameters;
            return this;
        }
        public java.util.List<DescribeParametersResponseBodyDataConfigParameters> getConfigParameters() {
            return this.configParameters;
        }

        public DescribeParametersResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeParametersResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeParametersResponseBodyData setRunningParameters(java.util.List<DescribeParametersResponseBodyDataRunningParameters> runningParameters) {
            this.runningParameters = runningParameters;
            return this;
        }
        public java.util.List<DescribeParametersResponseBodyDataRunningParameters> getRunningParameters() {
            return this.runningParameters;
        }

    }

}
