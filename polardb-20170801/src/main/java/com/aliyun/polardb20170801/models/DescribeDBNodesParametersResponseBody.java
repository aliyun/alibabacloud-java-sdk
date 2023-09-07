// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBNodesParametersResponseBody extends TeaModel {
    /**
     * <p>The IDs of the nodes.</p>
     */
    @NameInMap("DBNodeIds")
    public java.util.List<DescribeDBNodesParametersResponseBodyDBNodeIds> DBNodeIds;

    /**
     * <p>The type of the database engine. Set the value to **MySQL**.</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the MySQL database engine. Valid values:</p>
     * <br>
     * <p>*   **5.6**</p>
     * <p>*   **5.7**</p>
     * <p>*   **8.0**</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The cluster engine.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBNodesParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBNodesParametersResponseBody self = new DescribeDBNodesParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBNodesParametersResponseBody setDBNodeIds(java.util.List<DescribeDBNodesParametersResponseBodyDBNodeIds> DBNodeIds) {
        this.DBNodeIds = DBNodeIds;
        return this;
    }
    public java.util.List<DescribeDBNodesParametersResponseBodyDBNodeIds> getDBNodeIds() {
        return this.DBNodeIds;
    }

    public DescribeDBNodesParametersResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBNodesParametersResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBNodesParametersResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBNodesParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters extends TeaModel {
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
         * <p>*   **1**: no. You can customize the nodes to which the modified parameter value can be synchronized to.</p>
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
         * <p>*   **normal**</p>
         * <p>*   **modifying**</p>
         */
        @NameInMap("ParameterStatus")
        public String parameterStatus;

        /**
         * <p>The value of the parameter.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters self = new DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setDefaultParameterValue(String defaultParameterValue) {
            this.defaultParameterValue = defaultParameterValue;
            return this;
        }
        public String getDefaultParameterValue() {
            return this.defaultParameterValue;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setFactor(String factor) {
            this.factor = factor;
            return this;
        }
        public String getFactor() {
            return this.factor;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setForceRestart(Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Boolean getForceRestart() {
            return this.forceRestart;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setIsModifiable(Boolean isModifiable) {
            this.isModifiable = isModifiable;
            return this;
        }
        public Boolean getIsModifiable() {
            return this.isModifiable;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setIsNodeAvailable(String isNodeAvailable) {
            this.isNodeAvailable = isNodeAvailable;
            return this;
        }
        public String getIsNodeAvailable() {
            return this.isNodeAvailable;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setParamRelyRule(String paramRelyRule) {
            this.paramRelyRule = paramRelyRule;
            return this;
        }
        public String getParamRelyRule() {
            return this.paramRelyRule;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setParameterStatus(String parameterStatus) {
            this.parameterStatus = parameterStatus;
            return this;
        }
        public String getParameterStatus() {
            return this.parameterStatus;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeDBNodesParametersResponseBodyDBNodeIds extends TeaModel {
        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The parameters of the current node.</p>
         */
        @NameInMap("RunningParameters")
        public java.util.List<DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters> runningParameters;

        public static DescribeDBNodesParametersResponseBodyDBNodeIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodesParametersResponseBodyDBNodeIds self = new DescribeDBNodesParametersResponseBodyDBNodeIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIds setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDBNodesParametersResponseBodyDBNodeIds setRunningParameters(java.util.List<DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters> runningParameters) {
            this.runningParameters = runningParameters;
            return this;
        }
        public java.util.List<DescribeDBNodesParametersResponseBodyDBNodeIdsRunningParameters> getRunningParameters() {
            return this.runningParameters;
        }

    }

}
