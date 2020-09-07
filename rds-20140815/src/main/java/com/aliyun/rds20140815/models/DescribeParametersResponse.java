// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParametersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("ConfigParameters")
    @Validation(required = true)
    public DescribeParametersResponseConfigParameters configParameters;

    @NameInMap("RunningParameters")
    @Validation(required = true)
    public DescribeParametersResponseRunningParameters runningParameters;

    public static DescribeParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersResponse self = new DescribeParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParametersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParametersResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeParametersResponse setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeParametersResponse setConfigParameters(DescribeParametersResponseConfigParameters configParameters) {
        this.configParameters = configParameters;
        return this;
    }
    public DescribeParametersResponseConfigParameters getConfigParameters() {
        return this.configParameters;
    }

    public DescribeParametersResponse setRunningParameters(DescribeParametersResponseRunningParameters runningParameters) {
        this.runningParameters = runningParameters;
        return this;
    }
    public DescribeParametersResponseRunningParameters getRunningParameters() {
        return this.runningParameters;
    }

    public static class DescribeParametersResponseConfigParametersDBInstanceParameter extends TeaModel {
        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        public static DescribeParametersResponseConfigParametersDBInstanceParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseConfigParametersDBInstanceParameter self = new DescribeParametersResponseConfigParametersDBInstanceParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseConfigParametersDBInstanceParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParametersResponseConfigParametersDBInstanceParameter setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public DescribeParametersResponseConfigParametersDBInstanceParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

    }

    public static class DescribeParametersResponseConfigParameters extends TeaModel {
        @NameInMap("DBInstanceParameter")
        @Validation(required = true)
        public java.util.List<DescribeParametersResponseConfigParametersDBInstanceParameter> DBInstanceParameter;

        public static DescribeParametersResponseConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseConfigParameters self = new DescribeParametersResponseConfigParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseConfigParameters setDBInstanceParameter(java.util.List<DescribeParametersResponseConfigParametersDBInstanceParameter> DBInstanceParameter) {
            this.DBInstanceParameter = DBInstanceParameter;
            return this;
        }
        public java.util.List<DescribeParametersResponseConfigParametersDBInstanceParameter> getDBInstanceParameter() {
            return this.DBInstanceParameter;
        }

    }

    public static class DescribeParametersResponseRunningParametersDBInstanceParameter extends TeaModel {
        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        public static DescribeParametersResponseRunningParametersDBInstanceParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseRunningParametersDBInstanceParameter self = new DescribeParametersResponseRunningParametersDBInstanceParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseRunningParametersDBInstanceParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParametersResponseRunningParametersDBInstanceParameter setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public DescribeParametersResponseRunningParametersDBInstanceParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

    }

    public static class DescribeParametersResponseRunningParameters extends TeaModel {
        @NameInMap("DBInstanceParameter")
        @Validation(required = true)
        public java.util.List<DescribeParametersResponseRunningParametersDBInstanceParameter> DBInstanceParameter;

        public static DescribeParametersResponseRunningParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseRunningParameters self = new DescribeParametersResponseRunningParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseRunningParameters setDBInstanceParameter(java.util.List<DescribeParametersResponseRunningParametersDBInstanceParameter> DBInstanceParameter) {
            this.DBInstanceParameter = DBInstanceParameter;
            return this;
        }
        public java.util.List<DescribeParametersResponseRunningParametersDBInstanceParameter> getDBInstanceParameter() {
            return this.DBInstanceParameter;
        }

    }

}
