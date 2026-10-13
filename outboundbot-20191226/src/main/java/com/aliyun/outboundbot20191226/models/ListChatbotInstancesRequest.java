// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListChatbotInstancesRequest extends TeaModel {
    /**
     * <p>The access key of the chatbot workspace.</p>
     * <blockquote>
     * <p>You can obtain the value by calling the ListChatbotAgents operation. If you leave this parameter empty, chatbots in all workspaces are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9137ab9c27044921860030adf8590ec4_p_outbound_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <blockquote>
     * <p>The value of this parameter must be less than or equal to 50.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListChatbotInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatbotInstancesRequest self = new ListChatbotInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListChatbotInstancesRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListChatbotInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListChatbotInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
