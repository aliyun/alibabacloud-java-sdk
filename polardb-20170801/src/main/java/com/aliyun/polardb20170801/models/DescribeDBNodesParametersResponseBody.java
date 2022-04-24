// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBNodesParametersResponseBody extends TeaModel {
    @NameInMap("DBNodeIds")
    public java.util.List<DescribeDBNodesParametersResponseBodyDBNodeIds> DBNodeIds;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("Engine")
    public String engine;

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
        @NameInMap("CheckingCode")
        public String checkingCode;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DefaultParameterValue")
        public String defaultParameterValue;

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
        @NameInMap("DBNodeId")
        public String DBNodeId;

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
