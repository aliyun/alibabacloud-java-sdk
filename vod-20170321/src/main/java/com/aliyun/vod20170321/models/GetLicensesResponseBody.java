// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetLicensesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetLicensesResponseBodyData data;

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

    public static GetLicensesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLicensesResponseBody self = new GetLicensesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLicensesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLicensesResponseBody setData(GetLicensesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLicensesResponseBodyData getData() {
        return this.data;
    }

    public GetLicensesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLicensesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLicensesResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetLicensesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLicensesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLicensesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLicensesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<?> list;

        @NameInMap("Total")
        public Long total;

        public static GetLicensesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLicensesResponseBodyData self = new GetLicensesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLicensesResponseBodyData setList(java.util.List<?> list) {
            this.list = list;
            return this;
        }
        public java.util.List<?> getList() {
            return this.list;
        }

        public GetLicensesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
