// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionHistoryRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster to query.</p>
     * 
     * <strong>example:</strong>
     * <p>c7c190a82d9a048be9038d352840f****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number of the current page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end timestamp of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1635575219000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The alert name.</p>
     * 
     * <strong>example:</strong>
     * <p>异常访问。</p>
     */
    @NameInMap("HistoryName")
    public String historyName;

    /**
     * <p>The types of exception events.</p>
     */
    @NameInMap("InterceptionTypes")
    public java.util.List<Integer> interceptionTypes;

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
     * <p>The maximum number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start timestamp of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1651290987000</p>
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
