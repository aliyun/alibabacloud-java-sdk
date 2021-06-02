// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSingleConnDataResponseBody extends TeaModel {
    // 请求ID，与入参requestId对应
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

    // 关联信息
    @NameInMap("List")
    public java.util.List<GetSingleConnDataResponseBodyList> list;

    public static GetSingleConnDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSingleConnDataResponseBody self = new GetSingleConnDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSingleConnDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSingleConnDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSingleConnDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSingleConnDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSingleConnDataResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetSingleConnDataResponseBody setList(java.util.List<GetSingleConnDataResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GetSingleConnDataResponseBodyList> getList() {
        return this.list;
    }

    public static class GetSingleConnDataResponseBodyList extends TeaModel {
        // ID
        @NameInMap("Id")
        public String id;

        // 关联ID
        @NameInMap("MapId")
        public String mapId;

        // outer:外关联 inner：内关联 stair：楼梯关联
        @NameInMap("Type")
        public String type;

        public static GetSingleConnDataResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            GetSingleConnDataResponseBodyList self = new GetSingleConnDataResponseBodyList();
            return TeaModel.build(map, self);
        }

        public GetSingleConnDataResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSingleConnDataResponseBodyList setMapId(String mapId) {
            this.mapId = mapId;
            return this;
        }
        public String getMapId() {
            return this.mapId;
        }

        public GetSingleConnDataResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
