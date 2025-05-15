// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class ListAnalysisTagDetailByTaskIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListAnalysisTagDetailByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnalysisTagDetailByTaskIdResponseBody self = new ListAnalysisTagDetailByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setData(java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyData> getData() {
        return this.data;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags extends TeaModel {
        @NameInMap("tagName")
        public String tagName;

        @NameInMap("tags")
        public java.util.List<String> tags;

        public static ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags build(java.util.Map<String, ?> map) throws Exception {
            ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags self = new ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags();
            return TeaModel.build(map, self);
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class ListAnalysisTagDetailByTaskIdResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("content")
        public String content;

        @NameInMap("contentTags")
        public java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags> contentTags;

        @NameInMap("originResponse")
        public String originResponse;

        public static ListAnalysisTagDetailByTaskIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAnalysisTagDetailByTaskIdResponseBodyData self = new ListAnalysisTagDetailByTaskIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyData setContentTags(java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags> contentTags) {
            this.contentTags = contentTags;
            return this;
        }
        public java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags> getContentTags() {
            return this.contentTags;
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyData setOriginResponse(String originResponse) {
            this.originResponse = originResponse;
            return this;
        }
        public String getOriginResponse() {
            return this.originResponse;
        }

    }

}
