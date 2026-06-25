// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeChangeOrderResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A client-side error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server-side error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the change order.</p>
     */
    @NameInMap("Data")
    public DescribeChangeOrderResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>If the request is successful, this parameter is not returned.</p>
     * </li>
     * <li><p>If the request fails, this parameter is returned. For more information, see the <strong>error codes</strong> section of this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID of the request. This ID is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeOrderResponseBody self = new DescribeChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChangeOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeChangeOrderResponseBody setData(DescribeChangeOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeChangeOrderResponseBodyData getData() {
        return this.data;
    }

    public DescribeChangeOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChangeOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeChangeOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeChangeOrderResponseBodyDataPipelines extends TeaModel {
        /**
         * <p>The batch type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BatchType")
        public Integer batchType;

        /**
         * <p>The number of parallel tasks in a batch.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParallelCount")
        public Integer parallelCount;

        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0e4acf82-c9b1-4c1e-ac28-55776338****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The batch name.</p>
         * 
         * <strong>example:</strong>
         * <p>Batch 1 Change</p>
         */
        @NameInMap("PipelineName")
        public String pipelineName;

        /**
         * <p>The start time of the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>1562831689704</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the batch. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Preparing</p>
         * </li>
         * <li><p><strong>1</strong>: In progress</p>
         * </li>
         * <li><p><strong>2</strong>: Succeeded</p>
         * </li>
         * <li><p><strong>3</strong>: Failed</p>
         * </li>
         * <li><p><strong>6</strong>: Terminated</p>
         * </li>
         * <li><p><strong>8</strong>: Awaiting manual confirmation</p>
         * </li>
         * <li><p><strong>9</strong>: Awaiting automatic confirmation</p>
         * </li>
         * <li><p><strong>10</strong>: Failed due to a system error</p>
         * </li>
         * <li><p><strong>11</strong>: Pending approval</p>
         * </li>
         * <li><p><strong>12</strong>: Approved and pending execution</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time when the batch was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1562847178007</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeChangeOrderResponseBodyDataPipelines build(java.util.Map<String, ?> map) throws Exception {
            DescribeChangeOrderResponseBodyDataPipelines self = new DescribeChangeOrderResponseBodyDataPipelines();
            return TeaModel.build(map, self);
        }

        public DescribeChangeOrderResponseBodyDataPipelines setBatchType(Integer batchType) {
            this.batchType = batchType;
            return this;
        }
        public Integer getBatchType() {
            return this.batchType;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setParallelCount(Integer parallelCount) {
            this.parallelCount = parallelCount;
            return this;
        }
        public Integer getParallelCount() {
            return this.parallelCount;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeChangeOrderResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bbbbb-3fd370b2-3646-4ba6-91f9-9423e19ab0cd-*****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>app-test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>Indicates whether gray tag routing is enabled.</p>
         */
        @NameInMap("ApplicationEnableGreyTagRoute")
        public Boolean applicationEnableGreyTagRoute;

        /**
         * <p>The update strategy for the application.</p>
         */
        @NameInMap("ApplicationUpdateStrategy")
        public String applicationUpdateStrategy;

        /**
         * <p>The approval ID for the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>67de0b39-a9d4-4c09-a170-cf438208****</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <p>Indicates whether to automatically release the change in batches. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The change is automatically released.</p>
         * </li>
         * <li><p><strong>false</strong>: The change is not automatically released.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Auto")
        public Boolean auto;

        /**
         * <p>The number of batches.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>The release mode for batches. Valid values:</p>
         * <ul>
         * <li><p><strong>auto</strong>: Automatic release.</p>
         * </li>
         * <li><p><strong>manual</strong>: Manual release.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The wait time, in minutes, between batches in an automatic release.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BatchWaitTime")
        public Integer batchWaitTime;

        /**
         * <p>The change order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>765fa5c0-9ebb-4bb4-b383-1f885447**</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>The change type. This parameter is a description of <code>CoTypeCode</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Batch Restart Instances</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The change type code. Valid values:</p>
         * <ul>
         * <li><p><strong>CoBindSlb</strong>: Binds an SLB instance.</p>
         * </li>
         * <li><p><strong>CoUnbindSlb</strong>: Unbinds an SLB instance.</p>
         * </li>
         * <li><p><strong>CoCreateApp</strong>: Creates an application.</p>
         * </li>
         * <li><p><strong>CoDeleteApp</strong>: Deletes an application.</p>
         * </li>
         * <li><p><strong>CoDeploy</strong>: Deploys an application.</p>
         * </li>
         * <li><p><strong>CoRestartApplication</strong>: Restarts an application.</p>
         * </li>
         * <li><p><strong>CoRollback</strong>: Rolls back an application.</p>
         * </li>
         * <li><p><strong>CoScaleIn</strong>: Scales in an application.</p>
         * </li>
         * <li><p><strong>CoScaleOut</strong>: Scales out an application.</p>
         * </li>
         * <li><p><strong>CoStart</strong>: Starts an application.</p>
         * </li>
         * <li><p><strong>CoStop</strong>: Stops an application.</p>
         * </li>
         * <li><p><strong>CoRescaleApplicationVertically</strong>: Modifies instance specifications.</p>
         * </li>
         * <li><p><strong>CoDeployHistroy</strong>: Rolls back to a historical version.</p>
         * </li>
         * <li><p><strong>CoBindNas</strong>: Binds a NAS file system.</p>
         * </li>
         * <li><p><strong>CoUnbindNas</strong>: Unbinds a NAS file system.</p>
         * </li>
         * <li><p><strong>CoBatchStartApplication</strong>: Starts applications in batches.</p>
         * </li>
         * <li><p><strong>CoBatchStopApplication</strong>: Stops applications in batches.</p>
         * </li>
         * <li><p><strong>CoRestartInstances</strong>: Restarts instances.</p>
         * </li>
         * <li><p><strong>CoDeleteInstances</strong>: Deletes instances.</p>
         * </li>
         * <li><p><strong>CoScaleInAppWithInstances</strong>: Scales in an application by specifying instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CoRestartInstances</p>
         */
        @NameInMap("CoTypeCode")
        public String coTypeCode;

        /**
         * <p>The time when the change order was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-17 21:06:45</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the current batch.</p>
         * 
         * <strong>example:</strong>
         * <p>0e4acf82-c9b1-4c1e-ac28-55776338****</p>
         */
        @NameInMap("CurrentPipelineId")
        public String currentPipelineId;

        /**
         * <p>The description of the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The batch information.</p>
         */
        @NameInMap("Pipelines")
        public java.util.List<DescribeChangeOrderResponseBodyDataPipelines> pipelines;

        /**
         * <p>The status of the change order. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Preparing</p>
         * </li>
         * <li><p><strong>1</strong>: In progress</p>
         * </li>
         * <li><p><strong>2</strong>: Succeeded</p>
         * </li>
         * <li><p><strong>3</strong>: Failed</p>
         * </li>
         * <li><p><strong>6</strong>: Terminated</p>
         * </li>
         * <li><p><strong>8</strong>: Awaiting manual confirmation</p>
         * </li>
         * <li><p><strong>9</strong>: Awaiting automatic confirmation</p>
         * </li>
         * <li><p><strong>10</strong>: Failed due to a system error</p>
         * </li>
         * <li><p><strong>11</strong>: Pending approval</p>
         * </li>
         * <li><p><strong>12</strong>: Approved and pending execution</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The substatus of the release order. This parameter indicates whether an exception occurred during the release. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Normal.</p>
         * </li>
         * <li><p><strong>1</strong>: Abnormal. For example, if a batch release fails, you must manually perform a rollback, leaving the release order in the In Progress state.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SubStatus")
        public Integer subStatus;

        /**
         * <p>Indicates whether rollback is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Rollback is supported.</p>
         * </li>
         * <li><p><strong>false</strong>: Rollback is not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportRollback")
        public Boolean supportRollback;

        public static DescribeChangeOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChangeOrderResponseBodyData self = new DescribeChangeOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeChangeOrderResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeChangeOrderResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeChangeOrderResponseBodyData setApplicationEnableGreyTagRoute(Boolean applicationEnableGreyTagRoute) {
            this.applicationEnableGreyTagRoute = applicationEnableGreyTagRoute;
            return this;
        }
        public Boolean getApplicationEnableGreyTagRoute() {
            return this.applicationEnableGreyTagRoute;
        }

        public DescribeChangeOrderResponseBodyData setApplicationUpdateStrategy(String applicationUpdateStrategy) {
            this.applicationUpdateStrategy = applicationUpdateStrategy;
            return this;
        }
        public String getApplicationUpdateStrategy() {
            return this.applicationUpdateStrategy;
        }

        public DescribeChangeOrderResponseBodyData setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public DescribeChangeOrderResponseBodyData setAuto(Boolean auto) {
            this.auto = auto;
            return this;
        }
        public Boolean getAuto() {
            return this.auto;
        }

        public DescribeChangeOrderResponseBodyData setBatchCount(Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Integer getBatchCount() {
            return this.batchCount;
        }

        public DescribeChangeOrderResponseBodyData setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public DescribeChangeOrderResponseBodyData setBatchWaitTime(Integer batchWaitTime) {
            this.batchWaitTime = batchWaitTime;
            return this;
        }
        public Integer getBatchWaitTime() {
            return this.batchWaitTime;
        }

        public DescribeChangeOrderResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public DescribeChangeOrderResponseBodyData setCoType(String coType) {
            this.coType = coType;
            return this;
        }
        public String getCoType() {
            return this.coType;
        }

        public DescribeChangeOrderResponseBodyData setCoTypeCode(String coTypeCode) {
            this.coTypeCode = coTypeCode;
            return this;
        }
        public String getCoTypeCode() {
            return this.coTypeCode;
        }

        public DescribeChangeOrderResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeChangeOrderResponseBodyData setCurrentPipelineId(String currentPipelineId) {
            this.currentPipelineId = currentPipelineId;
            return this;
        }
        public String getCurrentPipelineId() {
            return this.currentPipelineId;
        }

        public DescribeChangeOrderResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeChangeOrderResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeChangeOrderResponseBodyData setPipelines(java.util.List<DescribeChangeOrderResponseBodyDataPipelines> pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public java.util.List<DescribeChangeOrderResponseBodyDataPipelines> getPipelines() {
            return this.pipelines;
        }

        public DescribeChangeOrderResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeChangeOrderResponseBodyData setSubStatus(Integer subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public Integer getSubStatus() {
            return this.subStatus;
        }

        public DescribeChangeOrderResponseBodyData setSupportRollback(Boolean supportRollback) {
            this.supportRollback = supportRollback;
            return this;
        }
        public Boolean getSupportRollback() {
            return this.supportRollback;
        }

    }

}
