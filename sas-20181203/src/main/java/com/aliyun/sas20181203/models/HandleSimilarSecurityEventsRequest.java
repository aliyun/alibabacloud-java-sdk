// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarSecurityEventsRequest extends TeaModel {
    /**
     * <p>The whitelist rule. For example, if you want to add a file that contains the string a to the whitelist based on the MD5 hash value, set this parameter to {&quot;field&quot;:&quot;md5&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;aa&quot;}.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;field&quot;:&quot;md5&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;aa&quot;}</p>
     */
    @NameInMap("MarkMissParam")
    public String markMissParam;

    /**
     * <p>The operation that you want to perform to handle the alert events.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeSecurityEventOperations~~">DescribeSecurityEventOperations</a> operation to query the operations.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>offline_handled</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The configuration of the operation that you want to perform to handle the alert events. The value of this parameter is in the JSON format.</p>
     * <blockquote>
     * <p> If you set <strong>OperationCode</strong> to <strong>kill_and_quara</strong>, <strong>block_ip</strong>, or <strong>virus_quara</strong>, you must specify OperationParams. If you set <strong>OperationCode</strong> to other values, you can leave OperationParams empty. If you set <strong>OperationCode</strong> to <strong>block_ip</strong>, the value of OperationParams must consist of the following fields:</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li><strong>expireTime</strong>: the end time of locking. Unit: milliseconds.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p> If you set <strong>OperationCode</strong> to <strong>kill_and_quara</strong>, the value of OperationParams must consist of the following fields:</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li><strong>subOperation</strong>: the method of detection and removal. Valid values:</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <pre><code>*   **killAndQuaraFileByMd5andPath**: terminates the process and quarantines the source file of the process.
     * *   **killByMd5andPath**: terminates the running process.
     * </code></pre>
     * </blockquote>
     * <blockquote>
     * <p> If you set <strong>OperationCode</strong> to <strong>virus_quara</strong>, the value of OperationParams consists of the following fields:</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li><strong>subOperation</strong>: the method of detection and removal. Valid values:</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <pre><code>*   **quaraFileByMd5andPath**: quarantines the source file of the process.
     * </code></pre>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;expireTime&quot;:1646208726195}</p>
     */
    @NameInMap("OperationParams")
    public String operationParams;

    /**
     * <p>The remark of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>remark test.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the task that handles the alert events at a time.</p>
     * <blockquote>
     * <p> You can call the <a href="~~CreateSimilarSecurityEventsQueryTask~~">CreateSimilarSecurityEventsQueryTask</a> operation to query the IDs of tasks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>666038</p>
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
