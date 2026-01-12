// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryAreaMapResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAreaMapResponseBodyData data;

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

    public static QueryAreaMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAreaMapResponseBody self = new QueryAreaMapResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAreaMapResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAreaMapResponseBody setData(QueryAreaMapResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAreaMapResponseBodyData getData() {
        return this.data;
    }

    public QueryAreaMapResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public QueryAreaMapResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public QueryAreaMapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAreaMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAreaMapResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAreaMapResponseBodyData extends TeaModel {
        @NameInMap("D3Oss")
        public String d3Oss;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LocationOss")
        public String locationOss;

        @NameInMap("MapType")
        public String mapType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Note")
        public String note;

        @NameInMap("Status")
        public String status;

        public static QueryAreaMapResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAreaMapResponseBodyData self = new QueryAreaMapResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAreaMapResponseBodyData setD3Oss(String d3Oss) {
            this.d3Oss = d3Oss;
            return this;
        }
        public String getD3Oss() {
            return this.d3Oss;
        }

        public QueryAreaMapResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryAreaMapResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAreaMapResponseBodyData setLocationOss(String locationOss) {
            this.locationOss = locationOss;
            return this;
        }
        public String getLocationOss() {
            return this.locationOss;
        }

        public QueryAreaMapResponseBodyData setMapType(String mapType) {
            this.mapType = mapType;
            return this;
        }
        public String getMapType() {
            return this.mapType;
        }

        public QueryAreaMapResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAreaMapResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public QueryAreaMapResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
