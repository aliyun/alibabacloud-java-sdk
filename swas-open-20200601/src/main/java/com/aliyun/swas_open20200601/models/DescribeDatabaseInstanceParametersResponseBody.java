// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceParametersResponseBody extends TeaModel {
    /**
     * <p>The range of ParameterValue.</p>
     * <blockquote>
     * <p>The value of CheckingCode varies based on the value of ParameterName.</p>
     * </blockquote>
     */
    @NameInMap("ConfigParameters")
    public java.util.List<DescribeDatabaseInstanceParametersResponseBodyConfigParameters> configParameters;

    /**
     * <p>The database engine that the instance runs. The value must be MySQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine. Valid values:</p>
     * <ul>
     * <li>5.7: MySQL 5.7.</li>
     * <li>8.0: MySQL 8.0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5.5</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The range of ParameterValue.</p>
     * <blockquote>
     * <p>The value of CheckingCode varies based on the value of ParameterName.</p>
     * </blockquote>
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
        /**
         * <p>The check code that indicates the valid values of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[1-65535]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>Does it support modifying parameter values. Possible values:</p>
         * <ul>
         * <li><p>true:Support modifying parameter values.</p>
         * </li>
         * <li><p>false:Modifying parameter values is not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ForceModify")
        public String forceModify;

        /**
         * <p>Specifies whether to forcibly restart the instance after parameters are modified. Valid values:</p>
         * <ul>
         * <li>true: forcibly restarts the instance. If a new parameter value takes effect only after the instance restarts, you must set this parameter to true. Otherwise, the new parameter value cannot take effect.</li>
         * <li>false: does not forcibly restart the instance.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForceRestart")
        public String forceRestart;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Auto-increment columns are incremented by this</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_increment_increment</p>
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
        /**
         * <p>The check code that indicates the valid values of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[ON|OFF]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>Does it support modifying parameter values. Possible values:</p>
         * <ul>
         * <li><p>true:Support modifying parameter values.</p>
         * </li>
         * <li><p>false:Modifying parameter values is not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ForceModify")
        public String forceModify;

        /**
         * <p>Specifies whether to forcibly restart the instance after parameters are modified. Valid values:</p>
         * <ul>
         * <li>true: forcibly restarts the instance. If a new parameter value takes effect only after the instance restarts, you must set this parameter to true. Otherwise, the new parameter value cannot take effect.</li>
         * <li>false: does not forcibly restart the instance.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForceRestart")
        public String forceRestart;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>When this variable has a value of 1 (the default), the server automatically grants the EXECUTE and ALTER ROUTINE privileges to the creator of a stored routine, if the user cannot already execute and alter or drop the routine. (The ALTER ROUTINE privilege is required to drop the routine.) The server also automatically drops those privileges from the creator when the routine is dropped. If automatic_sp_privileges is 0, the server does not automatically add or drop these privileges.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>autocommit</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
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
