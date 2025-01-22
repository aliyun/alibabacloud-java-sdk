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

    /**
     * <blockquote>
     * <p> This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RepairReset")
    @Deprecated
    public String repairReset;

    /**
     * <p>The fixing parameter configurations of the check item.</p>
     */
    @NameInMap("RepairSetting")
    public GetCheckDetailResponseBodyRepairSetting repairSetting;

    /**
     * <blockquote>
     * <p> This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RepairSupportType")
    @Deprecated
    public Integer repairSupportType;

    /**
     * <p>The request ID.</p>
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
         * <p>The name of the custom configuration item, which is unique in a check item.</p>
         * 
         * <strong>example:</strong>
         * <p>SessionTimeMax</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The display name of the custom configuration item for internationalization.</p>
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
         * <p>The description type of the check item. The value is fixed as text.</p>
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
        /**
         * <p>The text description of the fixing step.</p>
         * 
         * <strong>example:</strong>
         * <p>The first step is to open the calling interface.</p>
         */
        @NameInMap("ShowText")
        public String showText;

        /**
         * <p>The sequence number of the fixing step.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Indicates whether the value of the parameter is displayed in the console. Valid values:</p>
         * <ul>
         * <li>0: The historical value and real-time value of the parameter are displayed.</li>
         * <li>1: Only the real-time value of the parameter is displayed.</li>
         * <li>2: The value of the parameter is not displayed in the console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ConsoleParamType")
        public String consoleParamType;

        /**
         * <p>Indicates whether custom configurations of the fixing parameters are supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CustomFlag")
        public Boolean customFlag;

        /**
         * <p>Indicates whether data needs to be encrypted during transmission. Valid values:</p>
         * <ul>
         * <li>0: Data does not need to be encrypted during transmission.</li>
         * <li>1: Data needs to be encrypted during transmission.</li>
         * <li>2: Data needs to be encrypted during transmission, and the user must perform secondary confirmation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataTransformType")
        public String dataTransformType;

        /**
         * <p>The default value of the parameter. The value is a string.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>Indicates whether this parameter is specified by the user. Valid values:</p>
         * <ul>
         * <li>0: The default value is used.</li>
         * <li>1: This parameter is required, and no default value is specified.</li>
         * <li>2: This parameter can be left empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmptyParamSwitch")
        public String emptyParamSwitch;

        /**
         * <p>The fixing parameters that are not compatible with this parameter.</p>
         */
        @NameInMap("ExclusiveName")
        public java.util.List<String> exclusiveName;

        /**
         * <p>The ID of the fixing workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>64312d3ee19d470a9b54393dab****</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The name of the parameter. The name must be unique within the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>navicat</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The display name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The type of the parameter. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;NUMBER\&quot;,\&quot;range\&quot;:[1,24]}</p>
         */
        @NameInMap("TypeDefine")
        public String typeDefine;

        /**
         * <p>The type of the parameter. Valid values:</p>
         * <ul>
         * <li>1: asset parameters that are required during fixing.</li>
         * <li>2: user-provided parameters that are required during fixing.</li>
         * <li>3: parameters that are temporarily provided by the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsageType")
        public String usageType;

        /**
         * <p>The user-configured value of the parameter. The value is a string.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        /**
         * <p>The description of the fixing workflow.</p>
         */
        @NameInMap("FlowStep")
        public java.util.List<GetCheckDetailResponseBodyRepairSettingFlowStep> flowStep;

        /**
         * <p>The configurations of the fixing parameters.</p>
         */
        @NameInMap("RepairConfigs")
        public java.util.List<GetCheckDetailResponseBodyRepairSettingRepairConfigs> repairConfigs;

        /**
         * <p>Indicates whether a restart is required after the fixing. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RepairReset")
        public Boolean repairReset;

        /**
         * <p>Indicates whether the check item supports the quick fix feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RepairSupport")
        public Boolean repairSupport;

        /**
         * <p>The fixing type that is supported. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The fixing and rollback are supported.</li>
         * <li><strong>2</strong>: The fixing is supported, but the rollback is not supported.</li>
         * <li><strong>3</strong>: The fixing must be performed on a third-party platform.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
