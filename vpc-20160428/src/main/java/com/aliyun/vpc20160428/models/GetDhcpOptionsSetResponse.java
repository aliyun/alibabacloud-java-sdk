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

    public GetDhcpOptionsSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDhcpOptionsSetResponse setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
        return this;
    }
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    public GetDhcpOptionsSetResponse setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
        this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
        return this;
    }
    public String getDhcpOptionsSetDescription() {
        return this.dhcpOptionsSetDescription;
    }

    public GetDhcpOptionsSetResponse setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public GetDhcpOptionsSetResponse setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetDhcpOptionsSetResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDhcpOptionsSetResponse setAssociateVpcs(java.util.List<GetDhcpOptionsSetResponseAssociateVpcs> associateVpcs) {
        this.associateVpcs = associateVpcs;
        return this;
    }
    public java.util.List<GetDhcpOptionsSetResponseAssociateVpcs> getAssociateVpcs() {
        return this.associateVpcs;
    }

    public GetDhcpOptionsSetResponse setDhcpOptions(GetDhcpOptionsSetResponseDhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
        return this;
    }
    public GetDhcpOptionsSetResponseDhcpOptions getDhcpOptions() {
        return this.dhcpOptions;
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

        public GetDhcpOptionsSetResponseAssociateVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetDhcpOptionsSetResponseAssociateVpcs setAssociateStatus(String associateStatus) {
            this.associateStatus = associateStatus;
            return this;
        }
        public String getAssociateStatus() {
            return this.associateStatus;
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

        public GetDhcpOptionsSetResponseDhcpOptions setDomainNameServers(String domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }
        public String getDomainNameServers() {
            return this.domainNameServers;
        }

        public GetDhcpOptionsSetResponseDhcpOptions setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
