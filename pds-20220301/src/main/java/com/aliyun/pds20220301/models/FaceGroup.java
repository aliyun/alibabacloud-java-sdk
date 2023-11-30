// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FaceGroup extends TeaModel {
    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("group_cover_face_boundary")
    public FaceGroupGroupCoverFaceBoundary groupCoverFaceBoundary;

    @NameInMap("group_cover_file_id")
    public String groupCoverFileId;

    @NameInMap("group_cover_height")
    public Long groupCoverHeight;

    @NameInMap("group_cover_url")
    public String groupCoverUrl;

    @NameInMap("group_cover_width")
    public Long groupCoverWidth;

    @NameInMap("group_id")
    public String groupId;

    @NameInMap("group_name")
    public String groupName;

    @NameInMap("image_count")
    public Long imageCount;

    @NameInMap("remarks")
    public String remarks;

    @NameInMap("updated_at")
    public String updatedAt;

    public static FaceGroup build(java.util.Map<String, ?> map) throws Exception {
        FaceGroup self = new FaceGroup();
        return TeaModel.build(map, self);
    }

    public FaceGroup setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public FaceGroup setGroupCoverFaceBoundary(FaceGroupGroupCoverFaceBoundary groupCoverFaceBoundary) {
        this.groupCoverFaceBoundary = groupCoverFaceBoundary;
        return this;
    }
    public FaceGroupGroupCoverFaceBoundary getGroupCoverFaceBoundary() {
        return this.groupCoverFaceBoundary;
    }

    public FaceGroup setGroupCoverFileId(String groupCoverFileId) {
        this.groupCoverFileId = groupCoverFileId;
        return this;
    }
    public String getGroupCoverFileId() {
        return this.groupCoverFileId;
    }

    public FaceGroup setGroupCoverHeight(Long groupCoverHeight) {
        this.groupCoverHeight = groupCoverHeight;
        return this;
    }
    public Long getGroupCoverHeight() {
        return this.groupCoverHeight;
    }

    public FaceGroup setGroupCoverUrl(String groupCoverUrl) {
        this.groupCoverUrl = groupCoverUrl;
        return this;
    }
    public String getGroupCoverUrl() {
        return this.groupCoverUrl;
    }

    public FaceGroup setGroupCoverWidth(Long groupCoverWidth) {
        this.groupCoverWidth = groupCoverWidth;
        return this;
    }
    public Long getGroupCoverWidth() {
        return this.groupCoverWidth;
    }

    public FaceGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public FaceGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public FaceGroup setImageCount(Long imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Long getImageCount() {
        return this.imageCount;
    }

    public FaceGroup setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public FaceGroup setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static class FaceGroupGroupCoverFaceBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
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
