// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Album extends TeaModel {
    @NameInMap("album_id")
    public String albumId;

    @NameInMap("base_face_file")
    public File baseFaceFile;

    @NameInMap("base_face_group_id")
    public String baseFaceGroupId;

    @NameInMap("cover_file")
    public File coverFile;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("file_count")
    public Long fileCount;

    @NameInMap("name")
    public String name;

    @NameInMap("owner")
    public String owner;

    @NameInMap("updated_at")
    public String updatedAt;

    @NameInMap("user_tags")
    public java.util.Map<String, String> userTags;

    public static Album build(java.util.Map<String, ?> map) throws Exception {
        Album self = new Album();
        return TeaModel.build(map, self);
    }

    public Album setAlbumId(String albumId) {
        this.albumId = albumId;
        return this;
    }
    public String getAlbumId() {
        return this.albumId;
    }

    public Album setBaseFaceFile(File baseFaceFile) {
        this.baseFaceFile = baseFaceFile;
        return this;
    }
    public File getBaseFaceFile() {
        return this.baseFaceFile;
    }

    public Album setBaseFaceGroupId(String baseFaceGroupId) {
        this.baseFaceGroupId = baseFaceGroupId;
        return this;
    }
    public String getBaseFaceGroupId() {
        return this.baseFaceGroupId;
    }

    public Album setCoverFile(File coverFile) {
        this.coverFile = coverFile;
        return this;
    }
    public File getCoverFile() {
        return this.coverFile;
    }

    public Album setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Album setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Album setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public Album setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Album setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Album setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public Album setUserTags(java.util.Map<String, String> userTags) {
        this.userTags = userTags;
        return this;
    }
    public java.util.Map<String, String> getUserTags() {
        return this.userTags;
    }

}
