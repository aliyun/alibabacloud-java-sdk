// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetMemoryDetailResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of groups for automatically collected memories. If no automatic memories exist, an empty array is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;user&quot;,&quot;items&quot;:[{&quot;id&quot;:&quot;user/example.md&quot;,&quot;title&quot;:&quot;Sample preference&quot;,&quot;content&quot;:&quot;Prefers concise answers&quot;,&quot;description&quot;:&quot;Preference summary from recent conversations&quot;}],&quot;gmtModified&quot;:1720000000}]</p>
     */
    @NameInMap("groups")
    public java.util.List<GetMemoryDetailResponseBodyGroups> groups;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The current user is not an active member of the group cg_12345</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The manually added memory from profile.md. It includes the full content, existence status, and modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;content&quot;:&quot;Sample manual memory&quot;,&quot;exists&quot;:true,&quot;gmtModified&quot;:1720000000}</p>
     */
    @NameInMap("profile")
    public GetMemoryDetailResponseBodyProfile profile;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMemoryDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryDetailResponseBody self = new GetMemoryDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMemoryDetailResponseBody setGroups(java.util.List<GetMemoryDetailResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<GetMemoryDetailResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public GetMemoryDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMemoryDetailResponseBody setProfile(GetMemoryDetailResponseBodyProfile profile) {
        this.profile = profile;
        return this;
    }
    public GetMemoryDetailResponseBodyProfile getProfile() {
        return this.profile;
    }

    public GetMemoryDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMemoryDetailResponseBodyGroupsItems extends TeaModel {
        /**
         * <p>The body of the automatic memory, excluding the YAML frontmatter.</p>
         * 
         * <strong>example:</strong>
         * <p>Prefers concise answers</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The additional description of the automatic memory. If no description is available, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Preference summary from recent conversations</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The unique identifier of the automatic memory entry, which is a relative OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p>user/example.md</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The title of the automatic memory, which is derived from the file metadata or file name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample preference</p>
         */
        @NameInMap("title")
        public String title;

        public static GetMemoryDetailResponseBodyGroupsItems build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryDetailResponseBodyGroupsItems self = new GetMemoryDetailResponseBodyGroupsItems();
            return TeaModel.build(map, self);
        }

        public GetMemoryDetailResponseBodyGroupsItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetMemoryDetailResponseBodyGroupsItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMemoryDetailResponseBodyGroupsItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMemoryDetailResponseBodyGroupsItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetMemoryDetailResponseBodyGroups extends TeaModel {
        /**
         * <p>The last modification time of the group. The value is a UNIX timestamp in seconds. If no files exist, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1720000000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>The list of automatic memory entries under this type. If no entries exist, an empty array is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;user/example.md&quot;,&quot;title&quot;:&quot;Sample preference&quot;,&quot;content&quot;:&quot;Prefers concise answers&quot;,&quot;description&quot;:&quot;Preference summary from recent conversations&quot;}]</p>
         */
        @NameInMap("items")
        public java.util.List<GetMemoryDetailResponseBodyGroupsItems> items;

        /**
         * <p>The type of the automatic memory. Valid values: user, feedback, reference, and project.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMemoryDetailResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryDetailResponseBodyGroups self = new GetMemoryDetailResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public GetMemoryDetailResponseBodyGroups setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetMemoryDetailResponseBodyGroups setItems(java.util.List<GetMemoryDetailResponseBodyGroupsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetMemoryDetailResponseBodyGroupsItems> getItems() {
            return this.items;
        }

        public GetMemoryDetailResponseBodyGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMemoryDetailResponseBodyProfile extends TeaModel {
        /**
         * <p>The full body of the manual memory. If the memory has never been saved, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample manual memory</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Indicates whether profile.md exists. If the memory has never been saved, false is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("exists")
        public Boolean exists;

        /**
         * <p>The last modification time of profile.md. The value is a UNIX timestamp in seconds. If the file does not exist or its metadata cannot be obtained, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1720000000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        public static GetMemoryDetailResponseBodyProfile build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryDetailResponseBodyProfile self = new GetMemoryDetailResponseBodyProfile();
            return TeaModel.build(map, self);
        }

        public GetMemoryDetailResponseBodyProfile setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetMemoryDetailResponseBodyProfile setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }
        public Boolean getExists() {
            return this.exists;
        }

        public GetMemoryDetailResponseBodyProfile setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

    }

}
