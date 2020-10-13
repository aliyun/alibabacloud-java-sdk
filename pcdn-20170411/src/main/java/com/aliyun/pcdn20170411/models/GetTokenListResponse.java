// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTokenListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("TokenList")
    @Validation(required = true)
    public GetTokenListResponseTokenList tokenList;

    public static GetTokenListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenListResponse self = new GetTokenListResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenListResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTokenListResponse setTokenList(GetTokenListResponseTokenList tokenList) {
        this.tokenList = tokenList;
        return this;
    }
    public GetTokenListResponseTokenList getTokenList() {
        return this.tokenList;
    }

    public static class GetTokenListResponseTokenListToken extends TeaModel {
        @NameInMap("ClientId")
        @Validation(required = true)
        public String clientId;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("PlatformName")
        @Validation(required = true)
        public String platformName;

        @NameInMap("PlatformType")
        @Validation(required = true)
        public String platformType;

        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("UpdatedAt")
        @Validation(required = true)
        public String updatedAt;

        public static GetTokenListResponseTokenListToken build(java.util.Map<String, ?> map) throws Exception {
            GetTokenListResponseTokenListToken self = new GetTokenListResponseTokenListToken();
            return TeaModel.build(map, self);
        }

        public GetTokenListResponseTokenListToken setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetTokenListResponseTokenListToken setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetTokenListResponseTokenListToken setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public GetTokenListResponseTokenListToken setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public GetTokenListResponseTokenListToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetTokenListResponseTokenListToken setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetTokenListResponseTokenListToken setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class GetTokenListResponseTokenList extends TeaModel {
        @NameInMap("Token")
        @Validation(required = true)
        public java.util.List<GetTokenListResponseTokenListToken> token;

        public static GetTokenListResponseTokenList build(java.util.Map<String, ?> map) throws Exception {
            GetTokenListResponseTokenList self = new GetTokenListResponseTokenList();
            return TeaModel.build(map, self);
        }

        public GetTokenListResponseTokenList setToken(java.util.List<GetTokenListResponseTokenListToken> token) {
            this.token = token;
            return this;
        }
        public java.util.List<GetTokenListResponseTokenListToken> getToken() {
            return this.token;
        }

    }

}
