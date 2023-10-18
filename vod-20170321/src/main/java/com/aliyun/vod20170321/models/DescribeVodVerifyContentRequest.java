// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodVerifyContentRequest extends TeaModel {
    /**
     * <p>The domain name for which you want to query the ownership verification content. You can specify only one domain name in each call.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeVodVerifyContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodVerifyContentRequest self = new DescribeVodVerifyContentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodVerifyContentRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodVerifyContentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
