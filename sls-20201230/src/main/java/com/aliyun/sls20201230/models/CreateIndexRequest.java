// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    /**
     * <p>The configuration of field indexes. A field index is a key-value pair in which the key specifies the name of the field and the value specifies the index configuration of the field. You must specify this parameter, the line parameter, or both parameters. For more information, see Example.</p>
     */
    @NameInMap("keys")
    public java.util.Map<String, KeysValue> keys;

    /**
     * <p>The configuration of full-text indexes. You must specify this parameter, the keys parameter, or both parameters. For more information, see Example.</p>
     */
    @NameInMap("line")
    public CreateIndexRequestLine line;

    /**
     * <p>Specifies whether to turn on LogReduce. After you turn on LogReduce, either the whitelist or blacklist takes effect.</p>
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
     * <p>The maximum length of a field value that can be retained. Default value: 2048. Unit: bytes. The default value is equal to 2 KB. You can change the value of max_text_len. Valid values: 64 to 16384.</p>
     */
    @NameInMap("max_text_len")
    public Integer maxTextLen;

    /**
     * <p>The retention period of logs. Unit: days. Valid values: 7, 30, and 90.</p>
     */
    @NameInMap("ttl")
    public Integer ttl;

    public static CreateIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexRequest self = new CreateIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexRequest setKeys(java.util.Map<String, KeysValue> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.Map<String, KeysValue> getKeys() {
        return this.keys;
    }

    public CreateIndexRequest setLine(CreateIndexRequestLine line) {
        this.line = line;
        return this;
    }
    public CreateIndexRequestLine getLine() {
        return this.line;
    }

    public CreateIndexRequest setLogReduce(Boolean logReduce) {
        this.logReduce = logReduce;
        return this;
    }
    public Boolean getLogReduce() {
        return this.logReduce;
    }

    public CreateIndexRequest setLogReduceBlackList(java.util.List<String> logReduceBlackList) {
        this.logReduceBlackList = logReduceBlackList;
        return this;
    }
    public java.util.List<String> getLogReduceBlackList() {
        return this.logReduceBlackList;
    }

    public CreateIndexRequest setLogReduceWhiteList(java.util.List<String> logReduceWhiteList) {
        this.logReduceWhiteList = logReduceWhiteList;
        return this;
    }
    public java.util.List<String> getLogReduceWhiteList() {
        return this.logReduceWhiteList;
    }

    public CreateIndexRequest setMaxTextLen(Integer maxTextLen) {
        this.maxTextLen = maxTextLen;
        return this;
    }
    public Integer getMaxTextLen() {
        return this.maxTextLen;
    }

    public CreateIndexRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class CreateIndexRequestLine extends TeaModel {
        /**
         * <p>Specifies whether to enable case sensitivity. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false (default)</p>
         */
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        /**
         * <p>Specifies whether to include Chinese characters. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false (default)</p>
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
         * <p>The delimiters. You can specify a delimiter to delimit the content of a field value. For more information about delimiters, see Example.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("token")
        public java.util.List<String> token;

        public static CreateIndexRequestLine build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexRequestLine self = new CreateIndexRequestLine();
            return TeaModel.build(map, self);
        }

        public CreateIndexRequestLine setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        public CreateIndexRequestLine setChn(Boolean chn) {
            this.chn = chn;
            return this;
        }
        public Boolean getChn() {
            return this.chn;
        }

        public CreateIndexRequestLine setExcludeKeys(java.util.List<String> excludeKeys) {
            this.excludeKeys = excludeKeys;
            return this;
        }
        public java.util.List<String> getExcludeKeys() {
            return this.excludeKeys;
        }

        public CreateIndexRequestLine setIncludeKeys(java.util.List<String> includeKeys) {
            this.includeKeys = includeKeys;
            return this;
        }
        public java.util.List<String> getIncludeKeys() {
            return this.includeKeys;
        }

        public CreateIndexRequestLine setToken(java.util.List<String> token) {
            this.token = token;
            return this;
        }
        public java.util.List<String> getToken() {
            return this.token;
        }

    }

}
