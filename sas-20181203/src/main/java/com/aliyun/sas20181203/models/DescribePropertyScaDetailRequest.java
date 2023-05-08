// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailRequest extends TeaModel {
    /**
     * <p>The IP address that the process monitors.</p>
     */
    @NameInMap("Biz")
    public String biz;

    /**
     * <p>The type of the asset fingerprint that you want to query. Default value: **sca**. Valid values:</p>
     * <br>
     * <p>*   **sca**: middleware</p>
     * <p>*   **sca_database**: database</p>
     * <p>*   **sca_web**: web service</p>
     * <br>
     * <p>>  If you do not specify this parameter, the default value **sca** is used, which indicates that middleware fingerprints are queried.</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>10</p>
     */
    @NameInMap("Name")
    public Long name;

    /**
     * <p>The type of the middleware, database, or web service. Valid values:</p>
     * <br>
     * <p>*   **system_service**: system service</p>
     * <p>*   **software_library**: software library</p>
     * <p>*   **docker_component**: container component</p>
     * <p>*   **database**: database</p>
     * <p>*   **web_container**: web container</p>
     * <p>*   **jar**: JAR package</p>
     * <p>*   **web_framework**: web framework</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword. You must specify this parameter based on the value of the **SearchItem** parameter.</p>
     * <br>
     * <p>*   If the **SearchItem** parameter is set to **name**, you must enter the name of an asset fingerprint.</p>
     * <br>
     * <p>*   If the **SearchItem** parameter is set to **type**, you must enter the type of an asset fingerprint. Valid values:</p>
     * <br>
     * <p>    *   **system_service**: system service</p>
     * <p>    *   **software_library**: software library</p>
     * <p>    *   **docker_component**: container component</p>
     * <p>    *   **database**: database</p>
     * <p>    *   **web_container**: web container</p>
     * <p>    *   **jar**: JAR package</p>
     * <p>    *   **web_framework**: web framework</p>
     * <br>
     * <p>>  You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the asset fingerprints based on the specified name or type.</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The type of the search condition. Valid values:</p>
     * <br>
     * <p>*   **name**: the name of a database, middleware, or web service</p>
     * <p>*   **type**: the type of a database, middleware, or web service</p>
     * <br>
     * <p>>  You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the asset fingerprints based on the specified name or type.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>system_service</p>
     */
    @NameInMap("ProcessStartedEnd")
    public Long processStartedEnd;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("ProcessStartedStart")
    public Long processStartedStart;

    /**
     * <p>The port of the middleware, database, or web service.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The name of the middleware, database, or web service.</p>
     */
    @NameInMap("ScaName")
    public String scaName;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("ScaNamePattern")
    public String scaNamePattern;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("ScaVersion")
    public String scaVersion;

    /**
     * <p>The public IP address of the server on which the middleware, database, or web service is run.</p>
     */
    @NameInMap("SearchInfo")
    public String searchInfo;

    /**
     * <p>1641110965</p>
     */
    @NameInMap("SearchInfoSub")
    public String searchInfoSub;

    /**
     * <p>The name of the process.</p>
     */
    @NameInMap("SearchItem")
    public String searchItem;

    /**
     * <p>root</p>
     */
    @NameInMap("SearchItemSub")
    public String searchItemSub;

    /**
     * <p>The version of the middleware, database, or web service.</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The details about the asset fingerprints returned.</p>
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

}
