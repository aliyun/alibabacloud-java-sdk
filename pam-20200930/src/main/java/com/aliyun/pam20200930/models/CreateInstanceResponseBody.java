// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceAttribute")
    public CreateInstanceResponseBodyInstanceAttribute instanceAttribute;

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

    public CreateInstanceResponseBody setInstanceAttribute(CreateInstanceResponseBodyInstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
        return this;
    }
    public CreateInstanceResponseBodyInstanceAttribute getInstanceAttribute() {
        return this.instanceAttribute;
    }

    public static class CreateInstanceResponseBodyInstanceAttribute extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateInstanceResponseBodyInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstanceAttribute self = new CreateInstanceResponseBodyInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
