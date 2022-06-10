// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetDhcpOptionsSetResponseBody extends TeaModel {
    @NameInMap("AssociateVpcs")
    public java.util.List<GetDhcpOptionsSetResponseBodyAssociateVpcs> associateVpcs;

    @NameInMap("DhcpOptions")
    public GetDhcpOptionsSetResponseBodyDhcpOptions dhcpOptions;

    @NameInMap("DhcpOptionsSetDescription")
    public String dhcpOptionsSetDescription;

    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetDhcpOptionsSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDhcpOptionsSetResponseBody self = new GetDhcpOptionsSetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDhcpOptionsSetResponseBody setAssociateVpcs(java.util.List<GetDhcpOptionsSetResponseBodyAssociateVpcs> associateVpcs) {
        this.associateVpcs = associateVpcs;
        return this;
    }
    public java.util.List<GetDhcpOptionsSetResponseBodyAssociateVpcs> getAssociateVpcs() {
        return this.associateVpcs;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptions(GetDhcpOptionsSetResponseBodyDhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
        return this;
    }
    public GetDhcpOptionsSetResponseBodyDhcpOptions getDhcpOptions() {
        return this.dhcpOptions;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
        this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
        return this;
    }
    public String getDhcpOptionsSetDescription() {
        return this.dhcpOptionsSetDescription;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
        return this;
    }
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    public GetDhcpOptionsSetResponseBody setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetDhcpOptionsSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDhcpOptionsSetResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
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

    public static class GetDhcpOptionsSetResponseBodyDhcpOptions extends TeaModel {
        @NameInMap("BootFileName")
        public String bootFileName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainNameServers")
        public String domainNameServers;

        @NameInMap("Ipv6LeaseTime")
        public String ipv6LeaseTime;

        @NameInMap("LeaseTime")
        public String leaseTime;

        @NameInMap("TFTPServerName")
        public String TFTPServerName;

        public static GetDhcpOptionsSetResponseBodyDhcpOptions build(java.util.Map<String, ?> map) throws Exception {
            GetDhcpOptionsSetResponseBodyDhcpOptions self = new GetDhcpOptionsSetResponseBodyDhcpOptions();
            return TeaModel.build(map, self);
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setBootFileName(String bootFileName) {
            this.bootFileName = bootFileName;
            return this;
        }
        public String getBootFileName() {
            return this.bootFileName;
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setDomainNameServers(String domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }
        public String getDomainNameServers() {
            return this.domainNameServers;
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setIpv6LeaseTime(String ipv6LeaseTime) {
            this.ipv6LeaseTime = ipv6LeaseTime;
            return this;
        }
        public String getIpv6LeaseTime() {
            return this.ipv6LeaseTime;
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setLeaseTime(String leaseTime) {
            this.leaseTime = leaseTime;
            return this;
        }
        public String getLeaseTime() {
            return this.leaseTime;
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setTFTPServerName(String TFTPServerName) {
            this.TFTPServerName = TFTPServerName;
            return this;
        }
        public String getTFTPServerName() {
            return this.TFTPServerName;
        }

    }

}
