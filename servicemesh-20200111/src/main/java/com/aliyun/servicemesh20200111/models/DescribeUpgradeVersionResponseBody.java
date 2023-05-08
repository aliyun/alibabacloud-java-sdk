// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUpgradeVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version information.</p>
     */
    @NameInMap("Version")
    public DescribeUpgradeVersionResponseBodyVersion version;

    public static DescribeUpgradeVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeVersionResponseBody self = new DescribeUpgradeVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpgradeVersionResponseBody setVersion(DescribeUpgradeVersionResponseBodyVersion version) {
        this.version = version;
        return this;
    }
    public DescribeUpgradeVersionResponseBodyVersion getVersion() {
        return this.version;
    }

    public static class DescribeUpgradeVersionResponseBodyVersion extends TeaModel {
        /**
         * <p>The version of the ASM instance.</p>
         */
        @NameInMap("IstioOperatorVersion")
        public String istioOperatorVersion;

        /**
         * <p>The Istio version.</p>
         */
        @NameInMap("IstioVersion")
        public String istioVersion;

        /**
         * <p>The Kubernetes version.</p>
         */
        @NameInMap("KubernetesVersion")
        public String kubernetesVersion;

        public static DescribeUpgradeVersionResponseBodyVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpgradeVersionResponseBodyVersion self = new DescribeUpgradeVersionResponseBodyVersion();
            return TeaModel.build(map, self);
        }

        public DescribeUpgradeVersionResponseBodyVersion setIstioOperatorVersion(String istioOperatorVersion) {
            this.istioOperatorVersion = istioOperatorVersion;
            return this;
        }
        public String getIstioOperatorVersion() {
            return this.istioOperatorVersion;
        }

        public DescribeUpgradeVersionResponseBodyVersion setIstioVersion(String istioVersion) {
            this.istioVersion = istioVersion;
            return this;
        }
        public String getIstioVersion() {
            return this.istioVersion;
        }

        public DescribeUpgradeVersionResponseBodyVersion setKubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }
        public String getKubernetesVersion() {
            return this.kubernetesVersion;
        }

    }

}
