// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDomainQuotaResponseBody extends TeaModel {
    @NameInMap("size_quota")
    public Long sizeQuota;

    @NameInMap("size_used")
    public Long sizeUsed;

    @NameInMap("user_count_quota")
    public Long userCountQuota;

    @NameInMap("user_count_used")
    public Long userCountUsed;

    public static GetDomainQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainQuotaResponseBody self = new GetDomainQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainQuotaResponseBody setSizeQuota(Long sizeQuota) {
        this.sizeQuota = sizeQuota;
        return this;
    }
    public Long getSizeQuota() {
        return this.sizeQuota;
    }

    public GetDomainQuotaResponseBody setSizeUsed(Long sizeUsed) {
        this.sizeUsed = sizeUsed;
        return this;
    }
    public Long getSizeUsed() {
        return this.sizeUsed;
    }

    public GetDomainQuotaResponseBody setUserCountQuota(Long userCountQuota) {
        this.userCountQuota = userCountQuota;
        return this;
    }
    public Long getUserCountQuota() {
        return this.userCountQuota;
    }

    public GetDomainQuotaResponseBody setUserCountUsed(Long userCountUsed) {
        this.userCountUsed = userCountUsed;
        return this;
    }
    public Long getUserCountUsed() {
        return this.userCountUsed;
    }

}
