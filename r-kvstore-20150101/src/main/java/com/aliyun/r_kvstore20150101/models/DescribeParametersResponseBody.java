// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    /**
     * <p>The configuration parameters.</p>
     */
    @NameInMap("ConfigParameters")
    public DescribeParametersResponseBodyConfigParameters configParameters;

    /**
     * <p>The database engine that the instance runs.</p>
     * 
     * <strong>example:</strong>
     * <p>redis</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>4.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9C1338BE-8DE8-4890-A900-E1BC06BF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The running parameters.</p>
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

    public static class DescribeParametersResponseBodyConfigParametersParameter extends TeaModel {
        /**
         * <p>The check code that indicates the valid values of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[0|1]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>Indicates whether the instance must be restarted for the modifications to take effect. Valid values:</p>
         * <ul>
         * <li><strong>True</strong>: The instance must be restarted for the modifications to take effect.</li>
         * <li><strong>False</strong>: The instance does not need to be restarted for the modifications to take effect. Modifications immediately take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ForceRestart")
        public Boolean forceRestart;

        /**
         * <p>Indicates whether the parameter can be reset. Valid values:</p>
         * <ul>
         * <li><strong>False</strong>: The parameter cannot be reset.</li>
         * <li><strong>True</strong>: The parameter can be reset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifiableStatus")
        public Boolean modifiableStatus;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Check all keys passed in the KEYS array map to the same slot.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>script_check_enable</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeParametersResponseBodyConfigParametersParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyConfigParametersParameter self = new DescribeParametersResponseBodyConfigParametersParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyConfigParametersParameter setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeParametersResponseBodyConfigParametersParameter setForceRestart(Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Boolean getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParametersResponseBodyConfigParametersParameter setModifiableStatus(Boolean modifiableStatus) {
            this.modifiableStatus = modifiableStatus;
            return this;
        }
        public Boolean getModifiableStatus() {
            return this.modifiableStatus;
        }

        public DescribeParametersResponseBodyConfigParametersParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParametersResponseBodyConfigParametersParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParametersResponseBodyConfigParametersParameter setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeParametersResponseBodyConfigParameters extends TeaModel {
        @NameInMap("Parameter")
        public java.util.List<DescribeParametersResponseBodyConfigParametersParameter> parameter;

        public static DescribeParametersResponseBodyConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyConfigParameters self = new DescribeParametersResponseBodyConfigParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyConfigParameters setParameter(java.util.List<DescribeParametersResponseBodyConfigParametersParameter> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.List<DescribeParametersResponseBodyConfigParametersParameter> getParameter() {
            return this.parameter;
        }

    }

    public static class DescribeParametersResponseBodyRunningParametersParameter extends TeaModel {
        /**
         * <p>The check code that indicates the valid values of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[0|1]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>Indicates whether the instance must be restarted for the modifications to take effect. Valid values:</p>
         * <ul>
         * <li><strong>True</strong>: The instance must be restarted for the modifications to take effect.</li>
         * <li><strong>False</strong>: The instance does not need to be restarted for the modifications to take effect. Modifications immediately take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ForceRestart")
        public String forceRestart;

        /**
         * <p>Indicates whether the parameter can be reset. Valid values:</p>
         * <ul>
         * <li><strong>False</strong>: The parameter cannot be reset.</li>
         * <li><strong>True</strong>: The parameter can be reset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModifiableStatus")
        public String modifiableStatus;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>You can disable some dangerous commands, for example \&quot;keys,flushdb,flushall\&quot;, the commands must be in [flushall,flushdb,keys,hgetall,eval,evalsha,script].</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>#no_loose_disabled-commands</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>keys,flushall,flushdb</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeParametersResponseBodyRunningParametersParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyRunningParametersParameter self = new DescribeParametersResponseBodyRunningParametersParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyRunningParametersParameter setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeParametersResponseBodyRunningParametersParameter setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParametersResponseBodyRunningParametersParameter setModifiableStatus(String modifiableStatus) {
            this.modifiableStatus = modifiableStatus;
            return this;
        }
        public String getModifiableStatus() {
            return this.modifiableStatus;
        }

        public DescribeParametersResponseBodyRunningParametersParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParametersResponseBodyRunningParametersParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParametersResponseBodyRunningParametersParameter setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeParametersResponseBodyRunningParameters extends TeaModel {
        @NameInMap("Parameter")
        public java.util.List<DescribeParametersResponseBodyRunningParametersParameter> parameter;

        public static DescribeParametersResponseBodyRunningParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyRunningParameters self = new DescribeParametersResponseBodyRunningParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyRunningParameters setParameter(java.util.List<DescribeParametersResponseBodyRunningParametersParameter> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.List<DescribeParametersResponseBodyRunningParametersParameter> getParameter() {
            return this.parameter;
        }

    }

}
