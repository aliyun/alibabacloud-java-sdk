// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryNerResultsResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<ListInterventionDictionaryNerResultsResponseBodyResult> result;

    @NameInMap("requestId")
    public String requestId;

    public static ListInterventionDictionaryNerResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionaryNerResultsResponseBody self = new ListInterventionDictionaryNerResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionaryNerResultsResponseBody setResult(java.util.List<ListInterventionDictionaryNerResultsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInterventionDictionaryNerResultsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListInterventionDictionaryNerResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInterventionDictionaryNerResultsResponseBodyResult extends TeaModel {
        @NameInMap("tagLabel")
        public String tagLabel;

        @NameInMap("tag")
        public String tag;

        @NameInMap("token")
        public String token;

        @NameInMap("order")
        public Integer order;

        public static ListInterventionDictionaryNerResultsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInterventionDictionaryNerResultsResponseBodyResult self = new ListInterventionDictionaryNerResultsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInterventionDictionaryNerResultsResponseBodyResult setTagLabel(String tagLabel) {
            this.tagLabel = tagLabel;
            return this;
        }
        public String getTagLabel() {
            return this.tagLabel;
        }

        public ListInterventionDictionaryNerResultsResponseBodyResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListInterventionDictionaryNerResultsResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListInterventionDictionaryNerResultsResponseBodyResult setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

    }

}
