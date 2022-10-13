// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationsRequest extends TeaModel {
    @NameInMap("BeginTimeLeftRange")
    public Long beginTimeLeftRange;

    @NameInMap("BeginTimeRightRange")
    public Long beginTimeRightRange;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsSandBox")
    public String isSandBox;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Query")
    public String query;

    @NameInMap("Result")
    public Long result;

    @NameInMap("RoundsLeftRange")
    public Integer roundsLeftRange;

    @NameInMap("RoundsRightRange")
    public Integer roundsRightRange;

    public static ListConversationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConversationsRequest self = new ListConversationsRequest();
        return TeaModel.build(map, self);
    }

    public ListConversationsRequest setBeginTimeLeftRange(Long beginTimeLeftRange) {
        this.beginTimeLeftRange = beginTimeLeftRange;
        return this;
    }
    public Long getBeginTimeLeftRange() {
        return this.beginTimeLeftRange;
    }

    public ListConversationsRequest setBeginTimeRightRange(Long beginTimeRightRange) {
        this.beginTimeRightRange = beginTimeRightRange;
        return this;
    }
    public Long getBeginTimeRightRange() {
        return this.beginTimeRightRange;
    }

    public ListConversationsRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public ListConversationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListConversationsRequest setIsSandBox(String isSandBox) {
        this.isSandBox = isSandBox;
        return this;
    }
    public String getIsSandBox() {
        return this.isSandBox;
    }

    public ListConversationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConversationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConversationsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListConversationsRequest setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

    public ListConversationsRequest setRoundsLeftRange(Integer roundsLeftRange) {
        this.roundsLeftRange = roundsLeftRange;
        return this;
    }
    public Integer getRoundsLeftRange() {
        return this.roundsLeftRange;
    }

    public ListConversationsRequest setRoundsRightRange(Integer roundsRightRange) {
        this.roundsRightRange = roundsRightRange;
        return this;
    }
    public Integer getRoundsRightRange() {
        return this.roundsRightRange;
    }

}
