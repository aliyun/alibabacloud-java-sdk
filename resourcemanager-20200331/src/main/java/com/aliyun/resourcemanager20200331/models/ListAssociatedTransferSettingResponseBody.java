// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAssociatedTransferSettingResponseBody extends TeaModel {
    /**
     * <p>The settings of the Transfer Associated Resources feature.</p>
     */
    @NameInMap("AssociatedTransferSetting")
    public ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting associatedTransferSetting;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAssociatedTransferSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssociatedTransferSettingResponseBody self = new ListAssociatedTransferSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssociatedTransferSettingResponseBody setAssociatedTransferSetting(ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting associatedTransferSetting) {
        this.associatedTransferSetting = associatedTransferSetting;
        return this;
    }
    public ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting getAssociatedTransferSetting() {
        return this.associatedTransferSetting;
    }

    public ListAssociatedTransferSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings extends TeaModel {
        /**
         * <p>The type of the associated resource.</p>
         */
        @NameInMap("AssociatedResourceType")
        public String associatedResourceType;

        /**
         * <p>The service code of the associated resource.</p>
         */
        @NameInMap("AssociatedService")
        public String associatedService;

        /**
         * <p>The type of the primary resource.</p>
         */
        @NameInMap("MasterResourceType")
        public String masterResourceType;

        /**
         * <p>The service code of the primary resource.</p>
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

        public static ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings build(java.util.Map<String, ?> map) throws Exception {
            ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings self = new ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings();
            return TeaModel.build(map, self);
        }

        public ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings setAssociatedResourceType(String associatedResourceType) {
            this.associatedResourceType = associatedResourceType;
            return this;
        }
        public String getAssociatedResourceType() {
            return this.associatedResourceType;
        }

        public ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings setAssociatedService(String associatedService) {
            this.associatedService = associatedService;
            return this;
        }
        public String getAssociatedService() {
            return this.associatedService;
        }

        public ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings setMasterResourceType(String masterResourceType) {
            this.masterResourceType = masterResourceType;
            return this;
        }
        public String getMasterResourceType() {
            return this.masterResourceType;
        }

        public ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings setMasterService(String masterService) {
            this.masterService = masterService;
            return this;
        }
        public String getMasterService() {
            return this.masterService;
        }

        public ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting extends TeaModel {
        /**
         * <p>The settings of the Transfer Associated Resources feature.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("EnableExistingResourcesTransfer")
        public String enableExistingResourcesTransfer;

        /**
         * <p>The settings of the transfer rules.</p>
         */
        @NameInMap("RuleSettings")
        public java.util.List<ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings> ruleSettings;

        /**
         * <p>The status of the Transfer Associated Resources feature. Valid values:</p>
         * <br>
         * <p>- Enable: enabled</p>
         * <p>- Disable: disabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting build(java.util.Map<String, ?> map) throws Exception {
            ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting self = new ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting();
            return TeaModel.build(map, self);
        }

        public ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting setEnableExistingResourcesTransfer(String enableExistingResourcesTransfer) {
            this.enableExistingResourcesTransfer = enableExistingResourcesTransfer;
            return this;
        }
        public String getEnableExistingResourcesTransfer() {
            return this.enableExistingResourcesTransfer;
        }

        public ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting setRuleSettings(java.util.List<ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings> ruleSettings) {
            this.ruleSettings = ruleSettings;
            return this;
        }
        public java.util.List<ListAssociatedTransferSettingResponseBodyAssociatedTransferSettingRuleSettings> getRuleSettings() {
            return this.ruleSettings;
        }

        public ListAssociatedTransferSettingResponseBodyAssociatedTransferSetting setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
