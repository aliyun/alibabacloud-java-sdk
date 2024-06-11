// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsRequest extends TeaModel {
    /**
     * <p>Specifies whether to add multiple alert events to the whitelist at a time. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("MarkBatch")
    public String markBatch;

    /**
     * <p>The whitelist rule. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **field**: The field based on which alert events are added to the whitelist.</p>
     * <br>
     * <p>*   **operate**: The method that is used to added alert events to the whitelist. Valid values:</p>
     * <br>
     * <p>    *   **notContains**: does not contain</p>
     * <p>    *   **contains**: contains</p>
     * <p>    *   **regex**: matches by regular expression</p>
     * <p>    *   **strEqual**: equals</p>
     * <p>    *   **strNotEqual**: does not equal</p>
     * <br>
     * <p>*   **fieldValue**: The value of the field based on which alert events are added to the whitelist.</p>
     * <br>
     * <p>*   **uuid**: The application scope of the whitelist rule. Valid values:</p>
     * <br>
     * <p>    *   **part**: the current asset</p>
     * <p>    *   **ALL**: all assets</p>
     * <br>
     * <p>>  You can call the [DescribeSecurityEventOperations](~~DescribeSecurityEventOperations~~) operation to obtain the fields that you can specify for **field**.</p>
     */
    @NameInMap("MarkMissParam")
    public String markMissParam;

    /**
     * <p>The operation that you want to perform to handle the alert events. Valid values:</p>
     * <br>
     * <p>*   **block_ip**: blocks the source IP address.</p>
     * <p>*   **advance_mark_mis_info**: adds the alert events to the whitelist.</p>
     * <p>*   **ignore**: ignores the alert events.</p>
     * <p>*   **manual_handled**: marks the alert events as manually handled.</p>
     * <p>*   **kill_process**: terminates the malicious process.</p>
     * <p>*   **cleanup**: performs in-depth virus detection and removal.</p>
     * <p>*   **kill_and_quara**: kills the malicious processes and quarantines the source file.</p>
     * <p>*   **disable_malicious_defense**: stops the container on which the alerting files or processes exist.</p>
     * <p>*   **client_problem_check**: performs troubleshooting.</p>
     * <p>*   **quara**: quarantines the source file of the malicious process.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The configuration of the operation that you want to perform to handle the alert events.</p>
     * <br>
     * <p>>  If you set OperationCode to `kill_and_quara` or `block_ip`, you must specify OperationParams. If you set OperationCode to other values, you can leave OperationParams empty.</p>
     */
    @NameInMap("OperationParams")
    public String operationParams;

    /**
     * <p>The remarks of the handling operation.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <br>
     * <p>>  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to obtain the IDs.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The IDs of the alert events.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityEventIds")
    public java.util.List<String> securityEventIds;

    /**
     * <p>The source IP address of the request.</p>
     */
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

    public HandleSecurityEventsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public HandleSecurityEventsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
