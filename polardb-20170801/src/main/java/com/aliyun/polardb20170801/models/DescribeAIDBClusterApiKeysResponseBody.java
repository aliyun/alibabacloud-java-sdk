// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterApiKeysResponseBody extends TeaModel {
    /**
     * <p>API Keys。</p>
     */
    @NameInMap("ApiKeys")
    public java.util.List<DescribeAIDBClusterApiKeysResponseBodyApiKeys> apiKeys;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7F2007D3-7E74-4ECB-89A8-BF130D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAIDBClusterApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterApiKeysResponseBody self = new DescribeAIDBClusterApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterApiKeysResponseBody setApiKeys(java.util.List<DescribeAIDBClusterApiKeysResponseBodyApiKeys> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<DescribeAIDBClusterApiKeysResponseBodyApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    public DescribeAIDBClusterApiKeysResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAIDBClusterApiKeysResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAIDBClusterApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAIDBClusterApiKeysResponseBodyApiKeys extends TeaModel {
        /**
         * <p>The API key of the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>Scxxx-xxx-x-xxWW</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-09T03:19:19Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>my api key</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>ApiKey ID</p>
         * 
         * <strong>example:</strong>
         * <p>573</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The status of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeAIDBClusterApiKeysResponseBodyApiKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterApiKeysResponseBodyApiKeys self = new DescribeAIDBClusterApiKeysResponseBodyApiKeys();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterApiKeysResponseBodyApiKeys setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeAIDBClusterApiKeysResponseBodyApiKeys setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAIDBClusterApiKeysResponseBodyApiKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAIDBClusterApiKeysResponseBodyApiKeys setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAIDBClusterApiKeysResponseBodyApiKeys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
