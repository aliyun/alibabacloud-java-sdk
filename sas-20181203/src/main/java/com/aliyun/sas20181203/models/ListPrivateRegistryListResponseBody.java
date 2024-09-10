// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the image repositories.</p>
     */
    @NameInMap("ImageRegistryInfos")
    public java.util.List<ListPrivateRegistryListResponseBodyImageRegistryInfos> imageRegistryInfos;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578AB****</p>
     */
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
        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1766185894******</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The domain name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>66485</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The information about the Jenkins environment.</p>
         * 
         * <strong>example:</strong>
         * <p>JenkinsInfo</p>
         */
        @NameInMap("JenkinsEnv")
        public String jenkinsEnv;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Internet</li>
         * <li><strong>2</strong>: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetType")
        public Long netType;

        /**
         * <p>The password used to log on to the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>Harbor******</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The number of days during which assets can be retained.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("PersistenceDay")
        public Long persistenceDay;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: HTTP</li>
         * <li><strong>2</strong>: HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProtocolType")
        public Long protocolType;

        /**
         * <p>The region ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IP address of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>114.55.XXX.XXX</p>
         */
        @NameInMap("RegistryHostIp")
        public String registryHostIp;

        /**
         * <p>The alias of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("RegistryName")
        public String registryName;

        /**
         * <p>The type of the image repository. Valid values:</p>
         * <ul>
         * <li><strong>acr</strong>: Container Registry</li>
         * <li><strong>harbor</strong>: Harbor</li>
         * <li><strong>quay</strong>: Quay</li>
         * <li><strong>CI/CD</strong>: Jenkins</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>harbor</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The version of the image repository. Valid values:</p>
         * <ul>
         * <li><strong>V1</strong>: V1.0</li>
         * <li><strong>V2</strong>: V2.0</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        @NameInMap("RegistryVersion")
        public String registryVersion;

        /**
         * <p>The authentication token of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>0da12bce-cc36-4c48-b3e6-2215fc3a****</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The number of images that can be scanned per hour.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TransPerHour")
        public Integer transPerHour;

        /**
         * <p>The username used to log on to the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>RegistryUser</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp12897gqrex01zn0****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The whitelist of IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XXX.XXX</p>
         */
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
