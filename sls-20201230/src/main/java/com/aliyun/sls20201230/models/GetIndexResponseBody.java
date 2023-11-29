// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetIndexResponseBody extends TeaModel {
    /**
     * <p>The type of the index.</p>
     */
    @NameInMap("index_mode")
    public String indexMode;

    /**
     * <p>The configurations of field indexes. A field index is in the key-value format in which the key specifies the name of the field and the value specifies the index configuration of the field.</p>
     */
    @NameInMap("keys")
    public java.util.Map<String, KeysValue> keys;

    /**
     * <p>The time when the index configurations were last updated. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>The configurations of full-text indexes.</p>
     */
    @NameInMap("line")
    public GetIndexResponseBodyLine line;

    /**
     * <p>Indicates whether the log clustering feature is enabled.</p>
     */
    @NameInMap("log_reduce")
    public Boolean logReduce;

    /**
     * <p>The fields in the blacklist that are used to cluster logs. This parameter is valid only if the log clustering feature is enabled.</p>
     */
    @NameInMap("log_reduce_black_list")
    public java.util.List<String> logReduceBlackList;

    /**
     * <p>The fields in the whitelist that are used to cluster logs. This parameter is valid only if the log clustering feature is enabled.</p>
     */
    @NameInMap("log_reduce_white_list")
    public java.util.List<String> logReduceWhiteList;

    /**
     * <p>The maximum length of a field value that can be retained. Default value: 2048. Unit: bytes. The default value is equal to 2 KB. You can change the value of the max_text_len parameter. Valid values: 64 to 16384. Unit: bytes.</p>
     */
    @NameInMap("max_text_len")
    public Integer maxTextLen;

    /**
     * <p>The storage type. The value is fixed as pg.</p>
     */
    @NameInMap("storage")
    public String storage;

    /**
     * <p>The lifecycle of the index file. Valid values: 7, 30, and 90. Unit: day.</p>
     */
    @NameInMap("ttl")
    public Integer ttl;

    public static GetIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIndexResponseBody self = new GetIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIndexResponseBody setIndexMode(String indexMode) {
        this.indexMode = indexMode;
        return this;
    }
    public String getIndexMode() {
        return this.indexMode;
    }

    public GetIndexResponseBody setKeys(java.util.Map<String, KeysValue> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.Map<String, KeysValue> getKeys() {
        return this.keys;
    }

    public GetIndexResponseBody setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public GetIndexResponseBody setLine(GetIndexResponseBodyLine line) {
        this.line = line;
        return this;
    }
    public GetIndexResponseBodyLine getLine() {
        return this.line;
    }

    public GetIndexResponseBody setLogReduce(Boolean logReduce) {
        this.logReduce = logReduce;
        return this;
    }
    public Boolean getLogReduce() {
        return this.logReduce;
    }

    public GetIndexResponseBody setLogReduceBlackList(java.util.List<String> logReduceBlackList) {
        this.logReduceBlackList = logReduceBlackList;
        return this;
    }
    public java.util.List<String> getLogReduceBlackList() {
        return this.logReduceBlackList;
    }

    public GetIndexResponseBody setLogReduceWhiteList(java.util.List<String> logReduceWhiteList) {
        this.logReduceWhiteList = logReduceWhiteList;
        return this;
    }
    public java.util.List<String> getLogReduceWhiteList() {
        return this.logReduceWhiteList;
    }

    public GetIndexResponseBody setMaxTextLen(Integer maxTextLen) {
        this.maxTextLen = maxTextLen;
        return this;
    }
    public Integer getMaxTextLen() {
        return this.maxTextLen;
    }

    public GetIndexResponseBody setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    public String getStorage() {
        return this.storage;
    }

    public GetIndexResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class GetIndexResponseBodyLine extends TeaModel {
        /**
         * <p>Indicates whether case sensitivity is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        /**
         * <p>Indicates whether Chinese characters are included. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("chn")
        public Boolean chn;

        /**
         * <p>The excluded fields.</p>
         */
        @NameInMap("exclude_keys")
        public java.util.List<String> excludeKeys;

        /**
         * <p>The included fields.</p>
         */
        @NameInMap("include_keys")
        public java.util.List<String> includeKeys;

        /**
         * <p>The delimiters.</p>
         */
        @NameInMap("token")
        public java.util.List<String> token;

        public static GetIndexResponseBodyLine build(java.util.Map<String, ?> map) throws Exception {
            GetIndexResponseBodyLine self = new GetIndexResponseBodyLine();
            return TeaModel.build(map, self);
        }

        public GetIndexResponseBodyLine setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        public GetIndexResponseBodyLine setChn(Boolean chn) {
            this.chn = chn;
            return this;
        }
        public Boolean getChn() {
            return this.chn;
        }

        public GetIndexResponseBodyLine setExcludeKeys(java.util.List<String> excludeKeys) {
            this.excludeKeys = excludeKeys;
            return this;
        }
        public java.util.List<String> getExcludeKeys() {
            return this.excludeKeys;
        }

        public GetIndexResponseBodyLine setIncludeKeys(java.util.List<String> includeKeys) {
            this.includeKeys = includeKeys;
            return this;
        }
        public java.util.List<String> getIncludeKeys() {
            return this.includeKeys;
        }

        public GetIndexResponseBodyLine setToken(java.util.List<String> token) {
            this.token = token;
            return this;
        }
        public java.util.List<String> getToken() {
            return this.token;
        }

    }

}
