// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Events")
    public java.util.List<ListLDCEventsResponseBodyEvents> events;

    public static ListLDCEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCEventsResponseBody self = new ListLDCEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCEventsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCEventsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCEventsResponseBody setEvents(java.util.List<ListLDCEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<ListLDCEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public static class ListLDCEventsResponseBodyEvents extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Message")
        public String message;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static ListLDCEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            ListLDCEventsResponseBodyEvents self = new ListLDCEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public ListLDCEventsResponseBodyEvents setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListLDCEventsResponseBodyEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListLDCEventsResponseBodyEvents setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListLDCEventsResponseBodyEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListLDCEventsResponseBodyEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
