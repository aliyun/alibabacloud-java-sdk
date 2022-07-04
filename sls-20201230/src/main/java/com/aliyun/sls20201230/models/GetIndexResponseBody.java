// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetIndexResponseBody extends TeaModel {
    // 索引模式
    @NameInMap("index_mode")
    public String indexMode;

    // 字段索引配置。key为字段名称，value为索引配置。
    @NameInMap("keys")
    public java.util.Map<String, KeysValue> keys;

    // 上次修改时间
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    // 配置全文索引。
    @NameInMap("line")
    public GetIndexResponseBodyLine line;

    // 是否开启日志聚类.
    @NameInMap("log_reduce")
    public Boolean logReduce;

    // 日志聚类的聚类字段过滤黑名单，仅当日志聚类开启时有效。
    @NameInMap("log_reduce_black_list")
    public java.util.List<String> logReduceBlackList;

    // 日志聚类的聚类字段过滤白名单，仅当日志聚类开启时有效。
    @NameInMap("log_reduce_white_list")
    public java.util.List<String> logReduceWhiteList;

    // 日志服务默认字段值的最大长度为2048字节，即2 KB。如果您需要修改字段值的最大长度，可设置统计字段（text）最大长度，取值范围为64~16384字节。
    @NameInMap("max_text_len")
    public Integer maxTextLen;

    // 存储类型，目前固定取值为pg。
    @NameInMap("storage")
    public String storage;

    // 索引文件生命周期，支持7天、30天、90天。
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
        // 大小写敏感
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        // 是否包含中文。
        @NameInMap("chn")
        public Boolean chn;

        // 排除的字段列表。
        @NameInMap("exclude_keys")
        public java.util.List<String> excludeKeys;

        // 包含的字段列表。
        @NameInMap("include_keys")
        public java.util.List<String> includeKeys;

        // 分词符列表。
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
