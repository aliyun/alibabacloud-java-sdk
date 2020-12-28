// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmMetaResponseBody extends TeaModel {
    @NameInMap("VmMetaInfo")
    public GetVmMetaResponseBodyVmMetaInfo vmMetaInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVmMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVmMetaResponseBody self = new GetVmMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVmMetaResponseBody setVmMetaInfo(GetVmMetaResponseBodyVmMetaInfo vmMetaInfo) {
        this.vmMetaInfo = vmMetaInfo;
        return this;
    }
    public GetVmMetaResponseBodyVmMetaInfo getVmMetaInfo() {
        return this.vmMetaInfo;
    }

    public GetVmMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVmMetaResponseBodyVmMetaInfo extends TeaModel {
        @NameInMap("TokenPath")
        public String tokenPath;

        @NameInMap("HostsContent")
        public String hostsContent;

        @NameInMap("EnvoyEnvPath")
        public String envoyEnvPath;

        @NameInMap("TokenContent")
        public String tokenContent;

        @NameInMap("CertChainPath")
        public String certChainPath;

        @NameInMap("RootCertContent")
        public String rootCertContent;

        @NameInMap("KeyContent")
        public String keyContent;

        @NameInMap("RootCertPath")
        public String rootCertPath;

        @NameInMap("CertChainContent")
        public String certChainContent;

        @NameInMap("HostsPath")
        public String hostsPath;

        @NameInMap("KeyPath")
        public String keyPath;

        @NameInMap("EnvoyEnvContent")
        public String envoyEnvContent;

        public static GetVmMetaResponseBodyVmMetaInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVmMetaResponseBodyVmMetaInfo self = new GetVmMetaResponseBodyVmMetaInfo();
            return TeaModel.build(map, self);
        }

        public GetVmMetaResponseBodyVmMetaInfo setTokenPath(String tokenPath) {
            this.tokenPath = tokenPath;
            return this;
        }
        public String getTokenPath() {
            return this.tokenPath;
        }

        public GetVmMetaResponseBodyVmMetaInfo setHostsContent(String hostsContent) {
            this.hostsContent = hostsContent;
            return this;
        }
        public String getHostsContent() {
            return this.hostsContent;
        }

        public GetVmMetaResponseBodyVmMetaInfo setEnvoyEnvPath(String envoyEnvPath) {
            this.envoyEnvPath = envoyEnvPath;
            return this;
        }
        public String getEnvoyEnvPath() {
            return this.envoyEnvPath;
        }

        public GetVmMetaResponseBodyVmMetaInfo setTokenContent(String tokenContent) {
            this.tokenContent = tokenContent;
            return this;
        }
        public String getTokenContent() {
            return this.tokenContent;
        }

        public GetVmMetaResponseBodyVmMetaInfo setCertChainPath(String certChainPath) {
            this.certChainPath = certChainPath;
            return this;
        }
        public String getCertChainPath() {
            return this.certChainPath;
        }

        public GetVmMetaResponseBodyVmMetaInfo setRootCertContent(String rootCertContent) {
            this.rootCertContent = rootCertContent;
            return this;
        }
        public String getRootCertContent() {
            return this.rootCertContent;
        }

        public GetVmMetaResponseBodyVmMetaInfo setKeyContent(String keyContent) {
            this.keyContent = keyContent;
            return this;
        }
        public String getKeyContent() {
            return this.keyContent;
        }

        public GetVmMetaResponseBodyVmMetaInfo setRootCertPath(String rootCertPath) {
            this.rootCertPath = rootCertPath;
            return this;
        }
        public String getRootCertPath() {
            return this.rootCertPath;
        }

        public GetVmMetaResponseBodyVmMetaInfo setCertChainContent(String certChainContent) {
            this.certChainContent = certChainContent;
            return this;
        }
        public String getCertChainContent() {
            return this.certChainContent;
        }

        public GetVmMetaResponseBodyVmMetaInfo setHostsPath(String hostsPath) {
            this.hostsPath = hostsPath;
            return this;
        }
        public String getHostsPath() {
            return this.hostsPath;
        }

        public GetVmMetaResponseBodyVmMetaInfo setKeyPath(String keyPath) {
            this.keyPath = keyPath;
            return this;
        }
        public String getKeyPath() {
            return this.keyPath;
        }

        public GetVmMetaResponseBodyVmMetaInfo setEnvoyEnvContent(String envoyEnvContent) {
            this.envoyEnvContent = envoyEnvContent;
            return this;
        }
        public String getEnvoyEnvContent() {
            return this.envoyEnvContent;
        }

    }

}
