// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetLicenseKeyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetLicenseKeyResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("LogExt")
    public Object logExt;

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

    @NameInMap("Total")
    public Long total;

    public static GetLicenseKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseKeyResponseBody self = new GetLicenseKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLicenseKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLicenseKeyResponseBody setData(GetLicenseKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLicenseKeyResponseBodyData getData() {
        return this.data;
    }

    public GetLicenseKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLicenseKeyResponseBody setLogExt(Object logExt) {
        this.logExt = logExt;
        return this;
    }
    public Object getLogExt() {
        return this.logExt;
    }

    public GetLicenseKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLicenseKeyResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetLicenseKeyResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLicenseKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLicenseKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLicenseKeyResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetLicenseKeyResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<?> list;

        @NameInMap("Total")
        public Long total;

        public static GetLicenseKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLicenseKeyResponseBodyData self = new GetLicenseKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLicenseKeyResponseBodyData setList(java.util.List<?> list) {
            this.list = list;
            return this;
        }
        public java.util.List<?> getList() {
            return this.list;
        }

        public GetLicenseKeyResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
