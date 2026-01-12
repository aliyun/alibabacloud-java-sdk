// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetArEditUgcMaterialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetArEditUgcMaterialResponseBodyData data;

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

    public static GetArEditUgcMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArEditUgcMaterialResponseBody self = new GetArEditUgcMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArEditUgcMaterialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetArEditUgcMaterialResponseBody setData(GetArEditUgcMaterialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetArEditUgcMaterialResponseBodyData getData() {
        return this.data;
    }

    public GetArEditUgcMaterialResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public GetArEditUgcMaterialResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetArEditUgcMaterialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetArEditUgcMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArEditUgcMaterialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetArEditUgcMaterialResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Expiration")
        public Long expiration;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssPath")
        public String ossPath;

        @NameInMap("OssRegion")
        public String ossRegion;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetArEditUgcMaterialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetArEditUgcMaterialResponseBodyData self = new GetArEditUgcMaterialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetArEditUgcMaterialResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetArEditUgcMaterialResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetArEditUgcMaterialResponseBodyData setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public GetArEditUgcMaterialResponseBodyData setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public GetArEditUgcMaterialResponseBodyData setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public GetArEditUgcMaterialResponseBodyData setOssRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }
        public String getOssRegion() {
            return this.ossRegion;
        }

        public GetArEditUgcMaterialResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
