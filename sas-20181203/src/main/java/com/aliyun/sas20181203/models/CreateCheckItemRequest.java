// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCheckItemRequest extends TeaModel {
    /**
     * <p>The help information of the check item.</p>
     */
    @NameInMap("AssistInfo")
    public CreateCheckItemRequestAssistInfo assistInfo;

    /**
     * <p>The rule definition of the custom check item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AssociatedData&quot;:{&quot;ToDataList&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;FromPropertyPath&quot;:&quot;InstanceId&quot;}]},&quot;MatchProperty&quot;:{&quot;Operator&quot;:&quot;AND&quot;,&quot;MatchProperties&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Disk&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testId&quot;},{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testInstanceId&quot;}]}}</p>
     */
    @NameInMap("CheckRule")
    public String checkRule;

    /**
     * <p>The name of the custom check item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testCheckItemName</p>
     */
    @NameInMap("CheckShowName")
    public String checkShowName;

    /**
     * <p>The description of the check item.</p>
     */
    @NameInMap("Description")
    public CreateCheckItemRequestDescription description;

    /**
     * <p>The asset subtype of the cloud service.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DISK</p>
     */
    @NameInMap("InstanceSubType")
    public String instanceSubType;

    /**
     * <p>The asset type of the cloud service.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The risk level of the check item. Valid values:</p>
     * <ul>
     * <li><strong>HIGH</strong>: High risk.</li>
     * <li><strong>MEDIUM</strong>: Medium risk.</li>
     * <li><strong>LOW</strong>: Low risk.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The IDs of the sections associated with the check item.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SectionIds")
    public java.util.List<Long> sectionIds;

    /**
     * <p>The solution information of the check item.</p>
     */
    @NameInMap("Solution")
    public CreateCheckItemRequestSolution solution;

    /**
     * <p>The status of the check item. Valid values:</p>
     * <ul>
     * <li><strong>EDIT</strong>: Being edited.</li>
     * <li><strong>RELEASE</strong>: Published.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Changing the status from <strong>Published</strong> to <strong>Being edited</strong> will purge all historical records.</li>
     * <li>Only check items in the <strong>Published</strong> status can be used for checks.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EDIT</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The cloud asset vendor.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> operation to obtain the available vendors.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static CreateCheckItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckItemRequest self = new CreateCheckItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateCheckItemRequest setAssistInfo(CreateCheckItemRequestAssistInfo assistInfo) {
        this.assistInfo = assistInfo;
        return this;
    }
    public CreateCheckItemRequestAssistInfo getAssistInfo() {
        return this.assistInfo;
    }

    public CreateCheckItemRequest setCheckRule(String checkRule) {
        this.checkRule = checkRule;
        return this;
    }
    public String getCheckRule() {
        return this.checkRule;
    }

    public CreateCheckItemRequest setCheckShowName(String checkShowName) {
        this.checkShowName = checkShowName;
        return this;
    }
    public String getCheckShowName() {
        return this.checkShowName;
    }

    public CreateCheckItemRequest setDescription(CreateCheckItemRequestDescription description) {
        this.description = description;
        return this;
    }
    public CreateCheckItemRequestDescription getDescription() {
        return this.description;
    }

    public CreateCheckItemRequest setInstanceSubType(String instanceSubType) {
        this.instanceSubType = instanceSubType;
        return this;
    }
    public String getInstanceSubType() {
        return this.instanceSubType;
    }

    public CreateCheckItemRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateCheckItemRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateCheckItemRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public CreateCheckItemRequest setSectionIds(java.util.List<Long> sectionIds) {
        this.sectionIds = sectionIds;
        return this;
    }
    public java.util.List<Long> getSectionIds() {
        return this.sectionIds;
    }

    public CreateCheckItemRequest setSolution(CreateCheckItemRequestSolution solution) {
        this.solution = solution;
        return this;
    }
    public CreateCheckItemRequestSolution getSolution() {
        return this.solution;
    }

    public CreateCheckItemRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateCheckItemRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public static class CreateCheckItemRequestAssistInfo extends TeaModel {
        /**
         * <p>The type of the help information for the check item risk. Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content of the help information for the check item risk.</p>
         * 
         * <strong>example:</strong>
         * <p>custom assistInfo.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCheckItemRequestAssistInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckItemRequestAssistInfo self = new CreateCheckItemRequestAssistInfo();
            return TeaModel.build(map, self);
        }

        public CreateCheckItemRequestAssistInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateCheckItemRequestAssistInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateCheckItemRequestDescription extends TeaModel {
        /**
         * <p>The type of the check item description. Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content of the description.</p>
         * 
         * <strong>example:</strong>
         * <p>custom description.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCheckItemRequestDescription build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckItemRequestDescription self = new CreateCheckItemRequestDescription();
            return TeaModel.build(map, self);
        }

        public CreateCheckItemRequestDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateCheckItemRequestDescription setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateCheckItemRequestSolution extends TeaModel {
        /**
         * <p>The type of the check item solution information. Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content of the solution for the check item risk.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCheckItemRequestSolution build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckItemRequestSolution self = new CreateCheckItemRequestSolution();
            return TeaModel.build(map, self);
        }

        public CreateCheckItemRequestSolution setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateCheckItemRequestSolution setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
