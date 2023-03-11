// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSimilarSecurityEventsQueryTaskResponseBody extends TeaModel {
    /**
     * <p>The information about the task that queries alert events of the same alert type.</p>
     */
    @NameInMap("CreateSimilarSecurityEventsQueryTaskResponse")
    public CreateSimilarSecurityEventsQueryTaskResponseBodyCreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskResponse;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **New**: The task is created.</p>
         * <p>*   **RetrievingData**: Data is being retrieved.</p>
         * <p>*   **DataRetrieved**: Data is retrieved.</p>
         * <p>*   **Processing**: The task is running.</p>
         * <p>*   **Success**: The task is successful.</p>
         * <p>*   **Failed**: The task failed.</p>
         * <p>*   **PartialFailed**: The task partially failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         */
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
