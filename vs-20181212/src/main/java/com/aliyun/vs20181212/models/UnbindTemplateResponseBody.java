// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("TemplateId")
    public String templateId;

    public static UnbindTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindTemplateResponseBody self = new UnbindTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindTemplateResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindTemplateResponseBody setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public UnbindTemplateResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UnbindTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class BatchUnbindTemplateResponseBodyBindings extends TeaModel {
        @NameInMap("Error")
        public String error;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("TemplateId")
        public String templateId;

        public static BatchUnbindTemplateResponseBodyBindings build(java.util.Map<String, ?> map) throws Exception {
            BatchUnbindTemplateResponseBodyBindings self = new BatchUnbindTemplateResponseBodyBindings();
            return TeaModel.build(map, self);
        }

        public BatchUnbindTemplateResponseBodyBindings setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchUnbindTemplateResponseBodyBindings setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchUnbindTemplateResponseBodyBindings setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public BatchUnbindTemplateResponseBodyBindings setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
