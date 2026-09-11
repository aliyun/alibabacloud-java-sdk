// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SearchAliDingGroupChatsResponseBody extends TeaModel {
    /**
     * <p>业务状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>是否还有下一页</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    @NameInMap("items")
    public java.util.List<SearchAliDingGroupChatsResponseBodyItems> items;

    /**
     * <p>错误描述，成功时为空</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>下一页分页游标，末页为空</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextCursor")
    public String nextCursor;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>request-id</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SearchAliDingGroupChatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAliDingGroupChatsResponseBody self = new SearchAliDingGroupChatsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAliDingGroupChatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchAliDingGroupChatsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public SearchAliDingGroupChatsResponseBody setItems(java.util.List<SearchAliDingGroupChatsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<SearchAliDingGroupChatsResponseBodyItems> getItems() {
        return this.items;
    }

    public SearchAliDingGroupChatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchAliDingGroupChatsResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public SearchAliDingGroupChatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchAliDingGroupChatsResponseBodyItems extends TeaModel {
        /**
         * <p>阿里钉群聊 ID</p>
         * 
         * <strong>example:</strong>
         * <p>cid-example</p>
         */
        @NameInMap("chatId")
        public String chatId;

        /**
         * <p>会话类型</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNAL_GROUP</p>
         */
        @NameInMap("conversationType")
        public String conversationType;

        /**
         * <p>当前用户是否开启免打扰</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("muted")
        public Boolean muted;

        /**
         * <p>群聊标题</p>
         * 
         * <strong>example:</strong>
         * <p>客户项目群</p>
         */
        @NameInMap("title")
        public String title;

        public static SearchAliDingGroupChatsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            SearchAliDingGroupChatsResponseBodyItems self = new SearchAliDingGroupChatsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public SearchAliDingGroupChatsResponseBodyItems setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public SearchAliDingGroupChatsResponseBodyItems setConversationType(String conversationType) {
            this.conversationType = conversationType;
            return this;
        }
        public String getConversationType() {
            return this.conversationType;
        }

        public SearchAliDingGroupChatsResponseBodyItems setMuted(Boolean muted) {
            this.muted = muted;
            return this;
        }
        public Boolean getMuted() {
            return this.muted;
        }

        public SearchAliDingGroupChatsResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
