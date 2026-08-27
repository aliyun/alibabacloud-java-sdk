// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChatMessagesResponseBody extends TeaModel {
    /**
     * <p>A compatibility field. The V2 response does not return MaxResults.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A compatibility field. The V2 response does not return a message array.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Messages")
    public java.util.List<java.util.Map<String, ?>> messages;

    /**
     * <p>A compatibility field. The V2 response does not return NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>CAES...</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The pre-signed download URL for the Pipeline file a2a-snapshot.json. The URL is valid for 1800 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss.example/a2a-snapshot.json?signature=REDACTED">https://oss.example/a2a-snapshot.json?signature=REDACTED</a></p>
     */
    @NameInMap("PipelineSnapshotDownloadUrl")
    public String pipelineSnapshotDownloadUrl;

    /**
     * <p>The OpenAPI request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C68F7A5-2D16-5C8F-A4B1-01E9C6A9B0D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The pre-signed download URL for the session messages file session.jsonl. The URL is valid for 1800 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss.example/session.jsonl?signature=REDACTED">https://oss.example/session.jsonl?signature=REDACTED</a></p>
     */
    @NameInMap("SessionMessagesDownloadUrl")
    public String sessionMessagesDownloadUrl;

    /**
     * <p>The session title. This value may be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Create VPC template</p>
     */
    @NameInMap("Title")
    public String title;

    public static ListChatMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatMessagesResponseBody self = new ListChatMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatMessagesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListChatMessagesResponseBody setMessages(java.util.List<java.util.Map<String, ?>> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getMessages() {
        return this.messages;
    }

    public ListChatMessagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListChatMessagesResponseBody setPipelineSnapshotDownloadUrl(String pipelineSnapshotDownloadUrl) {
        this.pipelineSnapshotDownloadUrl = pipelineSnapshotDownloadUrl;
        return this;
    }
    public String getPipelineSnapshotDownloadUrl() {
        return this.pipelineSnapshotDownloadUrl;
    }

    public ListChatMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatMessagesResponseBody setSessionMessagesDownloadUrl(String sessionMessagesDownloadUrl) {
        this.sessionMessagesDownloadUrl = sessionMessagesDownloadUrl;
        return this;
    }
    public String getSessionMessagesDownloadUrl() {
        return this.sessionMessagesDownloadUrl;
    }

    public ListChatMessagesResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
