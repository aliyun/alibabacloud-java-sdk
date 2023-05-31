// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsResponseBody extends TeaModel {
    /**
     * <p>The handling result of the alert events.</p>
     */
    @NameInMap("HandleSecurityEventsResponse")
    public HandleSecurityEventsResponseBodyHandleSecurityEventsResponse handleSecurityEventsResponse;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static HandleSecurityEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HandleSecurityEventsResponseBody self = new HandleSecurityEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public HandleSecurityEventsResponseBody setHandleSecurityEventsResponse(HandleSecurityEventsResponseBodyHandleSecurityEventsResponse handleSecurityEventsResponse) {
        this.handleSecurityEventsResponse = handleSecurityEventsResponse;
        return this;
    }
    public HandleSecurityEventsResponseBodyHandleSecurityEventsResponse getHandleSecurityEventsResponse() {
        return this.handleSecurityEventsResponse;
    }

    public HandleSecurityEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class HandleSecurityEventsResponseBodyHandleSecurityEventsResponse extends TeaModel {
        /**
         * <p>The ID of the task to handle the alert events.</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static HandleSecurityEventsResponseBodyHandleSecurityEventsResponse build(java.util.Map<String, ?> map) throws Exception {
            HandleSecurityEventsResponseBodyHandleSecurityEventsResponse self = new HandleSecurityEventsResponseBodyHandleSecurityEventsResponse();
            return TeaModel.build(map, self);
        }

        public HandleSecurityEventsResponseBodyHandleSecurityEventsResponse setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
