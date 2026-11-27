// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBNodesParametersResponseBody extends TeaModel {
    /**
     * <p>The list of node IDs.</p>
     */
    @NameInMap("DBNodeIds")
    public java.util.List<DescribeDBNodesParametersResponseBodyDBNodeIds> DBNodeIds;

    /**
     * <p>The database type. The value is fixed as <strong>MySQL</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The MySQL version. Valid values:</p>
     * <ul>
     * <li><p><strong>5.6</strong></p>
     * </li>
     * <li><p><strong>5.7</strong></p>
     * </li>
     * <li><p><strong>8.0</strong></p>
     * </li>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
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
         * <p>The value range of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[utf8|latin1|gbk|utf8mb4]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>The data type of the parameter value. Valid values:</p>
         * <ul>
         * <li><p><strong>INT</strong>: integer</p>
         * </li>
         * <li><p><strong>STRING</strong>: string</p>
         * </li>
         * <li><p><strong>B</strong>: byte</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INT</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        @NameInMap("DefaultParameterValue")
        public String defaultParameterValue;

        /**
         * <p>The divisibility factor. For parameters of the integer and byte types, the parameter value must not only fall within the valid range but also be a multiple of the factor (which cannot be 0).</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Factor")
        public String factor;

        /**
         * <p>Specifies whether a restart is required for the parameter to take effect. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: no</p>
         * </li>
         * <li><p><strong>true</strong>: yes</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ForceRestart")
        public Boolean forceRestart;

        /**
         * <p>Specifies whether the parameter is modifiable. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: not modifiable</p>
         * </li>
         * <li><p><strong>true</strong>: modifiable</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsModifiable")
        public Boolean isModifiable;

        /**
         * <p>Specifies whether the parameter is a global parameter. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The parameter is a global parameter. Parameter modifications have a default application to other nodes and cannot be canceled.</p>
         * </li>
         * <li><p><strong>1</strong>: The parameter is not a global parameter. You can specify the nodes to which modifications to this parameter are applied.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsNodeAvailable")
        public String isNodeAvailable;

        /**
         * <p>The parameter dependency.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        @NameInMap("ParamRelyRule")
        public String paramRelyRule;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>The server&quot;s default character set.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>character_set_server</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The status of the parameter. Valid values:</p>
         * <ul>
         * <li><p><strong>normal</strong>: normal</p>
         * </li>
         * <li><p><strong>modifying</strong>: modifying</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("ParameterStatus")
        public String parameterStatus;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8</p>
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
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-bp1r4qe3s534*****</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The list of running parameters for the current node.</p>
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
