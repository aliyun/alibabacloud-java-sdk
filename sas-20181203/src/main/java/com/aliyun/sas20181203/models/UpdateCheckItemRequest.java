// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCheckItemRequest extends TeaModel {
    /**
     * <p>Help information for the check item.</p>
     */
    @NameInMap("AssistInfo")
    public UpdateCheckItemRequestAssistInfo assistInfo;

    /**
     * <p>ID of the custom check item to be updated.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCheckItems~~">ListCheckItems</a> API to get this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000000001</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>Definition rule for the custom check item.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AssociatedData&quot;:{&quot;ToDataList&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;FromPropertyPath&quot;:&quot;InstanceId&quot;}]},&quot;MatchProperty&quot;:{&quot;Operator&quot;:&quot;AND&quot;,&quot;MatchProperties&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Disk&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testId&quot;},{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testInstanceId&quot;}]}}</p>
     */
    @NameInMap("CheckRule")
    public String checkRule;

    /**
     * <p>Name of the custom check item.</p>
     * 
     * <strong>example:</strong>
     * <p>testCheckItemName</p>
     */
    @NameInMap("CheckShowName")
    public String checkShowName;

    /**
     * <p>Description of the check item.</p>
     */
    @NameInMap("Description")
    public UpdateCheckItemRequestDescription description;

    /**
     * <p>Sub-asset type of the cloud product.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> API to get this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DISK</p>
     */
    @NameInMap("InstanceSubType")
    public String instanceSubType;

    /**
     * <p>Asset type of the cloud product.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> API to get this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Remark information</p>
     * 
     * <strong>example:</strong>
     * <p>remark.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Risk level of the check item. Values:</p>
     * <ul>
     * <li><strong>HIGH</strong>: High risk</li>
     * <li><strong>MEDIUM</strong>: Medium risk</li>
     * <li><strong>LOW</strong>: Low risk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>Array of section IDs associated with the check item.</p>
     */
    @NameInMap("SectionIds")
    public java.util.List<Long> sectionIds;

    /**
     * <p>Solution information for the check item.</p>
     */
    @NameInMap("Solution")
    public UpdateCheckItemRequestSolution solution;

    /**
     * <p>Status of the check item. Values:</p>
     * <ul>
     * <li><strong>EDIT</strong>: In editing</li>
     * <li><strong>RELEASE</strong>: Released</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Changing from <strong>Released</strong> to <strong>In editing</strong> will clear all historical records</li>
     * <li>Only the <strong>Released</strong> status allows the use of the check item for inspection.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Cloud asset vendor.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> API to get the available vendors.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static UpdateCheckItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckItemRequest self = new UpdateCheckItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCheckItemRequest setAssistInfo(UpdateCheckItemRequestAssistInfo assistInfo) {
        this.assistInfo = assistInfo;
        return this;
    }
    public UpdateCheckItemRequestAssistInfo getAssistInfo() {
        return this.assistInfo;
    }

    public UpdateCheckItemRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public UpdateCheckItemRequest setCheckRule(String checkRule) {
        this.checkRule = checkRule;
        return this;
    }
    public String getCheckRule() {
        return this.checkRule;
    }

    public UpdateCheckItemRequest setCheckShowName(String checkShowName) {
        this.checkShowName = checkShowName;
        return this;
    }
    public String getCheckShowName() {
        return this.checkShowName;
    }

    public UpdateCheckItemRequest setDescription(UpdateCheckItemRequestDescription description) {
        this.description = description;
        return this;
    }
    public UpdateCheckItemRequestDescription getDescription() {
        return this.description;
    }

    public UpdateCheckItemRequest setInstanceSubType(String instanceSubType) {
        this.instanceSubType = instanceSubType;
        return this;
    }
    public String getInstanceSubType() {
        return this.instanceSubType;
    }

    public UpdateCheckItemRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateCheckItemRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateCheckItemRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public UpdateCheckItemRequest setSectionIds(java.util.List<Long> sectionIds) {
        this.sectionIds = sectionIds;
        return this;
    }
    public java.util.List<Long> getSectionIds() {
        return this.sectionIds;
    }

    public UpdateCheckItemRequest setSolution(UpdateCheckItemRequestSolution solution) {
        this.solution = solution;
        return this;
    }
    public UpdateCheckItemRequestSolution getSolution() {
        return this.solution;
    }

    public UpdateCheckItemRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateCheckItemRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public static class UpdateCheckItemRequestAssistInfo extends TeaModel {
        /**
         * <p>Type of the help information for the check item risk. Values:</p>
         * <ul>
         * <li><strong>text</strong>: Text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Content of the help information for the check item risk.</p>
         * 
         * <strong>example:</strong>
         * <p>custom assistInfo.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateCheckItemRequestAssistInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckItemRequestAssistInfo self = new UpdateCheckItemRequestAssistInfo();
            return TeaModel.build(map, self);
        }

        public UpdateCheckItemRequestAssistInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateCheckItemRequestAssistInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateCheckItemRequestDescription extends TeaModel {
        /**
         * <p>Type of the check item description. Values:</p>
         * <ul>
         * <li><strong>text</strong>: Text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>custom description.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateCheckItemRequestDescription build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckItemRequestDescription self = new UpdateCheckItemRequestDescription();
            return TeaModel.build(map, self);
        }

        public UpdateCheckItemRequestDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateCheckItemRequestDescription setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateCheckItemRequestSolution extends TeaModel {
        /**
         * <p>Type of the solution information for the check item. Values:</p>
         * <ul>
         * <li><strong>text</strong>: Text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Content of the solution for the check item risk.</p>
         * 
         * <strong>example:</strong>
         * <p>custom solution.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateCheckItemRequestSolution build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckItemRequestSolution self = new UpdateCheckItemRequestSolution();
            return TeaModel.build(map, self);
        }

        public UpdateCheckItemRequestSolution setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateCheckItemRequestSolution setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
