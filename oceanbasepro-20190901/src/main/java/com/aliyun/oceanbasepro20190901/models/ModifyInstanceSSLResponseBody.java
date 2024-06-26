// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The SSL setting of the OceanBase cluster instance.</p>
     */
    @NameInMap("InstanceSSL")
    public ModifyInstanceSSLResponseBodyInstanceSSL instanceSSL;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
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
        /**
         * <p>The operation to modify the SSL status. Valid values:</p>
         * <ul>
         * <li><p>open: Enable SSL encryption.</p>
         * </li>
         * <li><p>update: Update the CA certificate.</p>
         * </li>
         * <li><p>close: Disable SSL encryption.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("EnableSSL")
        public String enableSSL;

        /**
         * <p>The ID of the OceanBase cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
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
