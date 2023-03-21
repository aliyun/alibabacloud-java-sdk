// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddPrivateRegistryResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddPrivateRegistryResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static AddPrivateRegistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrivateRegistryResponseBody self = new AddPrivateRegistryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrivateRegistryResponseBody setData(AddPrivateRegistryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddPrivateRegistryResponseBodyData getData() {
        return this.data;
    }

    public AddPrivateRegistryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddPrivateRegistryResponseBodyData extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NetType")
        public Long netType;

        @NameInMap("Password")
        public String password;

        @NameInMap("ProtocolType")
        public Long protocolType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegistryHostIp")
        public String registryHostIp;

        @NameInMap("RegistryType")
        public String registryType;

        @NameInMap("RegistryVersion")
        public String registryVersion;

        @NameInMap("Token")
        public String token;

        @NameInMap("TransPerHour")
        public Integer transPerHour;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("VpcId")
        public String vpcId;

        public static AddPrivateRegistryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddPrivateRegistryResponseBodyData self = new AddPrivateRegistryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddPrivateRegistryResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public AddPrivateRegistryResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public AddPrivateRegistryResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddPrivateRegistryResponseBodyData setNetType(Long netType) {
            this.netType = netType;
            return this;
        }
        public Long getNetType() {
            return this.netType;
        }

        public AddPrivateRegistryResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public AddPrivateRegistryResponseBodyData setProtocolType(Long protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public Long getProtocolType() {
            return this.protocolType;
        }

        public AddPrivateRegistryResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public AddPrivateRegistryResponseBodyData setRegistryHostIp(String registryHostIp) {
            this.registryHostIp = registryHostIp;
            return this;
        }
        public String getRegistryHostIp() {
            return this.registryHostIp;
        }

        public AddPrivateRegistryResponseBodyData setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public AddPrivateRegistryResponseBodyData setRegistryVersion(String registryVersion) {
            this.registryVersion = registryVersion;
            return this;
        }
        public String getRegistryVersion() {
            return this.registryVersion;
        }

        public AddPrivateRegistryResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public AddPrivateRegistryResponseBodyData setTransPerHour(Integer transPerHour) {
            this.transPerHour = transPerHour;
            return this;
        }
        public Integer getTransPerHour() {
            return this.transPerHour;
        }

        public AddPrivateRegistryResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public AddPrivateRegistryResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
