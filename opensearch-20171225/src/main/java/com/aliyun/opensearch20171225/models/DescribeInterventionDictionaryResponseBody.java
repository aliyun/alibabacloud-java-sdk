// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeInterventionDictionaryResponseBody extends TeaModel {
    @NameInMap("result")
    public DescribeInterventionDictionaryResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeInterventionDictionaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterventionDictionaryResponseBody self = new DescribeInterventionDictionaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInterventionDictionaryResponseBody setResult(DescribeInterventionDictionaryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeInterventionDictionaryResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeInterventionDictionaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInterventionDictionaryResponseBodyResult extends TeaModel {
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

        public static DescribeInterventionDictionaryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInterventionDictionaryResponseBodyResult self = new DescribeInterventionDictionaryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeInterventionDictionaryResponseBodyResult setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeInterventionDictionaryResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeInterventionDictionaryResponseBodyResult setAnalyzer(String analyzer) {
            this.analyzer = analyzer;
            return this;
        }
        public String getAnalyzer() {
            return this.analyzer;
        }

        public DescribeInterventionDictionaryResponseBodyResult setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public DescribeInterventionDictionaryResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
