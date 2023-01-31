// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTagHitsSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("TagGroup")
        public String tagGroup;

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
