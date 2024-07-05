// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindTemplateResponseBody extends TeaModel {
    @NameInMap("Bindings")
    public java.util.List<BatchBindTemplateResponseBodyBindings> bindings;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchBindTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchBindTemplateResponseBody self = new BatchBindTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchBindTemplateResponseBody setBindings(java.util.List<BatchBindTemplateResponseBodyBindings> bindings) {
        this.bindings = bindings;
        return this;
    }
    public java.util.List<BatchBindTemplateResponseBodyBindings> getBindings() {
        return this.bindings;
    }

    public BatchBindTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchBindTemplateResponseBodyBindings extends TeaModel {
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

        public static BatchBindTemplateResponseBodyBindings build(java.util.Map<String, ?> map) throws Exception {
            BatchBindTemplateResponseBodyBindings self = new BatchBindTemplateResponseBodyBindings();
            return TeaModel.build(map, self);
        }

        public BatchBindTemplateResponseBodyBindings setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchBindTemplateResponseBodyBindings setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchBindTemplateResponseBodyBindings setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public BatchBindTemplateResponseBodyBindings setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
