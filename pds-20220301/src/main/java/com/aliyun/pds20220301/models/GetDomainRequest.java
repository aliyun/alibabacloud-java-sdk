// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDomainRequest extends TeaModel {
    /**
     * <p>domain id</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("get_quota_used")
    public Boolean getQuotaUsed;

    public static GetDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainRequest self = new GetDomainRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GetDomainRequest setGetQuotaUsed(Boolean getQuotaUsed) {
        this.getQuotaUsed = getQuotaUsed;
        return this;
    }
    public Boolean getGetQuotaUsed() {
        return this.getQuotaUsed;
    }

}
