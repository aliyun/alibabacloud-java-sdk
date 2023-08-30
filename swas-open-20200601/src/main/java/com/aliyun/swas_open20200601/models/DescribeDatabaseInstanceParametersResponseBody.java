// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceParametersResponseBody extends TeaModel {
    /**
     * <p>The range of ParameterValue.</p>
     * <br>
     * <p>> The value of CheckingCode varies based on the value of ParameterName.</p>
     */
    @NameInMap("ConfigParameters")
    public java.util.List<DescribeDatabaseInstanceParametersResponseBodyConfigParameters> configParameters;

    /**
     * <p>The database engine that the instance runs. The value must be MySQL.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine. Valid values:</p>
     * <br>
     * <p>*   5.7: MySQL 5.7.</p>
     * <p>*   8.0: MySQL 8.0.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The range of ParameterValue.</p>
     * <br>
     * <p>> The value of CheckingCode varies based on the value of ParameterName.</p>
     */
    @NameInMap("RunningParameters")
    public java.util.List<DescribeDatabaseInstanceParametersResponseBodyRunningParameters> runningParameters;

    public static DescribeDatabaseInstanceParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseInstanceParametersResponseBody self = new DescribeDatabaseInstanceParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseInstanceParametersResponseBody setConfigParameters(java.util.List<DescribeDatabaseInstanceParametersResponseBodyConfigParameters> configParameters) {
        this.configParameters = configParameters;
        return this;
    }
    public java.util.List<DescribeDatabaseInstanceParametersResponseBodyConfigParameters> getConfigParameters() {
        return this.configParameters;
    }

    public DescribeDatabaseInstanceParametersResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDatabaseInstanceParametersResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDatabaseInstanceParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatabaseInstanceParametersResponseBody setRunningParameters(java.util.List<DescribeDatabaseInstanceParametersResponseBodyRunningParameters> runningParameters) {
        this.runningParameters = runningParameters;
        return this;
    }
    public java.util.List<DescribeDatabaseInstanceParametersResponseBodyRunningParameters> getRunningParameters() {
        return this.runningParameters;
    }

    public static class DescribeDatabaseInstanceParametersResponseBodyConfigParameters extends TeaModel {
        @NameInMap("CheckingCode")
        public String checkingCode;

        @NameInMap("ForceModify")
        public String forceModify;

        @NameInMap("ForceRestart")
        public String forceRestart;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeDatabaseInstanceParametersResponseBodyConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabaseInstanceParametersResponseBodyConfigParameters self = new DescribeDatabaseInstanceParametersResponseBodyConfigParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDatabaseInstanceParametersResponseBodyConfigParameters setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeDatabaseInstanceParametersResponseBodyConfigParameters setForceModify(String forceModify) {
            this.forceModify = forceModify;
            return this;
        }
        public String getForceModify() {
            return this.forceModify;
        }

        public DescribeDatabaseInstanceParametersResponseBodyConfigParameters setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
            return this.forceRestart;
        }

        public DescribeDatabaseInstanceParametersResponseBodyConfigParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeDatabaseInstanceParametersResponseBodyConfigParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeDatabaseInstanceParametersResponseBodyConfigParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeDatabaseInstanceParametersResponseBodyRunningParameters extends TeaModel {
        @NameInMap("CheckingCode")
        public String checkingCode;

        @NameInMap("ForceModify")
        public String forceModify;

        @NameInMap("ForceRestart")
        public String forceRestart;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeDatabaseInstanceParametersResponseBodyRunningParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabaseInstanceParametersResponseBodyRunningParameters self = new DescribeDatabaseInstanceParametersResponseBodyRunningParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDatabaseInstanceParametersResponseBodyRunningParameters setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeDatabaseInstanceParametersResponseBodyRunningParameters setForceModify(String forceModify) {
            this.forceModify = forceModify;
            return this;
        }
        public String getForceModify() {
            return this.forceModify;
        }

        public DescribeDatabaseInstanceParametersResponseBodyRunningParameters setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
            return this.forceRestart;
        }

        public DescribeDatabaseInstanceParametersResponseBodyRunningParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeDatabaseInstanceParametersResponseBodyRunningParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeDatabaseInstanceParametersResponseBodyRunningParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
