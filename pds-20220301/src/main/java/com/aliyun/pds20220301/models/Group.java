// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Group extends TeaModel {
    @NameInMap("created_at")
    public Long createdAt;

    @NameInMap("creator")
    public String creator;

    @NameInMap("description")
    public String description;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("group_id")
    public String groupId;

    @NameInMap("group_name")
    public String groupName;

    @NameInMap("updated_at")
    public Long updatedAt;

    public static Group build(java.util.Map<String, ?> map) throws Exception {
        Group self = new Group();
        return TeaModel.build(map, self);
    }

    public Group setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Group setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Group setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Group setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public Group setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public Group setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public Group setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static class FaceGroupGroupCoverFaceBoundary extends TeaModel {
        @NameInMap("height")
        public Integer height;

        @NameInMap("left")
        public Integer left;

        @NameInMap("top")
        public Integer top;

        @NameInMap("width")
        public Integer width;

        public static FaceGroupGroupCoverFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            FaceGroupGroupCoverFaceBoundary self = new FaceGroupGroupCoverFaceBoundary();
            return TeaModel.build(map, self);
        }

        public FaceGroupGroupCoverFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public FaceGroupGroupCoverFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public FaceGroupGroupCoverFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public FaceGroupGroupCoverFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
