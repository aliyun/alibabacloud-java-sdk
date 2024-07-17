// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D39EE0F1-D7EF-5F46-B781-6BF4185308B0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The results returned.</p>
     */
    @NameInMap("result")
    public CreateInstanceResponseBodyResult result;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponseBody setResult(CreateInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ppr7901</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static CreateInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyResult self = new CreateInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
