// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFlowRecordRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static QueryLDCFlowRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFlowRecordRequest self = new QueryLDCFlowRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCFlowRecordRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public QueryLDCFlowRecordRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryLDCFlowRecordRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryLDCFlowRecordRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLDCFlowRecordRequest setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCFlowRecordRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public QueryLDCFlowRecordRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryLDCFlowRecordRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
