// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListOfflineTaskErrorLogsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1-2-3-4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The collection of log request bodies, log responses, retry counts, and timestamps.</p>
     */
    @NameInMap("result")
    public java.util.List<ListOfflineTaskErrorLogsResponseBodyResult> result;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListOfflineTaskErrorLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineTaskErrorLogsResponseBody self = new ListOfflineTaskErrorLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOfflineTaskErrorLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOfflineTaskErrorLogsResponseBody setResult(java.util.List<ListOfflineTaskErrorLogsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListOfflineTaskErrorLogsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListOfflineTaskErrorLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOfflineTaskErrorLogsResponseBodyResult extends TeaModel {
        /**
         * <p><strong>The log request body.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;instance&quot;:&quot;123&quot;,&quot;user&quot;:&quot;xuanzhen&quot;}</p>
         */
        @NameInMap("request")
        public String request;

        /**
         * <p><strong>The log response.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;error&quot;:{&quot;reason&quot;:&quot;unable to authenticate user [elastic] for REST request [/_bulk]&quot;,&quot;header&quot;:{&quot;WWW-Authenticate&quot;:[&quot;Basic realm=\&quot;security\&quot;, charset=\&quot;UTF-8\&quot;&quot;,&quot;ApiKey&quot;]},&quot;type&quot;:&quot;security_exception&quot;,&quot;root_cause&quot;:[{&quot;reason&quot;:&quot;unable to authenticate user [elastic] for REST request [/_bulk]&quot;,&quot;header&quot;:{&quot;WWW-Authenticate&quot;:[&quot;Basic realm=\&quot;security\&quot;, charset=\&quot;UTF-8\&quot;&quot;,&quot;ApiKey&quot;]},&quot;type&quot;:&quot;security_exception&quot;}]},&quot;status&quot;:401}]</p>
         */
        @NameInMap("response")
        public String response;

        /**
         * <p><strong>The number of retries.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("retry")
        public String retry;

        /**
         * <p><strong>The timestamp.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>1770272507085</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        public static ListOfflineTaskErrorLogsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineTaskErrorLogsResponseBodyResult self = new ListOfflineTaskErrorLogsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListOfflineTaskErrorLogsResponseBodyResult setRequest(String request) {
            this.request = request;
            return this;
        }
        public String getRequest() {
            return this.request;
        }

        public ListOfflineTaskErrorLogsResponseBodyResult setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public ListOfflineTaskErrorLogsResponseBodyResult setRetry(String retry) {
            this.retry = retry;
            return this;
        }
        public String getRetry() {
            return this.retry;
        }

        public ListOfflineTaskErrorLogsResponseBodyResult setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
