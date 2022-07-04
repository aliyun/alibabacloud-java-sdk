// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateIndexRequest extends TeaModel {
    // 字段索引配置，key为字段名称，value为字段索引配置。
    @NameInMap("keys")
    public java.util.Map<String, KeysValue> keys;

    // 配置全文索引。
    @NameInMap("line")
    public UpdateIndexRequestLine line;

    // 开启日志聚类，开启后白名单与黑名单至多生效其中一个。
    @NameInMap("log_reduce")
    public Boolean logReduce;

    // 日志聚类的聚类字段黑名单
    @NameInMap("log_reduce_black_list")
    public java.util.List<String> logReduceBlackList;

    // 日志聚类的聚类字段白名单
    @NameInMap("log_reduce_white_list")
    public java.util.List<String> logReduceWhiteList;

    // 统计字段的最大长度
    @NameInMap("max_text_len")
    public Integer maxTextLen;

    // 保存时间，单位为天
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
        // 大小写敏感
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        // 包含中文
        @NameInMap("chn")
        public Boolean chn;

        // 排除的字段列表，不能与include_keys同时指定。
        @NameInMap("exclude_keys")
        public java.util.List<String> excludeKeys;

        // 包含的字段列表，不能与exclude_keys同时指定。
        @NameInMap("include_keys")
        public java.util.List<String> includeKeys;

        // 分词符列表。可以设置一个分词参数，指定这个字段按照哪一种方式分词。
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
