// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectEventResponseBody extends TeaModel {
    /**
     * <p>The details of the returned data.</p>
     */
    @NameInMap("Data")
    public GetFileProtectEventResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The severity of alerts. Valid values:</p>
         * <br>
         * <p>*   0: does not generate alerts</p>
         * <p>*   1: sends notifications</p>
         * <p>*   2: suspicious</p>
         * <p>*   3: high-risk</p>
         */
        @NameInMap("AlertLevel")
        public Integer alertLevel;

        /**
         * <p>The event command line.</p>
         */
        @NameInMap("CmdLine")
        public String cmdLine;

        /**
         * <p>The path to the file.</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The permissions to run the process.</p>
         */
        @NameInMap("FilePermission")
        public String filePermission;

        /**
         * <p>The timestamp at which the event was first detected.</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <p>The time when the event was handled.</p>
         */
        @NameInMap("HandleTime")
        public Long handleTime;

        /**
         * <p>The ID of the event.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the associated instance.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the associated instance.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The time when the event last occurred.</p>
         */
        @NameInMap("LatestTime")
        public Long latestTime;

        /**
         * <p>The operation that the process performed on the file.</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The path to the process.</p>
         */
        @NameInMap("ProcPath")
        public String procPath;

        /**
         * <p>The process ID of the event.</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The remarks.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the event. Valid values:</p>
         * <br>
         * <p>*   0: not handled</p>
         * <p>*   1: handled</p>
         * <p>*   2: added to the whitelist</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The UUID of the asset.</p>
         */
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
