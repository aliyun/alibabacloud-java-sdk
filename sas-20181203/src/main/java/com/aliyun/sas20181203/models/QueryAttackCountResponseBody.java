// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryAttackCountResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>An array that consists of the numbers of alert events in different attack phases.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryAttackCountResponseBodyData> data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether exceptions are handled. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAttackCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackCountResponseBody self = new QueryAttackCountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAttackCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAttackCountResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryAttackCountResponseBody setData(java.util.List<QueryAttackCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAttackCountResponseBodyData> getData() {
        return this.data;
    }

    public QueryAttackCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAttackCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAttackCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAttackCountResponseBodyData extends TeaModel {
        /**
         * <p>The number of times that the alert is triggered.</p>
         */
        @NameInMap("EventCount")
        public Integer eventCount;

        /**
         * <p>The stage ID of the ATT\&CK attack.</p>
         */
        @NameInMap("TacticId")
        public String tacticId;

        /**
         * <p>The type of stage of the ATT\&CK attack.</p>
         */
        @NameInMap("TacticType")
        public String tacticType;

        public static QueryAttackCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackCountResponseBodyData self = new QueryAttackCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAttackCountResponseBodyData setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public QueryAttackCountResponseBodyData setTacticId(String tacticId) {
            this.tacticId = tacticId;
            return this;
        }
        public String getTacticId() {
            return this.tacticId;
        }

        public QueryAttackCountResponseBodyData setTacticType(String tacticType) {
            this.tacticType = tacticType;
            return this;
        }
        public String getTacticType() {
            return this.tacticType;
        }

    }

}
