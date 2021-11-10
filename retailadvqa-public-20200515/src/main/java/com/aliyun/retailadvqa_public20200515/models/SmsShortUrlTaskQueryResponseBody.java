// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SmsShortUrlTaskQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public SmsShortUrlTaskQueryResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static SmsShortUrlTaskQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SmsShortUrlTaskQueryResponseBody self = new SmsShortUrlTaskQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SmsShortUrlTaskQueryResponseBody setData(SmsShortUrlTaskQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SmsShortUrlTaskQueryResponseBodyData getData() {
        return this.data;
    }

    public SmsShortUrlTaskQueryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SmsShortUrlTaskQueryResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public SmsShortUrlTaskQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SmsShortUrlTaskQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SmsShortUrlTaskQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class SmsShortUrlTaskQueryResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static SmsShortUrlTaskQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SmsShortUrlTaskQueryResponseBodyData self = new SmsShortUrlTaskQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SmsShortUrlTaskQueryResponseBodyData setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public SmsShortUrlTaskQueryResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public SmsShortUrlTaskQueryResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SmsShortUrlTaskQueryResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
