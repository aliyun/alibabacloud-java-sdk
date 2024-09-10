// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVirusScanLatestTaskStatisticResponseBody extends TeaModel {
    /**
     * <p>The information about the virus scan task.</p>
     */
    @NameInMap("Data")
    public GetVirusScanLatestTaskStatisticResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDCAE1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVirusScanLatestTaskStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVirusScanLatestTaskStatisticResponseBody self = new GetVirusScanLatestTaskStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVirusScanLatestTaskStatisticResponseBody setData(GetVirusScanLatestTaskStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVirusScanLatestTaskStatisticResponseBodyData getData() {
        return this.data;
    }

    public GetVirusScanLatestTaskStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVirusScanLatestTaskStatisticResponseBodyData extends TeaModel {
        /**
         * <p>The number of machines on which the virus scan task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CompleteMachine")
        public Integer completeMachine;

        /**
         * <p>The name of the machine.</p>
         * 
         * <strong>example:</strong>
         * <p>testMahine1</p>
         */
        @NameInMap("MachineName")
        public String machineName;

        /**
         * <p>The progress of the virus scan task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>92</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The highest risk level of the detected alerts. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The number of safe machines that are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SafeMachine")
        public Integer safeMachine;

        /**
         * <p>The number of machines that are scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ScanMachine")
        public Integer scanMachine;

        /**
         * <p>The paths of files that were scanned. This value is returned only when ScanType is set to user.</p>
         */
        @NameInMap("ScanPath")
        public java.util.List<String> scanPath;

        /**
         * <p>The timestamp generated when the virus scan task was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1681145862000</p>
         */
        @NameInMap("ScanTime")
        public Long scanTime;

        /**
         * <p>The type of the virus scan. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: automatic scan.</li>
         * <li><strong>user</strong>: custom scan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ScanType")
        public String scanType;

        /**
         * <p>The status of the virus scan task.</p>
         * <p><strong>Valid values for a main task</strong>:</p>
         * <ul>
         * <li><strong>0</strong>: The main task is to be started.</li>
         * <li><strong>10</strong>: The main task is running.</li>
         * <li><strong>100</strong>: The main task is complete.</li>
         * </ul>
         * <p><strong>Valid values for a subtask</strong>:</p>
         * <ul>
         * <li><strong>0</strong>: The subtask is to be started.</li>
         * <li><strong>20</strong>: The scan script is sent.</li>
         * <li><strong>50</strong>: The subtask is running.</li>
         * <li><strong>100</strong>: The subtask is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The number of alerts that are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SuspiciousCount")
        public Integer suspiciousCount;

        /**
         * <p>The number of suspicious machines that are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SuspiciousMachine")
        public Integer suspiciousMachine;

        /**
         * <p>The ID of the virus scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>fc98d58eb56f699d49bf7ebbd6d7****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The number of machines on which the virus scan task was not complete or failed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UnCompleteMachine")
        public Integer unCompleteMachine;

        public static GetVirusScanLatestTaskStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVirusScanLatestTaskStatisticResponseBodyData self = new GetVirusScanLatestTaskStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setCompleteMachine(Integer completeMachine) {
            this.completeMachine = completeMachine;
            return this;
        }
        public Integer getCompleteMachine() {
            return this.completeMachine;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setMachineName(String machineName) {
            this.machineName = machineName;
            return this;
        }
        public String getMachineName() {
            return this.machineName;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setSafeMachine(Integer safeMachine) {
            this.safeMachine = safeMachine;
            return this;
        }
        public Integer getSafeMachine() {
            return this.safeMachine;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setScanMachine(Integer scanMachine) {
            this.scanMachine = scanMachine;
            return this;
        }
        public Integer getScanMachine() {
            return this.scanMachine;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setScanPath(java.util.List<String> scanPath) {
            this.scanPath = scanPath;
            return this;
        }
        public java.util.List<String> getScanPath() {
            return this.scanPath;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setScanTime(Long scanTime) {
            this.scanTime = scanTime;
            return this;
        }
        public Long getScanTime() {
            return this.scanTime;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setScanType(String scanType) {
            this.scanType = scanType;
            return this;
        }
        public String getScanType() {
            return this.scanType;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setSuspiciousCount(Integer suspiciousCount) {
            this.suspiciousCount = suspiciousCount;
            return this;
        }
        public Integer getSuspiciousCount() {
            return this.suspiciousCount;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setSuspiciousMachine(Integer suspiciousMachine) {
            this.suspiciousMachine = suspiciousMachine;
            return this;
        }
        public Integer getSuspiciousMachine() {
            return this.suspiciousMachine;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetVirusScanLatestTaskStatisticResponseBodyData setUnCompleteMachine(Integer unCompleteMachine) {
            this.unCompleteMachine = unCompleteMachine;
            return this;
        }
        public Integer getUnCompleteMachine() {
            return this.unCompleteMachine;
        }

    }

}
