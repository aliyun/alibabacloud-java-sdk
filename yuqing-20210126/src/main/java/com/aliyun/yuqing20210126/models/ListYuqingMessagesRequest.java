// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ListYuqingMessagesRequest extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("searchCondition")
    public SearchCondition searchCondition;

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
