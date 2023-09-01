// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PageImageRegistryResponseBody extends TeaModel {
    /**
     * <p>An array that consists of image repositories.</p>
     */
    @NameInMap("List")
    public java.util.List<PageImageRegistryResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public PageImageRegistryResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PageImageRegistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageImageRegistryResponseBody self = new PageImageRegistryResponseBody();
        return TeaModel.build(map, self);
    }

    public PageImageRegistryResponseBody setList(java.util.List<PageImageRegistryResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<PageImageRegistryResponseBodyList> getList() {
        return this.list;
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

    public static class PageImageRegistryResponseBodyList extends TeaModel {
        /**
         * <p>The IP address blacklist.</p>
         */
        @NameInMap("BlackList")
        public String blackList;

        /**
         * <p>The domain name of the image repository.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The time when the image repository was created. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the image repository was updated. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the image repository.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of images that are stored in the image repository.</p>
         */
        @NameInMap("ImageCount")
        public Integer imageCount;

        /**
         * <p>The information about the Jenkins environment.</p>
         */
        @NameInMap("JenkinsEnv")
        public String jenkinsEnv;

        /**
         * <p>The network type. Valid values:</p>
         * <br>
         * <p>*   **1**: Internet.</p>
         * <p>*   **2**: virtual private cloud (VPC).</p>
         */
        @NameInMap("NetType")
        public Integer netType;

        /**
         * <p>The password.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The number of days for which assets are retained.</p>
         */
        @NameInMap("PersistenceDay")
        public Integer persistenceDay;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <br>
         * <p>*   **1**: HTTP.</p>
         * <p>*   **2**: HTTPS.</p>
         */
        @NameInMap("ProtocolType")
        public Integer protocolType;

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
         * <p>The alias of the image repository.</p>
         */
        @NameInMap("RegistryName")
        public String registryName;

        /**
         * <p>The type of the image repository. Valid values:</p>
         * <br>
         * <p>*   **acr**: Container Registry.</p>
         * <p>*   **harbor**: Harbor.</p>
         * <p>*   **quay**: Quay.</p>
         * <p>*   **CI/CD**: Jenkins.</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The authentication token of the user.</p>
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
         * <p>The VPC ID.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The IP address whitelist.</p>
         */
        @NameInMap("WhiteList")
        public String whiteList;

        public static PageImageRegistryResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            PageImageRegistryResponseBodyList self = new PageImageRegistryResponseBodyList();
            return TeaModel.build(map, self);
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
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
