// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAssociatedTransferSettingRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the Transfer Existing Associated Resources feature. Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableExistingResourcesTransfer")
    public String enableExistingResourcesTransfer;

    /**
     * <p>The settings of transfer rules.</p>
     */
    @NameInMap("RuleSettings")
    public java.util.List<UpdateAssociatedTransferSettingRequestRuleSettings> ruleSettings;

    public static UpdateAssociatedTransferSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssociatedTransferSettingRequest self = new UpdateAssociatedTransferSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAssociatedTransferSettingRequest setEnableExistingResourcesTransfer(String enableExistingResourcesTransfer) {
        this.enableExistingResourcesTransfer = enableExistingResourcesTransfer;
        return this;
    }
    public String getEnableExistingResourcesTransfer() {
        return this.enableExistingResourcesTransfer;
    }

    public UpdateAssociatedTransferSettingRequest setRuleSettings(java.util.List<UpdateAssociatedTransferSettingRequestRuleSettings> ruleSettings) {
        this.ruleSettings = ruleSettings;
        return this;
    }
    public java.util.List<UpdateAssociatedTransferSettingRequestRuleSettings> getRuleSettings() {
        return this.ruleSettings;
    }

    public static class UpdateAssociatedTransferSettingRequestRuleSettings extends TeaModel {
        /**
         * <p>The type of the associated resource.</p>
         * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>disk</p>
         */
        @NameInMap("AssociatedResourceType")
        public String associatedResourceType;

        /**
         * <p>The service code of the associated resource.</p>
         * <p>You can obtain the service code from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("AssociatedService")
        public String associatedService;

        /**
         * <p>The type of the primary resource.</p>
         * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("MasterResourceType")
        public String masterResourceType;

        /**
         * <p>The service code of the primary resource.</p>
         * <p>You can obtain the service code from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("MasterService")
        public String masterService;

        /**
         * <p>The status of the Transfer Associated Resources feature. Valid values:</p>
         * <ul>
         * <li>Enable: enabled</li>
         * <li>Disable: disabled</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateAssociatedTransferSettingRequestRuleSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateAssociatedTransferSettingRequestRuleSettings self = new UpdateAssociatedTransferSettingRequestRuleSettings();
            return TeaModel.build(map, self);
        }

        public UpdateAssociatedTransferSettingRequestRuleSettings setAssociatedResourceType(String associatedResourceType) {
            this.associatedResourceType = associatedResourceType;
            return this;
        }
        public String getAssociatedResourceType() {
            return this.associatedResourceType;
        }

        public UpdateAssociatedTransferSettingRequestRuleSettings setAssociatedService(String associatedService) {
            this.associatedService = associatedService;
            return this;
        }
        public String getAssociatedService() {
            return this.associatedService;
        }

        public UpdateAssociatedTransferSettingRequestRuleSettings setMasterResourceType(String masterResourceType) {
            this.masterResourceType = masterResourceType;
            return this;
        }
        public String getMasterResourceType() {
            return this.masterResourceType;
        }

        public UpdateAssociatedTransferSettingRequestRuleSettings setMasterService(String masterService) {
            this.masterService = masterService;
            return this;
        }
        public String getMasterService() {
            return this.masterService;
        }

        public UpdateAssociatedTransferSettingRequestRuleSettings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
