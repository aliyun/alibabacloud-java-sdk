// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddPrivateRegistryResponseBody extends TeaModel {
    /**
     * <p>The handling result.</p>
     */
    @NameInMap("Data")
    public AddPrivateRegistryResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The domain name of the image repository.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ID of the image repository.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The network type. Valid values:</p>
         * <br>
         * <p>*   **1**: Internet</p>
         * <p>*   **2**: VPC</p>
         */
        @NameInMap("NetType")
        public Long netType;

        /**
         * <p>The password.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <br>
         * <p>*   **1**: HTTP</p>
         * <p>*   **2**: HTTPS</p>
         */
        @NameInMap("ProtocolType")
        public Long protocolType;

        /**
         * <p>The region ID of the image repository.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IP address of the image repository.</p>
         */
        @NameInMap("RegistryHostIp")
        public String registryHostIp;

        /**
         * <p>The type of the image repository. Valid values:</p>
         * <br>
         * <p>*   **harbor**</p>
         * <p>*   **quay**</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The version of the image repository. Default value: -. Valid values:</p>
         * <br>
         * <p>*   **-**: the default version</p>
         * <p>*   **V1**</p>
         * <p>*   **V2**</p>
         */
        @NameInMap("RegistryVersion")
        public String registryVersion;

        /**
         * <p>The value of the token.</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The number of scan tasks that are performed per hour.</p>
         */
        @NameInMap("TransPerHour")
        public Integer transPerHour;

        /**
         * <p>The username.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The ID of the VPC.</p>
         */
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
