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

    }

}
