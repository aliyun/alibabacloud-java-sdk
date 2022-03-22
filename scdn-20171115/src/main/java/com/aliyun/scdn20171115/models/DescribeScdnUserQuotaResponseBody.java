// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnUserQuotaResponseBody extends TeaModel {
    @NameInMap("BlockQuota")
    public Integer blockQuota;

    @NameInMap("BlockRemain")
    public Integer blockRemain;

    @NameInMap("DomainQuota")
    public Integer domainQuota;

    @NameInMap("PreloadQuota")
    public Integer preloadQuota;

    @NameInMap("PreloadRemain")
    public Integer preloadRemain;

    @NameInMap("RefreshDirQuota")
    public Integer refreshDirQuota;

    @NameInMap("RefreshDirRemain")
    public Integer refreshDirRemain;

    @NameInMap("RefreshUrlQuota")
    public Integer refreshUrlQuota;

    @NameInMap("RefreshUrlRemain")
    public Integer refreshUrlRemain;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScdnUserQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnUserQuotaResponseBody self = new DescribeScdnUserQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnUserQuotaResponseBody setBlockQuota(Integer blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }
    public Integer getBlockQuota() {
        return this.blockQuota;
    }

    public DescribeScdnUserQuotaResponseBody setBlockRemain(Integer blockRemain) {
        this.blockRemain = blockRemain;
        return this;
    }
    public Integer getBlockRemain() {
        return this.blockRemain;
    }

    public DescribeScdnUserQuotaResponseBody setDomainQuota(Integer domainQuota) {
        this.domainQuota = domainQuota;
        return this;
    }
    public Integer getDomainQuota() {
        return this.domainQuota;
    }

    public DescribeScdnUserQuotaResponseBody setPreloadQuota(Integer preloadQuota) {
        this.preloadQuota = preloadQuota;
        return this;
    }
    public Integer getPreloadQuota() {
        return this.preloadQuota;
    }

    public DescribeScdnUserQuotaResponseBody setPreloadRemain(Integer preloadRemain) {
        this.preloadRemain = preloadRemain;
        return this;
    }
    public Integer getPreloadRemain() {
        return this.preloadRemain;
    }

    public DescribeScdnUserQuotaResponseBody setRefreshDirQuota(Integer refreshDirQuota) {
        this.refreshDirQuota = refreshDirQuota;
        return this;
    }
    public Integer getRefreshDirQuota() {
        return this.refreshDirQuota;
    }

    public DescribeScdnUserQuotaResponseBody setRefreshDirRemain(Integer refreshDirRemain) {
        this.refreshDirRemain = refreshDirRemain;
        return this;
    }
    public Integer getRefreshDirRemain() {
        return this.refreshDirRemain;
    }

    public DescribeScdnUserQuotaResponseBody setRefreshUrlQuota(Integer refreshUrlQuota) {
        this.refreshUrlQuota = refreshUrlQuota;
        return this;
    }
    public Integer getRefreshUrlQuota() {
        return this.refreshUrlQuota;
    }

    public DescribeScdnUserQuotaResponseBody setRefreshUrlRemain(Integer refreshUrlRemain) {
        this.refreshUrlRemain = refreshUrlRemain;
        return this;
    }
    public Integer getRefreshUrlRemain() {
        return this.refreshUrlRemain;
    }

    public DescribeScdnUserQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
