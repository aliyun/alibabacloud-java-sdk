// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListQueryRaspAppInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListQueryRaspAppInfoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListQueryRaspAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryRaspAppInfoResponseBody self = new ListQueryRaspAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryRaspAppInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQueryRaspAppInfoResponseBody setData(java.util.List<ListQueryRaspAppInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListQueryRaspAppInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListQueryRaspAppInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQueryRaspAppInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQueryRaspAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueryRaspAppInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQueryRaspAppInfoResponseBodyData extends TeaModel {
        @NameInMap("RaspAppName")
        public String raspAppName;

        @NameInMap("RaspOnlineStatus")
        public Integer raspOnlineStatus;

        @NameInMap("RaspStatus")
        public String raspStatus;

        /**
         * <p>推送失败结果</p>
         */
        @NameInMap("Result")
        public String result;

        @NameInMap("Uuid")
        public String uuid;

        public static ListQueryRaspAppInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueryRaspAppInfoResponseBodyData self = new ListQueryRaspAppInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueryRaspAppInfoResponseBodyData setRaspAppName(String raspAppName) {
            this.raspAppName = raspAppName;
            return this;
        }
        public String getRaspAppName() {
            return this.raspAppName;
        }

        public ListQueryRaspAppInfoResponseBodyData setRaspOnlineStatus(Integer raspOnlineStatus) {
            this.raspOnlineStatus = raspOnlineStatus;
            return this;
        }
        public Integer getRaspOnlineStatus() {
            return this.raspOnlineStatus;
        }

        public ListQueryRaspAppInfoResponseBodyData setRaspStatus(String raspStatus) {
            this.raspStatus = raspStatus;
            return this;
        }
        public String getRaspStatus() {
            return this.raspStatus;
        }

        public ListQueryRaspAppInfoResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListQueryRaspAppInfoResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
