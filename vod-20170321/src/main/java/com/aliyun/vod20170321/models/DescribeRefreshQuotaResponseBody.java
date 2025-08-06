// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeRefreshQuotaResponseBody extends TeaModel {
    @NameInMap("RefreshCacheQuota")
    public DescribeRefreshQuotaResponseBodyRefreshCacheQuota refreshCacheQuota;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRefreshQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshQuotaResponseBody self = new DescribeRefreshQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshQuotaResponseBody setRefreshCacheQuota(DescribeRefreshQuotaResponseBodyRefreshCacheQuota refreshCacheQuota) {
        this.refreshCacheQuota = refreshCacheQuota;
        return this;
    }
    public DescribeRefreshQuotaResponseBodyRefreshCacheQuota getRefreshCacheQuota() {
        return this.refreshCacheQuota;
    }

    public DescribeRefreshQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRefreshQuotaResponseBodyRefreshCacheQuota extends TeaModel {
        @NameInMap("DirQuota")
        public String dirQuota;

        @NameInMap("DirRemain")
        public String dirRemain;

        @NameInMap("UrlQuota")
        public String urlQuota;

        @NameInMap("UrlRemain")
        public String urlRemain;

        public static DescribeRefreshQuotaResponseBodyRefreshCacheQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeRefreshQuotaResponseBodyRefreshCacheQuota self = new DescribeRefreshQuotaResponseBodyRefreshCacheQuota();
            return TeaModel.build(map, self);
        }

        public DescribeRefreshQuotaResponseBodyRefreshCacheQuota setDirQuota(String dirQuota) {
            this.dirQuota = dirQuota;
            return this;
        }
        public String getDirQuota() {
            return this.dirQuota;
        }

        public DescribeRefreshQuotaResponseBodyRefreshCacheQuota setDirRemain(String dirRemain) {
            this.dirRemain = dirRemain;
            return this;
        }
        public String getDirRemain() {
            return this.dirRemain;
        }

        public DescribeRefreshQuotaResponseBodyRefreshCacheQuota setUrlQuota(String urlQuota) {
            this.urlQuota = urlQuota;
            return this;
        }
        public String getUrlQuota() {
            return this.urlQuota;
        }

        public DescribeRefreshQuotaResponseBodyRefreshCacheQuota setUrlRemain(String urlRemain) {
            this.urlRemain = urlRemain;
            return this;
        }
        public String getUrlRemain() {
            return this.urlRemain;
        }

    }

}
