// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePunishedDomainsResponseBody extends TeaModel {
    /**
     * <p>The domain names that are penalized for failing to obtain an ICP filing.</p>
     */
    @NameInMap("PunishedDomains")
    public java.util.List<String> punishedDomains;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B1F4D802-55A1-5D53-A247-7E79****85E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePunishedDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePunishedDomainsResponseBody self = new DescribePunishedDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePunishedDomainsResponseBody setPunishedDomains(java.util.List<String> punishedDomains) {
        this.punishedDomains = punishedDomains;
        return this;
    }
    public java.util.List<String> getPunishedDomains() {
        return this.punishedDomains;
    }

    public DescribePunishedDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
