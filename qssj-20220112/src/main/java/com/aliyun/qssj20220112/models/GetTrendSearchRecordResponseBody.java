// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendSearchRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetTrendSearchRecordResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetTrendSearchRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrendSearchRecordResponseBody self = new GetTrendSearchRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrendSearchRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrendSearchRecordResponseBody setData(java.util.List<GetTrendSearchRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTrendSearchRecordResponseBodyData> getData() {
        return this.data;
    }

    public GetTrendSearchRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrendSearchRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrendSearchRecordResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetTrendSearchRecordResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("QueryKey")
        public String queryKey;

        public static GetTrendSearchRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrendSearchRecordResponseBodyData self = new GetTrendSearchRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrendSearchRecordResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTrendSearchRecordResponseBodyData setQueryKey(String queryKey) {
            this.queryKey = queryKey;
            return this;
        }
        public String getQueryKey() {
            return this.queryKey;
        }

    }

}
