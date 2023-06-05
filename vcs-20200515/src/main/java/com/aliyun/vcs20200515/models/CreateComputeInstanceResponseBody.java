// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateComputeInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateComputeInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateComputeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeInstanceResponseBody self = new CreateComputeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComputeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateComputeInstanceResponseBody setData(CreateComputeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateComputeInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateComputeInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateComputeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateComputeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateComputeInstanceResponseBodyData extends TeaModel {
        @NameInMap("AcuUsed")
        public Long acuUsed;

        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateComputeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeInstanceResponseBodyData self = new CreateComputeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateComputeInstanceResponseBodyData setAcuUsed(Long acuUsed) {
            this.acuUsed = acuUsed;
            return this;
        }
        public Long getAcuUsed() {
            return this.acuUsed;
        }

        public CreateComputeInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
