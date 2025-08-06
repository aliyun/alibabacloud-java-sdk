// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLicensesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLicensesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLicensesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLicensesResponseBody self = new ListLicensesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLicensesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLicensesResponseBody setData(ListLicensesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLicensesResponseBodyData getData() {
        return this.data;
    }

    public ListLicensesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLicensesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLicensesResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLicensesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLicensesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLicensesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLicensesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<?> list;

        @NameInMap("Total")
        public Long total;

        public static ListLicensesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLicensesResponseBodyData self = new ListLicensesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLicensesResponseBodyData setList(java.util.List<?> list) {
            this.list = list;
            return this;
        }
        public java.util.List<?> getList() {
            return this.list;
        }

        public ListLicensesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
