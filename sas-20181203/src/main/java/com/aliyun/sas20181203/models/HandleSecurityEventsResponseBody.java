// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HandleSecurityEventsResponse")
    public HandleSecurityEventsResponseBodyHandleSecurityEventsResponse handleSecurityEventsResponse;

    public static HandleSecurityEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HandleSecurityEventsResponseBody self = new HandleSecurityEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public HandleSecurityEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HandleSecurityEventsResponseBody setHandleSecurityEventsResponse(HandleSecurityEventsResponseBodyHandleSecurityEventsResponse handleSecurityEventsResponse) {
        this.handleSecurityEventsResponse = handleSecurityEventsResponse;
        return this;
    }
    public HandleSecurityEventsResponseBodyHandleSecurityEventsResponse getHandleSecurityEventsResponse() {
        return this.handleSecurityEventsResponse;
    }

    public static class HandleSecurityEventsResponseBodyHandleSecurityEventsResponse extends TeaModel {
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
