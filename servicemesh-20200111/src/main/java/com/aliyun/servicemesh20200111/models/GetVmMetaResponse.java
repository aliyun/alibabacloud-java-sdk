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

    }

}
