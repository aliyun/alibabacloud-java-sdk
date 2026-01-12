// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetConversationsRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to <strong>GetConversations</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>77be60cd-237b-4ca9-9c46-48b663cb****</p>
     */
    @NameInMap("LastId")
    public String lastId;

    /**
     * <p>The ID of the last conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Pinned")
    public String pinned;

    /**
     * <p>Specifies whether to pin the application.</p>
     * 
     * <strong>example:</strong>
     * <p>CreatedAt</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static GetConversationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConversationsRequest self = new GetConversationsRequest();
        return TeaModel.build(map, self);
    }

    public GetConversationsRequest setLastId(String lastId) {
        this.lastId = lastId;
        return this;
    }
    public String getLastId() {
        return this.lastId;
    }

    public GetConversationsRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public GetConversationsRequest setPinned(String pinned) {
        this.pinned = pinned;
        return this;
    }
    public String getPinned() {
        return this.pinned;
    }

    public GetConversationsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
