// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceSSLResponseBody extends TeaModel {
    // job
    @NameInMap("InstanceSSL")
    public ModifyInstanceSSLResponseBodyInstanceSSL instanceSSL;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSSLResponseBody self = new ModifyInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSSLResponseBody setInstanceSSL(ModifyInstanceSSLResponseBodyInstanceSSL instanceSSL) {
        this.instanceSSL = instanceSSL;
        return this;
    }
    public ModifyInstanceSSLResponseBodyInstanceSSL getInstanceSSL() {
        return this.instanceSSL;
    }

    public ModifyInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyInstanceSSLResponseBodyInstanceSSL extends TeaModel {
        @NameInMap("EnableSSL")
        public String enableSSL;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ModifyInstanceSSLResponseBodyInstanceSSL build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSSLResponseBodyInstanceSSL self = new ModifyInstanceSSLResponseBodyInstanceSSL();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSSLResponseBodyInstanceSSL setEnableSSL(String enableSSL) {
            this.enableSSL = enableSSL;
            return this;
        }
        public String getEnableSSL() {
            return this.enableSSL;
        }

        public ModifyInstanceSSLResponseBodyInstanceSSL setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
