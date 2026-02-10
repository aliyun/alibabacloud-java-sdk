// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailRequest extends TeaModel {
    /**
     * <p>The type of the asset fingerprint that you want to query. Default value: <strong>sca</strong>. Valid values:</p>
     * <ul>
     * <li><strong>sca</strong>: middleware</li>
     * <li><strong>sca_database</strong>: database</li>
     * <li><strong>sca_web</strong>: web service</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, the default value <strong>sca</strong> is used, which indicates that middleware fingerprints are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("Biz")
    public String biz;

    /**
     * <p>The type of the middleware, database, or web service that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>system_service</strong>: system service</li>
     * <li><strong>software_library</strong>: software library</li>
     * <li><strong>docker_component</strong>: container component</li>
     * <li><strong>database</strong>: database</li>
     * <li><strong>web_container</strong>: web container</li>
     * <li><strong>jar</strong>: JAR package</li>
     * <li><strong>web_framework</strong>: web framework</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system_service</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the middleware, database, or web service.</p>
     * <blockquote>
     * <p> This parameter is deprecated. You can ignore it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Name")
    public Long name;

    /**
     * <p>The value of NextToken that is returned when the NextToken method is used. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6k+AtdhNE3kgQEK36GujZ5on+tWdc+4WoaoMP/kUNxxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The PID.</p>
     * 
     * <strong>example:</strong>
     * <p>756</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The port that the process monitors.</p>
     * 
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The timestamp when the process ends. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1641110965</p>
     */
    @NameInMap("ProcessStartedEnd")
    public Long processStartedEnd;

    /**
     * <p>The timestamp when the process starts. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1641024565</p>
     */
    @NameInMap("ProcessStartedStart")
    public Long processStartedStart;

    /**
     * <p>The search condition, such as a server name or a server IP address.</p>
     * <blockquote>
     * <p> Fuzzy match is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The name of the asset fingerprint that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>openssl</p>
     */
    @NameInMap("ScaName")
    public String scaName;

    /**
     * <p>The name of the process.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("ScaNamePattern")
    public String scaNamePattern;

    /**
     * <p>The version of the middleware, database, or web service.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.2k</p>
     */
    @NameInMap("ScaVersion")
    public String scaVersion;

    @NameInMap("SearchCriteriaList")
    public java.util.List<DescribePropertyScaDetailRequestSearchCriteriaList> searchCriteriaList;

    /**
     * <p>The search keyword. You must specify this parameter based on the value of the <strong>SearchItem</strong> parameter.</p>
     * <ul>
     * <li><p>If the <strong>SearchItem</strong> parameter is set to <strong>name</strong>, you must enter the name of an asset fingerprint.</p>
     * </li>
     * <li><p>If the <strong>SearchItem</strong> parameter is set to <strong>type</strong>, you must enter the type of an asset fingerprint. Valid values:</p>
     * <ul>
     * <li><strong>system_service</strong>: system service</li>
     * <li><strong>software_library</strong>: software library</li>
     * <li><strong>docker_component</strong>: container component</li>
     * <li><strong>database</strong>: database</li>
     * <li><strong>web_container</strong>: web container</li>
     * <li><strong>jar</strong>: JAR package</li>
     * <li><strong>web_framework</strong>: web framework</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the asset fingerprints based on the specified name or type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>openssl</p>
     */
    @NameInMap("SearchInfo")
    public String searchInfo;

    /**
     * <p>The keyword of the subquery. You must specify this parameter based on the value of the <strong>SearchItemSub</strong> parameter.</p>
     * <ul>
     * <li>If the <strong>SearchItemSub</strong> parameter is set to <strong>port</strong>, you must enter a port number.</li>
     * <li>If the <strong>SearchItemSub</strong> parameter is set to <strong>pid</strong>, you must enter a process ID (PID).</li>
     * <li>If the <strong>SearchItemSub</strong> parameter is set to <strong>version</strong>, you must enter the version of a database, middleware, or web service.</li>
     * <li>If the <strong>SearchItemSub</strong> parameter is set to <strong>user</strong>, you must enter a username.</li>
     * </ul>
     * <blockquote>
     * <p> The subquery is used to search for data of a specified database, middleware, or web service.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1.0.2k</p>
     */
    @NameInMap("SearchInfoSub")
    public String searchInfoSub;

    /**
     * <p>The type of the search condition. Valid values:</p>
     * <ul>
     * <li><strong>name</strong>: the name of a database, middleware, or web service</li>
     * <li><strong>type</strong>: the type of a database, middleware, or web service</li>
     * </ul>
     * <blockquote>
     * <p> You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the asset fingerprints based on the specified name or type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("SearchItem")
    public String searchItem;

    /**
     * <p>The type of the subquery. Valid values:</p>
     * <ul>
     * <li><strong>port</strong></li>
     * <li><strong>pid</strong></li>
     * <li><strong>version</strong></li>
     * <li><strong>user</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>version</p>
     */
    @NameInMap("SearchItemSub")
    public String searchItemSub;

    /**
     * <p>Specifies whether to use the NextToken method to retrieve a new page of results. If you set UseNextToken to true, the value of TotalCount is not returned. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The NextToken method is used.</li>
     * <li><strong>false</strong>: The NextToken method is not used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    /**
     * <p>The user who runs the process.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The UUID of the server on which the middleware, database, or web service is run.</p>
     * 
     * <strong>example:</strong>
     * <p>uuid-02ebabe7-1c19-ab****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribePropertyScaDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaDetailRequest self = new DescribePropertyScaDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScaDetailRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public DescribePropertyScaDetailRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribePropertyScaDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyScaDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePropertyScaDetailRequest setName(Long name) {
        this.name = name;
        return this;
    }
    public Long getName() {
        return this.name;
    }

    public DescribePropertyScaDetailRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePropertyScaDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyScaDetailRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public DescribePropertyScaDetailRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribePropertyScaDetailRequest setProcessStartedEnd(Long processStartedEnd) {
        this.processStartedEnd = processStartedEnd;
        return this;
    }
    public Long getProcessStartedEnd() {
        return this.processStartedEnd;
    }

    public DescribePropertyScaDetailRequest setProcessStartedStart(Long processStartedStart) {
        this.processStartedStart = processStartedStart;
        return this;
    }
    public Long getProcessStartedStart() {
        return this.processStartedStart;
    }

    public DescribePropertyScaDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertyScaDetailRequest setScaName(String scaName) {
        this.scaName = scaName;
        return this;
    }
    public String getScaName() {
        return this.scaName;
    }

    public DescribePropertyScaDetailRequest setScaNamePattern(String scaNamePattern) {
        this.scaNamePattern = scaNamePattern;
        return this;
    }
    public String getScaNamePattern() {
        return this.scaNamePattern;
    }

    public DescribePropertyScaDetailRequest setScaVersion(String scaVersion) {
        this.scaVersion = scaVersion;
        return this;
    }
    public String getScaVersion() {
        return this.scaVersion;
    }

    public DescribePropertyScaDetailRequest setSearchCriteriaList(java.util.List<DescribePropertyScaDetailRequestSearchCriteriaList> searchCriteriaList) {
        this.searchCriteriaList = searchCriteriaList;
        return this;
    }
    public java.util.List<DescribePropertyScaDetailRequestSearchCriteriaList> getSearchCriteriaList() {
        return this.searchCriteriaList;
    }

    public DescribePropertyScaDetailRequest setSearchInfo(String searchInfo) {
        this.searchInfo = searchInfo;
        return this;
    }
    public String getSearchInfo() {
        return this.searchInfo;
    }

    public DescribePropertyScaDetailRequest setSearchInfoSub(String searchInfoSub) {
        this.searchInfoSub = searchInfoSub;
        return this;
    }
    public String getSearchInfoSub() {
        return this.searchInfoSub;
    }

    public DescribePropertyScaDetailRequest setSearchItem(String searchItem) {
        this.searchItem = searchItem;
        return this;
    }
    public String getSearchItem() {
        return this.searchItem;
    }

    public DescribePropertyScaDetailRequest setSearchItemSub(String searchItemSub) {
        this.searchItemSub = searchItemSub;
        return this;
    }
    public String getSearchItemSub() {
        return this.searchItemSub;
    }

    public DescribePropertyScaDetailRequest setUseNextToken(Boolean useNextToken) {
        this.useNextToken = useNextToken;
        return this;
    }
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    public DescribePropertyScaDetailRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public DescribePropertyScaDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class DescribePropertyScaDetailRequestSearchCriteriaList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePropertyScaDetailRequestSearchCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyScaDetailRequestSearchCriteriaList self = new DescribePropertyScaDetailRequestSearchCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribePropertyScaDetailRequestSearchCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePropertyScaDetailRequestSearchCriteriaList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
