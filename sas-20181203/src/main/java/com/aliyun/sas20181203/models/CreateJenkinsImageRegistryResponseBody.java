// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageRegistryResponseBody extends TeaModel {
    /**
     * <p>The result of creating the image repository.</p>
     */
    @NameInMap("Data")
    public CreateJenkinsImageRegistryResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AF1E723-53F1-55BF-A4B2-15CB7A32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time consumed. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeCost")
    public Long timeCost;

    public static CreateJenkinsImageRegistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJenkinsImageRegistryResponseBody self = new CreateJenkinsImageRegistryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJenkinsImageRegistryResponseBody setData(CreateJenkinsImageRegistryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateJenkinsImageRegistryResponseBodyData getData() {
        return this.data;
    }

    public CreateJenkinsImageRegistryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateJenkinsImageRegistryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJenkinsImageRegistryResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class CreateJenkinsImageRegistryResponseBodyData extends TeaModel {
        /**
         * <p>The blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>61.9.XXX.XXX</p>
         */
        @NameInMap("BlackList")
        public String blackList;

        /**
         * <p>The domain name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The creation time. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-16 18:17:16</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-21 10:40:01</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>443496</p>
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
         * <p>1</p>
         */
        @NameInMap("NetType")
        public Integer netType;

        /**
         * <p>The password.</p>
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
         * <p>30</p>
         */
        @NameInMap("PersistenceDay")
        public Integer persistenceDay;

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
        public Integer protocolType;

        /**
         * <p>The region ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IP address of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>1.13.XXX.XXX</p>
         */
        @NameInMap("RegistryHostIp")
        public String registryHostIp;

        /**
         * <p>The alias of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>fanyi</p>
         */
        @NameInMap("RegistryName")
        public String registryName;

        /**
         * <p>The type of the image repository. Valid values:</p>
         * <ul>
         * <li><strong>CI/CD</strong>: Jenkins</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CI/CD</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The authentication token of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>3c3c602c-fa1f-4bc0-992f-b4b2cac7****</p>
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
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>RegistryUser</p>
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

        /**
         * <p>The whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XXX.XXX</p>
         */
        @NameInMap("WhiteList")
        public String whiteList;

        public static CreateJenkinsImageRegistryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateJenkinsImageRegistryResponseBodyData self = new CreateJenkinsImageRegistryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateJenkinsImageRegistryResponseBodyData setBlackList(String blackList) {
            this.blackList = blackList;
            return this;
        }
        public String getBlackList() {
            return this.blackList;
        }

        public CreateJenkinsImageRegistryResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public CreateJenkinsImageRegistryResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateJenkinsImageRegistryResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateJenkinsImageRegistryResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateJenkinsImageRegistryResponseBodyData setNetType(Integer netType) {
            this.netType = netType;
            return this;
        }
        public Integer getNetType() {
            return this.netType;
        }

        public CreateJenkinsImageRegistryResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateJenkinsImageRegistryResponseBodyData setPersistenceDay(Integer persistenceDay) {
            this.persistenceDay = persistenceDay;
            return this;
        }
        public Integer getPersistenceDay() {
            return this.persistenceDay;
        }

        public CreateJenkinsImageRegistryResponseBodyData setProtocolType(Integer protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public Integer getProtocolType() {
            return this.protocolType;
        }

        public CreateJenkinsImageRegistryResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateJenkinsImageRegistryResponseBodyData setRegistryHostIp(String registryHostIp) {
            this.registryHostIp = registryHostIp;
            return this;
        }
        public String getRegistryHostIp() {
            return this.registryHostIp;
        }

        public CreateJenkinsImageRegistryResponseBodyData setRegistryName(String registryName) {
            this.registryName = registryName;
            return this;
        }
        public String getRegistryName() {
            return this.registryName;
        }

        public CreateJenkinsImageRegistryResponseBodyData setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public CreateJenkinsImageRegistryResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public CreateJenkinsImageRegistryResponseBodyData setTransPerHour(Integer transPerHour) {
            this.transPerHour = transPerHour;
            return this;
        }
        public Integer getTransPerHour() {
            return this.transPerHour;
        }

        public CreateJenkinsImageRegistryResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateJenkinsImageRegistryResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateJenkinsImageRegistryResponseBodyData setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

}
