// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Index extends TeaModel {
    /**
     * <p>The configurations of field indexes. A field index is a key-value pair in which the key specifies the name of the field and the value specifies the index configuration of the field. You must specify at least one of the following parameters: line and keys.</p>
     */
    @NameInMap("keys")
    public java.util.Map<String, IndexKey> keys;

    /**
     * <p>The configurations of full-text indexes. You must specify at least one of the following parameters: line and keys.</p>
     */
    @NameInMap("line")
    public IndexLine line;

    /**
     * <p>Specifies whether to enable the LogReduce feature. After you enable the LogReduce feature, either the whitelist or blacklist takes effect. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("log_reduce")
    public Boolean logReduce;

    /**
     * <p>The blacklist of fields that are used to cluster logs. This parameter takes effect only when the LogReduce feature is enabled.</p>
     */
    @NameInMap("log_reduce_black_list")
    public java.util.List<String> logReduceBlackList;

    /**
     * <p>The whitelist of fields that are used to cluster logs. This parameter takes effect only when the LogReduce feature is enabled.</p>
     */
    @NameInMap("log_reduce_white_list")
    public java.util.List<String> logReduceWhiteList;

    /**
     * <p>The maximum length of a field value that can be retained. Default value: 2048. Unit: bytes. The default value is equal to 2 KB. You can change the value of this parameter. Valid values: 64 to 16384.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("max_text_len")
    public Integer maxTextLen;

    /**
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
         * <p>Specifies whether to enable case sensitivity. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        /**
         * <p>Specifies whether the field contains Chinese characters. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("chn")
        public Boolean chn;

        /**
         * <p>The excluded fields. You cannot specify both include_keys and exclude_keys.</p>
         */
        @NameInMap("exclude_keys")
        public java.util.List<String> excludeKeys;

        /**
         * <p>The included fields. You cannot specify both include_keys and exclude_keys.</p>
         */
        @NameInMap("include_keys")
        public java.util.List<String> includeKeys;

        /**
         * <p>The delimiters. You can specify a delimiter to delimit the content of a field value.</p>
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
