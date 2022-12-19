// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailRequest extends TeaModel {
    // The type of the asset fingerprint that you want to query. Default value: **sca**. Valid values:
    // 
    // *   **sca**: middleware
    // *   **sca_database**: database
    // *   **sca_web**: web service
    // 
    // >  If you do not specify this parameter, the default value **sca** is used, which indicates that middleware fingerprints are queried.
    @NameInMap("Biz")
    public String biz;

    // The type of the middleware, database, or web service that you want to query. Valid values:
    // 
    // *   **system_service**: system service
    // *   **software_library**: software library
    // *   **docker_component**: container component
    // *   **database**: database
    // *   **web_container**: web container
    // *   **jar**: JAR package
    // *   **web_framework**: web framework
    @NameInMap("BizType")
    public String bizType;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The name of the middleware, database, or web service.
    // 
    // >  This parameter is deprecated. You can ignore it.
    @NameInMap("Name")
    public Long name;

    // The number of entries to return on each page. Default value: **10**.
    // 
    // >  We recommend that you do not leave this parameter empty.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The PID.
    @NameInMap("Pid")
    public String pid;

    // The port that the process monitors.
    @NameInMap("Port")
    public String port;

    // The timestamp when the process ends. Unit: milliseconds.
    @NameInMap("ProcessStartedEnd")
    public Long processStartedEnd;

    // The timestamp when the process starts. Unit: milliseconds.
    @NameInMap("ProcessStartedStart")
    public Long processStartedStart;

    // The search condition, such as a server name or a server IP address.
    // 
    // >  Fuzzy match is supported.
    @NameInMap("Remark")
    public String remark;

    // The name of the asset fingerprint that you want to query.
    @NameInMap("ScaName")
    public String scaName;

    // The name of the process.
    @NameInMap("ScaNamePattern")
    public String scaNamePattern;

    // The version of the middleware, database, or web service.
    @NameInMap("ScaVersion")
    public String scaVersion;

    // The search keyword. You must specify this parameter based on the value of the **SearchItem** parameter.
    // 
    // *   If the **SearchItem** parameter is set to **name**, you must enter the name of an asset fingerprint.
    // 
    // *   If the **SearchItem** parameter is set to **type**, you must enter the type of an asset fingerprint. Valid values:
    // 
    //     *   **system_service**: system service
    //     *   **software_library**: software library
    //     *   **docker_component**: container component
    //     *   **database**: database
    //     *   **web_container**: web container
    //     *   **jar**: JAR package
    //     *   **web_framework**: web framework
    // 
    // >  You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the asset fingerprints based on the specified name or type.
    @NameInMap("SearchInfo")
    public String searchInfo;

    // The keyword of the subquery. You must specify this parameter based on the value of the **SearchItemSub** parameter.
    // 
    // *   If the **SearchItemSub** parameter is set to **port**, you must enter a port number.
    // *   If the **SearchItemSub** parameter is set to **pid**, you must enter a process ID (PID).
    // *   If the **SearchItemSub** parameter is set to **version**, you must enter the version of a database, middleware, or web service.
    // *   If the **SearchItemSub** parameter is set to **user**, you must enter a username.
    // 
    // >  The subquery is used to search for data of a specified database, middleware, or web service.
    @NameInMap("SearchInfoSub")
    public String searchInfoSub;

    // The type of the search condition. Valid values:
    // 
    // *   **name**: the name of a database, middleware, or web service
    // *   **type**: the type of a database, middleware, or web service
    // 
    // >  You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the asset fingerprints based on the specified name or type.
    @NameInMap("SearchItem")
    public String searchItem;

    // The type of the subquery. Valid values:
    // 
    // *   **port**
    // *   **pid**
    // *   **version**
    // *   **user**
    @NameInMap("SearchItemSub")
    public String searchItemSub;

    // The user who runs the process.
    @NameInMap("User")
    public String user;

    // The UUID of the server on which the middleware, database, or web service is run.
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
