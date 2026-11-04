// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseMountParameterTemplateListResponseBody extends TeaModel {
    /**
     * <p>The list of parameter templates.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<DescribeLakebaseMountParameterTemplateListResponseBodyParameters> parameters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLakebaseMountParameterTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseMountParameterTemplateListResponseBody self = new DescribeLakebaseMountParameterTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseMountParameterTemplateListResponseBody setParameters(java.util.List<DescribeLakebaseMountParameterTemplateListResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<DescribeLakebaseMountParameterTemplateListResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public DescribeLakebaseMountParameterTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLakebaseMountParameterTemplateListResponseBodyParameters extends TeaModel {
        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>Auto-increment offset</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>Indicates whether the parameter takes effect dynamically. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>0: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDynamic")
        public String isDynamic;

        /**
         * <p>Indicates whether users are allowed to modify the parameter. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>0: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsUserChangeable")
        public String isUserChangeable;

        /**
         * <p>The value range or enumerated values, such as [0-3600].</p>
         * 
         * <strong>example:</strong>
         * <p>[0-3600]</p>
         */
        @NameInMap("Optional")
        public String optional;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_increment_offset</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The unit.</p>
         * 
         * <strong>example:</strong>
         * <p>s</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeLakebaseMountParameterTemplateListResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeLakebaseMountParameterTemplateListResponseBodyParameters self = new DescribeLakebaseMountParameterTemplateListResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeLakebaseMountParameterTemplateListResponseBodyParameters setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeLakebaseMountParameterTemplateListResponseBodyParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeLakebaseMountParameterTemplateListResponseBodyParameters setIsDynamic(String isDynamic) {
            this.isDynamic = isDynamic;
            return this;
        }
        public String getIsDynamic() {
            return this.isDynamic;
        }

        public DescribeLakebaseMountParameterTemplateListResponseBodyParameters setIsUserChangeable(String isUserChangeable) {
            this.isUserChangeable = isUserChangeable;
            return this;
        }
        public String getIsUserChangeable() {
            return this.isUserChangeable;
        }

        public DescribeLakebaseMountParameterTemplateListResponseBodyParameters setOptional(String optional) {
            this.optional = optional;
            return this;
        }
        public String getOptional() {
            return this.optional;
        }

        public DescribeLakebaseMountParameterTemplateListResponseBodyParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeLakebaseMountParameterTemplateListResponseBodyParameters setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
