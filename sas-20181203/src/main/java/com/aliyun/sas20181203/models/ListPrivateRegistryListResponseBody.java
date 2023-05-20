// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryListResponseBody extends TeaModel {
    @NameInMap("ImageRegistryInfos")
    public java.util.List<ListPrivateRegistryListResponseBodyImageRegistryInfos> imageRegistryInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPrivateRegistryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateRegistryListResponseBody self = new ListPrivateRegistryListResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateRegistryListResponseBody setImageRegistryInfos(java.util.List<ListPrivateRegistryListResponseBodyImageRegistryInfos> imageRegistryInfos) {
        this.imageRegistryInfos = imageRegistryInfos;
        return this;
    }
    public java.util.List<ListPrivateRegistryListResponseBodyImageRegistryInfos> getImageRegistryInfos() {
        return this.imageRegistryInfos;
    }

    public ListPrivateRegistryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrivateRegistryListResponseBodyImageRegistryInfos extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("JenkinsEnv")
        public String jenkinsEnv;

        @NameInMap("NetType")
        public Long netType;

        @NameInMap("Password")
        public String password;

        @NameInMap("PersistenceDay")
        public Long persistenceDay;

        @NameInMap("ProtocolType")
        public Long protocolType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegistryHostIp")
        public String registryHostIp;

        @NameInMap("RegistryName")
        public String registryName;

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

        @NameInMap("WhiteList")
        public String whiteList;

        public static ListPrivateRegistryListResponseBodyImageRegistryInfos build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateRegistryListResponseBodyImageRegistryInfos self = new ListPrivateRegistryListResponseBodyImageRegistryInfos();
            return TeaModel.build(map, self);
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setJenkinsEnv(String jenkinsEnv) {
            this.jenkinsEnv = jenkinsEnv;
            return this;
        }
        public String getJenkinsEnv() {
            return this.jenkinsEnv;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setNetType(Long netType) {
            this.netType = netType;
            return this;
        }
        public Long getNetType() {
            return this.netType;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setPersistenceDay(Long persistenceDay) {
            this.persistenceDay = persistenceDay;
            return this;
        }
        public Long getPersistenceDay() {
            return this.persistenceDay;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setProtocolType(Long protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public Long getProtocolType() {
            return this.protocolType;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setRegistryHostIp(String registryHostIp) {
            this.registryHostIp = registryHostIp;
            return this;
        }
        public String getRegistryHostIp() {
            return this.registryHostIp;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setRegistryName(String registryName) {
            this.registryName = registryName;
            return this;
        }
        public String getRegistryName() {
            return this.registryName;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setRegistryVersion(String registryVersion) {
            this.registryVersion = registryVersion;
            return this;
        }
        public String getRegistryVersion() {
            return this.registryVersion;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setTransPerHour(Integer transPerHour) {
            this.transPerHour = transPerHour;
            return this;
        }
        public Integer getTransPerHour() {
            return this.transPerHour;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListPrivateRegistryListResponseBodyImageRegistryInfos setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

}
