// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PageImageRegistryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<PageImageRegistryResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public PageImageRegistryResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PageImageRegistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageImageRegistryResponseBody self = new PageImageRegistryResponseBody();
        return TeaModel.build(map, self);
    }

    public PageImageRegistryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageImageRegistryResponseBody setList(java.util.List<PageImageRegistryResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<PageImageRegistryResponseBodyList> getList() {
        return this.list;
    }

    public PageImageRegistryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageImageRegistryResponseBody setPageInfo(PageImageRegistryResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageImageRegistryResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public PageImageRegistryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageImageRegistryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageImageRegistryResponseBodyList extends TeaModel {
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

        // 包含的镜像数量
        @NameInMap("ImageCount")
        public Integer imageCount;

        @NameInMap("JenkinsEnv")
        public String jenkinsEnv;

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

        public static PageImageRegistryResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            PageImageRegistryResponseBodyList self = new PageImageRegistryResponseBodyList();
            return TeaModel.build(map, self);
        }

        public PageImageRegistryResponseBodyList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public PageImageRegistryResponseBodyList setBlackList(String blackList) {
            this.blackList = blackList;
            return this;
        }
        public String getBlackList() {
            return this.blackList;
        }

        public PageImageRegistryResponseBodyList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public PageImageRegistryResponseBodyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public PageImageRegistryResponseBodyList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public PageImageRegistryResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PageImageRegistryResponseBodyList setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

        public PageImageRegistryResponseBodyList setJenkinsEnv(String jenkinsEnv) {
            this.jenkinsEnv = jenkinsEnv;
            return this;
        }
        public String getJenkinsEnv() {
            return this.jenkinsEnv;
        }

        public PageImageRegistryResponseBodyList setNetType(Integer netType) {
            this.netType = netType;
            return this;
        }
        public Integer getNetType() {
            return this.netType;
        }

        public PageImageRegistryResponseBodyList setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public PageImageRegistryResponseBodyList setPersistenceDay(Integer persistenceDay) {
            this.persistenceDay = persistenceDay;
            return this;
        }
        public Integer getPersistenceDay() {
            return this.persistenceDay;
        }

        public PageImageRegistryResponseBodyList setProtocolType(Integer protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public Integer getProtocolType() {
            return this.protocolType;
        }

        public PageImageRegistryResponseBodyList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public PageImageRegistryResponseBodyList setRegistryHostIp(String registryHostIp) {
            this.registryHostIp = registryHostIp;
            return this;
        }
        public String getRegistryHostIp() {
            return this.registryHostIp;
        }

        public PageImageRegistryResponseBodyList setRegistryName(String registryName) {
            this.registryName = registryName;
            return this;
        }
        public String getRegistryName() {
            return this.registryName;
        }

        public PageImageRegistryResponseBodyList setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public PageImageRegistryResponseBodyList setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public PageImageRegistryResponseBodyList setTransPerHour(Integer transPerHour) {
            this.transPerHour = transPerHour;
            return this;
        }
        public Integer getTransPerHour() {
            return this.transPerHour;
        }

        public PageImageRegistryResponseBodyList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public PageImageRegistryResponseBodyList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public PageImageRegistryResponseBodyList setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class PageImageRegistryResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static PageImageRegistryResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            PageImageRegistryResponseBodyPageInfo self = new PageImageRegistryResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public PageImageRegistryResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public PageImageRegistryResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public PageImageRegistryResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public PageImageRegistryResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
