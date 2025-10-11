// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationParametersResponseBody extends TeaModel {
    @NameInMap("ParameterTemplates")
    public DescribeApplicationParametersResponseBodyParameterTemplates parameterTemplates;

    @NameInMap("Parameters")
    public DescribeApplicationParametersResponseBodyParameters parameters;

    /**
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApplicationParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationParametersResponseBody self = new DescribeApplicationParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationParametersResponseBody setParameterTemplates(DescribeApplicationParametersResponseBodyParameterTemplates parameterTemplates) {
        this.parameterTemplates = parameterTemplates;
        return this;
    }
    public DescribeApplicationParametersResponseBodyParameterTemplates getParameterTemplates() {
        return this.parameterTemplates;
    }

    public DescribeApplicationParametersResponseBody setParameters(DescribeApplicationParametersResponseBodyParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public DescribeApplicationParametersResponseBodyParameters getParameters() {
        return this.parameters;
    }

    public DescribeApplicationParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Default")
        public String _default;

        /**
         * <strong>example:</strong>
         * <p>The name of the parameter</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedRestart")
        public Boolean needRestart;

        /**
         * <strong>example:</strong>
         * <p>^[a-zA-Z0-9]{1,20}$</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters self = new DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters set_default(String _default) {
            this._default = _default;
            return this;
        }
        public String get_default() {
            return this._default;
        }

        public DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters setNeedRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        public DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pac-**************</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        @NameInMap("Parameters")
        public java.util.List<DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters> parameters;

        public static DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplates self = new DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplates setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplates setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplates setParameters(java.util.List<DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplatesParameters> getParameters() {
            return this.parameters;
        }

    }

    public static class DescribeApplicationParametersResponseBodyParameterTemplates extends TeaModel {
        @NameInMap("ComponentParameterTemplates")
        public java.util.List<DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplates> componentParameterTemplates;

        public static DescribeApplicationParametersResponseBodyParameterTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationParametersResponseBodyParameterTemplates self = new DescribeApplicationParametersResponseBodyParameterTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationParametersResponseBodyParameterTemplates setComponentParameterTemplates(java.util.List<DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplates> componentParameterTemplates) {
            this.componentParameterTemplates = componentParameterTemplates;
            return this;
        }
        public java.util.List<DescribeApplicationParametersResponseBodyParameterTemplatesComponentParameterTemplates> getComponentParameterTemplates() {
            return this.componentParameterTemplates;
        }

    }

    public static class DescribeApplicationParametersResponseBodyParametersComponentParametersParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default value</p>
         */
        @NameInMap("Default")
        public String _default;

        /**
         * <strong>example:</strong>
         * <p>The name of the parameter</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedRestart")
        public Boolean needRestart;

        /**
         * <strong>example:</strong>
         * <p>^[a-zA-Z0-9]{1,20}$</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <strong>example:</strong>
         * <p>Applied</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeApplicationParametersResponseBodyParametersComponentParametersParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationParametersResponseBodyParametersComponentParametersParameters self = new DescribeApplicationParametersResponseBodyParametersComponentParametersParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParametersParameters set_default(String _default) {
            this._default = _default;
            return this;
        }
        public String get_default() {
            return this._default;
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParametersParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParametersParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParametersParameters setNeedRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParametersParameters setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParametersParameters setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParametersParameters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParametersParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParametersParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApplicationParametersResponseBodyParametersComponentParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pac-**************</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        @NameInMap("Parameters")
        public java.util.List<DescribeApplicationParametersResponseBodyParametersComponentParametersParameters> parameters;

        public static DescribeApplicationParametersResponseBodyParametersComponentParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationParametersResponseBodyParametersComponentParameters self = new DescribeApplicationParametersResponseBodyParametersComponentParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParameters setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParameters setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeApplicationParametersResponseBodyParametersComponentParameters setParameters(java.util.List<DescribeApplicationParametersResponseBodyParametersComponentParametersParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<DescribeApplicationParametersResponseBodyParametersComponentParametersParameters> getParameters() {
            return this.parameters;
        }

    }

    public static class DescribeApplicationParametersResponseBodyParameters extends TeaModel {
        @NameInMap("ComponentParameters")
        public java.util.List<DescribeApplicationParametersResponseBodyParametersComponentParameters> componentParameters;

        public static DescribeApplicationParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationParametersResponseBodyParameters self = new DescribeApplicationParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationParametersResponseBodyParameters setComponentParameters(java.util.List<DescribeApplicationParametersResponseBodyParametersComponentParameters> componentParameters) {
            this.componentParameters = componentParameters;
            return this;
        }
        public java.util.List<DescribeApplicationParametersResponseBodyParametersComponentParameters> getComponentParameters() {
            return this.componentParameters;
        }

    }

}
