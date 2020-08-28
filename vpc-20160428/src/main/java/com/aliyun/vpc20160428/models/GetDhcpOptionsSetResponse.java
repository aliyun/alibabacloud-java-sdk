// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetDhcpOptionsSetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DhcpOptionsSetName")
    @Validation(required = true)
    public String dhcpOptionsSetName;

    @NameInMap("DhcpOptionsSetDescription")
    @Validation(required = true)
    public String dhcpOptionsSetDescription;

    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    public String dhcpOptionsSetId;

    @NameInMap("OwnerId")
    @Validation(required = true)
    public Long ownerId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("AssociateVpcs")
    @Validation(required = true)
    public java.util.List<GetDhcpOptionsSetResponseAssociateVpcs> associateVpcs;

    @NameInMap("DhcpOptions")
    @Validation(required = true)
    public GetDhcpOptionsSetResponseDhcpOptions dhcpOptions;

    public static GetDhcpOptionsSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDhcpOptionsSetResponse self = new GetDhcpOptionsSetResponse();
        return TeaModel.build(map, self);
    }

    public static class GetDhcpOptionsSetResponseAssociateVpcs extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("AssociateStatus")
        @Validation(required = true)
        public String associateStatus;

        public static GetDhcpOptionsSetResponseAssociateVpcs build(java.util.Map<String, ?> map) throws Exception {
            GetDhcpOptionsSetResponseAssociateVpcs self = new GetDhcpOptionsSetResponseAssociateVpcs();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDhcpOptionsSetResponseDhcpOptions extends TeaModel {
        @NameInMap("DomainNameServers")
        @Validation(required = true)
        public String domainNameServers;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        public static GetDhcpOptionsSetResponseDhcpOptions build(java.util.Map<String, ?> map) throws Exception {
            GetDhcpOptionsSetResponseDhcpOptions self = new GetDhcpOptionsSetResponseDhcpOptions();
            return TeaModel.build(map, self);
        }

    }

}
