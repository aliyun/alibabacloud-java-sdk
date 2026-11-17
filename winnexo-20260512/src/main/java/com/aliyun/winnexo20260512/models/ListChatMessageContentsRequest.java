// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListChatMessageContentsRequest extends TeaModel {
    /**
     * <p>The maximum length of the attachment content.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("maxCharsPerAttachment")
    public Integer maxCharsPerAttachment;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>source-chat-1</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The ID of the effective tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListChatMessageContentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatMessageContentsRequest self = new ListChatMessageContentsRequest();
        return TeaModel.build(map, self);
    }

    public ListChatMessageContentsRequest setMaxCharsPerAttachment(Integer maxCharsPerAttachment) {
        this.maxCharsPerAttachment = maxCharsPerAttachment;
        return this;
    }
    public Integer getMaxCharsPerAttachment() {
        return this.maxCharsPerAttachment;
    }

    public ListChatMessageContentsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListChatMessageContentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChatMessageContentsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ListChatMessageContentsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
