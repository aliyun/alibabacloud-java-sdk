// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListDhcpOptionsSetsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DhcpOptionsSetId")
    public java.util.List<String> dhcpOptionsSetId;

    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    public static ListDhcpOptionsSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDhcpOptionsSetsRequest self = new ListDhcpOptionsSetsRequest();
        return TeaModel.build(map, self);
    }

}
