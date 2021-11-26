// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppVersionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppVersionsResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAppVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionsResponseBody self = new ListAppVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppVersionsResponseBody setData(java.util.List<ListAppVersionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppVersionsResponseBodyData> getData() {
        return this.data;
    }

    public ListAppVersionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAppVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAppVersionsResponseBodyData extends TeaModel {
        @NameInMap("BuildPackageUrl")
        public String buildPackageUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Type")
        public String type;

        @NameInMap("WarUrl")
        public String warUrl;

        public static ListAppVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppVersionsResponseBodyData self = new ListAppVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppVersionsResponseBodyData setBuildPackageUrl(String buildPackageUrl) {
            this.buildPackageUrl = buildPackageUrl;
            return this;
        }
        public String getBuildPackageUrl() {
            return this.buildPackageUrl;
        }

        public ListAppVersionsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppVersionsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAppVersionsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAppVersionsResponseBodyData setWarUrl(String warUrl) {
            this.warUrl = warUrl;
            return this;
        }
        public String getWarUrl() {
            return this.warUrl;
        }

    }

}
