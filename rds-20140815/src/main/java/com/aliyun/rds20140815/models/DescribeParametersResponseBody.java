// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    /**
     * <p>The list of parameters that are being synchronized.</p>
     * <blockquote>
     * <p>After you modify and submit the parameters, you must wait for the parameters to be synchronized to the instance. After the synchronization, you can delete the parameters from the list.</p>
     * </blockquote>
     */
    @NameInMap("ConfigParameters")
    public DescribeParametersResponseBodyConfigParameters configParameters;

    /**
     * <p>The type of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>5.5</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The information about the parameter template.</p>
     */
    @NameInMap("ParamGroupInfo")
    public DescribeParametersResponseBodyParamGroupInfo paramGroupInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
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
         * 
         * <strong>example:</strong>
         * <p>This parameter sets the default fill factor value at the server scope. A fill factor is provided to optimize index data storage and performance.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>fill factor</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
         * <p>The ID of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>rpg-sys-01040401010200</p>
         */
        @NameInMap("ParamGroupId")
        public String paramGroupId;

        /**
         * <p>The description of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>sync_binlog=1000, innodb_flush_log_at_trx_commit=2, async</p>
         */
        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        /**
         * <p>The name of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_innodb_8.0_basic_normal_high</p>
         */
        @NameInMap("ParameterGroupName")
        public String parameterGroupName;

        /**
         * <p>The type of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
        @NameInMap("ParameterDefaultValue")
        public String parameterDefaultValue;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>This parameter sets the default fill factor value at the server scope. A fill factor is provided to optimize index data storage and performance.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>fill factor</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        @NameInMap("ParameterValueRange")
        public String parameterValueRange;

        public static DescribeParametersResponseBodyRunningParametersDBInstanceParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyRunningParametersDBInstanceParameter self = new DescribeParametersResponseBodyRunningParametersDBInstanceParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyRunningParametersDBInstanceParameter setParameterDefaultValue(String parameterDefaultValue) {
            this.parameterDefaultValue = parameterDefaultValue;
            return this;
        }
        public String getParameterDefaultValue() {
            return this.parameterDefaultValue;
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

        public DescribeParametersResponseBodyRunningParametersDBInstanceParameter setParameterValueRange(String parameterValueRange) {
            this.parameterValueRange = parameterValueRange;
            return this;
        }
        public String getParameterValueRange() {
            return this.parameterValueRange;
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
