// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListHdrResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListHdrResponseBodyData> data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListHdrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHdrResponseBody self = new ListHdrResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHdrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHdrResponseBody setData(java.util.List<ListHdrResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListHdrResponseBodyData> getData() {
        return this.data;
    }

    public ListHdrResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public ListHdrResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListHdrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHdrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHdrResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHdrResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        public static ListHdrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHdrResponseBodyData self = new ListHdrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHdrResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHdrResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
