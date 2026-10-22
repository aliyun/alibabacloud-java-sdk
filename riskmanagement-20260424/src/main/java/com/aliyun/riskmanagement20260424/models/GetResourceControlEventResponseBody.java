// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetResourceControlEventResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of returned data.</p>
     */
    @NameInMap("Data")
    public GetResourceControlEventResponseBodyData data;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful‌</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6B57D35D-9DAC-5393-AE39-07697E37C2E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call is successful.</li>
     * <li><strong>false</strong>: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetResourceControlEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceControlEventResponseBody self = new GetResourceControlEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceControlEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourceControlEventResponseBody setData(GetResourceControlEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResourceControlEventResponseBodyData getData() {
        return this.data;
    }

    public GetResourceControlEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourceControlEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceControlEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours extends TeaModel {
        /**
         * <p>The traffic exceptions in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>150323855</p>
         */
        @NameInMap("AbnormalBytes")
        public Long abnormalBytes;

        /**
         * <p>The anomaly description.</p>
         * 
         * <strong>example:</strong>
         * <p>The traffic for the domain name cdn-newfile.stomics.tech increased to 54.78 GB between 03:00 and 04:00 on October 22, 2026, approximately 386 times the historical baseline of 0.14 GB. During this period, about 99.7% of the traffic was concentrated in the 14.22.49 CIDR block. Approximately 160 IP addresses accessed the domain, with no single IP accounting for a large proportion. The traffic involved 258 large files, primarily in tar.gz format, with an empty Referer header, indicating batch downloads or abnormal data pulling. Verify whether this was caused by a version release, image synchronization, or partner downloads. If the cause cannot be confirmed, temporarily throttle or block this CIDR block and implement access control for large files</p>
         */
        @NameInMap("AnomalyDesc")
        public String anomalyDesc;

        /**
         * <p>The baseline traffic in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>58819577119</p>
         */
        @NameInMap("BaselineBytes")
        public Long baselineBytes;

        /**
         * <p>The anomaly hour.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-22 03:00:23</p>
         */
        @NameInMap("Hour")
        public String hour;

        /**
         * <p>The traffic multiplier.</p>
         * 
         * <strong>example:</strong>
         * <p>391.29</p>
         */
        @NameInMap("TrafRatio")
        public Double trafRatio;

        public static GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours build(java.util.Map<String, ?> map) throws Exception {
            GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours self = new GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours();
            return TeaModel.build(map, self);
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours setAbnormalBytes(Long abnormalBytes) {
            this.abnormalBytes = abnormalBytes;
            return this;
        }
        public Long getAbnormalBytes() {
            return this.abnormalBytes;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours setAnomalyDesc(String anomalyDesc) {
            this.anomalyDesc = anomalyDesc;
            return this;
        }
        public String getAnomalyDesc() {
            return this.anomalyDesc;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours setBaselineBytes(Long baselineBytes) {
            this.baselineBytes = baselineBytes;
            return this;
        }
        public Long getBaselineBytes() {
            return this.baselineBytes;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours setHour(String hour) {
            this.hour = hour;
            return this;
        }
        public String getHour() {
            return this.hour;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours setTrafRatio(Double trafRatio) {
            this.trafRatio = trafRatio;
            return this;
        }
        public Double getTrafRatio() {
            return this.trafRatio;
        }

    }

    public static class GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord extends TeaModel {
        /**
         * <p>The end time of the alert.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("AlertEndTime")
        public String alertEndTime;

        /**
         * <p>The time of the first alert.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("AlertStartTime")
        public String alertStartTime;

        /**
         * <p>The time when the restriction is lifted.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("AntiPunishTime")
        public String antiPunishTime;

        /**
         * <p>The application time.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-08-21T02:26:50Z</p>
         */
        @NameInMap("ApplyTime")
        public String applyTime;

        /**
         * <p>The time when the alert is ignored.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("IgnoreAlertTime")
        public String ignoreAlertTime;

        /**
         * <p>The time when the instance is shut down.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("InstanceCloseTime")
        public String instanceCloseTime;

        /**
         * <p>The time when the instance is scanned.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("InstanceScanTime")
        public String instanceScanTime;

        /**
         * <p>The time of the latest check.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("LastCheckTime")
        public String lastCheckTime;

        /**
         * <p>The processing time of the mining alert.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("MiningAlertProcessTime")
        public String miningAlertProcessTime;

        /**
         * <p>The estimated shutdown time.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("PreCloseTime")
        public String preCloseTime;

        /**
         * <p>The processing time.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-11-05 10:06:21</p>
         */
        @NameInMap("ProcessTime")
        public String processTime;

        /**
         * <p>The end time of the restriction.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("PunishEndTime")
        public String punishEndTime;

        /**
         * <p>The start time of the restriction.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("PunishStartTime")
        public String punishStartTime;

        /**
         * <p>The rejection time.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("RejectTime")
        public String rejectTime;

        /**
         * <p>The time when the restriction is removed.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("RemoveTime")
        public String removeTime;

        /**
         * <p>The time when the risk check succeeds.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("RiskCheckSuccessTime")
        public String riskCheckSuccessTime;

        public static GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord build(java.util.Map<String, ?> map) throws Exception {
            GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord self = new GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord();
            return TeaModel.build(map, self);
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setAlertEndTime(String alertEndTime) {
            this.alertEndTime = alertEndTime;
            return this;
        }
        public String getAlertEndTime() {
            return this.alertEndTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setAlertStartTime(String alertStartTime) {
            this.alertStartTime = alertStartTime;
            return this;
        }
        public String getAlertStartTime() {
            return this.alertStartTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setAntiPunishTime(String antiPunishTime) {
            this.antiPunishTime = antiPunishTime;
            return this;
        }
        public String getAntiPunishTime() {
            return this.antiPunishTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setIgnoreAlertTime(String ignoreAlertTime) {
            this.ignoreAlertTime = ignoreAlertTime;
            return this;
        }
        public String getIgnoreAlertTime() {
            return this.ignoreAlertTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setInstanceCloseTime(String instanceCloseTime) {
            this.instanceCloseTime = instanceCloseTime;
            return this;
        }
        public String getInstanceCloseTime() {
            return this.instanceCloseTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setInstanceScanTime(String instanceScanTime) {
            this.instanceScanTime = instanceScanTime;
            return this;
        }
        public String getInstanceScanTime() {
            return this.instanceScanTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setLastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setMiningAlertProcessTime(String miningAlertProcessTime) {
            this.miningAlertProcessTime = miningAlertProcessTime;
            return this;
        }
        public String getMiningAlertProcessTime() {
            return this.miningAlertProcessTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setPreCloseTime(String preCloseTime) {
            this.preCloseTime = preCloseTime;
            return this;
        }
        public String getPreCloseTime() {
            return this.preCloseTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setProcessTime(String processTime) {
            this.processTime = processTime;
            return this;
        }
        public String getProcessTime() {
            return this.processTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setPunishEndTime(String punishEndTime) {
            this.punishEndTime = punishEndTime;
            return this;
        }
        public String getPunishEndTime() {
            return this.punishEndTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setPunishStartTime(String punishStartTime) {
            this.punishStartTime = punishStartTime;
            return this;
        }
        public String getPunishStartTime() {
            return this.punishStartTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setRejectTime(String rejectTime) {
            this.rejectTime = rejectTime;
            return this;
        }
        public String getRejectTime() {
            return this.rejectTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setRemoveTime(String removeTime) {
            this.removeTime = removeTime;
            return this;
        }
        public String getRemoveTime() {
            return this.removeTime;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord setRiskCheckSuccessTime(String riskCheckSuccessTime) {
            this.riskCheckSuccessTime = riskCheckSuccessTime;
            return this;
        }
        public String getRiskCheckSuccessTime() {
            return this.riskCheckSuccessTime;
        }

    }

    public static class GetResourceControlEventResponseBodyDataApplyRecordList extends TeaModel {
        /**
         * <p>The details of abnormal hours for CDN traffic exceptions.</p>
         */
        @NameInMap("AnomalyHours")
        public java.util.List<GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours> anomalyHours;

        /**
         * <p>The reason for approval.</p>
         * 
         * <strong>example:</strong>
         * <p>meet the requirements</p>
         */
        @NameInMap("ApprovalReason")
        public String approvalReason;

        /**
         * <p>The time records related to the application.</p>
         */
        @NameInMap("EventTimeRecord")
        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord eventTimeRecord;

        /**
         * <p>The reason for rejection.</p>
         * 
         * <strong>example:</strong>
         * <p>does not meet the requirements</p>
         */
        @NameInMap("RejectReason")
        public String rejectReason;

        /**
         * <p>The remark.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Desc for Draft</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The task status.</p>
         * <ul>
         * <li><strong>Executing</strong>: In progress.</li>
         * <li><strong>Removed</strong>: Removed.</li>
         * <li><strong>Alerting</strong>: Alerting.</li>
         * <li><strong>Ended</strong>: Ended.</li>
         * <li><strong>Processed</strong>: Processed by the user and under platform review.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetResourceControlEventResponseBodyDataApplyRecordList build(java.util.Map<String, ?> map) throws Exception {
            GetResourceControlEventResponseBodyDataApplyRecordList self = new GetResourceControlEventResponseBodyDataApplyRecordList();
            return TeaModel.build(map, self);
        }

        public GetResourceControlEventResponseBodyDataApplyRecordList setAnomalyHours(java.util.List<GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours> anomalyHours) {
            this.anomalyHours = anomalyHours;
            return this;
        }
        public java.util.List<GetResourceControlEventResponseBodyDataApplyRecordListAnomalyHours> getAnomalyHours() {
            return this.anomalyHours;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordList setApprovalReason(String approvalReason) {
            this.approvalReason = approvalReason;
            return this;
        }
        public String getApprovalReason() {
            return this.approvalReason;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordList setEventTimeRecord(GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord eventTimeRecord) {
            this.eventTimeRecord = eventTimeRecord;
            return this;
        }
        public GetResourceControlEventResponseBodyDataApplyRecordListEventTimeRecord getEventTimeRecord() {
            return this.eventTimeRecord;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordList setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetResourceControlEventResponseBodyDataApplyRecordList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetResourceControlEventResponseBodyData extends TeaModel {
        /**
         * <p>The list of application record information.</p>
         */
        @NameInMap("ApplyRecordList")
        public java.util.List<GetResourceControlEventResponseBodyDataApplyRecordList> applyRecordList;

        /**
         * <p>The handling suggestions from the assistant.</p>
         * 
         * <strong>example:</strong>
         * <p>assistant tip</p>
         */
        @NameInMap("AssistantTip")
        public String assistantTip;

        /**
         * <p>The blocked IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>196.251.81.30</p>
         */
        @NameInMap("BlockIp")
        public String blockIp;

        /**
         * <p>The traffic direction. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: Inbound to the cloud. </li>
         * <li><strong>out</strong>: Outbound from the cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>out</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.199.31.155</p>
         */
        @NameInMap("DstIp")
        public String dstIp;

        /**
         * <p>The destination port.</p>
         * 
         * <strong>example:</strong>
         * <p>30629</p>
         */
        @NameInMap("DstPort")
        public String dstPort;

        /**
         * <p>The ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>57ed8c6ddc9aafb1a3df38e6e84d2d45</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The overview of the event impact.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance Stopped</p>
         */
        @NameInMap("EventImpact")
        public String eventImpact;

        /**
         * <p>The vulnerability name.</p>
         * 
         * <strong>example:</strong>
         * <p>Mining Management Event</p>
         */
        @NameInMap("LeakName")
        public String leakName;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The reason for the penalty.</p>
         * 
         * <strong>example:</strong>
         * <p>This instance is connecting to a Miner Pool and has likely been compromised by hackers for mining or other illicit activities.</p>
         */
        @NameInMap("PunishReason")
        public String punishReason;

        /**
         * <p>The download URL of the penalty snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.aliyun.com/v2">https://xxx.aliyun.com/v2</a></p>
         */
        @NameInMap("SnapshotUrl")
        public String snapshotUrl;

        /**
         * <p>The source IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>36.134.124.185</p>
         */
        @NameInMap("SrcIp")
        public String srcIp;

        /**
         * <p>The source port number.</p>
         * 
         * <strong>example:</strong>
         * <p>2168</p>
         */
        @NameInMap("SrcPort")
        public String srcPort;

        /**
         * <p>The handling suggestions.</p>
         * 
         * <strong>example:</strong>
         * <p>Suggestion</p>
         */
        @NameInMap("Tip")
        public String tip;

        public static GetResourceControlEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResourceControlEventResponseBodyData self = new GetResourceControlEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResourceControlEventResponseBodyData setApplyRecordList(java.util.List<GetResourceControlEventResponseBodyDataApplyRecordList> applyRecordList) {
            this.applyRecordList = applyRecordList;
            return this;
        }
        public java.util.List<GetResourceControlEventResponseBodyDataApplyRecordList> getApplyRecordList() {
            return this.applyRecordList;
        }

        public GetResourceControlEventResponseBodyData setAssistantTip(String assistantTip) {
            this.assistantTip = assistantTip;
            return this;
        }
        public String getAssistantTip() {
            return this.assistantTip;
        }

        public GetResourceControlEventResponseBodyData setBlockIp(String blockIp) {
            this.blockIp = blockIp;
            return this;
        }
        public String getBlockIp() {
            return this.blockIp;
        }

        public GetResourceControlEventResponseBodyData setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public GetResourceControlEventResponseBodyData setDstIp(String dstIp) {
            this.dstIp = dstIp;
            return this;
        }
        public String getDstIp() {
            return this.dstIp;
        }

        public GetResourceControlEventResponseBodyData setDstPort(String dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public String getDstPort() {
            return this.dstPort;
        }

        public GetResourceControlEventResponseBodyData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetResourceControlEventResponseBodyData setEventImpact(String eventImpact) {
            this.eventImpact = eventImpact;
            return this;
        }
        public String getEventImpact() {
            return this.eventImpact;
        }

        public GetResourceControlEventResponseBodyData setLeakName(String leakName) {
            this.leakName = leakName;
            return this;
        }
        public String getLeakName() {
            return this.leakName;
        }

        public GetResourceControlEventResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetResourceControlEventResponseBodyData setPunishReason(String punishReason) {
            this.punishReason = punishReason;
            return this;
        }
        public String getPunishReason() {
            return this.punishReason;
        }

        public GetResourceControlEventResponseBodyData setSnapshotUrl(String snapshotUrl) {
            this.snapshotUrl = snapshotUrl;
            return this;
        }
        public String getSnapshotUrl() {
            return this.snapshotUrl;
        }

        public GetResourceControlEventResponseBodyData setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

        public GetResourceControlEventResponseBodyData setSrcPort(String srcPort) {
            this.srcPort = srcPort;
            return this;
        }
        public String getSrcPort() {
            return this.srcPort;
        }

        public GetResourceControlEventResponseBodyData setTip(String tip) {
            this.tip = tip;
            return this;
        }
        public String getTip() {
            return this.tip;
        }

    }

}
