// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTagHitsSummaryResponseBody extends TeaModel {
    /**
     * <p>The response code. <code>OK</code> indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5391EB13-A0E7-402D-A407-B99D4ABAF22A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>A list of tag groups.</p>
     */
    @NameInMap("TagGroups")
    public java.util.List<DescribeTagHitsSummaryResponseBodyTagGroups> tagGroups;

    /**
     * <p>A list of tag hit statistics.</p>
     */
    @NameInMap("TagHitsList")
    public java.util.List<DescribeTagHitsSummaryResponseBodyTagHitsList> tagHitsList;

    public static DescribeTagHitsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagHitsSummaryResponseBody self = new DescribeTagHitsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagHitsSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTagHitsSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTagHitsSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTagHitsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagHitsSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTagHitsSummaryResponseBody setTagGroups(java.util.List<DescribeTagHitsSummaryResponseBodyTagGroups> tagGroups) {
        this.tagGroups = tagGroups;
        return this;
    }
    public java.util.List<DescribeTagHitsSummaryResponseBodyTagGroups> getTagGroups() {
        return this.tagGroups;
    }

    public DescribeTagHitsSummaryResponseBody setTagHitsList(java.util.List<DescribeTagHitsSummaryResponseBodyTagHitsList> tagHitsList) {
        this.tagHitsList = tagHitsList;
        return this;
    }
    public java.util.List<DescribeTagHitsSummaryResponseBodyTagHitsList> getTagHitsList() {
        return this.tagHitsList;
    }

    public static class DescribeTagHitsSummaryResponseBodyTagGroups extends TeaModel {
        /**
         * <p>The ID of the tag group.</p>
         * 
         * <strong>example:</strong>
         * <p>8bb6f8ca-85a3-49f8-86a5-3127902a2156</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8a4c6d3d-5ed6-44ca-b779-16c20f8862be</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The tag group name.</p>
         * 
         * <strong>example:</strong>
         * <p>标签组</p>
         */
        @NameInMap("TagGroup")
        public String tagGroup;

        /**
         * <p>The index of the tag group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TagGroupIndex")
        public Integer tagGroupIndex;

        public static DescribeTagHitsSummaryResponseBodyTagGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagHitsSummaryResponseBodyTagGroups self = new DescribeTagHitsSummaryResponseBodyTagGroups();
            return TeaModel.build(map, self);
        }

        public DescribeTagHitsSummaryResponseBodyTagGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTagHitsSummaryResponseBodyTagGroups setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public DescribeTagHitsSummaryResponseBodyTagGroups setTagGroup(String tagGroup) {
            this.tagGroup = tagGroup;
            return this;
        }
        public String getTagGroup() {
            return this.tagGroup;
        }

        public DescribeTagHitsSummaryResponseBodyTagGroups setTagGroupIndex(Integer tagGroupIndex) {
            this.tagGroupIndex = tagGroupIndex;
            return this;
        }
        public Integer getTagGroupIndex() {
            return this.tagGroupIndex;
        }

    }

    public static class DescribeTagHitsSummaryResponseBodyTagHitsList extends TeaModel {
        /**
         * <p>The hit count for the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitCount")
        public Integer hitCount;

        /**
         * <p>The tag group name.</p>
         * 
         * <strong>example:</strong>
         * <p>当前学历</p>
         */
        @NameInMap("TagGroup")
        public String tagGroup;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>本科</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static DescribeTagHitsSummaryResponseBodyTagHitsList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagHitsSummaryResponseBodyTagHitsList self = new DescribeTagHitsSummaryResponseBodyTagHitsList();
            return TeaModel.build(map, self);
        }

        public DescribeTagHitsSummaryResponseBodyTagHitsList setHitCount(Integer hitCount) {
            this.hitCount = hitCount;
            return this;
        }
        public Integer getHitCount() {
            return this.hitCount;
        }

        public DescribeTagHitsSummaryResponseBodyTagHitsList setTagGroup(String tagGroup) {
            this.tagGroup = tagGroup;
            return this;
        }
        public String getTagGroup() {
            return this.tagGroup;
        }

        public DescribeTagHitsSummaryResponseBodyTagHitsList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
