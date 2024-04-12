// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GenerateAssetOperationTokenResponseBody extends TeaModel {
    @NameInMap("AssetOperationToken")
    public GenerateAssetOperationTokenResponseBodyAssetOperationToken assetOperationToken;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateAssetOperationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAssetOperationTokenResponseBody self = new GenerateAssetOperationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAssetOperationTokenResponseBody setAssetOperationToken(GenerateAssetOperationTokenResponseBodyAssetOperationToken assetOperationToken) {
        this.assetOperationToken = assetOperationToken;
        return this;
    }
    public GenerateAssetOperationTokenResponseBodyAssetOperationToken getAssetOperationToken() {
        return this.assetOperationToken;
    }

    public GenerateAssetOperationTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateAssetOperationTokenResponseBodyAssetOperationToken extends TeaModel {
        @NameInMap("CountLeft")
        public Long countLeft;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("HasCountLimit")
        public Boolean hasCountLimit;

        @NameInMap("MaxRenewCount")
        public Long maxRenewCount;

        @NameInMap("RenewCount")
        public Long renewCount;

        @NameInMap("Token")
        public String token;

        @NameInMap("TokenId")
        public String tokenId;

        public static GenerateAssetOperationTokenResponseBodyAssetOperationToken build(java.util.Map<String, ?> map) throws Exception {
            GenerateAssetOperationTokenResponseBodyAssetOperationToken self = new GenerateAssetOperationTokenResponseBodyAssetOperationToken();
            return TeaModel.build(map, self);
        }

        public GenerateAssetOperationTokenResponseBodyAssetOperationToken setCountLeft(Long countLeft) {
            this.countLeft = countLeft;
            return this;
        }
        public Long getCountLeft() {
            return this.countLeft;
        }

        public GenerateAssetOperationTokenResponseBodyAssetOperationToken setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GenerateAssetOperationTokenResponseBodyAssetOperationToken setHasCountLimit(Boolean hasCountLimit) {
            this.hasCountLimit = hasCountLimit;
            return this;
        }
        public Boolean getHasCountLimit() {
            return this.hasCountLimit;
        }

        public GenerateAssetOperationTokenResponseBodyAssetOperationToken setMaxRenewCount(Long maxRenewCount) {
            this.maxRenewCount = maxRenewCount;
            return this;
        }
        public Long getMaxRenewCount() {
            return this.maxRenewCount;
        }

        public GenerateAssetOperationTokenResponseBodyAssetOperationToken setRenewCount(Long renewCount) {
            this.renewCount = renewCount;
            return this;
        }
        public Long getRenewCount() {
            return this.renewCount;
        }

        public GenerateAssetOperationTokenResponseBodyAssetOperationToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GenerateAssetOperationTokenResponseBodyAssetOperationToken setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

}
