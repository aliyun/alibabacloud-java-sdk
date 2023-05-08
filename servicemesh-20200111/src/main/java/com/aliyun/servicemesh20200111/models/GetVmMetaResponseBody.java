// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmMetaResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metadata that is required to add a non-containerized application to the ASM instance.</p>
     */
    @NameInMap("VmMetaInfo")
    public GetVmMetaResponseBodyVmMetaInfo vmMetaInfo;

    public static GetVmMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVmMetaResponseBody self = new GetVmMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVmMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVmMetaResponseBody setVmMetaInfo(GetVmMetaResponseBodyVmMetaInfo vmMetaInfo) {
        this.vmMetaInfo = vmMetaInfo;
        return this;
    }
    public GetVmMetaResponseBodyVmMetaInfo getVmMetaInfo() {
        return this.vmMetaInfo;
    }

    public static class GetVmMetaResponseBodyVmMetaInfo extends TeaModel {
        /**
         * <p>The content of the EnvoyEnv file.</p>
         */
        @NameInMap("EnvoyEnvContent")
        public String envoyEnvContent;

        /**
         * <p>The content of the hosts file.</p>
         */
        @NameInMap("HostsContent")
        public String hostsContent;

        /**
         * <p>The content of the Token file.</p>
         */
        @NameInMap("TokenContent")
        public String tokenContent;

        public static GetVmMetaResponseBodyVmMetaInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVmMetaResponseBodyVmMetaInfo self = new GetVmMetaResponseBodyVmMetaInfo();
            return TeaModel.build(map, self);
        }

        public GetVmMetaResponseBodyVmMetaInfo setEnvoyEnvContent(String envoyEnvContent) {
            this.envoyEnvContent = envoyEnvContent;
            return this;
        }
        public String getEnvoyEnvContent() {
            return this.envoyEnvContent;
        }

        public GetVmMetaResponseBodyVmMetaInfo setHostsContent(String hostsContent) {
            this.hostsContent = hostsContent;
            return this;
        }
        public String getHostsContent() {
            return this.hostsContent;
        }

        public GetVmMetaResponseBodyVmMetaInfo setTokenContent(String tokenContent) {
            this.tokenContent = tokenContent;
            return this;
        }
        public String getTokenContent() {
            return this.tokenContent;
        }

    }

}
