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
         * <p>The start time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * <br>
         * <p>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the from parameter, but does not include the end time specified by the to parameter. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned.</p>
         */
        @NameInMap("from")
        public Long from;

        /**
         * <p>The end time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * <br>
         * <p>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the from parameter, but does not include the end time specified by the to parameter. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned.</p>
         */
        @NameInMap("to")
        public Long to;

        /**
         * <p>The number of logs that are generated within the subinterval.</p>
         */
        @NameInMap("count")
        public Long count;

        /**
         * <p>Indicates whether the query and analysis results in the subinterval is complete. Valid values:</p>
         * <br>
         * <p>Complete: The query is successful, and the complete query and analysis results are returned.</p>
         * <br>
         * <p>Incomplete: The query is successful, but the query and analysis results are incomplete. To obtain the complete results, you must repeat the request.</p>
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
