// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainDetailRequest extends TeaModel {
    /**
     * <p>The status of the origin server. Valid values:</p>
     * <br>
     * <p>*   **online**: indicates that the origin server is enabled.</p>
     * <p>*   **offline**: indicates that the origin server is disabled.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeVodDomainDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainDetailRequest self = new DescribeVodDomainDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainDetailRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainDetailRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
