// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetHistogramsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<GetHistogramsResponseBody> body;

    public static GetHistogramsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistogramsResponse self = new GetHistogramsResponse();
        return TeaModel.build(map, self);
    }

    public GetHistogramsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistogramsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistogramsResponse setBody(java.util.List<GetHistogramsResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<GetHistogramsResponseBody> getBody() {
        return this.body;
    }

    public static class GetHistogramsResponseBody extends TeaModel {
        /**
         * <p>The start time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>The time interval follows the left-closed, right-open principle. The interval includes the start time but excludes the end time. If the values of from and to are the same, the interval is invalid and the function returns an error.</p>
         * 
         * <strong>example:</strong>
         * <p>1409529600</p>
         */
        @NameInMap("from")
        public Long from;

        /**
         * <p>The end time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>The time interval follows the left-closed, right-open principle. The interval includes the start time but excludes the end time. If the values of from and to are the same, the interval is invalid and the function returns an error.</p>
         * 
         * <strong>example:</strong>
         * <p>1409569200</p>
         */
        @NameInMap("to")
        public Long to;

        /**
         * <p>The number of logs queried in the subinterval.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("count")
        public Long count;

        /**
         * <p>Indicates whether the query results in the subinterval are complete.</p>
         * <p>Complete: The query is complete and the returned results are complete.</p>
         * <p>Incomplete: The query is complete but the returned results are incomplete. Repeat the request to obtain complete results.</p>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("progress")
        public String progress;

        public static GetHistogramsResponseBody build(java.util.Map<String, ?> map) throws Exception {
            GetHistogramsResponseBody self = new GetHistogramsResponseBody();
            return TeaModel.build(map, self);
        }

        public GetHistogramsResponseBody setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public GetHistogramsResponseBody setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

        public GetHistogramsResponseBody setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetHistogramsResponseBody setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

}
