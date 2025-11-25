// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateMultiUserInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<UpdateMultiUserInstancesResponseBodyResult> result;

    public static UpdateMultiUserInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiUserInstancesResponseBody self = new UpdateMultiUserInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMultiUserInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMultiUserInstancesResponseBody setResult(java.util.List<UpdateMultiUserInstancesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<UpdateMultiUserInstancesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class UpdateMultiUserInstancesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><strong><strong>185894</strong></strong></p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>Failed to update multi-user instance configuration</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>sas-p0anpb26****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateStatus")
        public String updateStatus;

        public static UpdateMultiUserInstancesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiUserInstancesResponseBodyResult self = new UpdateMultiUserInstancesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMultiUserInstancesResponseBodyResult setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public UpdateMultiUserInstancesResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateMultiUserInstancesResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateMultiUserInstancesResponseBodyResult setUpdateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public String getUpdateStatus() {
            return this.updateStatus;
        }

    }

}
