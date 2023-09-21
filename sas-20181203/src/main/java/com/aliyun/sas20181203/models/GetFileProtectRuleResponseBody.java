// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFileProtectRuleResponseBodyData data;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("AlertLevel")
        public Integer alertLevel;

        @NameInMap("FileOps")
        public java.util.List<String> fileOps;

        @NameInMap("FilePaths")
        public java.util.List<String> filePaths;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ProcPaths")
        public java.util.List<String> procPaths;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Status")
        public Integer status;

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
