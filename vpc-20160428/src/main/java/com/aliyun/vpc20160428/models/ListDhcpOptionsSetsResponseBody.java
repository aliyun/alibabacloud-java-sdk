// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListDhcpOptionsSetsResponseBody extends TeaModel {
    @NameInMap("DhcpOptionsSets")
    public java.util.List<ListDhcpOptionsSetsResponseBodyDhcpOptionsSets> dhcpOptionsSets;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDhcpOptionsSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDhcpOptionsSetsResponseBody self = new ListDhcpOptionsSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDhcpOptionsSetsResponseBody setDhcpOptionsSets(java.util.List<ListDhcpOptionsSetsResponseBodyDhcpOptionsSets> dhcpOptionsSets) {
        this.dhcpOptionsSets = dhcpOptionsSets;
        return this;
    }
    public java.util.List<ListDhcpOptionsSetsResponseBodyDhcpOptionsSets> getDhcpOptionsSets() {
        return this.dhcpOptionsSets;
    }

    public ListDhcpOptionsSetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDhcpOptionsSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainNameServers")
        public String domainNameServers;

        public static ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions build(java.util.Map<String, ?> map) throws Exception {
            ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions self = new ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions();
            return TeaModel.build(map, self);
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions setDomainNameServers(String domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }
        public String getDomainNameServers() {
            return this.domainNameServers;
        }

    }

    public static class ListDhcpOptionsSetsResponseBodyDhcpOptionsSets extends TeaModel {
        @NameInMap("AssociateVpcCount")
        public Integer associateVpcCount;

        @NameInMap("DhcpOptions")
        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions dhcpOptions;

        @NameInMap("DhcpOptionsSetDescription")
        public String dhcpOptionsSetDescription;

        @NameInMap("DhcpOptionsSetId")
        public String dhcpOptionsSetId;

        @NameInMap("DhcpOptionsSetName")
        public String dhcpOptionsSetName;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("Status")
        public String status;

        public static ListDhcpOptionsSetsResponseBodyDhcpOptionsSets build(java.util.Map<String, ?> map) throws Exception {
            ListDhcpOptionsSetsResponseBodyDhcpOptionsSets self = new ListDhcpOptionsSetsResponseBodyDhcpOptionsSets();
            return TeaModel.build(map, self);
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setAssociateVpcCount(Integer associateVpcCount) {
            this.associateVpcCount = associateVpcCount;
            return this;
        }
        public Integer getAssociateVpcCount() {
            return this.associateVpcCount;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setDhcpOptions(ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions dhcpOptions) {
            this.dhcpOptions = dhcpOptions;
            return this;
        }
        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions getDhcpOptions() {
            return this.dhcpOptions;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
            this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
            return this;
        }
        public String getDhcpOptionsSetDescription() {
            return this.dhcpOptionsSetDescription;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setDhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }
        public String getDhcpOptionsSetId() {
            return this.dhcpOptionsSetId;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setDhcpOptionsSetName(String dhcpOptionsSetName) {
            this.dhcpOptionsSetName = dhcpOptionsSetName;
            return this;
        }
        public String getDhcpOptionsSetName() {
            return this.dhcpOptionsSetName;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
