// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ListYuqingMessagesRequest extends TeaModel {
    // 请求id
    @NameInMap("requestId")
    public String requestId;

    // 查询过滤参数，多个过滤参数之间是且的关系。例如:过滤实例名称为i-a123、i-b123，且实例状态为Stopped：&Filter.1.Name=InstanceName&Filter.1.Value.1=i-a123&Filter.1.Value.2=i-b123&Filter.2.Name=Status&Filter.2.Value=Stopped。
    @NameInMap("searchCondition")
    public SearchCondition searchCondition;

    // 舆情团队HashId
    @NameInMap("teamHashId")
    public String teamHashId;

    public static ListYuqingMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListYuqingMessagesRequest self = new ListYuqingMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListYuqingMessagesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListYuqingMessagesRequest setSearchCondition(SearchCondition searchCondition) {
        this.searchCondition = searchCondition;
        return this;
    }
    public SearchCondition getSearchCondition() {
        return this.searchCondition;
    }

    public ListYuqingMessagesRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
