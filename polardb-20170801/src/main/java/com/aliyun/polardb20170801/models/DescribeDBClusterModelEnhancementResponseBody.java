// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterModelEnhancementResponseBody extends TeaModel {
    /**
     * <p>The time when the model enhancement feature was enabled, in the ISO 8601 UTC format (YYYY-MM-DDThh:mm:ssZ).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The number of API keys for model enhancement.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ModelEnhancementKeyNumber")
    public Integer modelEnhancementKeyNumber;

    /**
     * <p>The list of API keys for model enhancement.</p>
     */
    @NameInMap("ModelEnhancementKeys")
    public java.util.List<DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys> modelEnhancementKeys;

    /**
     * <p>The status of the model enhancement feature. A value of ON indicates that the feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("ModelEnhancementStatus")
    public String modelEnhancementStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterModelEnhancementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterModelEnhancementResponseBody self = new DescribeDBClusterModelEnhancementResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterModelEnhancementResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDBClusterModelEnhancementResponseBody setModelEnhancementKeyNumber(Integer modelEnhancementKeyNumber) {
        this.modelEnhancementKeyNumber = modelEnhancementKeyNumber;
        return this;
    }
    public Integer getModelEnhancementKeyNumber() {
        return this.modelEnhancementKeyNumber;
    }

    public DescribeDBClusterModelEnhancementResponseBody setModelEnhancementKeys(java.util.List<DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys> modelEnhancementKeys) {
        this.modelEnhancementKeys = modelEnhancementKeys;
        return this;
    }
    public java.util.List<DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys> getModelEnhancementKeys() {
        return this.modelEnhancementKeys;
    }

    public DescribeDBClusterModelEnhancementResponseBody setModelEnhancementStatus(String modelEnhancementStatus) {
        this.modelEnhancementStatus = modelEnhancementStatus;
        return this;
    }
    public String getModelEnhancementStatus() {
        return this.modelEnhancementStatus;
    }

    public DescribeDBClusterModelEnhancementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys extends TeaModel {
        /**
         * <p>The value of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>ak-12345</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The ID of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-001</p>
         */
        @NameInMap("ApiKeyId")
        public String apiKeyId;

        /**
         * <p>The time when the API key was created, in the ISO 8601 UTC format (YYYY-MM-DDThh:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>Model enhancement key</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The expiration time of the API key, in the ISO 8601 UTC format (YYYY-MM-DDThh:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-31T23:59:59Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        public static DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys self = new DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys setApiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public String getApiKeyId() {
            return this.apiKeyId;
        }

        public DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBClusterModelEnhancementResponseBodyModelEnhancementKeys setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

    }

}
