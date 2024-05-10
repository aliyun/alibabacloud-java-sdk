// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateIndexRequest extends TeaModel {
    /**
     * <p>The configuration of field indexes. A field index is a key-value pair in which the key specifies the name of the field and the value specifies the index configuration of the field.</p>
     */
    @NameInMap("keys")
    public java.util.Map<String, KeysValue> keys;

    /**
     * <p>The configuration of full-text indexes.</p>
     */
    @NameInMap("line")
    public UpdateIndexRequestLine line;

    /**
     * <p>Specifies whether to turn on LogReduce. If you turn on LogReduce, only one of `log_reduce_white_list` and `log_reduce_black_list` takes effect.</p>
     */
    @NameInMap("log_reduce")
    public Boolean logReduce;

    /**
     * <p>The fields in the blacklist that you want to use to cluster logs.</p>
     */
    @NameInMap("log_reduce_black_list")
    public java.util.List<String> logReduceBlackList;

    /**
     * <p>The fields in the whitelist that you want to use to cluster logs.</p>
     */
    @NameInMap("log_reduce_white_list")
    public java.util.List<String> logReduceWhiteList;

    /**
     * <p>The maximum length of a field value that can be retained.</p>
     */
    @NameInMap("max_text_len")
    public Integer maxTextLen;

    /**
     * <p>The retention period of data. Unit: days. Valid values: 7, 30, and 90.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ttl")
    public Integer ttl;

    public static UpdateIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIndexRequest self = new UpdateIndexRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIndexRequest setKeys(java.util.Map<String, KeysValue> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.Map<String, KeysValue> getKeys() {
        return this.keys;
    }

    public UpdateIndexRequest setLine(UpdateIndexRequestLine line) {
        this.line = line;
        return this;
    }
    public UpdateIndexRequestLine getLine() {
        return this.line;
    }

    public UpdateIndexRequest setLogReduce(Boolean logReduce) {
        this.logReduce = logReduce;
        return this;
    }
    public Boolean getLogReduce() {
        return this.logReduce;
    }

    public UpdateIndexRequest setLogReduceBlackList(java.util.List<String> logReduceBlackList) {
        this.logReduceBlackList = logReduceBlackList;
        return this;
    }
    public java.util.List<String> getLogReduceBlackList() {
        return this.logReduceBlackList;
    }

    public UpdateIndexRequest setLogReduceWhiteList(java.util.List<String> logReduceWhiteList) {
        this.logReduceWhiteList = logReduceWhiteList;
        return this;
    }
    public java.util.List<String> getLogReduceWhiteList() {
        return this.logReduceWhiteList;
    }

    public UpdateIndexRequest setMaxTextLen(Integer maxTextLen) {
        this.maxTextLen = maxTextLen;
        return this;
    }
    public Integer getMaxTextLen() {
        return this.maxTextLen;
    }

    public UpdateIndexRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class UpdateIndexRequestLine extends TeaModel {
        /**
         * <p>Specifies whether to enable case sensitivity. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        /**
         * <p>Specifies whether to include Chinese characters. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>This parameter is required.</p>
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
         * <p>The delimiters that are used to split text.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("token")
        public java.util.List<String> token;

        public static UpdateIndexRequestLine build(java.util.Map<String, ?> map) throws Exception {
            UpdateIndexRequestLine self = new UpdateIndexRequestLine();
            return TeaModel.build(map, self);
        }

        public UpdateIndexRequestLine setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        public UpdateIndexRequestLine setChn(Boolean chn) {
            this.chn = chn;
            return this;
        }
        public Boolean getChn() {
            return this.chn;
        }

        public UpdateIndexRequestLine setExcludeKeys(java.util.List<String> excludeKeys) {
            this.excludeKeys = excludeKeys;
            return this;
        }
        public java.util.List<String> getExcludeKeys() {
            return this.excludeKeys;
        }

        public UpdateIndexRequestLine setIncludeKeys(java.util.List<String> includeKeys) {
            this.includeKeys = includeKeys;
            return this;
        }
        public java.util.List<String> getIncludeKeys() {
            return this.includeKeys;
        }

        public UpdateIndexRequestLine setToken(java.util.List<String> token) {
            this.token = token;
            return this;
        }
        public java.util.List<String> getToken() {
            return this.token;
        }

    }

}
