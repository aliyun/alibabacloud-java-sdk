// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetDhcpOptionsSetResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    @NameInMap("DhcpOptions")
    public GetDhcpOptionsSetResponseBodyDhcpOptions dhcpOptions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    @NameInMap("AssociateVpcs")
    public java.util.List<GetDhcpOptionsSetResponseBodyAssociateVpcs> associateVpcs;

    @NameInMap("DhcpOptionsSetDescription")
    public String dhcpOptionsSetDescription;

    public static GetDhcpOptionsSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDhcpOptionsSetResponseBody self = new GetDhcpOptionsSetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDhcpOptionsSetResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptions(GetDhcpOptionsSetResponseBodyDhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
        return this;
    }
    public GetDhcpOptionsSetResponseBodyDhcpOptions getDhcpOptions() {
        return this.dhcpOptions;
    }

    public GetDhcpOptionsSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDhcpOptionsSetResponseBody setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
        return this;
    }
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    public GetDhcpOptionsSetResponseBody setAssociateVpcs(java.util.List<GetDhcpOptionsSetResponseBodyAssociateVpcs> associateVpcs) {
        this.associateVpcs = associateVpcs;
        return this;
    }
    public java.util.List<GetDhcpOptionsSetResponseBodyAssociateVpcs> getAssociateVpcs() {
        return this.associateVpcs;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
        this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
        return this;
    }
    public String getDhcpOptionsSetDescription() {
        return this.dhcpOptionsSetDescription;
    }

    public static class GetDhcpOptionsSetResponseBodyDhcpOptions extends TeaModel {
        @NameInMap("DomainNameServers")
        public String domainNameServers;

        @NameInMap("DomainName")
        public String domainName;

        public static GetDhcpOptionsSetResponseBodyDhcpOptions build(java.util.Map<String, ?> map) throws Exception {
            GetDhcpOptionsSetResponseBodyDhcpOptions self = new GetDhcpOptionsSetResponseBodyDhcpOptions();
            return TeaModel.build(map, self);
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setDomainNameServers(String domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }
        public String getDomainNameServers() {
            return this.domainNameServers;
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class GetDhcpOptionsSetResponseBodyAssociateVpcs extends TeaModel {
        @NameInMap("AssociateStatus")
        public String associateStatus;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetDhcpOptionsSetResponseBodyAssociateVpcs build(java.util.Map<String, ?> map) throws Exception {
            GetDhcpOptionsSetResponseBodyAssociateVpcs self = new GetDhcpOptionsSetResponseBodyAssociateVpcs();
            return TeaModel.build(map, self);
        }

        public GetDhcpOptionsSetResponseBodyAssociateVpcs setAssociateStatus(String associateStatus) {
            this.associateStatus = associateStatus;
            return this;
        }
        public String getAssociateStatus() {
            return this.associateStatus;
        }

        public GetDhcpOptionsSetResponseBodyAssociateVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
