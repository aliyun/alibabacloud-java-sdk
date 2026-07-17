// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateAppGroupDeleteProtectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>80326EFE-485F-46E7-B291-5A1DD08D2198</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result.</p>
     */
    @NameInMap("result")
    public UpdateAppGroupDeleteProtectionResponseBodyResult result;

    public static UpdateAppGroupDeleteProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppGroupDeleteProtectionResponseBody self = new UpdateAppGroupDeleteProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppGroupDeleteProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAppGroupDeleteProtectionResponseBody setResult(UpdateAppGroupDeleteProtectionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateAppGroupDeleteProtectionResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateAppGroupDeleteProtectionResponseBodyResult extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ops-cn-m7r1ywo2h1b</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static UpdateAppGroupDeleteProtectionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppGroupDeleteProtectionResponseBodyResult self = new UpdateAppGroupDeleteProtectionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateAppGroupDeleteProtectionResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
