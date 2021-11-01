// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryReportNotifiesRequest extends TeaModel {
    // 自定义页面id
    @NameInMap("cpId")
    public Long cpId;

    // 创建截止时间,毫秒
    @NameInMap("createEndTimestamp")
    public Long createEndTimestamp;

    // 创建开始时间，毫秒
    @NameInMap("createStartTimestamp")
    public Long createStartTimestamp;

    // 当前页数，从1开始
    @NameInMap("pageNow")
    public Long pageNow;

    // 分页大小
    @NameInMap("pageSize")
    public Long pageSize;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    // 主题
    @NameInMap("subject")
    public String subject;

    // 舆情团队HashId
    @NameInMap("teamHashId")
    public String teamHashId;

    // 类型： 如邮件、钉钉等
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
