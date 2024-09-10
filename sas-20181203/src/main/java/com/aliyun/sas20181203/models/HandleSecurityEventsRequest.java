// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsRequest extends TeaModel {
    /**
     * <p>Specifies whether to add multiple alert events to the whitelist at a time. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MarkBatch")
    public String markBatch;

    /**
     * <p>The whitelist rule. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>field</strong>: The field based on which alert events are added to the whitelist.</p>
     * </li>
     * <li><p><strong>operate</strong>: The method that is used to added alert events to the whitelist. Valid values:</p>
     * <ul>
     * <li><strong>notContains</strong>: does not contain</li>
     * <li><strong>contains</strong>: contains</li>
     * <li><strong>regex</strong>: matches by regular expression</li>
     * <li><strong>strEqual</strong>: equals</li>
     * <li><strong>strNotEqual</strong>: does not equal</li>
     * </ul>
     * </li>
     * <li><p><strong>fieldValue</strong>: The value of the field based on which alert events are added to the whitelist.</p>
     * </li>
     * <li><p><strong>uuid</strong>: The application scope of the whitelist rule. Valid values:</p>
     * <ul>
     * <li><strong>part</strong>: the current asset</li>
     * <li><strong>ALL</strong>: all assets</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeSecurityEventOperations~~">DescribeSecurityEventOperations</a> operation to obtain the fields that you can specify for <strong>field</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;uuid&quot;:&quot;part&quot;,&quot;field&quot;:&quot;gmtModified&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;asd&quot;},{&quot;uuid&quot;:&quot;part&quot;,&quot;field&quot;:&quot;loginUser&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;vff&quot;}]</p>
     */
    @NameInMap("MarkMissParam")
    public String markMissParam;

    /**
     * <p>The operation that you want to perform to handle the alert events. Valid values:</p>
     * <ul>
     * <li><strong>block_ip</strong>: blocks the source IP address.</li>
     * <li><strong>advance_mark_mis_info</strong>: adds the alert events to the whitelist.</li>
     * <li><strong>ignore</strong>: ignores the alert events.</li>
     * <li><strong>manual_handled</strong>: marks the alert events as manually handled.</li>
     * <li><strong>kill_process</strong>: terminates the malicious process.</li>
     * <li><strong>cleanup</strong>: performs in-depth virus detection and removal.</li>
     * <li><strong>kill_and_quara</strong>: kills the malicious processes and quarantines the source file.</li>
     * <li><strong>disable_malicious_defense</strong>: stops the container on which the alerting files or processes exist.</li>
     * <li><strong>client_problem_check</strong>: performs troubleshooting.</li>
     * <li><strong>quara</strong>: quarantines the source file of the malicious process.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>block_ip</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The configuration of the operation that you want to perform to handle the alert events.</p>
     * <blockquote>
     * <p> If you set OperationCode to <code>kill_and_quara</code> or <code>block_ip</code>, you must specify OperationParams. If you set OperationCode to other values, you can leave OperationParams empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OperationParams")
    public String operationParams;

    /**
     * <p>The remarks of the handling operation.</p>
     * 
     * <strong>example:</strong>
     * <p>remark test.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16670360956*****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The IDs of the alert events.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;909361&quot;]</p>
     */
    @NameInMap("SecurityEventIds")
    public java.util.List<String> securityEventIds;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
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
