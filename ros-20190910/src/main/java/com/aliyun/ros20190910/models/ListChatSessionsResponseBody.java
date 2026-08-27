// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChatSessionsResponseBody extends TeaModel {
    /**
     * <p>A compatibility field. This field is not returned in the current V2 response. Use the MaxResults request parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page. This field may not be returned or may be null on the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>CAES...</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C68F7A5-2D16-5C8F-A4B1-01E9C6A9B0D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The session list of the current user, sorted by update time in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Sessions")
    public java.util.List<ListChatSessionsResponseBodySessions> sessions;

    public static ListChatSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatSessionsResponseBody self = new ListChatSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatSessionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListChatSessionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListChatSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatSessionsResponseBody setSessions(java.util.List<ListChatSessionsResponseBodySessions> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<ListChatSessionsResponseBodySessions> getSessions() {
        return this.sessions;
    }

    public static class ListChatSessionsResponseBodySessions extends TeaModel {
        /**
         * <p>The session mode. Valid values: IaCCodeNormal and IaCCodePipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>IaCCodePipeline</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The session ID. You can use this ID to re-enter a session in StartChat, stop a session in StopChat, or query messages in ListChatMessages.</p>
         * 
         * <strong>example:</strong>
         * <p>7f4e2a8c6d9b4a1f8e3c5b7d2a6f9012</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The session summary. This field currently shares the same source as Title and may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Create a VPC template</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The session title. This field may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Create a VPC template</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>A compatibility field. This field is not returned in the current V2 response. Use UpdatedAt instead.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-26T10:00:00Z</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static ListChatSessionsResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            ListChatSessionsResponseBodySessions self = new ListChatSessionsResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public ListChatSessionsResponseBodySessions setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListChatSessionsResponseBodySessions setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListChatSessionsResponseBodySessions setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListChatSessionsResponseBodySessions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListChatSessionsResponseBodySessions setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
