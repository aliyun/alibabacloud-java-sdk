// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUpgradeVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Version")
    @Validation(required = true)
    public DescribeUpgradeVersionResponseVersion version;

    public static DescribeUpgradeVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeVersionResponse self = new DescribeUpgradeVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpgradeVersionResponse setVersion(DescribeUpgradeVersionResponseVersion version) {
        this.version = version;
        return this;
    }
    public DescribeUpgradeVersionResponseVersion getVersion() {
        return this.version;
    }

    public static class DescribeUpgradeVersionResponseVersion extends TeaModel {
        @NameInMap("IstioVersion")
        @Validation(required = true)
        public String istioVersion;

        @NameInMap("IstioOperatorVersion")
        @Validation(required = true)
        public String istioOperatorVersion;

        @NameInMap("KubernetesVersion")
        @Validation(required = true)
        public String kubernetesVersion;

        public static DescribeUpgradeVersionResponseVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpgradeVersionResponseVersion self = new DescribeUpgradeVersionResponseVersion();
            return TeaModel.build(map, self);
        }

        public DescribeUpgradeVersionResponseVersion setIstioVersion(String istioVersion) {
            this.istioVersion = istioVersion;
            return this;
        }
        public String getIstioVersion() {
            return this.istioVersion;
        }

        public DescribeUpgradeVersionResponseVersion setIstioOperatorVersion(String istioOperatorVersion) {
            this.istioOperatorVersion = istioOperatorVersion;
            return this;
        }
        public String getIstioOperatorVersion() {
            return this.istioOperatorVersion;
        }

        public DescribeUpgradeVersionResponseVersion setKubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }
        public String getKubernetesVersion() {
            return this.kubernetesVersion;
        }

    }

}
