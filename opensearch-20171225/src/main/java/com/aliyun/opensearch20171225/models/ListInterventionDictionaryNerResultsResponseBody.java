// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryNerResultsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F780CA8-D4D4-2FFE-B8AC-42040822C554</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The NER results.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173606.html">Named Entity Recognition (NER)</a>.</p>
     */
    @NameInMap("result")
    public java.util.List<ListInterventionDictionaryNerResultsResponseBodyResult> result;

    public static ListInterventionDictionaryNerResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionaryNerResultsResponseBody self = new ListInterventionDictionaryNerResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionaryNerResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInterventionDictionaryNerResultsResponseBody setResult(java.util.List<ListInterventionDictionaryNerResultsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInterventionDictionaryNerResultsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListInterventionDictionaryNerResultsResponseBodyResult extends TeaModel {
        /**
         * <p>The ordinal number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The tag of the detected entity.</p>
         * <ul>
         * <li><p>brand: Brand</p>
         * </li>
         * <li><p>category: Category</p>
         * </li>
         * <li><p>material: Material</p>
         * </li>
         * <li><p>element: Element</p>
         * </li>
         * <li><p>style: Style</p>
         * </li>
         * <li><p>color: Color</p>
         * </li>
         * <li><p>function: Function</p>
         * </li>
         * <li><p>scenario: Scenario</p>
         * </li>
         * <li><p>people: People</p>
         * </li>
         * <li><p>season: Season</p>
         * </li>
         * <li><p>model: Model</p>
         * </li>
         * <li><p>region: Region</p>
         * </li>
         * <li><p>name: Name</p>
         * </li>
         * <li><p>adjective: Adjective</p>
         * </li>
         * <li><p>category-modifier: Category modifier</p>
         * </li>
         * <li><p>size: Size</p>
         * </li>
         * <li><p>quality: Quality</p>
         * </li>
         * <li><p>suit: Suit</p>
         * </li>
         * <li><p>new-release: New release</p>
         * </li>
         * <li><p>series: Series</p>
         * </li>
         * <li><p>marketing: Marketing</p>
         * </li>
         * <li><p>entertainment: Entertainment</p>
         * </li>
         * <li><p>organization: Organization</p>
         * </li>
         * <li><p>movie: Movie</p>
         * </li>
         * <li><p>game: Game</p>
         * </li>
         * <li><p>number: Number</p>
         * </li>
         * <li><p>unit: Unit</p>
         * </li>
         * <li><p>common: Common word</p>
         * </li>
         * <li><p>new-word: New word</p>
         * </li>
         * <li><p>proper-noun: Proper noun</p>
         * </li>
         * <li><p>symbol: Symbol</p>
         * </li>
         * <li><p>prefix: Prefix</p>
         * </li>
         * <li><p>suffix: Suffix</p>
         * </li>
         * <li><p>gift: Gift</p>
         * </li>
         * <li><p>negative: Negative</p>
         * </li>
         * <li><p>agent: Agent</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>category</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The label of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>品类</p>
         */
        @NameInMap("tagLabel")
        public String tagLabel;

        /**
         * <p>The detected entity.</p>
         * 
         * <strong>example:</strong>
         * <p>milk</p>
         */
        @NameInMap("token")
        public String token;

        public static ListInterventionDictionaryNerResultsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInterventionDictionaryNerResultsResponseBodyResult self = new ListInterventionDictionaryNerResultsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInterventionDictionaryNerResultsResponseBodyResult setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ListInterventionDictionaryNerResultsResponseBodyResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListInterventionDictionaryNerResultsResponseBodyResult setTagLabel(String tagLabel) {
            this.tagLabel = tagLabel;
            return this;
        }
        public String getTagLabel() {
            return this.tagLabel;
        }

        public ListInterventionDictionaryNerResultsResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
