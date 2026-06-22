// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailRequest extends TeaModel {
    /**
     * <p>The type of Asset Fingerprints to query. Default value: <strong>sca</strong>. Valid values:</p>
     * <ul>
     * <li><strong>sca</strong>: middleware</li>
     * <li><strong>sca_database</strong>: database</li>
     * <li><strong>sca_web</strong>: web service</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not set, the default value <strong>sca</strong> is used, which queries Asset Fingerprints information of the middleware type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("Biz")
    public String biz;

    /**
     * <p>The type of middleware, database, or web service to query. Valid values:  </p>
     * <ul>
     * <li><strong>system_service</strong>: system service</li>
     * <li><strong>software_library</strong>: software library</li>
     * <li><strong>docker_component</strong>: container component</li>
     * <li><strong>database</strong>: database</li>
     * <li><strong>web_container</strong>: web container</li>
     * <li><strong>jar</strong>: JAR package</li>
     * <li><strong>web_framework</strong>: web framework.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system_service</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The page number of the page to return in the query results. Default value: <strong>1</strong>, which indicates that the results are displayed starting from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
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
     * <p>This parameter is deprecated. You do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Name")
    public Long name;

    /**
     * <p>The token that marks the current position from which to start reading. Leave this parameter empty to start reading from the beginning.</p>
     * <blockquote>
     * <p>Do not specify this parameter for the first call. The response includes the NextToken value for the second call. Each subsequent response contains the NextToken value for the next call.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6k+AtdhNE3kgQEK36GujZ5on+tWdc+4WoaoMP/kUNxxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Sets the number of Asset Fingerprints entries per page in a paged query. Default value: <strong>10</strong>, which indicates that 10 Asset Fingerprints entries are displayed per page.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The process ID.</p>
     * 
     * <strong>example:</strong>
     * <p>756</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The port on which the process listens.</p>
     * 
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The end of the time range for querying the process start timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1641110965</p>
     */
    @NameInMap("ProcessStartedEnd")
    public Long processStartedEnd;

    /**
     * <p>The start of the time range for querying the process start timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1641024565</p>
     */
    @NameInMap("ProcessStartedStart")
    public Long processStartedStart;

    /**
     * <p>The search condition (server name or IP address).</p>
     * <blockquote>
     * <p>Fuzzy match is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The name of the Asset Fingerprints entry to query.</p>
     * 
     * <strong>example:</strong>
     * <p>openssl</p>
     */
    @NameInMap("ScaName")
    public String scaName;

    /**
     * <p>The process name.</p>
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

    /**
     * <p>The list of search criteria.</p>
     */
    @NameInMap("SearchCriteriaList")
    public java.util.List<DescribePropertyScaDetailRequestSearchCriteriaList> searchCriteriaList;

    /**
     * <p>The content to query. Depending on the value of <strong>SearchItem</strong>, you need to enter different query content:</p>
     * <ul>
     * <li>If <strong>SearchItem</strong> is set to <strong>name</strong>, enter the name of the asset fingerprint as the query condition.</li>
     * <li>If <strong>SearchItem</strong> is set to <strong>type</strong>, select the type of asset fingerprint to query. Valid values:   <ul>
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
     * <p>The <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters must be used together. Setting only one of them has no effect. By setting both parameters, you can view all data for asset fingerprints of a specified name or type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>openssl</p>
     */
    @NameInMap("SearchInfo")
    public String searchInfo;

    /**
     * <p>The content of the sub-query condition. Depending on the value of <strong>SearchItemSub</strong>, you need to enter different query content:</p>
     * <ul>
     * <li>If <strong>SearchItemSub</strong> is set to <strong>port</strong>, enter the port as the sub-query condition.</li>
     * <li>If <strong>SearchItemSub</strong> is set to <strong>pid</strong>, enter the process ID as the sub-query condition.</li>
     * <li>If <strong>SearchItemSub</strong> is set to <strong>version</strong>, enter the middleware, database, or web service version as the sub-query condition.</li>
     * <li>If <strong>SearchItemSub</strong> is set to <strong>user</strong>, enter the username as the sub-query condition.</li>
     * </ul>
     * <blockquote>
     * <p>Sub-query conditions help you search for the data list of a specific middleware, database, or web service.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1.0.2k</p>
     */
    @NameInMap("SearchInfoSub")
    public String searchInfoSub;

    /**
     * <p>The type of query condition. Valid values:</p>
     * <ul>
     * <li><strong>name</strong>: the name of the middleware, database, or web service.</li>
     * <li><strong>type</strong>: the type of the middleware, database, or web service.</li>
     * </ul>
     * <blockquote>
     * <p>The <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters must be used together. Setting only one of them has no effect. By setting both parameters, you can view all data for asset fingerprints of a specified name or type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("SearchItem")
    public String searchItem;

    /**
     * <p>The type of sub-query condition. Valid values:</p>
     * <ul>
     * <li><strong>port</strong>: port</li>
     * <li><strong>pid</strong>: process ID</li>
     * <li><strong>version</strong>: version</li>
     * <li><strong>user</strong>: user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>version</p>
     */
    @NameInMap("SearchItemSub")
    public String searchItemSub;

    /**
     * <p>Specifies whether to use the NextToken method to retrieve asset list data. If this parameter is used, TotalCount is no longer returned. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Use the NextToken method.</li>
     * <li><strong>false</strong>: Do not use the NextToken method.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    /**
     * <p>The user that runs the process.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The UUID of the server on which the middleware, database, or web service is deployed.</p>
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
         * <p>The name of the search criterion.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The filter value of the search criterion.</p>
         * 
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
