// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientRuleResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
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
         * <p>The alert notification level. Valid values:</p>
         * <ul>
         * <li><p>0: no alert</p>
         * </li>
         * <li><p>1: reminder</p>
         * </li>
         * <li><p>2: suspicious</p>
         * </li>
         * <li><p>3: high-risk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertLevel")
        public Integer alertLevel;

        /**
         * <p>The list of excluded users.</p>
         */
        @NameInMap("ExcludeUsers")
        public java.util.List<String> excludeUsers;

        /**
         * <p>The operations performed on files.</p>
         */
        @NameInMap("FileOps")
        public java.util.List<String> fileOps;

        /**
         * <p>The monitored file paths. Wildcards are supported.</p>
         */
        @NameInMap("FilePaths")
        public java.util.List<String> filePaths;

        /**
         * <p>The protected file types.</p>
         */
        @NameInMap("FileTypes")
        public java.util.List<String> fileTypes;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3119</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The operating system type. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows</li>
         * <li><strong>linux</strong>: Linux.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The process paths. Wildcards are supported.</p>
         */
        @NameInMap("ProcPaths")
        public java.util.List<String> procPaths;

        /**
         * <p>The action that the rule takes on the client. Valid values:</p>
         * <ul>
         * <li><p>monitor: alert</p>
         * </li>
         * <li><p>block: block</p>
         * </li>
         * <li><p>pass: allow.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The switch ID that corresponds to the rule.</p>
         * 
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
