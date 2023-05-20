// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageRegistryResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateJenkinsImageRegistryResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BlackList")
        public String blackList;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NetType")
        public Integer netType;

        @NameInMap("Password")
        public String password;

        @NameInMap("PersistenceDay")
        public Integer persistenceDay;

        @NameInMap("ProtocolType")
        public Integer protocolType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegistryHostIp")
        public String registryHostIp;

        @NameInMap("RegistryName")
        public String registryName;

        @NameInMap("RegistryType")
        public String registryType;

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
