// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMessagesRequest extends TeaModel {
    /**
     * <p>The end time of the query time range. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-09 09:00:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The lite topic name.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("liteTopicName")
    public String liteTopicName;

    /**
     * <p>The message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7F00000100207A4F0F294A938F7807AE</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>The message key.</p>
     * 
     * <strong>example:</strong>
     * <p>XSCBillResult</p>
     */
    @NameInMap("messageKey")
    public String messageKey;

    /**
     * <p>The current page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The scroll ID for the request.</p>
     * <p>You do not need to specify this parameter for the first page request. For subsequent page requests, specify this parameter based on the value returned from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>B13D0B07-F24B-4790-88D8-D47A38063D00</p>
     */
    @NameInMap("scrollId")
    public String scrollId;

    /**
     * <p>The start time of the query time range. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-09 08:00:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static ListMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessagesRequest self = new ListMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListMessagesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListMessagesRequest setLiteTopicName(String liteTopicName) {
        this.liteTopicName = liteTopicName;
        return this;
    }
    public String getLiteTopicName() {
        return this.liteTopicName;
    }

    public ListMessagesRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ListMessagesRequest setMessageKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }
    public String getMessageKey() {
        return this.messageKey;
    }

    public ListMessagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMessagesRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public ListMessagesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
