// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GenerateAssetOperationTokenResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("AssetOperationToken")
    public GenerateAssetOperationTokenResponseBodyAssetOperationToken assetOperationToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
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
        /**
         * <p>The remaining number of times that you can use the O\&amp;M token.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CountLeft")
        public Long countLeft;

        /**
         * <p>The time when the O\&amp;M token expires. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1709110797</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>Indicates whether the number of times that you can use the O\&amp;M token is limited.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasCountLimit")
        public Boolean hasCountLimit;

        /**
         * <p>The maximum number of renewals. A value of 0 indicates that renewal is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxRenewCount")
        public Long maxRenewCount;

        /**
         * <p>The number of times the O\&amp;M token is renewed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RenewCount")
        public Long renewCount;

        @NameInMap("SsoUrl")
        public String ssoUrl;

        /**
         * <p>The O\&amp;M token that you apply for.</p>
         * 
         * <strong>example:</strong>
         * <p>NmYyMmEzNmMwYzljNGY******</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The ID of the O\&amp;M token.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public GenerateAssetOperationTokenResponseBodyAssetOperationToken setSsoUrl(String ssoUrl) {
            this.ssoUrl = ssoUrl;
            return this;
        }
        public String getSsoUrl() {
            return this.ssoUrl;
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
