// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRelateMaliciousRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>80****</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Scenario")
    public String scenario;

    public static ListAgentlessRelateMaliciousRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRelateMaliciousRequest self = new ListAgentlessRelateMaliciousRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRelateMaliciousRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAgentlessRelateMaliciousRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public ListAgentlessRelateMaliciousRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAgentlessRelateMaliciousRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAgentlessRelateMaliciousRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

}
