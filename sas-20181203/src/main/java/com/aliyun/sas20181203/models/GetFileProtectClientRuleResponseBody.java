// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFileProtectClientRuleResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>79CFF74D-E967-5407-8A78-EE03B925****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFileProtectClientRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectClientRuleResponseBody self = new GetFileProtectClientRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileProtectClientRuleResponseBody setData(GetFileProtectClientRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileProtectClientRuleResponseBodyData getData() {
        return this.data;
    }

    public GetFileProtectClientRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileProtectClientRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertLevel")
        public Integer alertLevel;

        @NameInMap("ExcludeUsers")
        public java.util.List<String> excludeUsers;

        @NameInMap("FileOps")
        public java.util.List<String> fileOps;

        @NameInMap("FilePaths")
        public java.util.List<String> filePaths;

        @NameInMap("FileTypes")
        public java.util.List<String> fileTypes;

        /**
         * <strong>example:</strong>
         * <p>3119</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProcPaths")
        public java.util.List<String> procPaths;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>USER-CONTAINER-RULE-SWITCH-TYPE_***</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        public static GetFileProtectClientRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileProtectClientRuleResponseBodyData self = new GetFileProtectClientRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileProtectClientRuleResponseBodyData setAlertLevel(Integer alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        public GetFileProtectClientRuleResponseBodyData setExcludeUsers(java.util.List<String> excludeUsers) {
            this.excludeUsers = excludeUsers;
            return this;
        }
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        public GetFileProtectClientRuleResponseBodyData setFileOps(java.util.List<String> fileOps) {
            this.fileOps = fileOps;
            return this;
        }
        public java.util.List<String> getFileOps() {
            return this.fileOps;
        }

        public GetFileProtectClientRuleResponseBodyData setFilePaths(java.util.List<String> filePaths) {
            this.filePaths = filePaths;
            return this;
        }
        public java.util.List<String> getFilePaths() {
            return this.filePaths;
        }

        public GetFileProtectClientRuleResponseBodyData setFileTypes(java.util.List<String> fileTypes) {
            this.fileTypes = fileTypes;
            return this;
        }
        public java.util.List<String> getFileTypes() {
            return this.fileTypes;
        }

        public GetFileProtectClientRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetFileProtectClientRuleResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetFileProtectClientRuleResponseBodyData setProcPaths(java.util.List<String> procPaths) {
            this.procPaths = procPaths;
            return this;
        }
        public java.util.List<String> getProcPaths() {
            return this.procPaths;
        }

        public GetFileProtectClientRuleResponseBodyData setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

        public GetFileProtectClientRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetFileProtectClientRuleResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetFileProtectClientRuleResponseBodyData setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

    }

}
