// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryReportNotifiesRequest extends TeaModel {
    @NameInMap("cpId")
    public Long cpId;

    @NameInMap("createEndTimestamp")
    public Long createEndTimestamp;

    @NameInMap("createStartTimestamp")
    public Long createStartTimestamp;

    @NameInMap("pageNow")
    public Long pageNow;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("subject")
    public String subject;

    @NameInMap("teamHashId")
    public String teamHashId;

    @NameInMap("type")
    public Long type;

    public static QueryReportNotifiesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReportNotifiesRequest self = new QueryReportNotifiesRequest();
        return TeaModel.build(map, self);
    }

    public QueryReportNotifiesRequest setCpId(Long cpId) {
        this.cpId = cpId;
        return this;
    }
    public Long getCpId() {
        return this.cpId;
    }

    public QueryReportNotifiesRequest setCreateEndTimestamp(Long createEndTimestamp) {
        this.createEndTimestamp = createEndTimestamp;
        return this;
    }
    public Long getCreateEndTimestamp() {
        return this.createEndTimestamp;
    }

    public QueryReportNotifiesRequest setCreateStartTimestamp(Long createStartTimestamp) {
        this.createStartTimestamp = createStartTimestamp;
        return this;
    }
    public Long getCreateStartTimestamp() {
        return this.createStartTimestamp;
    }

    public QueryReportNotifiesRequest setPageNow(Long pageNow) {
        this.pageNow = pageNow;
        return this;
    }
    public Long getPageNow() {
        return this.pageNow;
    }

    public QueryReportNotifiesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryReportNotifiesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReportNotifiesRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public QueryReportNotifiesRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

    public QueryReportNotifiesRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
