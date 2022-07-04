// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetHistogramsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
        // 子时间区间的开始时间点。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
        // 
        // 时间区间遵循“左闭右开”原则，即该时间区间包括区间开始时间点，但不包括区间结束时间点。如果from和to的值相同，则为无效区间，函数直接返回错误。
        @NameInMap("from")
        public Long from;

        // 子时间区间的结束时间点。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
        // 
        // 时间区间遵循“左闭右开”原则，即该时间区间包括区间开始时间点，但不包括区间结束时间点。如果from和to的值相同，则为无效区间，函数直接返回错误。
        @NameInMap("to")
        public Long to;

        // 该子时间区间内查询到的日志条数。
        @NameInMap("count")
        public Long count;

        // 当前查询结果在该子时间区间内的结果是否完整。
        // 
        // Complete：查询已经完成，返回结果为完整结果。
        // 
        // Incomplete：查询已经完成，返回结果为不完整结果，需要重复请求以获得完整结果。
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
