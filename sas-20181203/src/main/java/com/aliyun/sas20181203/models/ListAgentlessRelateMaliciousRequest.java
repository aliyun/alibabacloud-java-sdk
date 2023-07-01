// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRelateMaliciousRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EventId")
    public Long eventId;

    @NameInMap("PageSize")
    public String pageSize;

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

    public ListAgentlessRelateMaliciousRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
