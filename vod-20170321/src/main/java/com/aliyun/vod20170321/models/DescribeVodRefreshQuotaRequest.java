// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshQuotaRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeVodRefreshQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRefreshQuotaRequest self = new DescribeVodRefreshQuotaRequest();
        return TeaModel.build(map, self);
    }

}
