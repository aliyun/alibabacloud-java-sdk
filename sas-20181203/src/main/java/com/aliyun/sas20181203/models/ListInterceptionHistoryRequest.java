// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionHistoryRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The name of the alert.</p>
     */
    @NameInMap("HistoryName")
    public String historyName;

    /**
     * <p>The types of exceptions.</p>
     */
    @NameInMap("InterceptionTypes")
    public java.util.List<Integer> interceptionTypes;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start of the time range to query. The value is a UNIX timestamp.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListInterceptionHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionHistoryRequest self = new ListInterceptionHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListInterceptionHistoryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListInterceptionHistoryRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListInterceptionHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListInterceptionHistoryRequest setHistoryName(String historyName) {
        this.historyName = historyName;
        return this;
    }
    public String getHistoryName() {
        return this.historyName;
    }

    public ListInterceptionHistoryRequest setInterceptionTypes(java.util.List<Integer> interceptionTypes) {
        this.interceptionTypes = interceptionTypes;
        return this;
    }
    public java.util.List<Integer> getInterceptionTypes() {
        return this.interceptionTypes;
    }

    public ListInterceptionHistoryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListInterceptionHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInterceptionHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
