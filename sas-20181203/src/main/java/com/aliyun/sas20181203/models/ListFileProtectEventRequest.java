// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectEventRequest extends TeaModel {
    /**
     * <p>The severities of alerts.</p>
     */
    @NameInMap("AlertLevels")
    public java.util.List<Integer> alertLevels;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The status of the event. Valid values:</p>
     * <br>
     * <p>*   0: unhandled</p>
     * <p>*   1: handled</p>
     * <p>*   2: added to the whitelist</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListFileProtectEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectEventRequest self = new ListFileProtectEventRequest();
        return TeaModel.build(map, self);
    }

    public ListFileProtectEventRequest setAlertLevels(java.util.List<Integer> alertLevels) {
        this.alertLevels = alertLevels;
        return this;
    }
    public java.util.List<Integer> getAlertLevels() {
        return this.alertLevels;
    }

    public ListFileProtectEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListFileProtectEventRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListFileProtectEventRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListFileProtectEventRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
