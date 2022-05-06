// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    @NameInMap("ConfigParameters")
    public DescribeParametersResponseBodyConfigParameters configParameters;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunningParameters")
    public DescribeParametersResponseBodyRunningParameters runningParameters;

    public static DescribeParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersResponseBody self = new DescribeParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParametersResponseBody setConfigParameters(DescribeParametersResponseBodyConfigParameters configParameters) {
        this.configParameters = configParameters;
        return this;
    }
    public DescribeParametersResponseBodyConfigParameters getConfigParameters() {
        return this.configParameters;
    }

    public DescribeParametersResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeParametersResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParametersResponseBody setRunningParameters(DescribeParametersResponseBodyRunningParameters runningParameters) {
        this.runningParameters = runningParameters;
        return this;
    }
    public DescribeParametersResponseBodyRunningParameters getRunningParameters() {
        return this.runningParameters;
    }

    public static class DescribeParametersResponseBodyConfigParametersDBInstanceParameter extends TeaModel {
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeParametersResponseBodyConfigParametersDBInstanceParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyConfigParametersDBInstanceParameter self = new DescribeParametersResponseBodyConfigParametersDBInstanceParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyConfigParametersDBInstanceParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParametersResponseBodyConfigParametersDBInstanceParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParametersResponseBodyConfigParametersDBInstanceParameter setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeParametersResponseBodyConfigParameters extends TeaModel {
        @NameInMap("DBInstanceParameter")
        public java.util.List<DescribeParametersResponseBodyConfigParametersDBInstanceParameter> DBInstanceParameter;

        public static DescribeParametersResponseBodyConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyConfigParameters self = new DescribeParametersResponseBodyConfigParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyConfigParameters setDBInstanceParameter(java.util.List<DescribeParametersResponseBodyConfigParametersDBInstanceParameter> DBInstanceParameter) {
            this.DBInstanceParameter = DBInstanceParameter;
            return this;
        }
        public java.util.List<DescribeParametersResponseBodyConfigParametersDBInstanceParameter> getDBInstanceParameter() {
            return this.DBInstanceParameter;
        }

    }

    public static class DescribeParametersResponseBodyRunningParametersDBInstanceParameter extends TeaModel {
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeParametersResponseBodyRunningParametersDBInstanceParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyRunningParametersDBInstanceParameter self = new DescribeParametersResponseBodyRunningParametersDBInstanceParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyRunningParametersDBInstanceParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParametersResponseBodyRunningParametersDBInstanceParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParametersResponseBodyRunningParametersDBInstanceParameter setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeParametersResponseBodyRunningParameters extends TeaModel {
        @NameInMap("DBInstanceParameter")
        public java.util.List<DescribeParametersResponseBodyRunningParametersDBInstanceParameter> DBInstanceParameter;

        public static DescribeParametersResponseBodyRunningParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyRunningParameters self = new DescribeParametersResponseBodyRunningParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyRunningParameters setDBInstanceParameter(java.util.List<DescribeParametersResponseBodyRunningParametersDBInstanceParameter> DBInstanceParameter) {
            this.DBInstanceParameter = DBInstanceParameter;
            return this;
        }
        public java.util.List<DescribeParametersResponseBodyRunningParametersDBInstanceParameter> getDBInstanceParameter() {
            return this.DBInstanceParameter;
        }

    }

}
