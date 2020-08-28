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

    }

}
