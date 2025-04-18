// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTagHitsSummaryResponseBody extends TeaModel {
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
     * <p>5391EB13-A0E7-402D-A407-B99D4ABAF22A</p>
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
    public java.util.List<DescribeTagHitsSummaryResponseBodyTagGroups> tagGroups;

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
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>8bb6f8ca-85a3-49f8-86a5-3127902a2156</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>84fc7c41-f918-4a47-b742-a439b35a8567</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("TagGroup")
        public String tagGroup;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitCount")
        public Integer hitCount;

        @NameInMap("TagGroup")
        public String tagGroup;

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
