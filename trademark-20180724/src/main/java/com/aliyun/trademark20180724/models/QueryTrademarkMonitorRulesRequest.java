// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkMonitorRulesRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("NotifyUpdate")
    public Integer notifyUpdate;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryTrademarkMonitorRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkMonitorRulesRequest self = new QueryTrademarkMonitorRulesRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkMonitorRulesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryTrademarkMonitorRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public QueryTrademarkMonitorRulesRequest setNotifyUpdate(Integer notifyUpdate) {
        this.notifyUpdate = notifyUpdate;
        return this;
    }
    public Integer getNotifyUpdate() {
        return this.notifyUpdate;
    }

    public QueryTrademarkMonitorRulesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTrademarkMonitorRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
