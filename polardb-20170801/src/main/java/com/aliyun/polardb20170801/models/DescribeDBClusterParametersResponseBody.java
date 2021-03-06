// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterParametersResponseBody extends TeaModel {
    @NameInMap("RunningParameters")
    public DescribeDBClusterParametersResponseBodyRunningParameters runningParameters;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("Engine")
    public String engine;

    public static DescribeDBClusterParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterParametersResponseBody self = new DescribeDBClusterParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterParametersResponseBody setRunningParameters(DescribeDBClusterParametersResponseBodyRunningParameters runningParameters) {
        this.runningParameters = runningParameters;
        return this;
    }
    public DescribeDBClusterParametersResponseBodyRunningParameters getRunningParameters() {
        return this.runningParameters;
    }

    public DescribeDBClusterParametersResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterParametersResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBClusterParametersResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public static class DescribeDBClusterParametersResponseBodyRunningParametersParameter extends TeaModel {
        @NameInMap("CheckingCode")
        public String checkingCode;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        @NameInMap("ForceRestart")
        public Boolean forceRestart;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ParameterStatus")
        public String parameterStatus;

        @NameInMap("DefaultParameterValue")
        public String defaultParameterValue;

        @NameInMap("IsModifiable")
        public Boolean isModifiable;

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

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setForceRestart(Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Boolean getForceRestart() {
            return this.forceRestart;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setParameterStatus(String parameterStatus) {
            this.parameterStatus = parameterStatus;
            return this;
        }
        public String getParameterStatus() {
            return this.parameterStatus;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setDefaultParameterValue(String defaultParameterValue) {
            this.defaultParameterValue = defaultParameterValue;
            return this;
        }
        public String getDefaultParameterValue() {
            return this.defaultParameterValue;
        }

        public DescribeDBClusterParametersResponseBodyRunningParametersParameter setIsModifiable(Boolean isModifiable) {
            this.isModifiable = isModifiable;
            return this;
        }
        public Boolean getIsModifiable() {
            return this.isModifiable;
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
