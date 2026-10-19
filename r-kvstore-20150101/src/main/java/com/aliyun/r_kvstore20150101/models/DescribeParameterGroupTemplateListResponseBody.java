// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupTemplateListResponseBody extends TeaModel {
    /**
     * <p>The compatible version.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The list of parameter details.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<DescribeParameterGroupTemplateListResponseBodyParameters> parameters;

    /**
     * <p>The request ID.</p>
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
         * <p>The value range of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[0|1]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>Indicates whether the parameter has taken effect. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Effective")
        public Long effective;

        /**
         * <p>The divisor factor. For integer and byte type parameters, the parameter value must not only fall within the valid range but also be a multiple of Factor (when Factor is not 0).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Factor")
        public Long factor;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable AOF persistence mode</p>
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
         * <li><strong>0</strong>: The parameter cannot be modified.</li>
         * <li><strong>1</strong>: The parameter can be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Revisable")
        public Long revisable;

        /**
         * <p>Indicates whether modification for minor versions is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportModifyForMinorVersion")
        public Boolean supportModifyForMinorVersion;

        /**
         * <p>The unit of the parameter value. Valid values:</p>
         * <ul>
         * <li><strong>INT</strong>: a common integer.</li>
         * <li><strong>STRING</strong>: a fixed string.</li>
         * <li><strong>B</strong>: bytes.</li>
         * </ul>
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
