// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SearchAliDingGroupChatsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Indicates whether more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The user group tree node information.</p>
     */
    @NameInMap("items")
    public java.util.List<SearchAliDingGroupChatsResponseBodyItems> items;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The starting cursor for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextCursor")
    public String nextCursor;

    /**
     * <p>The request ID.</p>
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
         * <p>The conversation ID. This ID is typically used for JSSDK.</p>
         * 
         * <strong>example:</strong>
         * <p>cid-example</p>
         */
        @NameInMap("chatId")
        public String chatId;

        /**
         * <p>The conversation type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: one-on-one chat.</li>
         * <li><strong>1</strong>: group chat.</li>
         * </ul>
         * <blockquote>
         * <p>For a one-on-one chat, you do not need to specify <strong>openConversationId</strong>. Specify the employee ID in <strong>receiverUserIdList</strong>. For a one-on-one chat between two users, specify the employee ID of either user. For a one-on-one chat between a user and a bot, specify the employee ID of the user.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>INTERNAL_GROUP</p>
         */
        @NameInMap("conversationType")
        public String conversationType;

        /**
         * <p>Indicates whether the current user has enabled the Do Not Disturb mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("muted")
        public Boolean muted;

        /**
         * <p>The title of the scheduled meeting.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer project group</p>
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
