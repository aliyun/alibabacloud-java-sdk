// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryNerResultsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The NER result.</p>
     * <br>
     * <p>For more information, see [InterventionDictionaryEntry](~~173606~~).</p>
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
