// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAssociatedTransferSettingRequest extends TeaModel {
    @NameInMap("EnableExistingResourcesTransfer")
    public String enableExistingResourcesTransfer;

    /**
     * <p>The settings of the transfer rules.</p>
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
         * <br>
         * <p>You can obtain the resource type from the **Resource type** column in [Services that work with Resource Group](~~94479~~).</p>
         */
        @NameInMap("AssociatedResourceType")
        public String associatedResourceType;

        /**
         * <p>The service code of the associated resource.</p>
         * <br>
         * <p>You can obtain the service code from the **Service code** column in [Services that work with Resource Group](~~94479~~).</p>
         */
        @NameInMap("AssociatedService")
        public String associatedService;

        /**
         * <p>The type of the primary resource.</p>
         * <br>
         * <p>You can obtain the resource type from the **Resource type** column in [Services that work with Resource Group](~~94479~~).</p>
         */
        @NameInMap("MasterResourceType")
        public String masterResourceType;

        /**
         * <p>The service code of the primary resource.</p>
         * <br>
         * <p>You can obtain the service code from the **Service code** column in [Services that work with Resource Group](~~94479~~).</p>
         */
        @NameInMap("MasterService")
        public String masterService;

        /**
         * <p>The status of the Transfer Associated Resources feature. Valid values:</p>
         * <br>
         * <p>- Enable: enabled</p>
         * <p>- Disable: disabled</p>
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
