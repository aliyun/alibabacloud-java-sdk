// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateInterventionDictionaryResponseBody extends TeaModel {
    /**
     * <p>The type of the intervention dictionary. Valid values:</p>
     * <br>
     * <p>*   stopword: an intervention dictionary for stop word filtering</p>
     * <p>*   synonym: an intervention dictionary for synonym configuration</p>
     * <p>*   correction: an intervention dictionary for spelling correction</p>
     * <p>*   category_prediction: an intervention dictionary for category prediction</p>
     * <p>*   ner: an intervention dictionary for named entity recognition (NER)</p>
     * <p>*   term_weighting: an intervention dictionary for term weight analysis</p>
     * <p>*   suggest_allowlist: a drop-down suggestion whitelist</p>
     * <p>*   suggest_denylist: a drop-down suggestion blacklist</p>
     * <p>*   hot_allowlist: a top search whitelist</p>
     * <p>*   hot_denylist: a top search blacklist</p>
     * <p>*   hint_allowlist: a shading whitelist</p>
     * <p>*   hint_denylist: a shading blacklist</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the request.</p>
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
         * <p>Creates an intervention dictionary.</p>
         */
        @NameInMap("analyzer")
        public String analyzer;

        /**
         * <p>The name of the intervention dictionary.</p>
         */
        @NameInMap("created")
        public String created;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        /**
         * <p>CreateInterventionDictionary</p>
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
