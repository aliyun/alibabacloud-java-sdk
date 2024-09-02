// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryNerResultsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8F780CA8-D4D4-2FFE-B8AC-42040822C554</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The NER result.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173606.html">InterventionDictionaryEntry</a>.</p>
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
         * <p>eaa73f35-007a-4be7-88c7-37dca4a04ab7</p>
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
