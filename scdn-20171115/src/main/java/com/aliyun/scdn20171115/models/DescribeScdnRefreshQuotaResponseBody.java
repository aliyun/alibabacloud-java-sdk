// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnRefreshQuotaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UrlRemain")
    public String urlRemain;

    @NameInMap("PreloadRemain")
    public String preloadRemain;

    @NameInMap("BlockQuota")
    public String blockQuota;

    @NameInMap("DirRemain")
    public String dirRemain;

    @NameInMap("UrlQuota")
    public String urlQuota;

    @NameInMap("DirQuota")
    public String dirQuota;

    @NameInMap("blockRemain")
    public String blockRemain;

    @NameInMap("PreloadQuota")
    public String preloadQuota;

    public static DescribeScdnRefreshQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnRefreshQuotaResponseBody self = new DescribeScdnRefreshQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnRefreshQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnRefreshQuotaResponseBody setUrlRemain(String urlRemain) {
        this.urlRemain = urlRemain;
        return this;
    }
    public String getUrlRemain() {
        return this.urlRemain;
    }

    public DescribeScdnRefreshQuotaResponseBody setPreloadRemain(String preloadRemain) {
        this.preloadRemain = preloadRemain;
        return this;
    }
    public String getPreloadRemain() {
        return this.preloadRemain;
    }

    public DescribeScdnRefreshQuotaResponseBody setBlockQuota(String blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }
    public String getBlockQuota() {
        return this.blockQuota;
    }

    public DescribeScdnRefreshQuotaResponseBody setDirRemain(String dirRemain) {
        this.dirRemain = dirRemain;
        return this;
    }
    public String getDirRemain() {
        return this.dirRemain;
    }

    public DescribeScdnRefreshQuotaResponseBody setUrlQuota(String urlQuota) {
        this.urlQuota = urlQuota;
        return this;
    }
    public String getUrlQuota() {
        return this.urlQuota;
    }

    public DescribeScdnRefreshQuotaResponseBody setDirQuota(String dirQuota) {
        this.dirQuota = dirQuota;
        return this;
    }
    public String getDirQuota() {
        return this.dirQuota;
    }

    public DescribeScdnRefreshQuotaResponseBody setBlockRemain(String blockRemain) {
        this.blockRemain = blockRemain;
        return this;
    }
    public String getBlockRemain() {
        return this.blockRemain;
    }

    public DescribeScdnRefreshQuotaResponseBody setPreloadQuota(String preloadQuota) {
        this.preloadQuota = preloadQuota;
        return this;
    }
    public String getPreloadQuota() {
        return this.preloadQuota;
    }

}
