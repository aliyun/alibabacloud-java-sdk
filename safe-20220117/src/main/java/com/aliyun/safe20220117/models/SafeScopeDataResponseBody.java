// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeScopeDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SafeScopeDataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SafeScopeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SafeScopeDataResponseBody self = new SafeScopeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public SafeScopeDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SafeScopeDataResponseBody setData(SafeScopeDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SafeScopeDataResponseBodyData getData() {
        return this.data;
    }

    public SafeScopeDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SafeScopeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SafeScopeDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SafeScopeDataResponseBodyDataPagination extends TeaModel {
        @NameInMap("Limit")
        public Integer limit;

        @NameInMap("Page")
        public Integer page;

        public static SafeScopeDataResponseBodyDataPagination build(java.util.Map<String, ?> map) throws Exception {
            SafeScopeDataResponseBodyDataPagination self = new SafeScopeDataResponseBodyDataPagination();
            return TeaModel.build(map, self);
        }

        public SafeScopeDataResponseBodyDataPagination setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public SafeScopeDataResponseBodyDataPagination setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

    public static class SafeScopeDataResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<?> data;

        @NameInMap("ExtraInfo")
        public java.util.Map<String, String> extraInfo;

        @NameInMap("Pagination")
        public SafeScopeDataResponseBodyDataPagination pagination;

        @NameInMap("Total")
        public Long total;

        public static SafeScopeDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SafeScopeDataResponseBodyData self = new SafeScopeDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SafeScopeDataResponseBodyData setData(java.util.List<?> data) {
            this.data = data;
            return this;
        }
        public java.util.List<?> getData() {
            return this.data;
        }

        public SafeScopeDataResponseBodyData setExtraInfo(java.util.Map<String, String> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, String> getExtraInfo() {
            return this.extraInfo;
        }

        public SafeScopeDataResponseBodyData setPagination(SafeScopeDataResponseBodyDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public SafeScopeDataResponseBodyDataPagination getPagination() {
            return this.pagination;
        }

        public SafeScopeDataResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
