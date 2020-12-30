// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigIndexResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigGroups")
    public DescribeConfigIndexResponseBodyConfigGroups configGroups;

    @NameInMap("Code")
    public String code;

    @NameInMap("StackName")
    public String stackName;

    @NameInMap("StackId")
    public String stackId;

    public static DescribeConfigIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigIndexResponseBody self = new DescribeConfigIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigIndexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeConfigIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigIndexResponseBody setConfigGroups(DescribeConfigIndexResponseBodyConfigGroups configGroups) {
        this.configGroups = configGroups;
        return this;
    }
    public DescribeConfigIndexResponseBodyConfigGroups getConfigGroups() {
        return this.configGroups;
    }

    public DescribeConfigIndexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeConfigIndexResponseBody setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public DescribeConfigIndexResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public static class DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption extends TeaModel {
        @NameInMap("RegexDesc")
        public String regexDesc;

        @NameInMap("MaxValue")
        public Long maxValue;

        @NameInMap("EditorType")
        public String editorType;

        @NameInMap("MinValue")
        public Long minValue;

        @NameInMap("OptionLabel")
        public String optionLabel;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("MaxLength")
        public Integer maxLength;

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

        public static DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption self = new DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption();
            return TeaModel.build(map, self);
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setRegexDesc(String regexDesc) {
            this.regexDesc = regexDesc;
            return this;
        }
        public String getRegexDesc() {
            return this.regexDesc;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setEditorType(String editorType) {
            this.editorType = editorType;
            return this;
        }
        public String getEditorType() {
            return this.editorType;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setOptionLabel(String optionLabel) {
            this.optionLabel = optionLabel;
            return this;
        }
        public String getOptionLabel() {
            return this.optionLabel;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setRegexPattern(String regexPattern) {
            this.regexPattern = regexPattern;
            return this;
        }
        public String getRegexPattern() {
            return this.regexPattern;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setChangeSeverity(String changeSeverity) {
            this.changeSeverity = changeSeverity;
            return this;
        }
        public String getChangeSeverity() {
            return this.changeSeverity;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setOptionDescription(String optionDescription) {
            this.optionDescription = optionDescription;
            return this;
        }
        public String getOptionDescription() {
            return this.optionDescription;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setOptionName(String optionName) {
            this.optionName = optionName;
            return this;
        }
        public String getOptionName() {
            return this.optionName;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setHiddenOption(Boolean hiddenOption) {
            this.hiddenOption = hiddenOption;
            return this;
        }
        public Boolean getHiddenOption() {
            return this.hiddenOption;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setValueOptions(String valueOptions) {
            this.valueOptions = valueOptions;
            return this;
        }
        public String getValueOptions() {
            return this.valueOptions;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption setReadonlyOption(Boolean readonlyOption) {
            this.readonlyOption = readonlyOption;
            return this;
        }
        public Boolean getReadonlyOption() {
            return this.readonlyOption;
        }

    }

    public static class DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptions extends TeaModel {
        @NameInMap("ConfigOption")
        public java.util.List<DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption> configOption;

        public static DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptions self = new DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptions();
            return TeaModel.build(map, self);
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptions setConfigOption(java.util.List<DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption> configOption) {
            this.configOption = configOption;
            return this;
        }
        public java.util.List<DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptionsConfigOption> getConfigOption() {
            return this.configOption;
        }

    }

    public static class DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath extends TeaModel {
        @NameInMap("PathName")
        public String pathName;

        @NameInMap("HiddenPath")
        public Boolean hiddenPath;

        @NameInMap("ConfigOptions")
        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptions configOptions;

        @NameInMap("PathLabel")
        public String pathLabel;

        public static DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath self = new DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath();
            return TeaModel.build(map, self);
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath setHiddenPath(Boolean hiddenPath) {
            this.hiddenPath = hiddenPath;
            return this;
        }
        public Boolean getHiddenPath() {
            return this.hiddenPath;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath setConfigOptions(DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptions configOptions) {
            this.configOptions = configOptions;
            return this;
        }
        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPathConfigOptions getConfigOptions() {
            return this.configOptions;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath setPathLabel(String pathLabel) {
            this.pathLabel = pathLabel;
            return this;
        }
        public String getPathLabel() {
            return this.pathLabel;
        }

    }

    public static class DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPaths extends TeaModel {
        @NameInMap("ConfigPath")
        public java.util.List<DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath> configPath;

        public static DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPaths self = new DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPaths();
            return TeaModel.build(map, self);
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPaths setConfigPath(java.util.List<DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath> configPath) {
            this.configPath = configPath;
            return this;
        }
        public java.util.List<DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPathsConfigPath> getConfigPath() {
            return this.configPath;
        }

    }

    public static class DescribeConfigIndexResponseBodyConfigGroupsConfigGroup extends TeaModel {
        @NameInMap("ConfigPaths")
        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPaths configPaths;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupLabel")
        public String groupLabel;

        public static DescribeConfigIndexResponseBodyConfigGroupsConfigGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigIndexResponseBodyConfigGroupsConfigGroup self = new DescribeConfigIndexResponseBodyConfigGroupsConfigGroup();
            return TeaModel.build(map, self);
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroup setConfigPaths(DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPaths configPaths) {
            this.configPaths = configPaths;
            return this;
        }
        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroupConfigPaths getConfigPaths() {
            return this.configPaths;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeConfigIndexResponseBodyConfigGroupsConfigGroup setGroupLabel(String groupLabel) {
            this.groupLabel = groupLabel;
            return this;
        }
        public String getGroupLabel() {
            return this.groupLabel;
        }

    }

    public static class DescribeConfigIndexResponseBodyConfigGroups extends TeaModel {
        @NameInMap("ConfigGroup")
        public java.util.List<DescribeConfigIndexResponseBodyConfigGroupsConfigGroup> configGroup;

        public static DescribeConfigIndexResponseBodyConfigGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigIndexResponseBodyConfigGroups self = new DescribeConfigIndexResponseBodyConfigGroups();
            return TeaModel.build(map, self);
        }

        public DescribeConfigIndexResponseBodyConfigGroups setConfigGroup(java.util.List<DescribeConfigIndexResponseBodyConfigGroupsConfigGroup> configGroup) {
            this.configGroup = configGroup;
            return this;
        }
        public java.util.List<DescribeConfigIndexResponseBodyConfigGroupsConfigGroup> getConfigGroup() {
            return this.configGroup;
        }

    }

}
