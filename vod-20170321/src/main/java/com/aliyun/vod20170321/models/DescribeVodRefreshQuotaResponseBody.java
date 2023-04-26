// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshQuotaResponseBody extends TeaModel {
    /**
     * <p>The remaining number of directories of files that can be refreshed on the current day.</p>
     */
    @NameInMap("BlockQuota")
    public String blockQuota;

    /**
     * <p>Queries the maximum number and remaining number of requests to refresh or prefetch files on the current day. You can prefetch files based on URLs and refresh files based on URLs or directories.</p>
     */
    @NameInMap("DirQuota")
    public String dirQuota;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DirRemain")
    public String dirRemain;

    @NameInMap("PreloadQuota")
    public String preloadQuota;

    /**
     * <p>The remaining number of OSS buckets that can be refreshed on the current day.</p>
     */
    @NameInMap("PreloadRemain")
    public String preloadRemain;

    /**
     * <p>The maximum number of directories of files that can be refreshed each day.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UrlQuota")
    public String urlQuota;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeVodRefreshQuota**.</p>
     */
    @NameInMap("UrlRemain")
    public String urlRemain;

    /**
     * <p>The maximum number of URLs of files that can be prefetched each day.</p>
     */
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
