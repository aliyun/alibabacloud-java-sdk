// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("ConfigParameters")
    public DescribeParametersResponseBodyConfigParameters configParameters;

    @NameInMap("RunningParameters")
    public DescribeParametersResponseBodyRunningParameters runningParameters;

    public static DescribeParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersResponseBody self = new DescribeParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeParametersResponseBody setConfigParameters(DescribeParametersResponseBodyConfigParameters configParameters) {
        this.configParameters = configParameters;
        return this;
    }
    public DescribeParametersResponseBodyConfigParameters getConfigParameters() {
        return this.configParameters;
    }

    public DescribeParametersResponseBody setRunningParameters(DescribeParametersResponseBodyRunningParameters runningParameters) {
        this.runningParameters = runningParameters;
        return this;
    }
    public DescribeParametersResponseBodyRunningParameters getRunningParameters() {
        return this.runningParameters;
    }

    public static class DescribeParametersResponseBodyConfigParametersParameter extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        @NameInMap("ModifiableStatus")
        public Boolean modifiableStatus;

        @NameInMap("ForceRestart")
        public Boolean forceRestart;

        @NameInMap("CheckingCode")
        public String checkingCode;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        public static DescribeParametersResponseBodyConfigParametersParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyConfigParametersParameter self = new DescribeParametersResponseBodyConfigParametersParameter();
            return TeaModel.build(map, self);
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

        public DescribeParametersResponseBodyConfigParametersParameter setModifiableStatus(Boolean modifiableStatus) {
            this.modifiableStatus = modifiableStatus;
            return this;
        }
        public Boolean getModifiableStatus() {
            return this.modifiableStatus;
        }

        public DescribeParametersResponseBodyConfigParametersParameter setForceRestart(Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Boolean getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParametersResponseBodyConfigParametersParameter setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeParametersResponseBodyConfigParametersParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
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
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        @NameInMap("ModifiableStatus")
        public String modifiableStatus;

        @NameInMap("ForceRestart")
        public String forceRestart;

        @NameInMap("CheckingCode")
        public String checkingCode;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        public static DescribeParametersResponseBodyRunningParametersParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyRunningParametersParameter self = new DescribeParametersResponseBodyRunningParametersParameter();
            return TeaModel.build(map, self);
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

        public DescribeParametersResponseBodyRunningParametersParameter setModifiableStatus(String modifiableStatus) {
            this.modifiableStatus = modifiableStatus;
            return this;
        }
        public String getModifiableStatus() {
            return this.modifiableStatus;
        }

        public DescribeParametersResponseBodyRunningParametersParameter setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParametersResponseBodyRunningParametersParameter setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeParametersResponseBodyRunningParametersParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
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
