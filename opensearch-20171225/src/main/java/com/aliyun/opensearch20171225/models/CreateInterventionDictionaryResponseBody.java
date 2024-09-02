// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateInterventionDictionaryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>80326EFE-485F-46E7-B291-5A1DD08D2198</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public CreateInterventionDictionaryResponseBodyResult result;

    public static CreateInterventionDictionaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInterventionDictionaryResponseBody self = new CreateInterventionDictionaryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInterventionDictionaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInterventionDictionaryResponseBody setResult(CreateInterventionDictionaryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateInterventionDictionaryResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateInterventionDictionaryResponseBodyResult extends TeaModel {
        /**
         * <p>The custom analyzer.</p>
         * 
         * <strong>example:</strong>
         * <p>dianshang</p>
         */
        @NameInMap("analyzer")
        public String analyzer;

        /**
         * <p>The time when the test scenario was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1591086323</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The name of the test group.</p>
         * 
         * <strong>example:</strong>
         * <p>testb</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the intervention dictionary. Valid values:</p>
         * <ul>
         * <li>stopword: an intervention dictionary for stop word filtering</li>
         * <li>synonym: an intervention dictionary for synonym configuration</li>
         * <li>correction: an intervention dictionary for spelling correction</li>
         * <li>category_prediction: an intervention dictionary for category prediction</li>
         * <li>ner: an intervention dictionary for named entity recognition (NER)</li>
         * <li>term_weighting: an intervention dictionary for term weight analysis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ner</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the intervention dictionary was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1591086323</p>
         */
        @NameInMap("updated")
        public String updated;

        public static CreateInterventionDictionaryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateInterventionDictionaryResponseBodyResult self = new CreateInterventionDictionaryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateInterventionDictionaryResponseBodyResult setAnalyzer(String analyzer) {
            this.analyzer = analyzer;
            return this;
        }
        public String getAnalyzer() {
            return this.analyzer;
        }

        public CreateInterventionDictionaryResponseBodyResult setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public CreateInterventionDictionaryResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateInterventionDictionaryResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateInterventionDictionaryResponseBodyResult setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

}
