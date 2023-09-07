// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterParametersResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database engine that the cluster runs. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **Oracle**</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine. </p>
     * <br>
     * <p>- Valid values for the MySQL database engine:    - **5.6**</p>
     * <p>  - **5.7**</p>
     * <p>  - **8.0**</p>
     * <p>- Valid value for the PostgreSQL database engine:    - **11**</p>
     * <p>  - **14**</p>
     * <p>- Valid value for the Oracle database engine: **11**</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The cluster engine.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The number of parameters.</p>
     */
    @NameInMap("ParameterNumbers")
    public String parameterNumbers;

    /**
     * <p>A comparison between the current parameters of the PolarDB cluster and the parameters of the source RDS instance before migration.</p>
     */
    @NameInMap("Parameters")
    public DescribeDBClusterParametersResponseBodyParameters parameters;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The parameters that are in use.</p>
     */
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
        /**
         * <p>Indicates whether the source parameters and current parameters have the same value.</p>
         */
        @NameInMap("IsEqual")
        public String isEqual;

        /**
         * <p>The description of the parameter of the current cluster.</p>
         */
        @NameInMap("distParameterDescription")
        public String distParameterDescription;

        /**
         * <p>The name of the parameter of the current cluster.</p>
         */
        @NameInMap("distParameterName")
        public String distParameterName;

        /**
         * <p>The valid values of the parameter of the current cluster.</p>
         */
        @NameInMap("distParameterOptional")
        public String distParameterOptional;

        /**
         * <p>The value of the parameter of the current cluster.</p>
         */
        @NameInMap("distParameterValue")
        public String distParameterValue;

        /**
         * <p>The description of the parameter of the source instance.</p>
         */
        @NameInMap("rdsParameterDescription")
        public String rdsParameterDescription;

        /**
         * <p>The name of the parameter of the source instance.</p>
         */
        @NameInMap("rdsParameterName")
        public String rdsParameterName;

        /**
         * <p>The valid values of the parameter of the source instance.</p>
         */
        @NameInMap("rdsParameterOptional")
        public String rdsParameterOptional;

        /**
         * <p>The value of the parameter of the source instance.</p>
         */
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
        /**
         * <p>The valid values of the parameter.</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>The data type of the parameter value. Valid values:</p>
         * <br>
         * <p>*   **INT**</p>
         * <p>*   **STRING**</p>
         * <p>*   **B**</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The default value of the parameter.</p>
         */
        @NameInMap("DefaultParameterValue")
        public String defaultParameterValue;

        /**
         * <p>A divisor of the parameter. For a parameter of the integer or byte type, the valid values must be a multiple of Factor unless you set Factor to 0.</p>
         */
        @NameInMap("Factor")
        public String factor;

        /**
         * <p>Indicates whether a cluster restart is required to allow the parameter modification to take effect. Valid values:</p>
         * <br>
         * <p>*   **false**</p>
         * <p>*   **true**</p>
         */
        @NameInMap("ForceRestart")
        public Boolean forceRestart;

        /**
         * <p>Indicates whether the parameter can be modified. Valid values:</p>
         * <br>
         * <p>*   **false**</p>
         * <p>*   **true**</p>
         */
        @NameInMap("IsModifiable")
        public Boolean isModifiable;

        /**
         * <p>Indicates whether the parameter is a global parameter. Valid values:</p>
         * <br>
         * <p>*   **0**: yes. The modified parameter value is synchronized to other nodes.</p>
         * <p>*   **1**: no. You can customize the nodes to which the modified parameter value can be synchronized.</p>
         */
        @NameInMap("IsNodeAvailable")
        public String isNodeAvailable;

        /**
         * <p>The dependencies of the parameter.</p>
         */
        @NameInMap("ParamRelyRule")
        public String paramRelyRule;

        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The status of the parameter. Valid values:</p>
         * <br>
         * <p>*   **Normal**</p>
         * <p>*   **Modifying**</p>
         */
        @NameInMap("ParameterStatus")
        public String parameterStatus;

        /**
         * <p>The value of the parameter.</p>
         */
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
