// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshQuotaResponseBody extends TeaModel {
    @NameInMap("BlockQuota")
    public String blockQuota;

    @NameInMap("DirQuota")
    public String dirQuota;

    @NameInMap("DirRemain")
    public String dirRemain;

    @NameInMap("PreloadQuota")
    public String preloadQuota;

    @NameInMap("PreloadRemain")
    public String preloadRemain;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UrlQuota")
    public String urlQuota;

    @NameInMap("UrlRemain")
    public String urlRemain;

    @NameInMap("blockRemain")
    public String blockRemain;

    public static DescribeVodRefreshQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRefreshQuotaResponseBody self = new DescribeVodRefreshQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodRefreshQuotaResponseBody setBlockQuota(String blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }
    public String getBlockQuota() {
        return this.blockQuota;
    }

    public DescribeVodRefreshQuotaResponseBody setDirQuota(String dirQuota) {
        this.dirQuota = dirQuota;
        return this;
    }
    public String getDirQuota() {
        return this.dirQuota;
    }

    public DescribeVodRefreshQuotaResponseBody setDirRemain(String dirRemain) {
        this.dirRemain = dirRemain;
        return this;
    }
    public String getDirRemain() {
        return this.dirRemain;
    }

    public DescribeVodRefreshQuotaResponseBody setPreloadQuota(String preloadQuota) {
        this.preloadQuota = preloadQuota;
        return this;
    }
    public String getPreloadQuota() {
        return this.preloadQuota;
    }

    public DescribeVodRefreshQuotaResponseBody setPreloadRemain(String preloadRemain) {
        this.preloadRemain = preloadRemain;
        return this;
    }
    public String getPreloadRemain() {
        return this.preloadRemain;
    }

    public DescribeVodRefreshQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodRefreshQuotaResponseBody setUrlQuota(String urlQuota) {
        this.urlQuota = urlQuota;
        return this;
    }
    public String getUrlQuota() {
        return this.urlQuota;
    }

    public DescribeVodRefreshQuotaResponseBody setUrlRemain(String urlRemain) {
        this.urlRemain = urlRemain;
        return this;
    }
    public String getUrlRemain() {
        return this.urlRemain;
    }

    public DescribeVodRefreshQuotaResponseBody setBlockRemain(String blockRemain) {
        this.blockRemain = blockRemain;
        return this;
    }
    public String getBlockRemain() {
        return this.blockRemain;
    }

}
