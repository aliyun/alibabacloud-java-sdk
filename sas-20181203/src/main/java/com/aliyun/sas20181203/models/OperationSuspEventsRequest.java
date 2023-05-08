// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationSuspEventsRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    /**
     * <p>WB01014029</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>Handles multiple exceptions at a time.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("SubOperation")
    public String subOperation;

    /**
     * <p>OperationSuspEvents</p>
     */
    @NameInMap("SuspiciousEventIds")
    public String suspiciousEventIds;

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
