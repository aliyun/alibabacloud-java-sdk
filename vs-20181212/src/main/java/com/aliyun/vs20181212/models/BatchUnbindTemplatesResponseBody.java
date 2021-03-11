// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchUnbindTemplatesResponseBodyResults> results;

    public static BatchUnbindTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindTemplatesResponseBody self = new BatchUnbindTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUnbindTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUnbindTemplatesResponseBody setResults(java.util.List<BatchUnbindTemplatesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchUnbindTemplatesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchUnbindTemplatesResponseBodyResults extends TeaModel {
        @NameInMap("Error")
        public String error;

        @NameInMap("TemplateType")
        public String templateType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("TemplateId")
        public String templateId;

        public static BatchUnbindTemplatesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchUnbindTemplatesResponseBodyResults self = new BatchUnbindTemplatesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchUnbindTemplatesResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchUnbindTemplatesResponseBodyResults setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public BatchUnbindTemplatesResponseBodyResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchUnbindTemplatesResponseBodyResults setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public BatchUnbindTemplatesResponseBodyResults setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
