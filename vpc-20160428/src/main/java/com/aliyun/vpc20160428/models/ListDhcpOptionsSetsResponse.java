// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListDhcpOptionsSetsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("DhcpOptionsSets")
    @Validation(required = true)
    public java.util.List<ListDhcpOptionsSetsResponseDhcpOptionsSets> dhcpOptionsSets;

    public static ListDhcpOptionsSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDhcpOptionsSetsResponse self = new ListDhcpOptionsSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListDhcpOptionsSetsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDhcpOptionsSetsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDhcpOptionsSetsResponse setDhcpOptionsSets(java.util.List<ListDhcpOptionsSetsResponseDhcpOptionsSets> dhcpOptionsSets) {
        this.dhcpOptionsSets = dhcpOptionsSets;
        return this;
    }
    public java.util.List<ListDhcpOptionsSetsResponseDhcpOptionsSets> getDhcpOptionsSets() {
        return this.dhcpOptionsSets;
    }

    public static class ListDhcpOptionsSetsResponseDhcpOptionsSetsDhcpOptions extends TeaModel {
        @NameInMap("DomainNameServers")
        @Validation(required = true)
        public String domainNameServers;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        public static ListDhcpOptionsSetsResponseDhcpOptionsSetsDhcpOptions build(java.util.Map<String, ?> map) throws Exception {
            ListDhcpOptionsSetsResponseDhcpOptionsSetsDhcpOptions self = new ListDhcpOptionsSetsResponseDhcpOptionsSetsDhcpOptions();
            return TeaModel.build(map, self);
        }

        public ListDhcpOptionsSetsResponseDhcpOptionsSetsDhcpOptions setDomainNameServers(String domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }
        public String getDomainNameServers() {
            return this.domainNameServers;
        }

        public ListDhcpOptionsSetsResponseDhcpOptionsSetsDhcpOptions setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class ListDhcpOptionsSetsResponseDhcpOptionsSets extends TeaModel {
        @NameInMap("DhcpOptionsSetName")
        @Validation(required = true)
        public String dhcpOptionsSetName;

        @NameInMap("DhcpOptionsSetDescription")
        @Validation(required = true)
        public String dhcpOptionsSetDescription;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public Long ownerId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("DhcpOptionsSetId")
        @Validation(required = true)
        public String dhcpOptionsSetId;

        @NameInMap("AssociateVpcCount")
        @Validation(required = true)
        public Integer associateVpcCount;

        @NameInMap("DhcpOptions")
        @Validation(required = true)
        public ListDhcpOptionsSetsResponseDhcpOptionsSetsDhcpOptions dhcpOptions;

        public static ListDhcpOptionsSetsResponseDhcpOptionsSets build(java.util.Map<String, ?> map) throws Exception {
            ListDhcpOptionsSetsResponseDhcpOptionsSets self = new ListDhcpOptionsSetsResponseDhcpOptionsSets();
            return TeaModel.build(map, self);
        }

        public ListDhcpOptionsSetsResponseDhcpOptionsSets setDhcpOptionsSetName(String dhcpOptionsSetName) {
            this.dhcpOptionsSetName = dhcpOptionsSetName;
            return this;
        }
        public String getDhcpOptionsSetName() {
            return this.dhcpOptionsSetName;
        }

        public ListDhcpOptionsSetsResponseDhcpOptionsSets setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
            this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
            return this;
        }
        public String getDhcpOptionsSetDescription() {
            return this.dhcpOptionsSetDescription;
        }

        public ListDhcpOptionsSetsResponseDhcpOptionsSets setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListDhcpOptionsSetsResponseDhcpOptionsSets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDhcpOptionsSetsResponseDhcpOptionsSets setDhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }
        public String getDhcpOptionsSetId() {
            return this.dhcpOptionsSetId;
        }

        public ListDhcpOptionsSetsResponseDhcpOptionsSets setAssociateVpcCount(Integer associateVpcCount) {
            this.associateVpcCount = associateVpcCount;
            return this;
        }
        public Integer getAssociateVpcCount() {
            return this.associateVpcCount;
        }

        public ListDhcpOptionsSetsResponseDhcpOptionsSets setDhcpOptions(ListDhcpOptionsSetsResponseDhcpOptionsSetsDhcpOptions dhcpOptions) {
            this.dhcpOptions = dhcpOptions;
            return this;
        }
        public ListDhcpOptionsSetsResponseDhcpOptionsSetsDhcpOptions getDhcpOptions() {
            return this.dhcpOptions;
        }

    }

}
