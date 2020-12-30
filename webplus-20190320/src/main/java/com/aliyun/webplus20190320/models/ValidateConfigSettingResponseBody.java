// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class ValidateConfigSettingResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigValidationResults")
    public ValidateConfigSettingResponseBodyConfigValidationResults configValidationResults;

    @NameInMap("Code")
    public String code;

    public static ValidateConfigSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateConfigSettingResponseBody self = new ValidateConfigSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateConfigSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidateConfigSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateConfigSettingResponseBody setConfigValidationResults(ValidateConfigSettingResponseBodyConfigValidationResults configValidationResults) {
        this.configValidationResults = configValidationResults;
        return this;
    }
    public ValidateConfigSettingResponseBodyConfigValidationResults getConfigValidationResults() {
        return this.configValidationResults;
    }

    public ValidateConfigSettingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption extends TeaModel {
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

        public static ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption build(java.util.Map<String, ?> map) throws Exception {
            ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption self = new ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption();
            return TeaModel.build(map, self);
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setRegexDesc(String regexDesc) {
            this.regexDesc = regexDesc;
            return this;
        }
        public String getRegexDesc() {
            return this.regexDesc;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setEditorType(String editorType) {
            this.editorType = editorType;
            return this;
        }
        public String getEditorType() {
            return this.editorType;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setOptionLabel(String optionLabel) {
            this.optionLabel = optionLabel;
            return this;
        }
        public String getOptionLabel() {
            return this.optionLabel;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setRegexPattern(String regexPattern) {
            this.regexPattern = regexPattern;
            return this;
        }
        public String getRegexPattern() {
            return this.regexPattern;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setChangeSeverity(String changeSeverity) {
            this.changeSeverity = changeSeverity;
            return this;
        }
        public String getChangeSeverity() {
            return this.changeSeverity;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setOptionDescription(String optionDescription) {
            this.optionDescription = optionDescription;
            return this;
        }
        public String getOptionDescription() {
            return this.optionDescription;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setOptionName(String optionName) {
            this.optionName = optionName;
            return this;
        }
        public String getOptionName() {
            return this.optionName;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setHiddenOption(Boolean hiddenOption) {
            this.hiddenOption = hiddenOption;
            return this;
        }
        public Boolean getHiddenOption() {
            return this.hiddenOption;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setValueOptions(String valueOptions) {
            this.valueOptions = valueOptions;
            return this;
        }
        public String getValueOptions() {
            return this.valueOptions;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption setReadonlyOption(Boolean readonlyOption) {
            this.readonlyOption = readonlyOption;
            return this;
        }
        public Boolean getReadonlyOption() {
            return this.readonlyOption;
        }

    }

    public static class ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult extends TeaModel {
        @NameInMap("OptionName")
        public String optionName;

        @NameInMap("PathName")
        public String pathName;

        @NameInMap("ResultMessage")
        public String resultMessage;

        @NameInMap("ResultSeverity")
        public String resultSeverity;

        @NameInMap("ConfigOption")
        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption configOption;

        public static ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult build(java.util.Map<String, ?> map) throws Exception {
            ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult self = new ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult();
            return TeaModel.build(map, self);
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult setOptionName(String optionName) {
            this.optionName = optionName;
            return this;
        }
        public String getOptionName() {
            return this.optionName;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult setResultSeverity(String resultSeverity) {
            this.resultSeverity = resultSeverity;
            return this;
        }
        public String getResultSeverity() {
            return this.resultSeverity;
        }

        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult setConfigOption(ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption configOption) {
            this.configOption = configOption;
            return this;
        }
        public ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResultConfigOption getConfigOption() {
            return this.configOption;
        }

    }

    public static class ValidateConfigSettingResponseBodyConfigValidationResults extends TeaModel {
        @NameInMap("ConfigValidationResult")
        public java.util.List<ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult> configValidationResult;

        public static ValidateConfigSettingResponseBodyConfigValidationResults build(java.util.Map<String, ?> map) throws Exception {
            ValidateConfigSettingResponseBodyConfigValidationResults self = new ValidateConfigSettingResponseBodyConfigValidationResults();
            return TeaModel.build(map, self);
        }

        public ValidateConfigSettingResponseBodyConfigValidationResults setConfigValidationResult(java.util.List<ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult> configValidationResult) {
            this.configValidationResult = configValidationResult;
            return this;
        }
        public java.util.List<ValidateConfigSettingResponseBodyConfigValidationResultsConfigValidationResult> getConfigValidationResult() {
            return this.configValidationResult;
        }

    }

}
