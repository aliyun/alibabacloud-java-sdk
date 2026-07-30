// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterApiKeyResponseBody extends TeaModel {
    /**
     * <p>The API key.</p>
     */
    @NameInMap("ApiKey")
    public CreateAIDBClusterApiKeyResponseBodyApiKey apiKey;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAIDBClusterApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAIDBClusterApiKeyResponseBody self = new CreateAIDBClusterApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAIDBClusterApiKeyResponseBody setApiKey(CreateAIDBClusterApiKeyResponseBodyApiKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public CreateAIDBClusterApiKeyResponseBodyApiKey getApiKey() {
        return this.apiKey;
    }

    public CreateAIDBClusterApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAIDBClusterApiKeyResponseBodyApiKey extends TeaModel {
        /**
         * <p>The API key of the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-12T03:41:53Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>393</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The API key status.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateAIDBClusterApiKeyResponseBodyApiKey build(java.util.Map<String, ?> map) throws Exception {
            CreateAIDBClusterApiKeyResponseBodyApiKey self = new CreateAIDBClusterApiKeyResponseBodyApiKey();
            return TeaModel.build(map, self);
        }

        public CreateAIDBClusterApiKeyResponseBodyApiKey setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateAIDBClusterApiKeyResponseBodyApiKey setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAIDBClusterApiKeyResponseBodyApiKey setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAIDBClusterApiKeyResponseBodyApiKey setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateAIDBClusterApiKeyResponseBodyApiKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
