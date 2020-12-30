// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTokenListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TokenList")
    public GetTokenListResponseBodyTokenList tokenList;

    @NameInMap("Code")
    public Integer code;

    public static GetTokenListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenListResponseBody self = new GetTokenListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenListResponseBody setTokenList(GetTokenListResponseBodyTokenList tokenList) {
        this.tokenList = tokenList;
        return this;
    }
    public GetTokenListResponseBodyTokenList getTokenList() {
        return this.tokenList;
    }

    public GetTokenListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetTokenListResponseBodyTokenListToken extends TeaModel {
        @NameInMap("PlatformName")
        public String platformName;

        @NameInMap("Token")
        public String token;

        @NameInMap("PlatformType")
        public String platformType;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ClientId")
        public String clientId;

        public static GetTokenListResponseBodyTokenListToken build(java.util.Map<String, ?> map) throws Exception {
            GetTokenListResponseBodyTokenListToken self = new GetTokenListResponseBodyTokenListToken();
            return TeaModel.build(map, self);
        }

        public GetTokenListResponseBodyTokenListToken setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public GetTokenListResponseBodyTokenListToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetTokenListResponseBodyTokenListToken setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public GetTokenListResponseBodyTokenListToken setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetTokenListResponseBodyTokenListToken setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetTokenListResponseBodyTokenListToken setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetTokenListResponseBodyTokenListToken setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

    public static class GetTokenListResponseBodyTokenList extends TeaModel {
        @NameInMap("Token")
        public java.util.List<GetTokenListResponseBodyTokenListToken> token;

        public static GetTokenListResponseBodyTokenList build(java.util.Map<String, ?> map) throws Exception {
            GetTokenListResponseBodyTokenList self = new GetTokenListResponseBodyTokenList();
            return TeaModel.build(map, self);
        }

        public GetTokenListResponseBodyTokenList setToken(java.util.List<GetTokenListResponseBodyTokenListToken> token) {
            this.token = token;
            return this;
        }
        public java.util.List<GetTokenListResponseBodyTokenListToken> getToken() {
            return this.token;
        }

    }

}
