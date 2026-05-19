// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientEventResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFileProtectClientEventResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFileProtectClientEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectClientEventResponseBody self = new GetFileProtectClientEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileProtectClientEventResponseBody setData(GetFileProtectClientEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileProtectClientEventResponseBodyData getData() {
        return this.data;
    }

    public GetFileProtectClientEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileProtectClientEventResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlertLevel")
        public Integer alertLevel;

        /**
         * <strong>example:</strong>
         * <p>[&quot;touch&quot;,&quot;/usr/local/aaaa&quot;]</p>
         */
        @NameInMap("CmdLine")
        public String cmdLine;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>/usr/local</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p>rwxr-xr-x</p>
         */
        @NameInMap("FilePermission")
        public String filePermission;

        /**
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("HandleTime")
        public Long handleTime;

        /**
         * <strong>example:</strong>
         * <p>3454</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>i-wz92q7m5hsbgfhdss***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>17.16.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <strong>example:</strong>
         * <p>10.42.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("LatestTime")
        public Long latestTime;

        /**
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>/bin/bash33</p>
         */
        @NameInMap("ProcPath")
        public String procPath;

        /**
         * <strong>example:</strong>
         * <p>3453</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        /**
         * <strong>example:</strong>
         * <p>test-000</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static GetFileProtectClientEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileProtectClientEventResponseBodyData self = new GetFileProtectClientEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileProtectClientEventResponseBodyData setAlertLevel(Integer alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        public GetFileProtectClientEventResponseBodyData setCmdLine(String cmdLine) {
            this.cmdLine = cmdLine;
            return this;
        }
        public String getCmdLine() {
            return this.cmdLine;
        }

        public GetFileProtectClientEventResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetFileProtectClientEventResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetFileProtectClientEventResponseBodyData setFilePermission(String filePermission) {
            this.filePermission = filePermission;
            return this;
        }
        public String getFilePermission() {
            return this.filePermission;
        }

        public GetFileProtectClientEventResponseBodyData setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public GetFileProtectClientEventResponseBodyData setHandleTime(Long handleTime) {
            this.handleTime = handleTime;
            return this;
        }
        public Long getHandleTime() {
            return this.handleTime;
        }

        public GetFileProtectClientEventResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetFileProtectClientEventResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetFileProtectClientEventResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetFileProtectClientEventResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public GetFileProtectClientEventResponseBodyData setLatestTime(Long latestTime) {
            this.latestTime = latestTime;
            return this;
        }
        public Long getLatestTime() {
            return this.latestTime;
        }

        public GetFileProtectClientEventResponseBodyData setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetFileProtectClientEventResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetFileProtectClientEventResponseBodyData setProcPath(String procPath) {
            this.procPath = procPath;
            return this;
        }
        public String getProcPath() {
            return this.procPath;
        }

        public GetFileProtectClientEventResponseBodyData setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public GetFileProtectClientEventResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetFileProtectClientEventResponseBodyData setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

        public GetFileProtectClientEventResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetFileProtectClientEventResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetFileProtectClientEventResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetFileProtectClientEventResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetFileProtectClientEventResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
