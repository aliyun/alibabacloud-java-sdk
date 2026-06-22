// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationSuspEventsRequest extends TeaModel {
    /**
     * <p>The request source identifier.</p>
     * <p>Set this parameter to <strong>sas</strong>, which indicates a request from the Security Center client.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The operation to perform on the alert. Valid values:</p>
     * <ul>
     * <li><strong>deal</strong>: handles the alert (quarantine).</li>
     * <li><strong>ignore</strong>: ignores the alert.</li>
     * <li><strong>mark_mis_info</strong>: marks the alert as a false positive (adds it to the whitelist).</li>
     * <li><strong>rm_mark_mis_info</strong>: unmarks the alert as a false positive (removes it from the whitelist).</li>
     * <li><strong>offline_handled</strong>: marks the alert as handled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>deal</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The sub-operation type to perform when quarantining the alert event. Valid values:</p>
     * <ul>
     * <li><strong>killAndQuaraFileByPidAndMd5andPath</strong>: terminates the process by PID and quarantines the source file of the process.</li>
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
     * <p>The list of alert event IDs.</p>
     * <blockquote>
     * <p>You can call <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> to obtain alert event IDs from the SecurityEventIds response parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>290852</p>
     */
    @NameInMap("SuspiciousEventIds")
    public String suspiciousEventIds;

    /**
     * <p>The type of the exception event to handle. Valid values:</p>
     * <ul>
     * <li><strong>alarm</strong>: alert.</li>
     * <li><strong>Empty</strong>: exception.</li>
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
