// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PageImageRegistryResponseBody extends TeaModel {
    /**
     * <p>The image repository list data.</p>
     */
    @NameInMap("List")
    public java.util.List<PageImageRegistryResponseBodyList> list;

    /**
     * <p>The pagination information for the paged query.</p>
     */
    @NameInMap("PageInfo")
    public PageImageRegistryResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request and can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>FDA9E37C-6114-5945-8FF1-E3D4D397****</p>
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
         * <p>The blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>129.211.XXX.XXX</p>
         */
        @NameInMap("BlackList")
        public String blackList;

        /**
         * <p>The domain name of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>sinochem.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The creation time, in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-30 10:23:30</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time, in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-30 10:23:30</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The unique ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>1078312</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of images in the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ImageCount")
        public Integer imageCount;

        /**
         * <p>The Jenkins environment context.</p>
         * 
         * <strong>example:</strong>
         * <p>projectInfo</p>
         */
        @NameInMap("JenkinsEnv")
        public String jenkinsEnv;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: public network</li>
         * <li><strong>2</strong>: VPC.</li>
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
         * <p>The number of days that assets are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PersistenceDay")
        public Integer persistenceDay;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: HTTP</li>
         * <li><strong>2</strong>: HTTPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProtocolType")
        public Integer protocolType;

        /**
         * <p>The region ID of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IP address of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>39.104.XXX.XXX</p>
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
         * <p>The image repository type. Valid values:</p>
         * <ul>
         * <li><strong>acr</strong>: ACR</li>
         * <li><strong>harbor</strong>: Harbor</li>
         * <li><strong>quay</strong>: Quay</li>
         * <li><strong>CI/CD</strong>: Jenkins.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>harbor</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The authentication token of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>c7b90d29-632f-4e58-88b8-00ad77f6****</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The number of scan tasks per hour.</p>
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
         * <p>The instance ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-5gu8iu68w9b472jbb****</p>
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
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the current page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
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
