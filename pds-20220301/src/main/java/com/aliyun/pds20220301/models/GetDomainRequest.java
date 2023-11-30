// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDomainRequest extends TeaModel {
    /**
     * <p>The ID of the domain.</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>Specifies whether to return the used quota of the domain. Default value: false. If the quota of the domain is greater than 0 and you set this parameter to true, the used quota of the domain is returned.</p>
     */
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
