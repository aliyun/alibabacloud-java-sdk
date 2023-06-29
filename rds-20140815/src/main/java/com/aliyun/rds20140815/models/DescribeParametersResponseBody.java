// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    /**
     * <p>The list of parameters that are being synchronized. After you modify and submit the parameter settings, you must wait for the parameter modifications to be synchronized to the instance. After the synchronization, you can delete the parameters from the list.</p>
     */
    @NameInMap("ConfigParameters")
    public DescribeParametersResponseBodyConfigParameters configParameters;

    /**
     * <p>The type of the database engine.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Parameter template information.</p>
     */
    @NameInMap("ParamGroupInfo")
    public DescribeParametersResponseBodyParamGroupInfo paramGroupInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of parameters that are in use.</p>
     */
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

    public DescribeParametersResponseBody setParamGroupInfo(DescribeParametersResponseBodyParamGroupInfo paramGroupInfo) {
        this.paramGroupInfo = paramGroupInfo;
        return this;
    }
    public DescribeParametersResponseBodyParamGroupInfo getParamGroupInfo() {
        return this.paramGroupInfo;
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
         * <p>The value of the parameter.</p>
         */
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

    public static class DescribeParametersResponseBodyParamGroupInfo extends TeaModel {
        /**
         * <p>Parameter template ID.</p>
         */
        @NameInMap("ParamGroupId")
        public String paramGroupId;

        /**
         * <p>Parameter template description.</p>
         */
        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        /**
         * <p>Parameter template name.</p>
         */
        @NameInMap("ParameterGroupName")
        public String parameterGroupName;

        /**
         * <p>Parameter template type.</p>
         */
        @NameInMap("ParameterGroupType")
        public String parameterGroupType;

        public static DescribeParametersResponseBodyParamGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyParamGroupInfo self = new DescribeParametersResponseBodyParamGroupInfo();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyParamGroupInfo setParamGroupId(String paramGroupId) {
            this.paramGroupId = paramGroupId;
            return this;
        }
        public String getParamGroupId() {
            return this.paramGroupId;
        }

        public DescribeParametersResponseBodyParamGroupInfo setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParametersResponseBodyParamGroupInfo setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParametersResponseBodyParamGroupInfo setParameterGroupType(String parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

    }

    public static class DescribeParametersResponseBodyRunningParametersDBInstanceParameter extends TeaModel {
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
         * <p>The value of the parameter.</p>
         */
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
