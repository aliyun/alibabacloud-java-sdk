// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetConnDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Extend")
    public String extend;

    @NameInMap("List")
    public java.util.List<GetConnDataResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Version")
    public String version;

    public static GetConnDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnDataResponseBody self = new GetConnDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetConnDataResponseBody setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public GetConnDataResponseBody setList(java.util.List<GetConnDataResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GetConnDataResponseBodyList> getList() {
        return this.list;
    }

    public GetConnDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConnDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetConnDataResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class GetConnDataResponseBodyList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("MapId")
        public String mapId;

        @NameInMap("Type")
        public String type;

        public static GetConnDataResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            GetConnDataResponseBodyList self = new GetConnDataResponseBodyList();
            return TeaModel.build(map, self);
        }

        public GetConnDataResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetConnDataResponseBodyList setMapId(String mapId) {
            this.mapId = mapId;
            return this;
        }
        public String getMapId() {
            return this.mapId;
        }

        public GetConnDataResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
