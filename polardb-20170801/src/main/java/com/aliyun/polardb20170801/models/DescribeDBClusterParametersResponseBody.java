// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterParametersResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1s826a1up******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database engine that the clusters runs. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>Oracle</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine. </p>
     * <ul>
     * <li>Valid values for the MySQL database engine:   <ul>
     * <li><strong>5.6</strong></li>
     * <li><strong>5.7</strong></li>
     * <li><strong>8.0</strong></li>
     * </ul>
     * </li>
     * <li>Valid value for the PostgreSQL database engine:    <ul>
     * <li><strong>11</strong></li>
     * <li><strong>14</strong></li>
     * </ul>
     * </li>
     * <li>Valid value for the Oracle database engine:  <strong>11</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The cluster engine.</p>
     * 
     * <strong>example:</strong>
     * <p>POLARDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The number of parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ParameterNumbers")
    public String parameterNumbers;

    @NameInMap("Parameters")
    public DescribeDBClusterParametersResponseBodyParameters parameters;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunningParameters")
    public DescribeDBClusterParametersResponseBodyRunningParameters runningParameters;

    public static DescribeDBClusterParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterParametersResponseBody self = new DescribeDBClusterParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterParametersResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
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

    public DescribeDBClusterParametersResponseBody setParameterNumbers(String parameterNumbers) {
        this.parameterNumbers = parameterNumbers;
        return this;
    }
    public String getParameterNumbers() {
        return this.parameterNumbers;
    }

    public DescribeDBClusterParametersResponseBody setParameters(DescribeDBClusterParametersResponseBodyParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public DescribeDBClusterParametersResponseBodyParameters getParameters() {
        return this.parameters;
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

    public static class DescribeDBClusterParametersResponseBodyParametersParameters extends TeaModel {
        @NameInMap("IsEqual")
        public String isEqual;

        @NameInMap("IsInstancePolarDBKey")
        public String isInstancePolarDBKey;

        @NameInMap("IsInstanceRdsKey")
        public String isInstanceRdsKey;

        @NameInMap("IsPolarDBKey")
        public String isPolarDBKey;

        @NameInMap("IsRdsKey")
        public String isRdsKey;

        @NameInMap("distParameterDescription")
        public String distParameterDescription;

        @NameInMap("distParameterName")
        public String distParameterName;

        @NameInMap("distParameterOptional")
        public String distParameterOptional;

        @NameInMap("distParameterValue")
        public String distParameterValue;

        @NameInMap("rdsParameterDescription")
        public String rdsParameterDescription;

        @NameInMap("rdsParameterName")
        public String rdsParameterName;

        @NameInMap("rdsParameterOptional")
        public String rdsParameterOptional;

        @NameInMap("rdsParameterValue")
        public String rdsParameterValue;

        public static DescribeDBClusterParametersResponseBodyParametersParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterParametersResponseBodyParametersParameters self = new DescribeDBClusterParametersResponseBodyParametersParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setIsEqual(String isEqual) {
            this.isEqual = isEqual;
            return this;
        }
        public String getIsEqual() {
            return this.isEqual;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setIsInstancePolarDBKey(String isInstancePolarDBKey) {
            this.isInstancePolarDBKey = isInstancePolarDBKey;
            return this;
        }
        public String getIsInstancePolarDBKey() {
            return this.isInstancePolarDBKey;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setIsInstanceRdsKey(String isInstanceRdsKey) {
            this.isInstanceRdsKey = isInstanceRdsKey;
            return this;
        }
        public String getIsInstanceRdsKey() {
            return this.isInstanceRdsKey;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setIsPolarDBKey(String isPolarDBKey) {
            this.isPolarDBKey = isPolarDBKey;
            return this;
        }
        public String getIsPolarDBKey() {
            return this.isPolarDBKey;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setIsRdsKey(String isRdsKey) {
            this.isRdsKey = isRdsKey;
            return this;
        }
        public String getIsRdsKey() {
            return this.isRdsKey;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setDistParameterDescription(String distParameterDescription) {
            this.distParameterDescription = distParameterDescription;
            return this;
        }
        public String getDistParameterDescription() {
            return this.distParameterDescription;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setDistParameterName(String distParameterName) {
            this.distParameterName = distParameterName;
            return this;
        }
        public String getDistParameterName() {
            return this.distParameterName;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setDistParameterOptional(String distParameterOptional) {
            this.distParameterOptional = distParameterOptional;
            return this;
        }
        public String getDistParameterOptional() {
            return this.distParameterOptional;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setDistParameterValue(String distParameterValue) {
            this.distParameterValue = distParameterValue;
            return this;
        }
        public String getDistParameterValue() {
            return this.distParameterValue;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setRdsParameterDescription(String rdsParameterDescription) {
            this.rdsParameterDescription = rdsParameterDescription;
            return this;
        }
        public String getRdsParameterDescription() {
            return this.rdsParameterDescription;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setRdsParameterName(String rdsParameterName) {
            this.rdsParameterName = rdsParameterName;
            return this;
        }
        public String getRdsParameterName() {
            return this.rdsParameterName;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setRdsParameterOptional(String rdsParameterOptional) {
            this.rdsParameterOptional = rdsParameterOptional;
            return this;
        }
        public String getRdsParameterOptional() {
            return this.rdsParameterOptional;
        }

        public DescribeDBClusterParametersResponseBodyParametersParameters setRdsParameterValue(String rdsParameterValue) {
            this.rdsParameterValue = rdsParameterValue;
            return this;
        }
        public String getRdsParameterValue() {
            return this.rdsParameterValue;
        }

    }

    public static class DescribeDBClusterParametersResponseBodyParameters extends TeaModel {
        @NameInMap("Parameters")
        public java.util.List<DescribeDBClusterParametersResponseBodyParametersParameters> parameters;

        public static DescribeDBClusterParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterParametersResponseBodyParameters self = new DescribeDBClusterParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterParametersResponseBodyParameters setParameters(java.util.List<DescribeDBClusterParametersResponseBodyParametersParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<DescribeDBClusterParametersResponseBodyParametersParameters> getParameters() {
            return this.parameters;
        }

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
