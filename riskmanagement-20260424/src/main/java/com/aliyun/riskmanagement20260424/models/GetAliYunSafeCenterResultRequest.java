// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAliYunSafeCenterResultRequest extends TeaModel {
    @NameInMap("CreateSimilarSecurityEventsQueryTaskRequest")
    public GetAliYunSafeCenterResultRequestCreateSimilarSecurityEventsQueryTaskRequest createSimilarSecurityEventsQueryTaskRequest;

    @NameInMap("DescribeInstancesFullStatusRequest")
    public GetAliYunSafeCenterResultRequestDescribeInstancesFullStatusRequest describeInstancesFullStatusRequest;

    @NameInMap("DescribeSecurityEventOperationStatusRequest")
    public GetAliYunSafeCenterResultRequestDescribeSecurityEventOperationStatusRequest describeSecurityEventOperationStatusRequest;

    @NameInMap("DescribeSimilarSecurityEventsRequest")
    public GetAliYunSafeCenterResultRequestDescribeSimilarSecurityEventsRequest describeSimilarSecurityEventsRequest;

    @NameInMap("GetAssetDetailByUuidRequest")
    public GetAliYunSafeCenterResultRequestGetAssetDetailByUuidRequest getAssetDetailByUuidRequest;

    @NameInMap("HandleSecurityEventsRequest")
    public GetAliYunSafeCenterResultRequestHandleSecurityEventsRequest handleSecurityEventsRequest;

    @NameInMap("HandleSimilarSecurityEventsRequest")
    public GetAliYunSafeCenterResultRequestHandleSimilarSecurityEventsRequest handleSimilarSecurityEventsRequest;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InterfaceCode")
    public String interfaceCode;

    @NameInMap("ListInstancesRequest")
    public GetAliYunSafeCenterResultRequestListInstancesRequest listInstancesRequest;

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
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityEventId")
        public Long securityEventId;

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
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

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
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityEventIds")
        public java.util.List<String> securityEventIds;

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
        @NameInMap("RegionId")
        public String regionId;

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
        @NameInMap("RegionId")
        public String regionId;

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
        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("FileMd5")
        public String fileMd5;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("MarkBatch")
        public String markBatch;

        @NameInMap("MarkMissParam")
        public String markMissParam;

        @NameInMap("OperationCode")
        public String operationCode;

        @NameInMap("OperationParams")
        public String operationParams;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Remark")
        public String remark;

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
        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OperationCode")
        public String operationCode;

        @NameInMap("OperationParams")
        public String operationParams;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SourceIp")
        public String sourceIp;

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
        @NameInMap("InstanceIds")
        public String instanceIds;

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
