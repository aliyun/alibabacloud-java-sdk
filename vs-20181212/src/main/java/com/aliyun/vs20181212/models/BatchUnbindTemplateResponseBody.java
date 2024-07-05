// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindTemplateResponseBody extends TeaModel {
    @NameInMap("Bindings")
    public java.util.List<BatchUnbindTemplateResponseBodyBindings> bindings;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchUnbindTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindTemplateResponseBody self = new BatchUnbindTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUnbindTemplateResponseBody setBindings(java.util.List<BatchUnbindTemplateResponseBodyBindings> bindings) {
        this.bindings = bindings;
        return this;
    }
    public java.util.List<BatchUnbindTemplateResponseBodyBindings> getBindings() {
        return this.bindings;
    }

    public BatchUnbindTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchUnbindTemplateResponseBodyBindings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>some error</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <strong>example:</strong>
         * <p>323*****994-cn-qingdao</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>323*****998-cn-qingdao</p>
         */
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
