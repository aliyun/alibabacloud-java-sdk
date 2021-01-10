// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class QueryConversationsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("BeginTimeLeftRange")
    public Long beginTimeLeftRange;

    @NameInMap("BeginTimeRightRange")
    public Long beginTimeRightRange;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryConversationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationsRequest self = new QueryConversationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryConversationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryConversationsRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public QueryConversationsRequest setBeginTimeLeftRange(Long beginTimeLeftRange) {
        this.beginTimeLeftRange = beginTimeLeftRange;
        return this;
    }
    public Long getBeginTimeLeftRange() {
        return this.beginTimeLeftRange;
    }

    public QueryConversationsRequest setBeginTimeRightRange(Long beginTimeRightRange) {
        this.beginTimeRightRange = beginTimeRightRange;
        return this;
    }
    public Long getBeginTimeRightRange() {
        return this.beginTimeRightRange;
    }

    public QueryConversationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryConversationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
