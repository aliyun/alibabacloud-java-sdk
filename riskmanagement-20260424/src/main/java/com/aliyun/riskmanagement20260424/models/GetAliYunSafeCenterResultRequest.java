// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAliYunSafeCenterResultRequest extends TeaModel {
    /**
     * <p>Creates a node to query security alerting events triggered by the same rule or alerting type.</p>
     */
    @NameInMap("CreateSimilarSecurityEventsQueryTaskRequest")
    public GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest createSimilarSecurityEventsQueryTaskRequest;

    /**
     * <p>Queries the running status of ECS instances.</p>
     */
    @NameInMap("DescribeInstancesFullStatusRequest")
    public GetAliYunSafeCenterResultRequestDescribeInstancesFullStatusRequest describeInstancesFullStatusRequest;

    /**
     * <p>Queries whether the list of security alerting events that match the same IP rule or same alerting type as the alerting event to be handled is empty.</p>
     */
    @NameInMap("DescribeSecurityEventOperationStatusRequest")
    public GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest describeSecurityEventOperationStatusRequest;

    /**
     * <p>Queries identical security alert events in Security Center.</p>
     */
    @NameInMap("DescribeSimilarSecurityEventsRequest")
    public GetAliYunSafeCenterResultRequestDescribeSimilarSecurityEventsRequest describeSimilarSecurityEventsRequest;

    /**
     * <p>The request parameters for querying the Security Center Agent status.</p>
     */
    @NameInMap("GetAssetDetailByUuidRequest")
    public GetAliYunSafeCenterResultRequestGetAssetDetailByUuidRequest getAssetDetailByUuidRequest;

    /**
     * <p>Handles security alert events.</p>
     */
    @NameInMap("HandleSecurityEventsRequest")
    public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest handleSecurityEventsRequest;

    /**
     * <p>Handles security alert events in batches based on the same IP rule or type.</p>
     */
    @NameInMap("HandleSimilarSecurityEventsRequest")
    public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest handleSimilarSecurityEventsRequest;

    /**
     * <p>The code of the public API operation.</p>
     * <ul>
     * <li><p><strong>GetAssetDetailByUuid</strong>: Retrieves the Agent status. Request parameter: GetAssetDetailByUuidRequest.</p>
     * </li>
     * <li><p><strong>DescribeSimilarSecurityEvents</strong>: Retrieves the list of instance IDs for identical security alerting events. Request parameter: DescribeSimilarSecurityEventsRequest.</p>
     * </li>
     * <li><p><strong>CreateSimilarSecurityEventsQueryTask</strong>: Creates a node to query security alerting events triggered by the same rule or alerting type. Request parameter: CreateSimilarSecurityEventsQueryTaskRequest.</p>
     * </li>
     * <li><p><strong>DescribeSecurityEventOperationStatus</strong>: Queries whether the list of security alerting events that match the same IP rule or same alerting type as the alerting event to be handled is empty. Request parameter: DescribeSecurityEventOperationStatusRequest.</p>
     * </li>
     * <li><p><strong>HandleSimilarSecurityEvents</strong>: Handles security alerting events in batches based on the same IP rule or type. Request parameter: HandleSimilarSecurityEventsRequest.
     * HandleSecurityEvents: Handles security alerting events. Request parameter: HandleSecurityEventsRequest.</p>
     * </li>
     * <li><p><strong>DescribeInstancesFullStatus</strong>: Queries the running status of ECS instances. Request parameter: DescribeInstancesFullStatusRequest.</p>
     * </li>
     * <li><p><strong>ListInstances</strong>: Queries the running status of simple application servers. Request parameter: ListInstancesRequest.</p>
     * </li>
     * <li><p><strong>StartConfigRuleEvaluation</strong>: Re-evaluates security check rules.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Each API operation name corresponds to its own request parameters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ListInstanceStatus</p>
     */
    @NameInMap("InterfaceCode")
    public String interfaceCode;

    /**
     * <p>Queries the running status of simple application servers.</p>
     */
    @NameInMap("ListInstancesRequest")
    public GetAliYunSafeCenterResultRequestListInstancesRequest listInstancesRequest;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetAliYunSafeCenterResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAliYunSafeCenterResultRequest self = new GetAliYunSafeCenterResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAliYunSafeCenterResultRequest setCreateSimilarSecurityEventsQueryTaskRequest(GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest createSimilarSecurityEventsQueryTaskRequest) {
        this.createSimilarSecurityEventsQueryTaskRequest = createSimilarSecurityEventsQueryTaskRequest;
        return this;
    }
    public GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest getCreateSimilarSecurityEventsQueryTaskRequest() {
        return this.createSimilarSecurityEventsQueryTaskRequest;
    }

    public GetAliYunSafeCenterResultRequest setDescribeInstancesFullStatusRequest(GetAliYunSafeCenterResultRequestDescribeInstancesFullStatusRequest describeInstancesFullStatusRequest) {
        this.describeInstancesFullStatusRequest = describeInstancesFullStatusRequest;
        return this;
    }
    public GetAliYunSafeCenterResultRequestDescribeInstancesFullStatusRequest getDescribeInstancesFullStatusRequest() {
        return this.describeInstancesFullStatusRequest;
    }

    public GetAliYunSafeCenterResultRequest setDescribeSecurityEventOperationStatusRequest(GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest describeSecurityEventOperationStatusRequest) {
        this.describeSecurityEventOperationStatusRequest = describeSecurityEventOperationStatusRequest;
        return this;
    }
    public GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest getDescribeSecurityEventOperationStatusRequest() {
        return this.describeSecurityEventOperationStatusRequest;
    }

    public GetAliYunSafeCenterResultRequest setDescribeSimilarSecurityEventsRequest(GetAliYunSafeCenterResultRequestDescribeSimilarSecurityEventsRequest describeSimilarSecurityEventsRequest) {
        this.describeSimilarSecurityEventsRequest = describeSimilarSecurityEventsRequest;
        return this;
    }
    public GetAliYunSafeCenterResultRequestDescribeSimilarSecurityEventsRequest getDescribeSimilarSecurityEventsRequest() {
        return this.describeSimilarSecurityEventsRequest;
    }

    public GetAliYunSafeCenterResultRequest setGetAssetDetailByUuidRequest(GetAliYunSafeCenterResultRequestGetAssetDetailByUuidRequest getAssetDetailByUuidRequest) {
        this.getAssetDetailByUuidRequest = getAssetDetailByUuidRequest;
        return this;
    }
    public GetAliYunSafeCenterResultRequestGetAssetDetailByUuidRequest getGetAssetDetailByUuidRequest() {
        return this.getAssetDetailByUuidRequest;
    }

    public GetAliYunSafeCenterResultRequest setHandleSecurityEventsRequest(GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest handleSecurityEventsRequest) {
        this.handleSecurityEventsRequest = handleSecurityEventsRequest;
        return this;
    }
    public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest getHandleSecurityEventsRequest() {
        return this.handleSecurityEventsRequest;
    }

    public GetAliYunSafeCenterResultRequest setHandleSimilarSecurityEventsRequest(GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest handleSimilarSecurityEventsRequest) {
        this.handleSimilarSecurityEventsRequest = handleSimilarSecurityEventsRequest;
        return this;
    }
    public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest getHandleSimilarSecurityEventsRequest() {
        return this.handleSimilarSecurityEventsRequest;
    }

    public GetAliYunSafeCenterResultRequest setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }
    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    public GetAliYunSafeCenterResultRequest setListInstancesRequest(GetAliYunSafeCenterResultRequestListInstancesRequest listInstancesRequest) {
        this.listInstancesRequest = listInstancesRequest;
        return this;
    }
    public GetAliYunSafeCenterResultRequestListInstancesRequest getListInstancesRequest() {
        return this.listInstancesRequest;
    }

    public GetAliYunSafeCenterResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>629755508</p>
         */
        @NameInMap("SecurityEventId")
        public Long securityEventId;

        /**
         * <p>The code of the alerting event that has the same type or rule hits.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SimilarEventScenarioCode")
        public String similarEventScenarioCode;

        public static GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
            GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest self = new GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest();
            return TeaModel.build(map, self);
        }

        public GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest setSecurityEventId(Long securityEventId) {
            this.securityEventId = securityEventId;
            return this;
        }
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        public GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest setSimilarEventScenarioCode(String similarEventScenarioCode) {
            this.similarEventScenarioCode = similarEventScenarioCode;
            return this;
        }
        public String getSimilarEventScenarioCode() {
            return this.similarEventScenarioCode;
        }

    }

    public static class GetAliYunSafeCenterResultRequestDescribeInstancesFullStatusRequest extends TeaModel {
        /**
         * <p>The list of instance IDs.</p>
         */
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetAliYunSafeCenterResultRequestDescribeInstancesFullStatusRequest build(java.util.Map<String, ?> map) throws Exception {
            GetAliYunSafeCenterResultRequestDescribeInstancesFullStatusRequest self = new GetAliYunSafeCenterResultRequestDescribeInstancesFullStatusRequest();
            return TeaModel.build(map, self);
        }

        public GetAliYunSafeCenterResultRequestDescribeInstancesFullStatusRequest setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public GetAliYunSafeCenterResultRequestDescribeInstancesFullStatusRequest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest extends TeaModel {
        /**
         * <p>The region ID. Example: ap-southeast-1.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of security alert event IDs.</p>
         * <blockquote>
         * <p>You must specify either TaskId or SecurityEventIds.N. At least one of these parameters is required for a successful call.</p>
         * </blockquote>
         */
        @NameInMap("SecurityEventIds")
        public java.util.List<String> securityEventIds;

        /**
         * <p>The ID of the task for handling security alert events.</p>
         * <blockquote>
         * <p>You must specify either TaskId or SecurityEventIds. At least one of these parameters is required for a successful call.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0BC3B4E600002A9F000048BCDCE7E710</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
            GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest self = new GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest();
            return TeaModel.build(map, self);
        }

        public GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest setSecurityEventIds(java.util.List<String> securityEventIds) {
            this.securityEventIds = securityEventIds;
            return this;
        }
        public java.util.List<String> getSecurityEventIds() {
            return this.securityEventIds;
        }

        public GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

    public static class GetAliYunSafeCenterResultRequestDescribeSimilarSecurityEventsRequest extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the query task. You can call the CreateSimilarSecurityEventsQueryTask operation to obtain this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1689135</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static GetAliYunSafeCenterResultRequestDescribeSimilarSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
            GetAliYunSafeCenterResultRequestDescribeSimilarSecurityEventsRequest self = new GetAliYunSafeCenterResultRequestDescribeSimilarSecurityEventsRequest();
            return TeaModel.build(map, self);
        }

        public GetAliYunSafeCenterResultRequestDescribeSimilarSecurityEventsRequest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAliYunSafeCenterResultRequestDescribeSimilarSecurityEventsRequest setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

    public static class GetAliYunSafeCenterResultRequestGetAssetDetailByUuidRequest extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The UUID of the asset to query.</p>
         * 
         * <strong>example:</strong>
         * <p>9A75F21D3993C0A2B094A4AB132890B2</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static GetAliYunSafeCenterResultRequestGetAssetDetailByUuidRequest build(java.util.Map<String, ?> map) throws Exception {
            GetAliYunSafeCenterResultRequestGetAssetDetailByUuidRequest self = new GetAliYunSafeCenterResultRequestGetAssetDetailByUuidRequest();
            return TeaModel.build(map, self);
        }

        public GetAliYunSafeCenterResultRequestGetAssetDetailByUuidRequest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAliYunSafeCenterResultRequestGetAssetDetailByUuidRequest setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest extends TeaModel {
        /**
         * <p>The alert rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The MD5 hash of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>fbbb90731fbb6df57c933173182d01a5</p>
         */
        @NameInMap("FileMd5")
        public String fileMd5;

        /**
         * <p>The path of the sensitive file.</p>
         * 
         * <strong>example:</strong>
         * <p>flyfish-lfp-wy.release</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-shared-vpc-002</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The user IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>123.56.127.180</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>Specifies whether to add to the whitelist in batches.</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MarkBatch")
        public String markBatch;

        /**
         * <p>The whitelist rule configuration. The value is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>field</strong>: The whitelist field.</li>
         * <li><strong>operate</strong>: The whitelist method. Valid values:<ul>
         * <li><strong>notContains</strong>: Does not contain.</li>
         * <li><strong>contains</strong>: Contains.</li>
         * <li><strong>regex</strong>: Regular expression match.</li>
         * <li><strong>strEqual</strong>: Equals.</li>
         * <li><strong>strNotEqual</strong>: Does not equal.</li>
         * </ul>
         * </li>
         * <li><strong>fieldValue</strong>: The match value.</li>
         * <li><strong>uuid</strong>: The scope of the whitelist rule. Valid values:<ul>
         * <li><strong>part</strong>: Only the current asset.</li>
         * <li><strong>ALL</strong>: All assets.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Call the DescribeSecurityEventOperations operation to obtain the field whitelist field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;uuid&quot;:&quot;part&quot;,&quot;field&quot;:&quot;gmtModified&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;asd&quot;},{&quot;uuid&quot;:&quot;part&quot;,&quot;field&quot;:&quot;loginUser&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;vff&quot;}]</p>
         */
        @NameInMap("MarkMissParam")
        public String markMissParam;

        /**
         * <p>The method for handling the security alert event. Valid values:</p>
         * <ul>
         * <li><strong>block_ip</strong>: Block.</li>
         * <li><strong>advance_mark_mis_info</strong>: Add to whitelist.</li>
         * <li><strong>ignore</strong>: Ignore.</li>
         * <li><strong>manual_handled</strong>: Manually handled.</li>
         * <li><strong>kill_process</strong>: Terminate process.</li>
         * <li><strong>cleanup</strong>: Deep scan and cleanup.</li>
         * <li><strong>kill_and_quara</strong>: Virus scan and quarantine.</li>
         * <li><strong>disable_malicious_defense</strong>: Disable malicious behavior defense.</li>
         * <li><strong>client_problem_check</strong>: Troubleshoot.</li>
         * <li><strong>quara</strong>: Quarantine.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block_ip</p>
         */
        @NameInMap("OperationCode")
        public String operationCode;

        /**
         * <p>The configuration of the sub-operation for handling security alert events.</p>
         * <p>When OperationCode is set to kill_and_quara, specify the parameter type &quot;subOperation&quot;:${code}.
         * Valid code values:</p>
         * <ul>
         * <li>Quarantined file: quaraFileByMd5andPath</li>
         * <li>Kill process and quarantined file by process ID and path: killAndQuaraFileByPidAndMd5andPath</li>
         * <li>Kill process only: killByMd5andPath</li>
         * <li>Kill process and quarantined file: killAndQuaraFileByMd5andPath</li>
         * <li>Kill container process by process ID and path: killProcessByPidandPathandCmdline</li>
         * <li>Kill container process by file MD5 and path: killContainerProcessByMd5AndPath</li>
         * </ul>
         * <p>When OperationCode is set to block_ip, the parameter is:</p>
         * <ul>
         * <li>Expiration time: expireTime:${timestamp}<blockquote>
         * <p>This parameter is required only when OperationCode is set to <code>kill_and_quara</code> or <code>block_ip</code>. For other values of OperationCode, this parameter can be left empty. ${timestamp} indicates the timestamp of the deadline for blocking this IP address.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;expireTime\&quot;:1719588943551,\&quot;subOperation\&quot;:\&quot;killAndQuaraFileByMd5andPath\&quot;}</p>
         */
        @NameInMap("OperationParams")
        public String operationParams;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The collection of IDs of the security alert events to handle.</p>
         * <p>Example:</p>
         */
        @NameInMap("SecurityEventIds")
        public java.util.List<String> securityEventIds;

        public static GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
            GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest self = new GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest();
            return TeaModel.build(map, self);
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }
        public String getFileMd5() {
            return this.fileMd5;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setMarkBatch(String markBatch) {
            this.markBatch = markBatch;
            return this;
        }
        public String getMarkBatch() {
            return this.markBatch;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setMarkMissParam(String markMissParam) {
            this.markMissParam = markMissParam;
            return this;
        }
        public String getMarkMissParam() {
            return this.markMissParam;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setOperationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }
        public String getOperationCode() {
            return this.operationCode;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setOperationParams(String operationParams) {
            this.operationParams = operationParams;
            return this;
        }
        public String getOperationParams() {
            return this.operationParams;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest setSecurityEventIds(java.util.List<String> securityEventIds) {
            this.securityEventIds = securityEventIds;
            return this;
        }
        public java.util.List<String> getSecurityEventIds() {
            return this.securityEventIds;
        }

    }

    public static class GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest extends TeaModel {
        /**
         * <p>The alerting type.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw_elasticity_public_cn-g4t3nkh3i00b</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.10*.44.71</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The operation type for batch handling similar security alert events.</p>
         * <blockquote>
         * <p>You can call the DescribeSecurityEventOperations operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>offline_handled</p>
         */
        @NameInMap("OperationCode")
        public String operationCode;

        /**
         * <p>The configuration of the sub-operation for handling alerting events. The value is in JSON format.</p>
         * <blockquote>
         * <p>This parameter is required only when <strong>OperationCode</strong> is set to <strong>kill_and_quara</strong>, <strong>block_ip</strong>, or <strong>virus_quara</strong>. For other values of <strong>OperationCode</strong>, this parameter can be left empty.</p>
         * </blockquote>
         * <blockquote>
         * <p>When <strong>OperationCode</strong> is set to <strong>block_ip</strong>, the following field is included:</p>
         * <ul>
         * <li><strong>expireTime</strong>: The lock expiration time. Unit: milliseconds.</li>
         * </ul>
         * <p>When <strong>OperationCode</strong> is set to <strong>kill_and_quara</strong>, the following field is included:</p>
         * <ul>
         * <li><strong>subOperation</strong>: The method for killing and quarantining. Valid values:<ul>
         * <li><strong>killAndQuaraFileByMd5andPath</strong>: Terminates the process and quarantines the file.</li>
         * <li><strong>killByMd5andPath</strong>: Terminates the running process.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>When <strong>OperationCode</strong> is set to <strong>virus_quara</strong>, the following field is included:</p>
         * <ul>
         * <li><strong>subOperation</strong>: The method for killing and quarantining. Valid values:<ul>
         * <li><strong>quaraFileByMd5andPath</strong>: Quarantines the source file of the process.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;expireTime\&quot;:1767687685917}</p>
         */
        @NameInMap("OperationParams")
        public String operationParams;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>220.2*3.155.93</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        /**
         * <p>The ID of the task for batch handling all security alert events of the same type.</p>
         * <blockquote>
         * <p>You can call the CreateSimilarSecurityEventsQueryTask operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12221</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
            GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest self = new GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest();
            return TeaModel.build(map, self);
        }

        public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest setOperationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }
        public String getOperationCode() {
            return this.operationCode;
        }

        public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest setOperationParams(String operationParams) {
            this.operationParams = operationParams;
            return this;
        }
        public String getOperationParams() {
            return this.operationParams;
        }

        public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

    public static class GetAliYunSafeCenterResultRequestListInstancesRequest extends TeaModel {
        /**
         * <p>The instance IDs of simple application servers. The value is a JSON array that can contain up to 100 IDs. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;2ad1ae67295445f598017499dc****&quot;, &quot;2ad1ae67295445f598017123dc****&quot;]</p>
         */
        @NameInMap("InstanceIds")
        public String instanceIds;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetAliYunSafeCenterResultRequestListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
            GetAliYunSafeCenterResultRequestListInstancesRequest self = new GetAliYunSafeCenterResultRequestListInstancesRequest();
            return TeaModel.build(map, self);
        }

        public GetAliYunSafeCenterResultRequestListInstancesRequest setInstanceIds(String instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public String getInstanceIds() {
            return this.instanceIds;
        }

        public GetAliYunSafeCenterResultRequestListInstancesRequest setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
