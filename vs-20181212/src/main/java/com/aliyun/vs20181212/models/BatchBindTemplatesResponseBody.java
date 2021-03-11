// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchBindTemplatesResponseBodyResults> results;

    public static BatchBindTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchBindTemplatesResponseBody self = new BatchBindTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchBindTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchBindTemplatesResponseBody setResults(java.util.List<BatchBindTemplatesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchBindTemplatesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchBindTemplatesResponseBodyResults extends TeaModel {
        @NameInMap("Error")
        public String error;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("TemplateId")
        public String templateId;

        public static BatchBindTemplatesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchBindTemplatesResponseBodyResults self = new BatchBindTemplatesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchBindTemplatesResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchBindTemplatesResponseBodyResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchBindTemplatesResponseBodyResults setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public BatchBindTemplatesResponseBodyResults setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
