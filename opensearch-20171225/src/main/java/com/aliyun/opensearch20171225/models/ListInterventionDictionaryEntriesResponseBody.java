// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryEntriesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>516A02B7-2167-8D92-12D0-B639A2A0F3C5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about intervention entries.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173606.html">InterventionDictionaryEntry</a>.</p>
     */
    @NameInMap("result")
    public java.util.List<ListInterventionDictionaryEntriesResponseBodyResult> result;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The internal name of the identified entity type. Valid values:</p>
         * <ul>
         * <li>brand</li>
         * <li>category</li>
         * <li>material</li>
         * <li>element</li>
         * <li>style</li>
         * <li>color</li>
         * <li>function</li>
         * <li>scenario</li>
         * <li>people</li>
         * <li>season</li>
         * <li>model</li>
         * <li>region</li>
         * <li>name</li>
         * <li>adjective</li>
         * <li>category-modifier</li>
         * <li>size</li>
         * <li>quality</li>
         * <li>suit</li>
         * <li>new-release</li>
         * <li>series</li>
         * <li>marketing</li>
         * <li>entertainment</li>
         * <li>organization</li>
         * <li>movie</li>
         * <li>game</li>
         * <li>number</li>
         * <li>unit</li>
         * <li>common</li>
         * <li>new-word</li>
         * <li>proper-noun</li>
         * <li>symbol</li>
         * <li>prefix</li>
         * <li>suffix</li>
         * <li>gift</li>
         * <li>negative</li>
         * <li>agent</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>category</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The description of the internal name of the identified entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>category</p>
         */
        @NameInMap("tagLabel")
        public String tagLabel;

        /**
         * <p>The entity.</p>
         * 
         * <strong>example:</strong>
         * <p>category</p>
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
         * <p>The command. Valid values:</p>
         * <ul>
         * <li>add</li>
         * <li>delete</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("cmd")
        public String cmd;

        /**
         * <p>The timestamp when the intervention entry was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1536690285</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p>The content of an intervention entry for category prediction. The field value consists of key-value pairs. The key in a key-value pair indicates the ID of the category. The value in a key-value pair indicates the relevance to the category. A value of 0 indicates irrelevant. A value of 1 indicates slightly relevant. A value of 2 indicates relevant. Example: {&quot;2&quot;:1, &quot;100&quot;:0}</p>
         * 
         * <strong>example:</strong>
         * <p>{                 &quot;100&quot;: &quot;0&quot;,                 &quot;200&quot;: &quot;2&quot;             }</p>
         */
        @NameInMap("relevance")
        public java.util.Map<String, ?> relevance;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * <ul>
         * <li>ACTIVE: The intervention entry takes effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The content of the intervention entry for term weight analysis.</p>
         */
        @NameInMap("tokens")
        public java.util.List<ListInterventionDictionaryEntriesResponseBodyResultTokens> tokens;

        /**
         * <p>The timestamp when the intervention entry was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1537348987</p>
         */
        @NameInMap("updated")
        public Long updated;

        /**
         * <p>The intervention entry.</p>
         * 
         * <strong>example:</strong>
         * <p>\u8fc7\u513f</p>
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
