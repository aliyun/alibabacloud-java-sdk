// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetSqlInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<GetSqlInstanceResponseBody> body;

    public static GetSqlInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlInstanceResponse self = new GetSqlInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlInstanceResponse setBody(java.util.List<GetSqlInstanceResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<GetSqlInstanceResponseBody> getBody() {
        return this.body;
    }

    public static class GetSqlInstanceResponseBody extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("cu")
        public Integer cu;

        @NameInMap("createTime")
        public Integer createTime;

        @NameInMap("updateTime")
        public Integer updateTime;

        @NameInMap("useAsDefault")
        public Boolean useAsDefault;

        public static GetSqlInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
            GetSqlInstanceResponseBody self = new GetSqlInstanceResponseBody();
            return TeaModel.build(map, self);
        }

        public GetSqlInstanceResponseBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSqlInstanceResponseBody setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public GetSqlInstanceResponseBody setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public GetSqlInstanceResponseBody setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Integer getUpdateTime() {
            return this.updateTime;
        }

        public GetSqlInstanceResponseBody setUseAsDefault(Boolean useAsDefault) {
            this.useAsDefault = useAsDefault;
            return this;
        }
        public Boolean getUseAsDefault() {
            return this.useAsDefault;
        }

    }

}
