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
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
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
         * 
         * <strong>example:</strong>
         * <p>1766185894104***</p>
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
         * <p>273698***</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Internet</li>
         * <li><strong>2</strong>: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetType")
        public Long netType;

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: HTTP</li>
         * <li><strong>2</strong>: HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProtocolType")
        public Long protocolType;

        /**
         * <p>The region ID of the image repository.</p>
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
         * <p><code>114.55.**.**</code></p>
         */
        @NameInMap("RegistryHostIp")
        public String registryHostIp;

        /**
         * <p>The type of the image repository. Valid values:</p>
         * <ul>
         * <li><strong>harbor</strong></li>
         * <li><strong>quay</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>harbor</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The version of the image repository. Default value: -. Valid values:</p>
         * <ul>
         * <li><strong>-</strong>: the default version</li>
         * <li><strong>V1</strong></li>
         * <li><strong>V2</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>V2</p>
         */
        @NameInMap("RegistryVersion")
        public String registryVersion;

        /**
         * <p>The value of the token.</p>
         * 
         * <strong>example:</strong>
         * <p>3c3c602c-fa1f-4bc0-992f-b4b2cac7****</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The number of scan tasks that are performed per hour.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TransPerHour")
        public Integer transPerHour;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2vchkxmf2j9yjt3x2****</p>
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
