// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageRegistryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateJenkinsImageRegistryResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TimeCost")
    public Long timeCost;

    public static CreateJenkinsImageRegistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJenkinsImageRegistryResponseBody self = new CreateJenkinsImageRegistryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJenkinsImageRegistryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public CreateJenkinsImageRegistryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateJenkinsImageRegistryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJenkinsImageRegistryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateJenkinsImageRegistryResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class CreateJenkinsImageRegistryResponseBodyData extends TeaModel {
        // 阿里用户Id
        @NameInMap("AliUid")
        public Long aliUid;

        // 黑名单
        @NameInMap("BlackList")
        public String blackList;

        // 域名
        @NameInMap("DomainName")
        public String domainName;

        // 创建日期
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 更改日期
        @NameInMap("GmtModified")
        public String gmtModified;

        // 唯一ID
        @NameInMap("Id")
        public Long id;

        // 网络类型 1：公网 2：vpc
        @NameInMap("NetType")
        public Integer netType;

        // 密码
        @NameInMap("Password")
        public String password;

        // 资产保存天数
        @NameInMap("PersistenceDay")
        public Integer persistenceDay;

        // 协议类型 1：http 2:https
        @NameInMap("ProtocolType")
        public Integer protocolType;

        // 镜像仓库所在的regionId
        @NameInMap("RegionId")
        public String regionId;

        // 主机Ip地址
        @NameInMap("RegistryHostIp")
        public String registryHostIp;

        // 镜像仓库别名
        @NameInMap("RegistryName")
        public String registryName;

        // 容器镜像服务类型 harbor，quory
        @NameInMap("RegistryType")
        public String registryType;

        // token 用户的唯一标识
        @NameInMap("Token")
        public String token;

        // 每小时扫描任务数
        @NameInMap("TransPerHour")
        public Integer transPerHour;

        // 用户名
        @NameInMap("UserName")
        public String userName;

        // vpcId
        @NameInMap("VpcId")
        public String vpcId;

        // 白名单
        @NameInMap("WhiteList")
        public String whiteList;

        public static CreateJenkinsImageRegistryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateJenkinsImageRegistryResponseBodyData self = new CreateJenkinsImageRegistryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateJenkinsImageRegistryResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
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
