// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationSuspEventsRequest extends TeaModel {
    /**
     * <p>The ID of the request source.</p>
     * <p>Set the value to <strong>sas</strong>, which indicates that the request is sent from Security Center.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The operation that you want to perform on alerts. Valid values:</p>
     * <ul>
     * <li><strong>deal</strong>: quarantines the source file of the malicious process.</li>
     * <li><strong>ignore</strong>: ignores the alerts.</li>
     * <li><strong>mark_mis_info</strong>: marks the alerts as false positives by adding the alerts to the whitelist.</li>
     * <li><strong>rm_mark_mis_info</strong>: cancels false positives by removing the alerts from the whitelist.</li>
     * <li><strong>offline_handled</strong>: marks the alerts as handled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>deal</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The suboperation that you want to perform when you quarantine the source file of the malicious process. Valid values:</p>
     * <ul>
     * <li><strong>killAndQuaraFileByPidAndMd5andPath</strong>: terminates the process based on its process ID (PID) and quarantines the source file of the process.</li>
     * <li><strong>quaraFileByMd5andPath</strong>: quarantines the source file of the process.</li>
     * <li><strong>killAndQuaraFileByMd5andPath</strong>: terminates the process and quarantines the source file of the process.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>killAndQuaraFileByPidAndMd5andPath</p>
     */
    @NameInMap("SubOperation")
    public String subOperation;

    /**
     * <p>The IDs of alert events.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain the IDs of alert events from the SecurityEventIds response parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>290852</p>
     */
    @NameInMap("SuspiciousEventIds")
    public String suspiciousEventIds;

    /**
     * <p>The type of the exceptions. Valid values:</p>
     * <ul>
     * <li><strong>alarm</strong>: alerts</li>
     * <li><strong>null</strong>: exceptions</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>alarm</p>
     */
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
