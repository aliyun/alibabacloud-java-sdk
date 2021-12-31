// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryNerResultsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("order")
        public Integer order;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tagLabel")
        public String tagLabel;

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
