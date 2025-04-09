// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyTagGroupsResponseBody extends TeaModel {
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
     * <p>5a865b03-d2b9-4ef9-be98-f21fa0d93744</p>
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
    public java.util.List<ModifyTagGroupsResponseBodyTagGroups> tagGroups;

    @NameInMap("Tags")
    public java.util.List<ModifyTagGroupsResponseBodyTags> tags;

    public static ModifyTagGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagGroupsResponseBody self = new ModifyTagGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTagGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyTagGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyTagGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyTagGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTagGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyTagGroupsResponseBody setTagGroups(java.util.List<ModifyTagGroupsResponseBodyTagGroups> tagGroups) {
        this.tagGroups = tagGroups;
        return this;
    }
    public java.util.List<ModifyTagGroupsResponseBodyTagGroups> getTagGroups() {
        return this.tagGroups;
    }

    public ModifyTagGroupsResponseBody setTags(java.util.List<ModifyTagGroupsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ModifyTagGroupsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ModifyTagGroupsResponseBodyTagGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>365b955d-6f4d-4ab5-a6e1-9a301307f4b1</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("TagGroup")
        public String tagGroup;

        /**
         * <strong>example:</strong>
         * <p>54629be9-0746-464a-ab59-4830242cf644</p>
         */
        @NameInMap("TagGroupId")
        public String tagGroupId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagGroupIndex")
        public Integer tagGroupIndex;

        public static ModifyTagGroupsResponseBodyTagGroups build(java.util.Map<String, ?> map) throws Exception {
            ModifyTagGroupsResponseBodyTagGroups self = new ModifyTagGroupsResponseBodyTagGroups();
            return TeaModel.build(map, self);
        }

        public ModifyTagGroupsResponseBodyTagGroups setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ModifyTagGroupsResponseBodyTagGroups setTagGroup(String tagGroup) {
            this.tagGroup = tagGroup;
            return this;
        }
        public String getTagGroup() {
            return this.tagGroup;
        }

        public ModifyTagGroupsResponseBodyTagGroups setTagGroupId(String tagGroupId) {
            this.tagGroupId = tagGroupId;
            return this;
        }
        public String getTagGroupId() {
            return this.tagGroupId;
        }

        public ModifyTagGroupsResponseBodyTagGroups setTagGroupIndex(Integer tagGroupIndex) {
            this.tagGroupIndex = tagGroupIndex;
            return this;
        }
        public Integer getTagGroupIndex() {
            return this.tagGroupIndex;
        }

    }

    public static class ModifyTagGroupsResponseBodyTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>365b955d-6f4d-4ab5-a6e1-9a301307f4b1</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("TagGroup")
        public String tagGroup;

        /**
         * <strong>example:</strong>
         * <p>19b23e92-4ee3-4129-8c2e-e1968670d887</p>
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

        public static ModifyTagGroupsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ModifyTagGroupsResponseBodyTags self = new ModifyTagGroupsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ModifyTagGroupsResponseBodyTags setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ModifyTagGroupsResponseBodyTags setTagGroup(String tagGroup) {
            this.tagGroup = tagGroup;
            return this;
        }
        public String getTagGroup() {
            return this.tagGroup;
        }

        public ModifyTagGroupsResponseBodyTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ModifyTagGroupsResponseBodyTags setTagIndex(Integer tagIndex) {
            this.tagIndex = tagIndex;
            return this;
        }
        public Integer getTagIndex() {
            return this.tagIndex;
        }

        public ModifyTagGroupsResponseBodyTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
