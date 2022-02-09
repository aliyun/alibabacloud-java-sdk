// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewalResponseBody extends TeaModel {
    @NameInMap("Instance")
    public ModifyInstanceAutoRenewalResponseBodyInstance instance;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAutoRenewalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewalResponseBody self = new ModifyInstanceAutoRenewalResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewalResponseBody setInstance(ModifyInstanceAutoRenewalResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public ModifyInstanceAutoRenewalResponseBodyInstance getInstance() {
        return this.instance;
    }

    public ModifyInstanceAutoRenewalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyInstanceAutoRenewalResponseBodyInstance extends TeaModel {
        @NameInMap("AutoRenewal")
        public String autoRenewal;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ModifyInstanceAutoRenewalResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAutoRenewalResponseBodyInstance self = new ModifyInstanceAutoRenewalResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAutoRenewalResponseBodyInstance setAutoRenewal(String autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public String getAutoRenewal() {
            return this.autoRenewal;
        }

        public ModifyInstanceAutoRenewalResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
