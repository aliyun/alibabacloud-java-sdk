// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectRuleResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetFileProtectRuleResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C0DF9057-67C5-574D-A2D2-0CA9AC74C4D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFileProtectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectRuleResponseBody self = new GetFileProtectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileProtectRuleResponseBody setData(GetFileProtectRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileProtectRuleResponseBodyData getData() {
        return this.data;
    }

    public GetFileProtectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileProtectRuleResponseBodyData extends TeaModel {
        /**
         * <p>The handling method of the rule. Valid values:</p>
         * <ol>
         * <li>pass: allow</li>
         * <li>alert</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The severity of alerts. Valid values:</p>
         * <ul>
         * <li>0: does not generate alerts</li>
         * <li>1: sends notifications</li>
         * <li>2: suspicious</li>
         * <li>3: high-risk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlertLevel")
        public Integer alertLevel;

        /**
         * <p>The operations performed on the files.</p>
         */
        @NameInMap("FileOps")
        public java.util.List<String> fileOps;

        /**
         * <p>The paths to the monitored files.</p>
         */
        @NameInMap("FilePaths")
        public java.util.List<String> filePaths;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>44616</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows</li>
         * <li><strong>linux</strong>: Linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The paths to the monitored processes.</p>
         */
        @NameInMap("ProcPaths")
        public java.util.List<String> procPaths;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test-000</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ol>
         * <li>0: disabled</li>
         * <li>1: enabled</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The switch ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE_PROTECT_RULE_SWITCH_TYPE_0000</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        public static GetFileProtectRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileProtectRuleResponseBodyData self = new GetFileProtectRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileProtectRuleResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetFileProtectRuleResponseBodyData setAlertLevel(Integer alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        public GetFileProtectRuleResponseBodyData setFileOps(java.util.List<String> fileOps) {
            this.fileOps = fileOps;
            return this;
        }
        public java.util.List<String> getFileOps() {
            return this.fileOps;
        }

        public GetFileProtectRuleResponseBodyData setFilePaths(java.util.List<String> filePaths) {
            this.filePaths = filePaths;
            return this;
        }
        public java.util.List<String> getFilePaths() {
            return this.filePaths;
        }

        public GetFileProtectRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetFileProtectRuleResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetFileProtectRuleResponseBodyData setProcPaths(java.util.List<String> procPaths) {
            this.procPaths = procPaths;
            return this;
        }
        public java.util.List<String> getProcPaths() {
            return this.procPaths;
        }

        public GetFileProtectRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetFileProtectRuleResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetFileProtectRuleResponseBodyData setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

    }

}
