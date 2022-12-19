// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSimilarSecurityEventsQueryTaskResponseBody extends TeaModel {
    // The information about the task that queries alert events of the same alert type.
    @NameInMap("CreateSimilarSecurityEventsQueryTaskResponse")
    public CreateSimilarSecurityEventsQueryTaskResponseBodyCreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskResponse;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSimilarSecurityEventsQueryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarSecurityEventsQueryTaskResponseBody self = new CreateSimilarSecurityEventsQueryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSimilarSecurityEventsQueryTaskResponseBody setCreateSimilarSecurityEventsQueryTaskResponse(CreateSimilarSecurityEventsQueryTaskResponseBodyCreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskResponse) {
        this.createSimilarSecurityEventsQueryTaskResponse = createSimilarSecurityEventsQueryTaskResponse;
        return this;
    }
    public CreateSimilarSecurityEventsQueryTaskResponseBodyCreateSimilarSecurityEventsQueryTaskResponse getCreateSimilarSecurityEventsQueryTaskResponse() {
        return this.createSimilarSecurityEventsQueryTaskResponse;
    }

    public CreateSimilarSecurityEventsQueryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSimilarSecurityEventsQueryTaskResponseBodyCreateSimilarSecurityEventsQueryTaskResponse extends TeaModel {
        // The status of the task. Valid values:
        // 
        // *   **New**: The task is created.
        // *   **RetrievingData**: Data is being retrieved.
        // *   **DataRetrieved**: Data is retrieved.
        // *   **Processing**: The task is running.
        // *   **Success**: The task is successful.
        // *   **Failed**: The task failed.
        // *   **PartialFailed**: The task partially failed.
        @NameInMap("Status")
        public String status;

        // The ID of the task.
        @NameInMap("TaskId")
        public Long taskId;

        public static CreateSimilarSecurityEventsQueryTaskResponseBodyCreateSimilarSecurityEventsQueryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateSimilarSecurityEventsQueryTaskResponseBodyCreateSimilarSecurityEventsQueryTaskResponse self = new CreateSimilarSecurityEventsQueryTaskResponseBodyCreateSimilarSecurityEventsQueryTaskResponse();
            return TeaModel.build(map, self);
        }

        public CreateSimilarSecurityEventsQueryTaskResponseBodyCreateSimilarSecurityEventsQueryTaskResponse setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateSimilarSecurityEventsQueryTaskResponseBodyCreateSimilarSecurityEventsQueryTaskResponse setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
