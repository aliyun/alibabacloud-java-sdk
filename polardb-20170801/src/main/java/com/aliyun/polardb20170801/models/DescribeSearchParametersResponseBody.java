// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSearchParametersResponseBody extends TeaModel {
    /**
     * <p>The ID of the PolarDB primary cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zex82f527he****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The Search engine version, which is not the MySQL version of the primary cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>3.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The type of the Search engine.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb_search</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e3a24663-eee5-4009-b635-2e9e8d052e74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The visible parameters and their modification statuses.</p>
     */
    @NameInMap("RunningParameters")
    public DescribeSearchParametersResponseBodyRunningParameters runningParameters;

    public static DescribeSearchParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchParametersResponseBody self = new DescribeSearchParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSearchParametersResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSearchParametersResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeSearchParametersResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeSearchParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSearchParametersResponseBody setRunningParameters(DescribeSearchParametersResponseBodyRunningParameters runningParameters) {
        this.runningParameters = runningParameters;
        return this;
    }
    public DescribeSearchParametersResponseBodyRunningParameters getRunningParameters() {
        return this.runningParameters;
    }

    public static class DescribeSearchParametersResponseBodyRunningParametersParameter extends TeaModel {
        /**
         * <p>The value rule of the template, which can be a numeric range, an enumeration, or a regular expression. This rule must be interpreted in combination with the DataType field.</p>
         * 
         * <strong>example:</strong>
         * <p>[true\|false]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>The data type of the parameter value. Valid values: INT, DOUBLE, B/BYTE, MEMORY, PERCENT, TIME, BOOLEAN, and STRING. The MEMORY type supports percentages or capacities with units.</p>
         * 
         * <strong>example:</strong>
         * <p>BOOLEAN</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The default value of the current active template, which is independent of the value modified by the user.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultParameterValue")
        public String defaultParameterValue;

        /**
         * <p>The divisibility factor. If the value is not zero, the numeric value parsed based on the templatetype must be a multiple of this factor.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Factor")
        public String factor;

        /**
         * <p>Specifies whether a restart is required for the modification to take effect. The value is true for static parameters and false for dynamic parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForceRestart")
        public Boolean forceRestart;

        /**
         * <p>Specifies whether the user is allowed to modify the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsModifiable")
        public Boolean isModifiable;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter description</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>prometheus.indices</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The modification status of the parameter. A value of Normal indicates that no modifications are pending. A value of Modifying indicates that the modification task is not completed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ParameterStatus")
        public String parameterStatus;

        /**
         * <p>The configuration value on the control plane. If a modification is in progress, the value to be applied is displayed. This value is not read from the kernel in real time.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeSearchParametersResponseBodyRunningParametersParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeSearchParametersResponseBodyRunningParametersParameter self = new DescribeSearchParametersResponseBodyRunningParametersParameter();
            return TeaModel.build(map, self);
        }

        public DescribeSearchParametersResponseBodyRunningParametersParameter setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeSearchParametersResponseBodyRunningParametersParameter setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeSearchParametersResponseBodyRunningParametersParameter setDefaultParameterValue(String defaultParameterValue) {
            this.defaultParameterValue = defaultParameterValue;
            return this;
        }
        public String getDefaultParameterValue() {
            return this.defaultParameterValue;
        }

        public DescribeSearchParametersResponseBodyRunningParametersParameter setFactor(String factor) {
            this.factor = factor;
            return this;
        }
        public String getFactor() {
            return this.factor;
        }

        public DescribeSearchParametersResponseBodyRunningParametersParameter setForceRestart(Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Boolean getForceRestart() {
            return this.forceRestart;
        }

        public DescribeSearchParametersResponseBodyRunningParametersParameter setIsModifiable(Boolean isModifiable) {
            this.isModifiable = isModifiable;
            return this;
        }
        public Boolean getIsModifiable() {
            return this.isModifiable;
        }

        public DescribeSearchParametersResponseBodyRunningParametersParameter setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeSearchParametersResponseBodyRunningParametersParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeSearchParametersResponseBodyRunningParametersParameter setParameterStatus(String parameterStatus) {
            this.parameterStatus = parameterStatus;
            return this;
        }
        public String getParameterStatus() {
            return this.parameterStatus;
        }

        public DescribeSearchParametersResponseBodyRunningParametersParameter setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeSearchParametersResponseBodyRunningParameters extends TeaModel {
        /**
         * <p>The list of parameters.</p>
         */
        @NameInMap("Parameter")
        public java.util.List<DescribeSearchParametersResponseBodyRunningParametersParameter> parameter;

        public static DescribeSearchParametersResponseBodyRunningParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSearchParametersResponseBodyRunningParameters self = new DescribeSearchParametersResponseBodyRunningParameters();
            return TeaModel.build(map, self);
        }

        public DescribeSearchParametersResponseBodyRunningParameters setParameter(java.util.List<DescribeSearchParametersResponseBodyRunningParametersParameter> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.List<DescribeSearchParametersResponseBodyRunningParametersParameter> getParameter() {
            return this.parameter;
        }

    }

}
