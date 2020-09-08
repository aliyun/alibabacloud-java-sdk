// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmMetaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VmMetaInfo")
    @Validation(required = true)
    public GetVmMetaResponseVmMetaInfo vmMetaInfo;

    public static GetVmMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVmMetaResponse self = new GetVmMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetVmMetaResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVmMetaResponse setVmMetaInfo(GetVmMetaResponseVmMetaInfo vmMetaInfo) {
        this.vmMetaInfo = vmMetaInfo;
        return this;
    }
    public GetVmMetaResponseVmMetaInfo getVmMetaInfo() {
        return this.vmMetaInfo;
    }

    public static class GetVmMetaResponseVmMetaInfo extends TeaModel {
        @NameInMap("RootCertPath")
        @Validation(required = true)
        public String rootCertPath;

        @NameInMap("RootCertContent")
        @Validation(required = true)
        public String rootCertContent;

        @NameInMap("KeyPath")
        @Validation(required = true)
        public String keyPath;

        @NameInMap("KeyContent")
        @Validation(required = true)
        public String keyContent;

        @NameInMap("CertChainPath")
        @Validation(required = true)
        public String certChainPath;

        @NameInMap("CertChainContent")
        @Validation(required = true)
        public String certChainContent;

        @NameInMap("EnvoyEnvPath")
        @Validation(required = true)
        public String envoyEnvPath;

        @NameInMap("EnvoyEnvContent")
        @Validation(required = true)
        public String envoyEnvContent;

        @NameInMap("HostsPath")
        @Validation(required = true)
        public String hostsPath;

        @NameInMap("HostsContent")
        @Validation(required = true)
        public String hostsContent;

        public static GetVmMetaResponseVmMetaInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVmMetaResponseVmMetaInfo self = new GetVmMetaResponseVmMetaInfo();
            return TeaModel.build(map, self);
        }

        public GetVmMetaResponseVmMetaInfo setRootCertPath(String rootCertPath) {
            this.rootCertPath = rootCertPath;
            return this;
        }
        public String getRootCertPath() {
            return this.rootCertPath;
        }

        public GetVmMetaResponseVmMetaInfo setRootCertContent(String rootCertContent) {
            this.rootCertContent = rootCertContent;
            return this;
        }
        public String getRootCertContent() {
            return this.rootCertContent;
        }

        public GetVmMetaResponseVmMetaInfo setKeyPath(String keyPath) {
            this.keyPath = keyPath;
            return this;
        }
        public String getKeyPath() {
            return this.keyPath;
        }

        public GetVmMetaResponseVmMetaInfo setKeyContent(String keyContent) {
            this.keyContent = keyContent;
            return this;
        }
        public String getKeyContent() {
            return this.keyContent;
        }

        public GetVmMetaResponseVmMetaInfo setCertChainPath(String certChainPath) {
            this.certChainPath = certChainPath;
            return this;
        }
        public String getCertChainPath() {
            return this.certChainPath;
        }

        public GetVmMetaResponseVmMetaInfo setCertChainContent(String certChainContent) {
            this.certChainContent = certChainContent;
            return this;
        }
        public String getCertChainContent() {
            return this.certChainContent;
        }

        public GetVmMetaResponseVmMetaInfo setEnvoyEnvPath(String envoyEnvPath) {
            this.envoyEnvPath = envoyEnvPath;
            return this;
        }
        public String getEnvoyEnvPath() {
            return this.envoyEnvPath;
        }

        public GetVmMetaResponseVmMetaInfo setEnvoyEnvContent(String envoyEnvContent) {
            this.envoyEnvContent = envoyEnvContent;
            return this;
        }
        public String getEnvoyEnvContent() {
            return this.envoyEnvContent;
        }

        public GetVmMetaResponseVmMetaInfo setHostsPath(String hostsPath) {
            this.hostsPath = hostsPath;
            return this;
        }
        public String getHostsPath() {
            return this.hostsPath;
        }

        public GetVmMetaResponseVmMetaInfo setHostsContent(String hostsContent) {
            this.hostsContent = hostsContent;
            return this;
        }
        public String getHostsContent() {
            return this.hostsContent;
        }

    }

}
