// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryEntriesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListInterventionDictionaryEntriesResponseBodyResult> result;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListInterventionDictionaryEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionaryEntriesResponseBody self = new ListInterventionDictionaryEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionaryEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInterventionDictionaryEntriesResponseBody setResult(java.util.List<ListInterventionDictionaryEntriesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInterventionDictionaryEntriesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListInterventionDictionaryEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInterventionDictionaryEntriesResponseBodyResultTokens extends TeaModel {
        @NameInMap("order")
        public Integer order;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tagLabel")
        public String tagLabel;

        @NameInMap("token")
        public String token;

        public static ListInterventionDictionaryEntriesResponseBodyResultTokens build(java.util.Map<String, ?> map) throws Exception {
            ListInterventionDictionaryEntriesResponseBodyResultTokens self = new ListInterventionDictionaryEntriesResponseBodyResultTokens();
            return TeaModel.build(map, self);
        }

        public ListInterventionDictionaryEntriesResponseBodyResultTokens setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ListInterventionDictionaryEntriesResponseBodyResultTokens setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListInterventionDictionaryEntriesResponseBodyResultTokens setTagLabel(String tagLabel) {
            this.tagLabel = tagLabel;
            return this;
        }
        public String getTagLabel() {
            return this.tagLabel;
        }

        public ListInterventionDictionaryEntriesResponseBodyResultTokens setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class ListInterventionDictionaryEntriesResponseBodyResult extends TeaModel {
        @NameInMap("cmd")
        public String cmd;

        @NameInMap("created")
        public Long created;

        @NameInMap("relevance")
        public java.util.Map<String, ?> relevance;

        @NameInMap("status")
        public String status;

        @NameInMap("tokens")
        public java.util.List<ListInterventionDictionaryEntriesResponseBodyResultTokens> tokens;

        @NameInMap("updated")
        public Long updated;

        @NameInMap("word")
        public String word;

        public static ListInterventionDictionaryEntriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInterventionDictionaryEntriesResponseBodyResult self = new ListInterventionDictionaryEntriesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInterventionDictionaryEntriesResponseBodyResult setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public ListInterventionDictionaryEntriesResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListInterventionDictionaryEntriesResponseBodyResult setRelevance(java.util.Map<String, ?> relevance) {
            this.relevance = relevance;
            return this;
        }
        public java.util.Map<String, ?> getRelevance() {
            return this.relevance;
        }

        public ListInterventionDictionaryEntriesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInterventionDictionaryEntriesResponseBodyResult setTokens(java.util.List<ListInterventionDictionaryEntriesResponseBodyResultTokens> tokens) {
            this.tokens = tokens;
            return this;
        }
        public java.util.List<ListInterventionDictionaryEntriesResponseBodyResultTokens> getTokens() {
            return this.tokens;
        }

        public ListInterventionDictionaryEntriesResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

        public ListInterventionDictionaryEntriesResponseBodyResult setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

}
