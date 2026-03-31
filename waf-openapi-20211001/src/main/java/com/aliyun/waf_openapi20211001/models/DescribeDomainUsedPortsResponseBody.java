// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainUsedPortsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-<em>-A47C-</em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsedPorts")
    public java.util.List<Integer> usedPorts;

    public static DescribeDomainUsedPortsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainUsedPortsResponseBody self = new DescribeDomainUsedPortsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainUsedPortsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainUsedPortsResponseBody setUsedPorts(java.util.List<Integer> usedPorts) {
        this.usedPorts = usedPorts;
        return this;
    }
    public java.util.List<Integer> getUsedPorts() {
        return this.usedPorts;
    }

}
