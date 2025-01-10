// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckDetailResponseBody extends TeaModel {
    /**
     * <p>The help information about the check item.</p>
     */
    @NameInMap("AssistInfo")
    public GetCheckDetailResponseBodyAssistInfo assistInfo;

    /**
     * <p>The custom configuration items of the check item.</p>
     */
    @NameInMap("CustomConfigs")
    public java.util.List<GetCheckDetailResponseBodyCustomConfigs> customConfigs;

    /**
     * <p>The description of the check item.</p>
     */
    @NameInMap("Description")
    public GetCheckDetailResponseBodyDescription description;

    @NameInMap("RepairReset")
    @Deprecated
    public String repairReset;

    @NameInMap("RepairSetting")
    public GetCheckDetailResponseBodyRepairSetting repairSetting;

    @NameInMap("RepairSupportType")
    @Deprecated
    public Integer repairSupportType;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>15A6ED6A-DBFE-5255-A248-289907809BEC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The solution to handle the risk item.</p>
     */
    @NameInMap("Solution")
    public GetCheckDetailResponseBodySolution solution;

    public static GetCheckDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckDetailResponseBody self = new GetCheckDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckDetailResponseBody setAssistInfo(GetCheckDetailResponseBodyAssistInfo assistInfo) {
        this.assistInfo = assistInfo;
        return this;
    }
    public GetCheckDetailResponseBodyAssistInfo getAssistInfo() {
        return this.assistInfo;
    }

    public GetCheckDetailResponseBody setCustomConfigs(java.util.List<GetCheckDetailResponseBodyCustomConfigs> customConfigs) {
        this.customConfigs = customConfigs;
        return this;
    }
    public java.util.List<GetCheckDetailResponseBodyCustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    public GetCheckDetailResponseBody setDescription(GetCheckDetailResponseBodyDescription description) {
        this.description = description;
        return this;
    }
    public GetCheckDetailResponseBodyDescription getDescription() {
        return this.description;
    }

    @Deprecated
    public GetCheckDetailResponseBody setRepairReset(String repairReset) {
        this.repairReset = repairReset;
        return this;
    }
    public String getRepairReset() {
        return this.repairReset;
    }

    public GetCheckDetailResponseBody setRepairSetting(GetCheckDetailResponseBodyRepairSetting repairSetting) {
        this.repairSetting = repairSetting;
        return this;
    }
    public GetCheckDetailResponseBodyRepairSetting getRepairSetting() {
        return this.repairSetting;
    }

    @Deprecated
    public GetCheckDetailResponseBody setRepairSupportType(Integer repairSupportType) {
        this.repairSupportType = repairSupportType;
        return this;
    }
    public Integer getRepairSupportType() {
        return this.repairSupportType;
    }

    public GetCheckDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckDetailResponseBody setSolution(GetCheckDetailResponseBodySolution solution) {
        this.solution = solution;
        return this;
    }
    public GetCheckDetailResponseBodySolution getSolution() {
        return this.solution;
    }

    public static class GetCheckDetailResponseBodyAssistInfo extends TeaModel {
        /**
         * <p>The link to the help information about the risk item when the Type parameter is set to link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.alibabacloud.com/help/en/resource-access-management/latest/faq-about-ram-users">https://www.alibabacloud.com/help/en/resource-access-management/latest/faq-about-ram-users</a></p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <p>The type of the help information about the risk item. Valid values:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * <li><strong>link</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content in the help information about the risk item when the Type parameter is set to text.</p>
         * 
         * <strong>example:</strong>
         * <p>Configure an IP address whitelist</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCheckDetailResponseBodyAssistInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodyAssistInfo self = new GetCheckDetailResponseBodyAssistInfo();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodyAssistInfo setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetCheckDetailResponseBodyAssistInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCheckDetailResponseBodyAssistInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCheckDetailResponseBodyCustomConfigs extends TeaModel {
        /**
         * <p>The default value of the custom configuration item. The value is a string.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The name of the custom configuration item. The name of a custom configuration item is unique in a check item.</p>
         * 
         * <strong>example:</strong>
         * <p>SessionTimeMax</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The keyword that identifies the custom configuration item for internationalization.</p>
         * 
         * <strong>example:</strong>
         * <p>Maximum session time</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The type of the custom configuration item. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;NUMBER\&quot;,\&quot;range\&quot;:[1,24]}</p>
         */
        @NameInMap("TypeDefine")
        public String typeDefine;

        /**
         * <p>The value of the custom configuration item. The value is a string.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCheckDetailResponseBodyCustomConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodyCustomConfigs self = new GetCheckDetailResponseBodyCustomConfigs();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodyCustomConfigs setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetCheckDetailResponseBodyCustomConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCheckDetailResponseBodyCustomConfigs setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetCheckDetailResponseBodyCustomConfigs setTypeDefine(String typeDefine) {
            this.typeDefine = typeDefine;
            return this;
        }
        public String getTypeDefine() {
            return this.typeDefine;
        }

        public GetCheckDetailResponseBodyCustomConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCheckDetailResponseBodyDescription extends TeaModel {
        /**
         * <p>The link to the description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.alibabacloud.com/help/en/object-storage-service/latest/tutorial-implement-data-sharing-across-departments-based-on-bucket-policies">https://www.alibabacloud.com/help/en/object-storage-service/latest/tutorial-implement-data-sharing-across-departments-based-on-bucket-policies</a></p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <p>The type of the description of the check item. The value is fixed as text.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content in the description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>The MSE instance does not enable authentication by default. If public network access is enabled at the same time, the data in the configuration center may be dragged and there is a security risk.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCheckDetailResponseBodyDescription build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodyDescription self = new GetCheckDetailResponseBodyDescription();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodyDescription setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetCheckDetailResponseBodyDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCheckDetailResponseBodyDescription setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCheckDetailResponseBodyRepairSettingFlowStep extends TeaModel {
        @NameInMap("ShowText")
        public String showText;

        @NameInMap("Step")
        public String step;

        public static GetCheckDetailResponseBodyRepairSettingFlowStep build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodyRepairSettingFlowStep self = new GetCheckDetailResponseBodyRepairSettingFlowStep();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodyRepairSettingFlowStep setShowText(String showText) {
            this.showText = showText;
            return this;
        }
        public String getShowText() {
            return this.showText;
        }

        public GetCheckDetailResponseBodyRepairSettingFlowStep setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class GetCheckDetailResponseBodyRepairSettingRepairConfigs extends TeaModel {
        @NameInMap("ConsoleParamType")
        public String consoleParamType;

        @NameInMap("CustomFlag")
        public Boolean customFlag;

        @NameInMap("DataTransformType")
        public String dataTransformType;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("EmptyParamSwitch")
        public String emptyParamSwitch;

        @NameInMap("ExclusiveName")
        public java.util.List<String> exclusiveName;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("TypeDefine")
        public String typeDefine;

        @NameInMap("UsageType")
        public String usageType;

        @NameInMap("Value")
        public String value;

        public static GetCheckDetailResponseBodyRepairSettingRepairConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodyRepairSettingRepairConfigs self = new GetCheckDetailResponseBodyRepairSettingRepairConfigs();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setConsoleParamType(String consoleParamType) {
            this.consoleParamType = consoleParamType;
            return this;
        }
        public String getConsoleParamType() {
            return this.consoleParamType;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setCustomFlag(Boolean customFlag) {
            this.customFlag = customFlag;
            return this;
        }
        public Boolean getCustomFlag() {
            return this.customFlag;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setDataTransformType(String dataTransformType) {
            this.dataTransformType = dataTransformType;
            return this;
        }
        public String getDataTransformType() {
            return this.dataTransformType;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setEmptyParamSwitch(String emptyParamSwitch) {
            this.emptyParamSwitch = emptyParamSwitch;
            return this;
        }
        public String getEmptyParamSwitch() {
            return this.emptyParamSwitch;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setExclusiveName(java.util.List<String> exclusiveName) {
            this.exclusiveName = exclusiveName;
            return this;
        }
        public java.util.List<String> getExclusiveName() {
            return this.exclusiveName;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setTypeDefine(String typeDefine) {
            this.typeDefine = typeDefine;
            return this;
        }
        public String getTypeDefine() {
            return this.typeDefine;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setUsageType(String usageType) {
            this.usageType = usageType;
            return this;
        }
        public String getUsageType() {
            return this.usageType;
        }

        public GetCheckDetailResponseBodyRepairSettingRepairConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCheckDetailResponseBodyRepairSetting extends TeaModel {
        @NameInMap("FlowStep")
        public java.util.List<GetCheckDetailResponseBodyRepairSettingFlowStep> flowStep;

        @NameInMap("RepairConfigs")
        public java.util.List<GetCheckDetailResponseBodyRepairSettingRepairConfigs> repairConfigs;

        @NameInMap("RepairReset")
        public Boolean repairReset;

        @NameInMap("RepairSupport")
        public Boolean repairSupport;

        @NameInMap("RepairSupportType")
        public Integer repairSupportType;

        public static GetCheckDetailResponseBodyRepairSetting build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodyRepairSetting self = new GetCheckDetailResponseBodyRepairSetting();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodyRepairSetting setFlowStep(java.util.List<GetCheckDetailResponseBodyRepairSettingFlowStep> flowStep) {
            this.flowStep = flowStep;
            return this;
        }
        public java.util.List<GetCheckDetailResponseBodyRepairSettingFlowStep> getFlowStep() {
            return this.flowStep;
        }

        public GetCheckDetailResponseBodyRepairSetting setRepairConfigs(java.util.List<GetCheckDetailResponseBodyRepairSettingRepairConfigs> repairConfigs) {
            this.repairConfigs = repairConfigs;
            return this;
        }
        public java.util.List<GetCheckDetailResponseBodyRepairSettingRepairConfigs> getRepairConfigs() {
            return this.repairConfigs;
        }

        public GetCheckDetailResponseBodyRepairSetting setRepairReset(Boolean repairReset) {
            this.repairReset = repairReset;
            return this;
        }
        public Boolean getRepairReset() {
            return this.repairReset;
        }

        public GetCheckDetailResponseBodyRepairSetting setRepairSupport(Boolean repairSupport) {
            this.repairSupport = repairSupport;
            return this;
        }
        public Boolean getRepairSupport() {
            return this.repairSupport;
        }

        public GetCheckDetailResponseBodyRepairSetting setRepairSupportType(Integer repairSupportType) {
            this.repairSupportType = repairSupportType;
            return this;
        }
        public Integer getRepairSupportType() {
            return this.repairSupportType;
        }

    }

    public static class GetCheckDetailResponseBodySolution extends TeaModel {
        /**
         * <p>The link to the solution to handle the risk item when the Type parameter is set to link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.alibabacloud.com/help/en/object-storage-service/latest/tutorial-implement-data-sharing-across-departments-based-on-bucket-policies">https://www.alibabacloud.com/help/en/object-storage-service/latest/tutorial-implement-data-sharing-across-departments-based-on-bucket-policies</a></p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <p>The type of the solution to handle the risk item. Valid values:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * <li><strong>link</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content of the solution to handle the risk item when the Type parameter is set to text.</p>
         * 
         * <strong>example:</strong>
         * <p>Enter the MSE product console - registration and configuration center - instance list, click the corresponding instance name to enter the instance details, find the public network whitelist setting option in the basic information, and configure the whitelist according to business needs. It is forbidden to configure 0.0.0.0 or the whitelist as null.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCheckDetailResponseBodySolution build(java.util.Map<String, ?> map) throws Exception {
            GetCheckDetailResponseBodySolution self = new GetCheckDetailResponseBodySolution();
            return TeaModel.build(map, self);
        }

        public GetCheckDetailResponseBodySolution setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetCheckDetailResponseBodySolution setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCheckDetailResponseBodySolution setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
