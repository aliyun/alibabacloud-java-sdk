// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetConversationsResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetConversationsResponseBodyData> data;

    /**
     * <p>Indicates whether the current page is followed by a page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasMore")
    public String hasMore;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetConversationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConversationsResponseBody self = new GetConversationsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConversationsResponseBody setData(java.util.List<GetConversationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetConversationsResponseBodyData> getData() {
        return this.data;
    }

    public GetConversationsResponseBody setHasMore(String hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public String getHasMore() {
        return this.hasMore;
    }

    public GetConversationsResponseBody setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetConversationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConversationsResponseBodyData extends TeaModel {
        /**
         * <p>The creation time of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>1764055092</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The ID of the history conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>60b335ca-124d-4ee1-864b-de554987****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The introduction to the conversation.</p>
         */
        @NameInMap("Introduction")
        public String introduction;

        /**
         * <p>The name of the history conversation.</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetConversationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConversationsResponseBodyData self = new GetConversationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConversationsResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetConversationsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetConversationsResponseBodyData setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public GetConversationsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
