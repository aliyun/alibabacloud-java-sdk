// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeInterventionDictionaryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information the intervention dictionary.</p>
     */
    @NameInMap("result")
    public DescribeInterventionDictionaryResponseBodyResult result;

    public static DescribeInterventionDictionaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterventionDictionaryResponseBody self = new DescribeInterventionDictionaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInterventionDictionaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInterventionDictionaryResponseBody setResult(DescribeInterventionDictionaryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeInterventionDictionaryResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeInterventionDictionaryResponseBodyResult extends TeaModel {
        /**
         * <p>The custom analyzer.</p>
         */
        @NameInMap("analyzer")
        public String analyzer;

        /**
         * <p>The time when the intervention dictionary was created.</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The name of the intervention dictionary.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the intervention dictionary. Valid values:</p>
         * <br>
         * <p>*   stopword: an intervention dictionary for stop word filtering</p>
         * <p>*   synonym: an intervention dictionary for synonym configuration</p>
         * <p>*   correction: an intervention dictionary for spelling correction</p>
         * <p>*   category_prediction: an intervention dictionary for category prediction</p>
         * <p>*   ner: an intervention dictionary for named entity recognition (NER)</p>
         * <p>*   term_weighting: an intervention dictionary for term weight analysis</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the intervention dictionary was last updated.</p>
         */
        @NameInMap("updated")
        public String updated;

        public static DescribeInterventionDictionaryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInterventionDictionaryResponseBodyResult self = new DescribeInterventionDictionaryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeInterventionDictionaryResponseBodyResult setAnalyzer(String analyzer) {
            this.analyzer = analyzer;
            return this;
        }
        public String getAnalyzer() {
            return this.analyzer;
        }

        public DescribeInterventionDictionaryResponseBodyResult setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeInterventionDictionaryResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInterventionDictionaryResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeInterventionDictionaryResponseBodyResult setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

}
