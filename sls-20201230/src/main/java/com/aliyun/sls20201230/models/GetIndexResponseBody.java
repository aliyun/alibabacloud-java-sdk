// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetIndexResponseBody extends TeaModel {
    @NameInMap("index_mode")
    public String indexMode;

    @NameInMap("keys")
    public java.util.Map<String, KeysValue> keys;

    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    @NameInMap("line")
    public GetIndexResponseBodyLine line;

    @NameInMap("log_reduce")
    public Boolean logReduce;

    @NameInMap("log_reduce_black_list")
    public java.util.List<String> logReduceBlackList;

    @NameInMap("log_reduce_white_list")
    public java.util.List<String> logReduceWhiteList;

    @NameInMap("max_text_len")
    public Integer maxTextLen;

    @NameInMap("storage")
    public String storage;

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
