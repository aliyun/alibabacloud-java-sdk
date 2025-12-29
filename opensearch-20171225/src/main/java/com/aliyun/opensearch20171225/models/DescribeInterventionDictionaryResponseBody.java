// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeInterventionDictionaryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7CCF454-472A-030E-F254-604520B028AA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details about the intervention dictionary.</p>
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
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("analyzer")
        public String analyzer;

        /**
         * <p>The time when the the intervention dictionary was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1536233287</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The name of the the intervention dictionary.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Type</p>
         * <ul>
         * <li>stopword: an intervention dictionary for stop word filtering.</li>
         * <li>synonym: an intervention dictionary for synonym configuration.</li>
         * <li>correction: an intervention dictionary for spelling correction.</li>
         * <li>category_prediction: an intervention dictionary for category prediction.</li>
         * <li>ner: an intervention dictionary for named entity recognition.</li>
         * <li>term_weighting: an intervention dictionary for term weight analysis.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>category_prediction</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the the intervention dictionary was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1536233287</p>
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
