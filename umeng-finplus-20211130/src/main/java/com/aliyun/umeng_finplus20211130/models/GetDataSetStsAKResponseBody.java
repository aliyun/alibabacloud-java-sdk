// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetDataSetStsAKResponseBody extends TeaModel {
    // 状态编码
    @NameInMap("Code")
    public String code;

    // 数据对象
    @NameInMap("Data")
    public GetDataSetStsAKResponseBodyData data;

    // 消息描述
    @NameInMap("Msg")
    public String msg;

    // request标识Id
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetDataSetStsAKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSetStsAKResponseBody self = new GetDataSetStsAKResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSetStsAKResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataSetStsAKResponseBody setData(GetDataSetStsAKResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataSetStsAKResponseBodyData getData() {
        return this.data;
    }

    public GetDataSetStsAKResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetDataSetStsAKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSetStsAKResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataSetStsAKResponseBodyData extends TeaModel {
        // bucket名
        @NameInMap("Bucket")
        public String bucket;

        // 地址信息
        @NameInMap("Endpoint")
        public String endpoint;

        // 编码
        @NameInMap("Id")
        public String id;

        // 路径
        @NameInMap("Path")
        public String path;

        // 密码
        @NameInMap("Secret")
        public String secret;

        // token
        @NameInMap("Token")
        public String token;

        public static GetDataSetStsAKResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataSetStsAKResponseBodyData self = new GetDataSetStsAKResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataSetStsAKResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetDataSetStsAKResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetDataSetStsAKResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDataSetStsAKResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDataSetStsAKResponseBodyData setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public GetDataSetStsAKResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
