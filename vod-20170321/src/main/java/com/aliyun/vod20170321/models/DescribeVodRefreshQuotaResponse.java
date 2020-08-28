// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshQuotaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UrlQuota")
    @Validation(required = true)
    public String urlQuota;

    @NameInMap("DirQuota")
    @Validation(required = true)
    public String dirQuota;

    @NameInMap("UrlRemain")
    @Validation(required = true)
    public String urlRemain;

    @NameInMap("DirRemain")
    @Validation(required = true)
    public String dirRemain;

    @NameInMap("PreloadQuota")
    @Validation(required = true)
    public String preloadQuota;

    @NameInMap("BlockQuota")
    @Validation(required = true)
    public String blockQuota;

    @NameInMap("PreloadRemain")
    @Validation(required = true)
    public String preloadRemain;

    @NameInMap("blockRemain")
    @Validation(required = true)
    public String blockRemain;

    public static DescribeVodRefreshQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRefreshQuotaResponse self = new DescribeVodRefreshQuotaResponse();
        return TeaModel.build(map, self);
    }

}
