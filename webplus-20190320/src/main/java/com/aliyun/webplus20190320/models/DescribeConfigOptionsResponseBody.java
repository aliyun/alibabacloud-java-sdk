// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigOptionsResponseBody extends TeaModel {
    @NameInMap("StackConfigOption")
    public DescribeConfigOptionsResponseBodyStackConfigOption stackConfigOption;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DescribeConfigOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigOptionsResponseBody self = new DescribeConfigOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigOptionsResponseBody setStackConfigOption(DescribeConfigOptionsResponseBodyStackConfigOption stackConfigOption) {
        this.stackConfigOption = stackConfigOption;
        return this;
    }
    public DescribeConfigOptionsResponseBodyStackConfigOption getStackConfigOption() {
        return this.stackConfigOption;
    }

    public DescribeConfigOptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeConfigOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigOptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption extends TeaModel {
        @NameInMap("RegexDesc")
        public String regexDesc;

        @NameInMap("MaxValue")
        public Long maxValue;

        @NameInMap("EditorType")
        public String editorType;

        @NameInMap("MinValue")
        public Long minValue;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("MaxLength")
        public Integer maxLength;

        @NameInMap("OptionLabel")
        public String optionLabel;

        @NameInMap("RegexPattern")
        public String regexPattern;

        @NameInMap("ChangeSeverity")
        public String changeSeverity;

        @NameInMap("OptionDescription")
        public String optionDescription;

        @NameInMap("OptionName")
        public String optionName;

        @NameInMap("PathName")
        public String pathName;

        @NameInMap("HiddenOption")
        public Boolean hiddenOption;

        @NameInMap("ValueType")
        public String valueType;

        @NameInMap("MinLength")
        public Integer minLength;

        @NameInMap("ValueOptions")
        public String valueOptions;

        @NameInMap("ReadonlyOption")
        public Boolean readonlyOption;

        public static DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption self = new DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption();
            return TeaModel.build(map, self);
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setRegexDesc(String regexDesc) {
            this.regexDesc = regexDesc;
            return this;
        }
        public String getRegexDesc() {
            return this.regexDesc;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setEditorType(String editorType) {
            this.editorType = editorType;
            return this;
        }
        public String getEditorType() {
            return this.editorType;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setOptionLabel(String optionLabel) {
            this.optionLabel = optionLabel;
            return this;
        }
        public String getOptionLabel() {
            return this.optionLabel;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setRegexPattern(String regexPattern) {
            this.regexPattern = regexPattern;
            return this;
        }
        public String getRegexPattern() {
            return this.regexPattern;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setChangeSeverity(String changeSeverity) {
            this.changeSeverity = changeSeverity;
            return this;
        }
        public String getChangeSeverity() {
            return this.changeSeverity;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setOptionDescription(String optionDescription) {
            this.optionDescription = optionDescription;
            return this;
        }
        public String getOptionDescription() {
            return this.optionDescription;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setOptionName(String optionName) {
            this.optionName = optionName;
            return this;
        }
        public String getOptionName() {
            return this.optionName;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setHiddenOption(Boolean hiddenOption) {
            this.hiddenOption = hiddenOption;
            return this;
        }
        public Boolean getHiddenOption() {
            return this.hiddenOption;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setValueOptions(String valueOptions) {
            this.valueOptions = valueOptions;
            return this;
        }
        public String getValueOptions() {
            return this.valueOptions;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption setReadonlyOption(Boolean readonlyOption) {
            this.readonlyOption = readonlyOption;
            return this;
        }
        public Boolean getReadonlyOption() {
            return this.readonlyOption;
        }

    }

    public static class DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptions extends TeaModel {
        @NameInMap("ConfigOption")
        public java.util.List<DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption> configOption;

        public static DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptions self = new DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptions();
            return TeaModel.build(map, self);
        }

        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptions setConfigOption(java.util.List<DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption> configOption) {
            this.configOption = configOption;
            return this;
        }
        public java.util.List<DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptionsConfigOption> getConfigOption() {
            return this.configOption;
        }

    }

    public static class DescribeConfigOptionsResponseBodyStackConfigOption extends TeaModel {
        @NameInMap("StackId")
        public String stackId;

        @NameInMap("ConfigOptions")
        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptions configOptions;

        @NameInMap("StackName")
        public String stackName;

        public static DescribeConfigOptionsResponseBodyStackConfigOption build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigOptionsResponseBodyStackConfigOption self = new DescribeConfigOptionsResponseBodyStackConfigOption();
            return TeaModel.build(map, self);
        }

        public DescribeConfigOptionsResponseBodyStackConfigOption setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOption setConfigOptions(DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptions configOptions) {
            this.configOptions = configOptions;
            return this;
        }
        public DescribeConfigOptionsResponseBodyStackConfigOptionConfigOptions getConfigOptions() {
            return this.configOptions;
        }

        public DescribeConfigOptionsResponseBodyStackConfigOption setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

    }

}
