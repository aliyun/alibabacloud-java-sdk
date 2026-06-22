// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarSecurityEventsRequest extends TeaModel {
    /**
     * <p>The rule for adding items to the whitelist. For example, to add a whitelist rule based on file MD5 where the file contains the string &quot;a&quot;, set this parameter to {&quot;field&quot;:&quot;md5&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;aa&quot;}.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;field&quot;:&quot;md5&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;aa&quot;}</p>
     */
    @NameInMap("MarkMissParam")
    public String markMissParam;

    /**
     * <p>The type of operation for batch processing alert events of the same type.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeSecurityEventOperations~~">DescribeSecurityEventOperations</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>offline_handled</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The configuration of the sub-operation for handling alerting events. The value is in JSON format.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>OperationCode</strong> is set to <strong>kill_and_quara</strong>, <strong>block_ip</strong>, or <strong>virus_quara</strong>. For other values of <strong>OperationCode</strong>, this parameter can be left empty.</p>
     * </blockquote>
     * <blockquote>
     * <p>When <strong>OperationCode</strong> is set to <strong>block_ip</strong>, the following field is included:</p>
     * <ul>
     * <li><strong>expireTime</strong>: the lock expiration time. Unit: milliseconds.</li>
     * </ul>
     * <p>When <strong>OperationCode</strong> is set to <strong>kill_and_quara</strong>, the following field is included:</p>
     * <ul>
     * <li><strong>subOperation</strong>: the method used to scan and remove threats. Valid values:<ul>
     * <li><strong>killAndQuaraFileByMd5andPath</strong>: terminates the process and moves the file to the quarantined file.</li>
     * <li><strong>killByMd5andPath</strong>: terminates the running process.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>When <strong>OperationCode</strong> is set to <strong>virus_quara</strong>, the following field is included:</p>
     * <ul>
     * <li><strong>subOperation</strong>: the method used to scan and remove threats. Valid values:<ul>
     * <li><strong>quaraFileByMd5andPath</strong>: moves the source file of the process to the quarantined file.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;expireTime&quot;:1646208726195}</p>
     */
    @NameInMap("OperationParams")
    public String operationParams;

    /**
     * <p>The remarks for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>remark test.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the task that batch processes all alert events of the same type.</p>
     * <blockquote>
     * <p>Call the <a href="~~CreateSimilarSecurityEventsQueryTask~~">CreateSimilarSecurityEventsQueryTask</a> operation to obtain this parameter.</p>
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
