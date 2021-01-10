// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveInterventionDictionaryResponseBody extends TeaModel {
    @NameInMap("result")
    public RemoveInterventionDictionaryResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static RemoveInterventionDictionaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveInterventionDictionaryResponseBody self = new RemoveInterventionDictionaryResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveInterventionDictionaryResponseBody setResult(RemoveInterventionDictionaryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public RemoveInterventionDictionaryResponseBodyResult getResult() {
        return this.result;
    }

    public RemoveInterventionDictionaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveInterventionDictionaryResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public String created;

        @NameInMap("type")
        public String type;

        @NameInMap("analyzer")
        public String analyzer;

        @NameInMap("updated")
        public String updated;

        @NameInMap("name")
        public String name;

        public static RemoveInterventionDictionaryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveInterventionDictionaryResponseBodyResult self = new RemoveInterventionDictionaryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RemoveInterventionDictionaryResponseBodyResult setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public RemoveInterventionDictionaryResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RemoveInterventionDictionaryResponseBodyResult setAnalyzer(String analyzer) {
            this.analyzer = analyzer;
            return this;
        }
        public String getAnalyzer() {
            return this.analyzer;
        }

        public RemoveInterventionDictionaryResponseBodyResult setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public RemoveInterventionDictionaryResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
