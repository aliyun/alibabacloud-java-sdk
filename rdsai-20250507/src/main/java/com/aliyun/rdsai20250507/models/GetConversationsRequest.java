// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetConversationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-iBuGU1VxEY42zrQRQfNA****</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <strong>example:</strong>
     * <p>77be60cd-237b-4ca9-9c46-48b663cb****</p>
     */
    @NameInMap("LastId")
    public String lastId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Pinned")
    public String pinned;

    /**
     * <strong>example:</strong>
     * <p>CreatedAt</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static GetConversationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConversationsRequest self = new GetConversationsRequest();
        return TeaModel.build(map, self);
    }

    public GetConversationsRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
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
