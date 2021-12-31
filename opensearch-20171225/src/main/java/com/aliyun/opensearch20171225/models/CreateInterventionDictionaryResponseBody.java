// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateInterventionDictionaryResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("analyzer")
        public String analyzer;

        @NameInMap("created")
        public String created;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

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
