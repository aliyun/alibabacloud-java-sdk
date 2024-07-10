// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeChangeOrderResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: indicates that the request was successful.</li>
     * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
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
     * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
     * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information of a change order was obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The information was obtained.</li>
     * <li><strong>false</strong>: The information could not be obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
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
         * <p>The ID of the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>0e4acf82-c9b1-4c1e-ac28-55776338****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The name of the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>Batch 1 Change</p>
         */
        @NameInMap("PipelineName")
        public String pipelineName;

        /**
         * <p>The time when the batch processing starts.</p>
         * 
         * <strong>example:</strong>
         * <p>1562831689704</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the batch. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The batch is being prepared.</li>
         * <li><strong>1</strong>: The batch is being processed.</li>
         * <li><strong>2</strong>: The batch was processed.</li>
         * <li><strong>3</strong>: The batch could not be processed.</li>
         * <li><strong>6</strong>: The batch processing was terminated.</li>
         * <li><strong>8</strong>: The execution process is pending. You must manually determine the release batch.</li>
         * <li><strong>9</strong>: The execution process is pending. SAE will automatically determine the release batch.</li>
         * <li><strong>10</strong>: The batch could not be processed due to a system exception.</li>
         * <li><strong>11</strong>: The change order is pending approval.</li>
         * <li><strong>12</strong>: The change order is approved and is pending execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time when the batch information is last modified.</p>
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
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>bbbbb-3fd370b2-3646-4ba6-91f9-9423e19ab0cd-*****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The approval ID of the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>67de0b39-a9d4-4c09-a170-cf438208****</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <p>Indicates whether SAE automatically determines the release batches. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: SAE automatically determines the release batches.</li>
         * <li><strong>false</strong>: SAE does not automatically determine the release batches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Auto")
        public Boolean auto;

        /**
         * <p>The number of release batches.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>The mode in which the release batches are determined. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong>: SAE automatically determines the release batches.</li>
         * <li><strong>Manual</strong>: You must manually determine the release batches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The interval between batches when SAE automatically determines the release batches in a phased release. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BatchWaitTime")
        public Integer batchWaitTime;

        /**
         * <p>The ID of the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>765fa5c0-9ebb-4bb4-b383-1f885447**</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>The description about the change type, which corresponds to the <strong>CoTypeCode</strong> parameter.</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The code of the change type. Valid values:</p>
         * <ul>
         * <li><strong>CoBindSlb</strong>: associates the Server Load Balancer (SLB) instance with the application.</li>
         * <li><strong>CoUnbindSlb</strong>: disassociates the SLB instance from the application.</li>
         * <li><strong>CoCreateApp</strong>: creates the application.</li>
         * <li><strong>CoDeleteApp</strong>: deletes the application.</li>
         * <li><strong>CoDeploy</strong>: deploys the application.</li>
         * <li><strong>CoRestartApplication</strong>: restarts the application.</li>
         * <li><strong>CoRollback</strong>: rolls back the application.</li>
         * <li><strong>CoScaleIn</strong>: scales in the application.</li>
         * <li><strong>CoScaleOut</strong>: scales out the application.</li>
         * <li><strong>CoStart</strong>: starts the application.</li>
         * <li><strong>CoStop</strong>: stops the application.</li>
         * <li><strong>CoRescaleApplicationVertically</strong>: modifies the instance specifications.</li>
         * <li><strong>CoDeployHistroy</strong>: rolls back the application to a historical version.</li>
         * <li><strong>CoBindNas</strong>: associates a network-attached storage (NAS) file system with the application.</li>
         * <li><strong>CoUnbindNas</strong>: disassociates the NAS file system from the application.</li>
         * <li><strong>CoBatchStartApplication</strong>: starts multiple applications concurrently.</li>
         * <li><strong>CoBatchStopApplication</strong>: stops multiple applications concurrently.</li>
         * <li><strong>CoRestartInstances</strong>: restarts the instances.</li>
         * <li><strong>CoDeleteInstances</strong>: deletes the instances.</li>
         * <li><strong>CoScaleInAppWithInstances</strong>: reduces the number of specified application instances.</li>
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
         * <li><strong>0</strong>: The change order is being prepared.</li>
         * <li><strong>1</strong>: The change order is being executed.</li>
         * <li><strong>2</strong>: The change order was executed.</li>
         * <li><strong>3</strong>: The change order could not be executed.</li>
         * <li><strong>6</strong>: The change order was terminated.</li>
         * <li><strong>8</strong>: The execution process is pending. You must manually determine the release batch.</li>
         * <li><strong>9</strong>: The execution process is pending. SAE will automatically determine the release batches.</li>
         * <li><strong>10</strong>: The execution failed due to a system exception.</li>
         * <li><strong>11</strong>: The change order is pending approval.</li>
         * <li><strong>12</strong>: The change order is approved and is pending execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The substatus of the change order. This parameter indicates whether an exception occurred while the change order was being executed. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No exception occurred.</li>
         * <li><strong>1</strong>: An exception occurred. For example, when an error occurred during a phased release, you must manually roll back the application. In this case, the change order cannot be completed, so the Status parameter is still displayed as &quot;1&quot;, which indicates that the change order is being executed. You can check the value of this parameter to determine whether an exception occurs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SubStatus")
        public Integer subStatus;

        /**
         * <p>Indicates whether the application can be rolled back. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The application can be rolled back.</li>
         * <li><strong>false</strong>: The application cannot be rolled back.</li>
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
