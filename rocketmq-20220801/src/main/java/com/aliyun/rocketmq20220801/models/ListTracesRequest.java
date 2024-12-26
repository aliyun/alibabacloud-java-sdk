// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTracesRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-19 10:10:09</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The message ID.</p>
     * <p>This parameter is required if you set queryType to MESSAGE_ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0100163E0EC1F1965C04C7906700000000</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>The message key.</p>
     * <p>This parameter is required if you set queryType to MESSAGE_ID.</p>
     * 
     * <strong>example:</strong>
     * <p>order_ceating</p>
     */
    @NameInMap("messageKey")
    public String messageKey;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The query type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>MESSAGE_ID</li>
     * <li>MESSAGE_KEY</li>
     * <li>TOPIC</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MESSAGE_ID</p>
     */
    @NameInMap("queryType")
    public String queryType;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-10 10:42:11</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static ListTracesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTracesRequest self = new ListTracesRequest();
        return TeaModel.build(map, self);
    }

    public ListTracesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTracesRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ListTracesRequest setMessageKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }
    public String getMessageKey() {
        return this.messageKey;
    }

    public ListTracesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTracesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTracesRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListTracesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
