// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryEntriesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about each intervention entry.</p>
     * <br>
     * <p>For more information, see [InterventionDictionaryEntry](~~173606~~).</p>
     */
    @NameInMap("result")
    public java.util.List<ListInterventionDictionaryEntriesResponseBodyResult> result;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The sequence number.</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The internal name of the identified entity type. Valid values:</p>
         * <br>
         * <p>*   brand</p>
         * <p>*   category</p>
         * <p>*   material</p>
         * <p>*   element</p>
         * <p>*   style</p>
         * <p>*   color</p>
         * <p>*   function</p>
         * <p>*   scenario</p>
         * <p>*   people</p>
         * <p>*   season</p>
         * <p>*   model</p>
         * <p>*   region</p>
         * <p>*   name</p>
         * <p>*   adjective</p>
         * <p>*   category-modifier</p>
         * <p>*   size</p>
         * <p>*   quality</p>
         * <p>*   suit</p>
         * <p>*   new-release</p>
         * <p>*   series</p>
         * <p>*   marketing</p>
         * <p>*   entertainment</p>
         * <p>*   organization</p>
         * <p>*   movie</p>
         * <p>*   game</p>
         * <p>*   number</p>
         * <p>*   unit</p>
         * <p>*   common</p>
         * <p>*   new-word</p>
         * <p>*   proper-noun</p>
         * <p>*   symbol</p>
         * <p>*   prefix</p>
         * <p>*   suffix</p>
         * <p>*   gift</p>
         * <p>*   negative</p>
         * <p>*   agent</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The description of the internal name of the identified entity type.</p>
         */
        @NameInMap("tagLabel")
        public String tagLabel;

        /**
         * <p>The entity.</p>
         */
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
        /**
         * <p>The action. Valid values:</p>
         * <br>
         * <p>*   add</p>
         * <p>*   delete</p>
         */
        @NameInMap("cmd")
        public String cmd;

        /**
         * <p>The timestamp when the intervention entry was created.</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p>The content of an intervention entry for category prediction.</p>
         * <br>
         * <p>The parameter returns key-value pairs. The key in a key-value pair indicates the ID of the category. The value in a key-value pair indicates the relevance value of the category. A value of 0 indicates irrelevant. A value of 1 indicates slightly relevant. A value of 2 indicates relevant.</p>
         * <br>
         * <p>Example: {"2":1, "100":0}</p>
         */
        @NameInMap("relevance")
        public java.util.Map<String, ?> relevance;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * <br>
         * <p>*   ACTIVE: The intervention entry takes effect.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The content of an intervention entry for term weight analysis.</p>
         */
        @NameInMap("tokens")
        public java.util.List<ListInterventionDictionaryEntriesResponseBodyResultTokens> tokens;

        /**
         * <p>The timestamp when the intervention entry was last updated.</p>
         */
        @NameInMap("updated")
        public Long updated;

        /**
         * <p>The intervention query in the intervention entry.</p>
         */
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
