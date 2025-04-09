// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListTagsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TagGroups")
    public java.util.List<ListTagsResponseBodyTagGroups> tagGroups;

    @NameInMap("Tags")
    public java.util.List<ListTagsResponseBodyTags> tags;

    public static ListTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsResponseBody self = new ListTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTagsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTagsResponseBody setTagGroups(java.util.List<ListTagsResponseBodyTagGroups> tagGroups) {
        this.tagGroups = tagGroups;
        return this;
    }
    public java.util.List<ListTagsResponseBodyTagGroups> getTagGroups() {
        return this.tagGroups;
    }

    public ListTagsResponseBody setTags(java.util.List<ListTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListTagsResponseBodyTagGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8a4c6d3d-5ed6-44ca-b779-16c20f8862be</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("TagGroup")
        public String tagGroup;

        /**
         * <strong>example:</strong>
         * <p>38c03261-9fe8-4b9b-8c3b-983a60319012</p>
         */
        @NameInMap("TagGroupId")
        public String tagGroupId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagGroupIndex")
        public Integer tagGroupIndex;

        public static ListTagsResponseBodyTagGroups build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyTagGroups self = new ListTagsResponseBodyTagGroups();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyTagGroups setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListTagsResponseBodyTagGroups setTagGroup(String tagGroup) {
            this.tagGroup = tagGroup;
            return this;
        }
        public String getTagGroup() {
            return this.tagGroup;
        }

        public ListTagsResponseBodyTagGroups setTagGroupId(String tagGroupId) {
            this.tagGroupId = tagGroupId;
            return this;
        }
        public String getTagGroupId() {
            return this.tagGroupId;
        }

        public ListTagsResponseBodyTagGroups setTagGroupIndex(Integer tagGroupIndex) {
            this.tagGroupIndex = tagGroupIndex;
            return this;
        }
        public Integer getTagGroupIndex() {
            return this.tagGroupIndex;
        }

    }

    public static class ListTagsResponseBodyTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8a4c6d3d-5ed6-44ca-b779-16c20f8862be</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("TagGroup")
        public String tagGroup;

        /**
         * <strong>example:</strong>
         * <p>d62be647-6202-4b1f-9708-0baeec552635</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagIndex")
        public Integer tagIndex;

        @NameInMap("TagName")
        public String tagName;

        public static ListTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyTags self = new ListTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyTags setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListTagsResponseBodyTags setTagGroup(String tagGroup) {
            this.tagGroup = tagGroup;
            return this;
        }
        public String getTagGroup() {
            return this.tagGroup;
        }

        public ListTagsResponseBodyTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ListTagsResponseBodyTags setTagIndex(Integer tagIndex) {
            this.tagIndex = tagIndex;
            return this;
        }
        public Integer getTagIndex() {
            return this.tagIndex;
        }

        public ListTagsResponseBodyTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
