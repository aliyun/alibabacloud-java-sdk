// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupTemplateListResponseBody extends TeaModel {
    /**
     * <p>The compatible engine version. Valid values:</p>
     * <p>ApsaraDB for Redis Community Edition: 5.0, 6.0, and 7.0. Tair DRAM-based instances: 5.0 and 6.0. Tair persistent memory-optimized instances: 6.0. Tair ESSD-based instances: 4.0.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The information about parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<DescribeParameterGroupTemplateListResponseBodyParameters> parameters;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterGroupTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupTemplateListResponseBody self = new DescribeParameterGroupTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupTemplateListResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeParameterGroupTemplateListResponseBody setParameters(java.util.List<DescribeParameterGroupTemplateListResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<DescribeParameterGroupTemplateListResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public DescribeParameterGroupTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterGroupTemplateListResponseBodyParameters extends TeaModel {
        /**
         * <p>The regular expression used to validate input.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;\\d+\\s+\\d+\\s+\\d+&quot;</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>Indicates whether the modification takes effect. Valid values: 0 and 1. A value of 0 indicates that the modification does not take effect. A value of 1 indicates that the modification takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Effective")
        public Long effective;

        /**
         * <p>A divisor of the parameter. For a parameter of the integer or byte type, the valid values must be a multiple of Factor unless you set Factor to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Factor")
        public Long factor;

        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>appendonly</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        /**
         * <p>Indicates whether the parameter can be modified. Valid values:</p>
         * <ul>
         * <li><strong>0: The parameter cannot be modified.</strong></li>
         * <li><strong>1</strong>: The parameter can be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Revisable")
        public Long revisable;

        /**
         * <p>Indicates whether the minor version can be changed. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportModifyForMinorVersion")
        public Boolean supportModifyForMinorVersion;

        /**
         * <p>The unit of the parameter value. Valid values: INT (ordinary integer), STRING (fixed string), and B (byte).</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeParameterGroupTemplateListResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupTemplateListResponseBodyParameters self = new DescribeParameterGroupTemplateListResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupTemplateListResponseBodyParameters setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeParameterGroupTemplateListResponseBodyParameters setEffective(Long effective) {
            this.effective = effective;
            return this;
        }
        public Long getEffective() {
            return this.effective;
        }

        public DescribeParameterGroupTemplateListResponseBodyParameters setFactor(Long factor) {
            this.factor = factor;
            return this;
        }
        public Long getFactor() {
            return this.factor;
        }

        public DescribeParameterGroupTemplateListResponseBodyParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParameterGroupTemplateListResponseBodyParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParameterGroupTemplateListResponseBodyParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public DescribeParameterGroupTemplateListResponseBodyParameters setRevisable(Long revisable) {
            this.revisable = revisable;
            return this;
        }
        public Long getRevisable() {
            return this.revisable;
        }

        public DescribeParameterGroupTemplateListResponseBodyParameters setSupportModifyForMinorVersion(Boolean supportModifyForMinorVersion) {
            this.supportModifyForMinorVersion = supportModifyForMinorVersion;
            return this;
        }
        public Boolean getSupportModifyForMinorVersion() {
            return this.supportModifyForMinorVersion;
        }

        public DescribeParameterGroupTemplateListResponseBodyParameters setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
