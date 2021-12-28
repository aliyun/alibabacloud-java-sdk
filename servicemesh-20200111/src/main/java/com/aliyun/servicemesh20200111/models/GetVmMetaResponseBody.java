// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("EnvoyEnvContent")
        public String envoyEnvContent;

        @NameInMap("HostsContent")
        public String hostsContent;

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
