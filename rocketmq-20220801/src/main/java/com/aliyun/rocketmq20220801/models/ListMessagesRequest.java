// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMessagesRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-09 09:00:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>Message Id.</p>
     * 
     * <strong>example:</strong>
     * <p>7F00000100207A4F0F294A938F7807AE</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>Message key.</p>
     * 
     * <strong>example:</strong>
     * <p>XSCBillResult</p>
     */
    @NameInMap("messageKey")
    public String messageKey;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The scroll ID of the request.</p>
     * <p>You do not need to configure this parameter for the first page. This parameter is included in the pagination request based on the result returned for the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>B13D0B07-F24B-4790-88D8-D47A38063D00</p>
     */
    @NameInMap("scrollId")
    public String scrollId;

    /**
     * <p>The beginning of the time range to query.</p>
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
