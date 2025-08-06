// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetSdkListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSdkListResponseBodyData data;

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

    public static GetSdkListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSdkListResponseBody self = new GetSdkListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSdkListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSdkListResponseBody setData(GetSdkListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSdkListResponseBodyData getData() {
        return this.data;
    }

    public GetSdkListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSdkListResponseBody setLogExt(Object logExt) {
        this.logExt = logExt;
        return this;
    }
    public Object getLogExt() {
        return this.logExt;
    }

    public GetSdkListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSdkListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetSdkListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetSdkListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSdkListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSdkListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetSdkListResponseBodyData extends TeaModel {
        @NameInMap("Businesses")
        public java.util.Map<String, java.util.List<DataBusinessesValue>> businesses;

        public static GetSdkListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSdkListResponseBodyData self = new GetSdkListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSdkListResponseBodyData setBusinesses(java.util.Map<String, java.util.List<DataBusinessesValue>> businesses) {
            this.businesses = businesses;
            return this;
        }
        public java.util.Map<String, java.util.List<DataBusinessesValue>> getBusinesses() {
            return this.businesses;
        }

    }

}
