// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    @NameInMap("keys")
    public java.util.Map<String, KeysValue> keys;

    @NameInMap("line")
    public CreateIndexRequestLine line;

    @NameInMap("log_reduce")
    public Boolean logReduce;

    @NameInMap("log_reduce_black_list")
    public java.util.List<String> logReduceBlackList;

    @NameInMap("log_reduce_white_list")
    public java.util.List<String> logReduceWhiteList;

    @NameInMap("max_text_len")
    public Integer maxTextLen;

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
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        @NameInMap("chn")
        public Boolean chn;

        @NameInMap("exclude_keys")
        public java.util.List<String> excludeKeys;

        @NameInMap("include_keys")
        public java.util.List<String> includeKeys;

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
