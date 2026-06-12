// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Index extends TeaModel {
    /**
     * <p>The field index configuration. The key is the field name and the value is the index configuration for the field. You must specify either this parameter or the \<code>line\\</code> parameter.</p>
     */
    @NameInMap("keys")
    public java.util.Map<String, IndexKey> keys;

    /**
     * <p>The full-text index configuration. You must specify either this parameter or the \<code>keys\\</code> parameter.</p>
     */
    @NameInMap("line")
    public IndexLine line;

    /**
     * <p>Specifies whether to enable log clustering. If enabled, either the whitelist or the blacklist can be active, but not both.</p>
     * <ul>
     * <li><p>true: Enable log clustering.</p>
     * </li>
     * <li><p>false (default): Do not enable log clustering.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("log_reduce")
    public Boolean logReduce;

    /**
     * <p>The blacklist of fields for log clustering. This parameter is valid only when log clustering is enabled.</p>
     */
    @NameInMap("log_reduce_black_list")
    public java.util.List<String> logReduceBlackList;

    /**
     * <p>The whitelist of fields for log clustering. This parameter is valid only when log clustering is enabled.</p>
     */
    @NameInMap("log_reduce_white_list")
    public java.util.List<String> logReduceWhiteList;

    /**
     * <p>The default maximum length of a field value in Simple Log Service is 2,048 bytes (2 KB). To change this limit, set the maximum length for a text field. The value must be between 64 and 16,384 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("max_text_len")
    public Integer maxTextLen;

    /**
     * <p>Specifies whether to enable the scan index.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("scan_index")
    public Boolean scanIndex;

    public static Index build(java.util.Map<String, ?> map) throws Exception {
        Index self = new Index();
        return TeaModel.build(map, self);
    }

    public Index setKeys(java.util.Map<String, IndexKey> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.Map<String, IndexKey> getKeys() {
        return this.keys;
    }

    public Index setLine(IndexLine line) {
        this.line = line;
        return this;
    }
    public IndexLine getLine() {
        return this.line;
    }

    public Index setLogReduce(Boolean logReduce) {
        this.logReduce = logReduce;
        return this;
    }
    public Boolean getLogReduce() {
        return this.logReduce;
    }

    public Index setLogReduceBlackList(java.util.List<String> logReduceBlackList) {
        this.logReduceBlackList = logReduceBlackList;
        return this;
    }
    public java.util.List<String> getLogReduceBlackList() {
        return this.logReduceBlackList;
    }

    public Index setLogReduceWhiteList(java.util.List<String> logReduceWhiteList) {
        this.logReduceWhiteList = logReduceWhiteList;
        return this;
    }
    public java.util.List<String> getLogReduceWhiteList() {
        return this.logReduceWhiteList;
    }

    public Index setMaxTextLen(Integer maxTextLen) {
        this.maxTextLen = maxTextLen;
        return this;
    }
    public Integer getMaxTextLen() {
        return this.maxTextLen;
    }

    public Index setScanIndex(Boolean scanIndex) {
        this.scanIndex = scanIndex;
        return this;
    }
    public Boolean getScanIndex() {
        return this.scanIndex;
    }

    public static class IndexLine extends TeaModel {
        /**
         * <p>Specifies whether the index is case-sensitive.</p>
         * <ul>
         * <li><p>true: The index is case-sensitive.</p>
         * </li>
         * <li><p>false (default): The index is not case-sensitive.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        /**
         * <p>Specifies whether the logs contain Chinese characters.</p>
         * <ul>
         * <li><p>true: The logs contain Chinese characters.</p>
         * </li>
         * <li><p>false (default): The logs do not contain Chinese characters.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("chn")
        public Boolean chn;

        /**
         * <p>The list of fields to exclude from the full-text index. This parameter cannot be specified at the same time as \<code>include_keys\\</code>.</p>
         */
        @NameInMap("exclude_keys")
        public java.util.List<String> excludeKeys;

        /**
         * <p>The list of fields to include in the full-text index. This parameter cannot be specified at the same time as \<code>exclude_keys\\</code>.</p>
         */
        @NameInMap("include_keys")
        public java.util.List<String> includeKeys;

        /**
         * <p>The list of delimiters for tokenization. This parameter specifies how the field is tokenized.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("token")
        public java.util.List<String> token;

        public static IndexLine build(java.util.Map<String, ?> map) throws Exception {
            IndexLine self = new IndexLine();
            return TeaModel.build(map, self);
        }

        public IndexLine setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        public IndexLine setChn(Boolean chn) {
            this.chn = chn;
            return this;
        }
        public Boolean getChn() {
            return this.chn;
        }

        public IndexLine setExcludeKeys(java.util.List<String> excludeKeys) {
            this.excludeKeys = excludeKeys;
            return this;
        }
        public java.util.List<String> getExcludeKeys() {
            return this.excludeKeys;
        }

        public IndexLine setIncludeKeys(java.util.List<String> includeKeys) {
            this.includeKeys = includeKeys;
            return this;
        }
        public java.util.List<String> getIncludeKeys() {
            return this.includeKeys;
        }

        public IndexLine setToken(java.util.List<String> token) {
            this.token = token;
            return this;
        }
        public java.util.List<String> getToken() {
            return this.token;
        }

    }

}
