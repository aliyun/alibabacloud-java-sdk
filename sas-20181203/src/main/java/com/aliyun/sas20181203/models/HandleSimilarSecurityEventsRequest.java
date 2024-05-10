// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarSecurityEventsRequest extends TeaModel {
    /**
     * <p>The whitelist rule. For example, if you want to add a file that contains the string a to the whitelist based on the MD5 hash value, set this parameter to {"field":"md5","operate":"contains","fieldValue":"aa"}.</p>
     */
    @NameInMap("MarkMissParam")
    public String markMissParam;

    /**
     * <p>The operation that you want to perform to handle the alert events.</p>
     * <br>
     * <p>>  You can call the [DescribeSecurityEventOperations](~~DescribeSecurityEventOperations~~) operation to query the operations.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The configuration of the operation that you want to perform to handle the alert events. The value of this parameter is in the JSON format.</p>
     * <br>
     * <p>>  If you set **OperationCode** to **kill_and_quara**, **block_ip**, or **virus_quara**, you must specify OperationParams. If you set **OperationCode** to other values, you can leave OperationParams empty. If you set **OperationCode** to **block_ip**, the value of OperationParams must consist of the following fields:</p>
     * <br>
     * <p>> *   **expireTime**: the end time of locking. Unit: milliseconds.</p>
     * <br>
     * <p>>  If you set **OperationCode** to **kill_and_quara**, the value of OperationParams must consist of the following fields:</p>
     * <br>
     * <p>> *   **subOperation**: the method of detection and removal. Valid values:</p>
     * <br>
     * <p>>     *   **killAndQuaraFileByMd5andPath**: terminates the process and quarantines the source file of the process.</p>
     * <p>>     *   **killByMd5andPath**: terminates the running process.</p>
     * <br>
     * <p>>  If you set **OperationCode** to **virus_quara**, the value of OperationParams consists of the following fields:</p>
     * <br>
     * <p>> *   **subOperation**: the method of detection and removal. Valid values:</p>
     * <br>
     * <p>>     *   **quaraFileByMd5andPath**: quarantines the source file of the process.</p>
     */
    @NameInMap("OperationParams")
    public String operationParams;

    /**
     * <p>The remark of the operation.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the task that handles the alert events at a time.</p>
     * <br>
     * <p>>  You can call the [CreateSimilarSecurityEventsQueryTask](~~CreateSimilarSecurityEventsQueryTask~~) operation to query the IDs of tasks.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static HandleSimilarSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleSimilarSecurityEventsRequest self = new HandleSimilarSecurityEventsRequest();
        return TeaModel.build(map, self);
    }

    public HandleSimilarSecurityEventsRequest setMarkMissParam(String markMissParam) {
        this.markMissParam = markMissParam;
        return this;
    }
    public String getMarkMissParam() {
        return this.markMissParam;
    }

    public HandleSimilarSecurityEventsRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public HandleSimilarSecurityEventsRequest setOperationParams(String operationParams) {
        this.operationParams = operationParams;
        return this;
    }
    public String getOperationParams() {
        return this.operationParams;
    }

    public HandleSimilarSecurityEventsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public HandleSimilarSecurityEventsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public HandleSimilarSecurityEventsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public HandleSimilarSecurityEventsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
