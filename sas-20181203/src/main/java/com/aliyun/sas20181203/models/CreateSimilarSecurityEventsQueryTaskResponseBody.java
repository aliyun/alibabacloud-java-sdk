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
     * 
     * <strong>example:</strong>
     * <p>5861EE3E-F0B3-48B8-A5DC-A5080BFBE052</p>
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
         * <ul>
         * <li><strong>New</strong>: The task is created.</li>
         * <li><strong>RetrievingData</strong>: Data is being retrieved.</li>
         * <li><strong>DataRetrieved</strong>: Data is retrieved.</li>
         * <li><strong>Processing</strong>: The task is running.</li>
         * <li><strong>Success</strong>: The task is successful.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * <li><strong>PartialFailed</strong>: The task partially failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>New</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2915</p>
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
