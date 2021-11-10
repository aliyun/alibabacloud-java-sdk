// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ActivityInfoQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public ActivityInfoQueryResponseBodyData data;

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

    public static ActivityInfoQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivityInfoQueryResponseBody self = new ActivityInfoQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivityInfoQueryResponseBody setData(ActivityInfoQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ActivityInfoQueryResponseBodyData getData() {
        return this.data;
    }

    public ActivityInfoQueryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ActivityInfoQueryResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ActivityInfoQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActivityInfoQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ActivityInfoQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ActivityInfoQueryResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static ActivityInfoQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ActivityInfoQueryResponseBodyData self = new ActivityInfoQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ActivityInfoQueryResponseBodyData setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public ActivityInfoQueryResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ActivityInfoQueryResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ActivityInfoQueryResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
