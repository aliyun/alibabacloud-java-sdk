// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListMenuResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Data")
    public java.util.List<ListMenuResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static ListMenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMenuResponseBody self = new ListMenuResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMenuResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ListMenuResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ListMenuResponseBody setData(java.util.List<ListMenuResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMenuResponseBodyData> getData() {
        return this.data;
    }

    public ListMenuResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMenuResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Url")
        public String url;

        @NameInMap("Name")
        public String name;

        public static ListMenuResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMenuResponseBodyData self = new ListMenuResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMenuResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListMenuResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListMenuResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
