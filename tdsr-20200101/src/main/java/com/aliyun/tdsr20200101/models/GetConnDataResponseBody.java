// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetConnDataResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 版本
    @NameInMap("Version")
    public String version;

    // 扩展信息
    @NameInMap("Extend")
    public String extend;

    // 关联信息
    @NameInMap("List")
    public java.util.List<GetConnDataResponseBodyList> list;

    public static GetConnDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnDataResponseBody self = new GetConnDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetConnDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetConnDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConnDataResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
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

    public static class GetConnDataResponseBodyList extends TeaModel {
        // ID
        @NameInMap("Id")
        public String id;

        // 关联的ID
        @NameInMap("MapId")
        public String mapId;

        // outer:外关联 inner：内关联 stair：楼梯关联
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
