// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAIStaffChatMessagesRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The conversation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81bc5a34-1d8d-4ef7-a208-7401c51b054b</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The number of records per page. Valid values: 10 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The gmtCreate value of the last record on the previous page. Leave this parameter empty for the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("StartCreateTime")
    public String startCreateTime;

    public static ListAIStaffChatMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIStaffChatMessagesRequest self = new ListAIStaffChatMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListAIStaffChatMessagesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListAIStaffChatMessagesRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ListAIStaffChatMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAIStaffChatMessagesRequest setStartCreateTime(String startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }
    public String getStartCreateTime() {
        return this.startCreateTime;
    }

}
