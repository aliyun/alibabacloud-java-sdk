// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationSuspEventsRequest extends TeaModel {
    // The ID of the request source.
    // 
    // Set the value to **sas**, which indicates that the request is sent from Security Center.
    @NameInMap("From")
    public String from;

    // The operation that you want to perform on alerts. Valid values:
    // 
    // *   **deal**: quarantines the source file of the malicious process.
    // *   **ignore**: ignores the alerts.
    // *   **mark\_mis_info**: marks the alerts as false positives by adding the alerts to the whitelist.
    // *   **rm\_mark\_mis_info**: cancels marking the alerts as false positives by removing the alerts from the whitelist.
    // *   **offline_handled**: marks the alerts as handled.
    @NameInMap("Operation")
    public String operation;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The suboperation that you want to perform when you quarantine the source file of the malicious process. Valid values:
    // 
    // *   **killAndQuaraFileByPidAndMd5andPath**: terminates the process based on its process ID (PID) and quarantines the source file of the process.
    // *   **quaraFileByMd5andPath**: quarantines the source file of the process.
    // *   **killAndQuaraFileByMd5andPath**: terminates the process and quarantines the source file of the process.
    @NameInMap("SubOperation")
    public String subOperation;

    // The IDs of alert events.
    // 
    // >  You can call the [DescribeAlarmEventList](~~DescribeAlarmEventList~~) operation to obtain the IDs of alert events from the SecurityEventIds response parameter.
    @NameInMap("SuspiciousEventIds")
    public String suspiciousEventIds;

    // The type of the exceptions. Valid values:
    // 
    // *   **alarm**: alerts
    // *   **null**: exceptions
    @NameInMap("WarnType")
    public String warnType;

    public static OperationSuspEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperationSuspEventsRequest self = new OperationSuspEventsRequest();
        return TeaModel.build(map, self);
    }

    public OperationSuspEventsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public OperationSuspEventsRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public OperationSuspEventsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public OperationSuspEventsRequest setSubOperation(String subOperation) {
        this.subOperation = subOperation;
        return this;
    }
    public String getSubOperation() {
        return this.subOperation;
    }

    public OperationSuspEventsRequest setSuspiciousEventIds(String suspiciousEventIds) {
        this.suspiciousEventIds = suspiciousEventIds;
        return this;
    }
    public String getSuspiciousEventIds() {
        return this.suspiciousEventIds;
    }

    public OperationSuspEventsRequest setWarnType(String warnType) {
        this.warnType = warnType;
        return this;
    }
    public String getWarnType() {
        return this.warnType;
    }

}
