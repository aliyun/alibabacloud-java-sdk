// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListApiKeysResponseBody extends TeaModel {
    @NameInMap("apiKeys")
    public java.util.List<ListApiKeysResponseBodyApiKeys> apiKeys;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiKeysResponseBody self = new ListApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiKeysResponseBody setApiKeys(java.util.List<ListApiKeysResponseBodyApiKeys> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<ListApiKeysResponseBodyApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    public ListApiKeysResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListApiKeysResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListApiKeysResponseBodyApiKeys extends TeaModel {
        @NameInMap("allowedStores")
        public java.util.List<String> allowedStores;

        /**
         * <strong>example:</strong>
         * <apiKey-plaintext>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>demo-apikey-001</p>
         */
        @NameInMap("apiKeyName")
        public String apiKeyName;

        /**
         * <strong>example:</strong>
         * <p>1788420000</p>
         */
        @NameInMap("createTime")
        public Integer createTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1788420000</p>
         */
        @NameInMap("updateTime")
        public Integer updateTime;

        public static ListApiKeysResponseBodyApiKeys build(java.util.Map<String, ?> map) throws Exception {
            ListApiKeysResponseBodyApiKeys self = new ListApiKeysResponseBodyApiKeys();
            return TeaModel.build(map, self);
        }

        public ListApiKeysResponseBodyApiKeys setAllowedStores(java.util.List<String> allowedStores) {
            this.allowedStores = allowedStores;
            return this;
        }
        public java.util.List<String> getAllowedStores() {
            return this.allowedStores;
        }

        public ListApiKeysResponseBodyApiKeys setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListApiKeysResponseBodyApiKeys setApiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        public ListApiKeysResponseBodyApiKeys setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public ListApiKeysResponseBodyApiKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiKeysResponseBodyApiKeys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApiKeysResponseBodyApiKeys setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Integer getUpdateTime() {
            return this.updateTime;
        }

    }

}
