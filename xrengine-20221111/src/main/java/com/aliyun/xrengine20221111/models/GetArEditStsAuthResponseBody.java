// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetArEditStsAuthResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetArEditStsAuthResponseBodyData data;

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

    public static GetArEditStsAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArEditStsAuthResponseBody self = new GetArEditStsAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArEditStsAuthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetArEditStsAuthResponseBody setData(GetArEditStsAuthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetArEditStsAuthResponseBodyData getData() {
        return this.data;
    }

    public GetArEditStsAuthResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public GetArEditStsAuthResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetArEditStsAuthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetArEditStsAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArEditStsAuthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetArEditStsAuthResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("EditPath")
        public String editPath;

        @NameInMap("Expiration")
        public Long expiration;

        @NameInMap("Map3DPath")
        public String map3DPath;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssRegion")
        public String ossRegion;

        @NameInMap("PublishPath")
        public String publishPath;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetArEditStsAuthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetArEditStsAuthResponseBodyData self = new GetArEditStsAuthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetArEditStsAuthResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetArEditStsAuthResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetArEditStsAuthResponseBodyData setEditPath(String editPath) {
            this.editPath = editPath;
            return this;
        }
        public String getEditPath() {
            return this.editPath;
        }

        public GetArEditStsAuthResponseBodyData setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public GetArEditStsAuthResponseBodyData setMap3DPath(String map3DPath) {
            this.map3DPath = map3DPath;
            return this;
        }
        public String getMap3DPath() {
            return this.map3DPath;
        }

        public GetArEditStsAuthResponseBodyData setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public GetArEditStsAuthResponseBodyData setOssRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }
        public String getOssRegion() {
            return this.ossRegion;
        }

        public GetArEditStsAuthResponseBodyData setPublishPath(String publishPath) {
            this.publishPath = publishPath;
            return this;
        }
        public String getPublishPath() {
            return this.publishPath;
        }

        public GetArEditStsAuthResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
