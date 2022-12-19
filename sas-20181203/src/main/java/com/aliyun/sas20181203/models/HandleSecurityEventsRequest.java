// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsRequest extends TeaModel {
    // Specifies whether to add multiple alert events to the whitelist at a time. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("MarkBatch")
    public String markBatch;

    // The whitelist rule. The value of this parameter is in the JSON format and contains the following fields:
    // 
    // *   **field**: The field based on which alert events are added to the whitelist.
    // 
    // *   **operate**: The method that is used to added alert events to the whitelist. Valid values:
    // 
    //     *   **notContains**: does not contain
    //     *   **contains**: contains
    //     *   **regex**: matches by regular expression
    //     *   **strEqual**: equals
    //     *   **strNotEqual**: does not equal
    // 
    // *   **fieldValue**: The value of the field based on which alert events are added to the whitelist.
    // 
    // *   **uuid**: The application scope of the whitelist rule. Valid values:
    // 
    //     *   **part**: the current asset
    //     *   **ALL**: all assets
    // 
    // >  You can call the [DescribeSecurityEventOperations](~~DescribeSecurityEventOperations~~) operation to obtain the fields that you can specify for **field**.
    @NameInMap("MarkMissParam")
    public String markMissParam;

    // The operation that you want to perform to handle the alert events. Valid values:
    // 
    // *   **block_ip**: blocks the source IP address.
    // *   **advance\_mark\_mis_info**: adds the alert events to the whitelist.
    // *   **ignore**: ignores the alert events.
    // *   **manual_handled**: marks the alert events as manually handled.
    // *   **kill_process**: terminates the malicious process.
    // *   **cleanup**: performs in-depth virus detection and removal.
    // *   **kill\_and_quara**: kills the malicious processes and quarantines the source file.
    // *   **disable\_malicious_defense**: stops the container on which the alerting files or processes exist.
    // *   **client\_problem_check**: performs troubleshooting.
    // *   **quara**: quarantines the source file of the malicious process.
    @NameInMap("OperationCode")
    public String operationCode;

    // The configuration of the operation that you want to perform to handle the alert events.
    // 
    // >  If you set OperationCode to `kill_and_quara` or `block_ip`, you must specify OperationParams. If you set OperationCode to other values, you can leave OperationParams empty.
    @NameInMap("OperationParams")
    public String operationParams;

    // The IDs of the alert events.
    @NameInMap("SecurityEventIds")
    public java.util.List<String> securityEventIds;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static HandleSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleSecurityEventsRequest self = new HandleSecurityEventsRequest();
        return TeaModel.build(map, self);
    }

    public HandleSecurityEventsRequest setMarkBatch(String markBatch) {
        this.markBatch = markBatch;
        return this;
    }
    public String getMarkBatch() {
        return this.markBatch;
    }

    public HandleSecurityEventsRequest setMarkMissParam(String markMissParam) {
        this.markMissParam = markMissParam;
        return this;
    }
    public String getMarkMissParam() {
        return this.markMissParam;
    }

    public HandleSecurityEventsRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public HandleSecurityEventsRequest setOperationParams(String operationParams) {
        this.operationParams = operationParams;
        return this;
    }
    public String getOperationParams() {
        return this.operationParams;
    }

    public HandleSecurityEventsRequest setSecurityEventIds(java.util.List<String> securityEventIds) {
        this.securityEventIds = securityEventIds;
        return this;
    }
    public java.util.List<String> getSecurityEventIds() {
        return this.securityEventIds;
    }

    public HandleSecurityEventsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
