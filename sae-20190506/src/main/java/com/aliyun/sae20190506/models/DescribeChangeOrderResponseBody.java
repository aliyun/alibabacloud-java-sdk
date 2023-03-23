// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeChangeOrderResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
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
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information of a change order was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: The information was obtained.</p>
     * <p>*   **false**: The information could not be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
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
         */
        @NameInMap("BatchType")
        public Integer batchType;

        /**
         * <p>The number of parallel tasks in a batch.</p>
         */
        @NameInMap("ParallelCount")
        public Integer parallelCount;

        /**
         * <p>The ID of the batch.</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The name of the batch.</p>
         */
        @NameInMap("PipelineName")
        public String pipelineName;

        /**
         * <p>The time when the batch processing starts.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the batch. Valid values:</p>
         * <br>
         * <p>*   **0**: The batch is being prepared.</p>
         * <p>*   **1**: The batch is being processed.</p>
         * <p>*   **2**: The batch was processed.</p>
         * <p>*   **3**: The batch could not be processed.</p>
         * <p>*   **6**: The batch processing was terminated.</p>
         * <p>*   **8**: The execution process is pending. You must manually determine the release batch.</p>
         * <p>*   **9**: The execution process is pending. SAE will automatically determine the release batch.</p>
         * <p>*   **10**: The batch could not be processed due to a system exception.</p>
         * <p>*   **11**: The change order is pending approval.</p>
         * <p>*   **12**: The change order is approved and is pending execution.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time when the batch information is last modified.</p>
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
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The approval ID of the change order.</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <p>Indicates whether SAE automatically determines the release batches. Valid values:</p>
         * <br>
         * <p>*   **true**: SAE automatically determines the release batches.</p>
         * <p>*   **false**: SAE does not automatically determine the release batches.</p>
         */
        @NameInMap("Auto")
        public Boolean auto;

        /**
         * <p>The number of release batches.</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>The mode in which the release batches are determined. Valid values:</p>
         * <br>
         * <p>*   **auto**: SAE automatically determines the release batches.</p>
         * <p>*   **Manual**: You must manually determine the release batches.</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The interval between batches when SAE automatically determines the release batches in a phased release. Unit: minutes.</p>
         */
        @NameInMap("BatchWaitTime")
        public Integer batchWaitTime;

        /**
         * <p>The ID of the change order.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>The description about the change type, which corresponds to the **CoTypeCode** parameter.</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The code of the change type. Valid values:</p>
         * <br>
         * <p>*   **CoBindSlb**: associates the Server Load Balancer (SLB) instance with the application.</p>
         * <p>*   **CoUnbindSlb**: disassociates the SLB instance from the application.</p>
         * <p>*   **CoCreateApp**: creates the application.</p>
         * <p>*   **CoDeleteApp**: deletes the application.</p>
         * <p>*   **CoDeploy**: deploys the application.</p>
         * <p>*   **CoRestartApplication**: restarts the application.</p>
         * <p>*   **CoRollback**: rolls back the application.</p>
         * <p>*   **CoScaleIn**: scales in the application.</p>
         * <p>*   **CoScaleOut**: scales out the application.</p>
         * <p>*   **CoStart**: starts the application.</p>
         * <p>*   **CoStop**: stops the application.</p>
         * <p>*   **CoRescaleApplicationVertically**: modifies the instance specifications.</p>
         * <p>*   **CoDeployHistroy**: rolls back the application to a historical version.</p>
         * <p>*   **CoBindNas**: associates a network-attached storage (NAS) file system with the application.</p>
         * <p>*   **CoUnbindNas**: disassociates the NAS file system from the application.</p>
         * <p>*   **CoBatchStartApplication**: starts multiple applications concurrently.</p>
         * <p>*   **CoBatchStopApplication**: stops multiple applications concurrently.</p>
         * <p>*   **CoRestartInstances**: restarts the instances.</p>
         * <p>*   **CoDeleteInstances**: deletes the instances.</p>
         * <p>*   **CoScaleInAppWithInstances**: reduces the number of specified application instances.</p>
         */
        @NameInMap("CoTypeCode")
        public String coTypeCode;

        /**
         * <p>The time when the change order was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the current batch.</p>
         */
        @NameInMap("CurrentPipelineId")
        public String currentPipelineId;

        /**
         * <p>The description of the change order.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error message.</p>
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
         * <br>
         * <p>*   **0**: The change order is being prepared.</p>
         * <p>*   **1**: The change order is being executed.</p>
         * <p>*   **2**: The change order was executed.</p>
         * <p>*   **3**: The change order could not be executed.</p>
         * <p>*   **6**: The change order was terminated.</p>
         * <p>*   **8**: The execution process is pending. You must manually determine the release batch.</p>
         * <p>*   **9**: The execution process is pending. SAE will automatically determine the release batches.</p>
         * <p>*   **10**: The execution failed due to a system exception.</p>
         * <p>*   **11**: The change order is pending approval.</p>
         * <p>*   **12**: The change order is approved and is pending execution.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The substatus of the change order. This parameter indicates whether an exception occurred while the change order was being executed. Valid values:</p>
         * <br>
         * <p>*   **0**: No exception occurred.</p>
         * <p>*   **1**: An exception occurred. For example, when an error occurred during a phased release, you must manually roll back the application. In this case, the change order cannot be completed, so the Status parameter is still displayed as "1", which indicates that the change order is being executed. You can check the value of this parameter to determine whether an exception occurs.</p>
         */
        @NameInMap("SubStatus")
        public Integer subStatus;

        /**
         * <p>Indicates whether the application can be rolled back. Valid values:</p>
         * <br>
         * <p>*   **true**: The application can be rolled back.</p>
         * <p>*   **false**: The application cannot be rolled back.</p>
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
