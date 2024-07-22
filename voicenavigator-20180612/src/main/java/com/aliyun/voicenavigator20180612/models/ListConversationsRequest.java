// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1638288000000</p>
     */
    @NameInMap("BeginTimeLeftRange")
    public Long beginTimeLeftRange;

    /**
     * <strong>example:</strong>
     * <p>1637547875311</p>
     */
    @NameInMap("BeginTimeRightRange")
    public Long beginTimeRightRange;

    /**
     * <strong>example:</strong>
     * <p>138106*****</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSandBox")
    public String isSandBox;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>13788914724</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
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
