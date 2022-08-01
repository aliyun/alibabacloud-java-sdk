// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterParametersResponseBody extends TeaModel {
    @NameInMap("DBType")
    public String DBType;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunningParameters")
    public DescribeDBClusterParametersResponseBodyRunningParameters runningParameters;

    public static DescribeDBClusterParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterParametersResponseBody self = new DescribeDBClusterParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterParametersResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBClusterParametersResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterParametersResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBClusterParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterParametersResponseBody setRunningParameters(DescribeDBClusterParametersResponseBodyRunningParameters runningParameters) {
        this.runningParameters = runningParameters;
        return this;
    }
    public DescribeDBClusterParametersResponseBodyRunningParameters getRunningParameters() {
        return this.runningParameters;
    }

    public static class DescribeDBClusterParametersResponseBodyRunningParametersParameter extends TeaModel {
        @NameInMap("CheckingCode")
        public String checkingCode;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DefaultParameterValue")
        public String defaultParameterValue;

        @NameInMap("Factor")
        public String factor;

        @NameInMap("ForceRestart")
        public Boolean forceRestart;

        @NameInMap("IsModifiable")
        public Boolean isModifiable;

        @NameInMap("IsNodeAvailable")
        public String isNodeAvailable;

        @NameInMap("ParamRelyRule")
        public String paramRelyRule;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterStatus")
        public String parameterStatus;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeDBClusterParametersResponseBodyRunningParametersParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterParametersResponseBodyRunningParametersParameter self = new DescribeDBClusterParametersResponseBodyRunningParametersParameter();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setDefaultParameterValue(String defaultParameterValue) {
            this.defaultParameterValue = defaultParameterValue;
            return this;
        }
        public String getDefaultParameterValue() {
            return this.defaultParameterValue;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setFactor(String factor) {
            this.factor = factor;
            return this;
        }
        public String getFactor() {
            return this.factor;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setForceRestart(Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Boolean getForceRestart() {
            return this.forceRestart;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setIsModifiable(Boolean isModifiable) {
            this.isModifiable = isModifiable;
            return this;
        }
        public Boolean getIsModifiable() {
            return this.isModifiable;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setIsNodeAvailable(String isNodeAvailable) {
            this.isNodeAvailable = isNodeAvailable;
            return this;
        }
        public String getIsNodeAvailable() {
            return this.isNodeAvailable;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setParamRelyRule(String paramRelyRule) {
            this.paramRelyRule = paramRelyRule;
            return this;
        }
        public String getParamRelyRule() {
            return this.paramRelyRule;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setParameterStatus(String parameterStatus) {
            this.parameterStatus = parameterStatus;
            return this;
        }
        public String getParameterStatus() {
            return this.parameterStatus;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeDBClusterParametersResponseBodyRunningParameters extends TeaModel {
        @NameInMap("Parameter")
        public java.util.List<DescribeDBClusterParametersResponseBodyRunningParametersParameter> parameter;

        public static DescribeDBClusterParametersResponseBodyRunningParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterParametersResponseBodyRunningParameters self = new DescribeDBClusterParametersResponseBodyRunningParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterParametersResponseBodyRunningParameters setParameter(java.util.List<DescribeDBClusterParametersResponseBodyRunningParametersParameter> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.List<DescribeDBClusterParametersResponseBodyRunningParametersParameter> getParameter() {
            return this.parameter;
        }

    }

}
