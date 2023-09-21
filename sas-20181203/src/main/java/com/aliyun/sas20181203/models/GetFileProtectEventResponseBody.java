// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectEventResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFileProtectEventResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFileProtectEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectEventResponseBody self = new GetFileProtectEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileProtectEventResponseBody setData(GetFileProtectEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileProtectEventResponseBodyData getData() {
        return this.data;
    }

    public GetFileProtectEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileProtectEventResponseBodyData extends TeaModel {
        @NameInMap("AlertLevel")
        public Integer alertLevel;

        @NameInMap("CmdLine")
        public String cmdLine;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FilePermission")
        public String filePermission;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("HandleTime")
        public Long handleTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("LatestTime")
        public Long latestTime;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("ProcPath")
        public String procPath;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Uuid")
        public String uuid;

        public static GetFileProtectEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileProtectEventResponseBodyData self = new GetFileProtectEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileProtectEventResponseBodyData setAlertLevel(Integer alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        public GetFileProtectEventResponseBodyData setCmdLine(String cmdLine) {
            this.cmdLine = cmdLine;
            return this;
        }
        public String getCmdLine() {
            return this.cmdLine;
        }

        public GetFileProtectEventResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetFileProtectEventResponseBodyData setFilePermission(String filePermission) {
            this.filePermission = filePermission;
            return this;
        }
        public String getFilePermission() {
            return this.filePermission;
        }

        public GetFileProtectEventResponseBodyData setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public GetFileProtectEventResponseBodyData setHandleTime(Long handleTime) {
            this.handleTime = handleTime;
            return this;
        }
        public Long getHandleTime() {
            return this.handleTime;
        }

        public GetFileProtectEventResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetFileProtectEventResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetFileProtectEventResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetFileProtectEventResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public GetFileProtectEventResponseBodyData setLatestTime(Long latestTime) {
            this.latestTime = latestTime;
            return this;
        }
        public Long getLatestTime() {
            return this.latestTime;
        }

        public GetFileProtectEventResponseBodyData setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetFileProtectEventResponseBodyData setProcPath(String procPath) {
            this.procPath = procPath;
            return this;
        }
        public String getProcPath() {
            return this.procPath;
        }

        public GetFileProtectEventResponseBodyData setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public GetFileProtectEventResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetFileProtectEventResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetFileProtectEventResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetFileProtectEventResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
