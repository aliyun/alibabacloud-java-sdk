// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetArEditCommonMaterialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetArEditCommonMaterialResponseBodyData data;

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

    public static GetArEditCommonMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArEditCommonMaterialResponseBody self = new GetArEditCommonMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArEditCommonMaterialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetArEditCommonMaterialResponseBody setData(GetArEditCommonMaterialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetArEditCommonMaterialResponseBodyData getData() {
        return this.data;
    }

    public GetArEditCommonMaterialResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public GetArEditCommonMaterialResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetArEditCommonMaterialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetArEditCommonMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArEditCommonMaterialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetArEditCommonMaterialResponseBodyData extends TeaModel {
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

        public static GetArEditCommonMaterialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetArEditCommonMaterialResponseBodyData self = new GetArEditCommonMaterialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetArEditCommonMaterialResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetArEditCommonMaterialResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetArEditCommonMaterialResponseBodyData setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public GetArEditCommonMaterialResponseBodyData setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public GetArEditCommonMaterialResponseBodyData setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public GetArEditCommonMaterialResponseBodyData setOssRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }
        public String getOssRegion() {
            return this.ossRegion;
        }

        public GetArEditCommonMaterialResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
