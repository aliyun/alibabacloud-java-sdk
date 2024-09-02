// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Index extends TeaModel {
    @NameInMap("keys")
    public java.util.Map<String, IndexKey> keys;

    @NameInMap("line")
    public IndexLine line;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("log_reduce")
    public Boolean logReduce;

    @NameInMap("log_reduce_black_list")
    public java.util.List<String> logReduceBlackList;

    @NameInMap("log_reduce_white_list")
    public java.util.List<String> logReduceWhiteList;

    /**
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("max_text_len")
    public Integer maxTextLen;

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

    public static class IndexLine extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("chn")
        public Boolean chn;

        @NameInMap("exclude_keys")
        public java.util.List<String> excludeKeys;

        @NameInMap("include_keys")
        public java.util.List<String> includeKeys;

        /**
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
