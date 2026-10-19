// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetMemoryDetailResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为 200，失败时为对应错误码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>自动拾取记忆的分组列表；无自动记忆时为空数组</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;user&quot;,&quot;items&quot;:[{&quot;id&quot;:&quot;user/example.md&quot;,&quot;title&quot;:&quot;示例偏好&quot;,&quot;content&quot;:&quot;喜欢简洁的回答&quot;,&quot;description&quot;:&quot;来自近期会话的偏好总结&quot;}],&quot;gmtModified&quot;:1720000000}]</p>
     */
    @NameInMap("groups")
    public java.util.List<GetMemoryDetailResponseBodyGroups> groups;

    /**
     * <p>错误描述；成功时为空字符串，失败时返回具体原因</p>
     * 
     * <strong>example:</strong>
     * <p>当前用户不是群组 cg_12345 的活跃成员</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>手动添加的记忆，来自 profile.md；包含完整内容、存在状态和修改时间</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;content&quot;:&quot;示例手动记忆&quot;,&quot;exists&quot;:true,&quot;gmtModified&quot;:1720000000}</p>
     */
    @NameInMap("profile")
    public GetMemoryDetailResponseBodyProfile profile;

    /**
     * <p>请求追踪 ID，用于定位本次调用</p>
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
         * <p>自动记忆正文，不包含 YAML frontmatter</p>
         * 
         * <strong>example:</strong>
         * <p>喜欢简洁的回答</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>自动记忆的附加描述；没有时为空字符串</p>
         * 
         * <strong>example:</strong>
         * <p>来自近期会话的偏好总结</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>自动记忆条目的唯一标识，为相对 OSS 路径</p>
         * 
         * <strong>example:</strong>
         * <p>user/example.md</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>自动记忆标题，来自文件元数据或文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例偏好</p>
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
         * <p>该分组最近修改时间，Unix 秒级时间戳；无文件时为 null</p>
         * 
         * <strong>example:</strong>
         * <p>1720000000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>该类型下的自动记忆条目列表；没有条目时为空数组</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;user/example.md&quot;,&quot;title&quot;:&quot;示例偏好&quot;,&quot;content&quot;:&quot;喜欢简洁的回答&quot;,&quot;description&quot;:&quot;来自近期会话的偏好总结&quot;}]</p>
         */
        @NameInMap("items")
        public java.util.List<GetMemoryDetailResponseBodyGroupsItems> items;

        /**
         * <p>自动记忆类型：user、feedback、reference 或 project</p>
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
         * <p>手动记忆的完整正文；未保存过时为空字符串</p>
         * 
         * <strong>example:</strong>
         * <p>示例手动记忆</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>profile.md 是否存在；未保存过时为 false</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("exists")
        public Boolean exists;

        /**
         * <p>profile.md 最近修改时间，Unix 秒级时间戳；文件不存在或无法取得元数据时为 null</p>
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
