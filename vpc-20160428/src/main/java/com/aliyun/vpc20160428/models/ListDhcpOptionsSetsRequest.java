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

    public ListDhcpOptionsSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDhcpOptionsSetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDhcpOptionsSetsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDhcpOptionsSetsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ListDhcpOptionsSetsRequest setDhcpOptionsSetId(java.util.List<String> dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public java.util.List<String> getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public ListDhcpOptionsSetsRequest setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
        return this;
    }
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

}
