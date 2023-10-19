// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    @NameInMap("check_name_mode")
    public String checkNameMode;

    @NameInMap("content_hash")
    public String contentHash;

    @NameInMap("content_hash_name")
    public String contentHashName;

    @NameInMap("content_type")
    public String contentType;

    @NameInMap("description")
    public String description;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("hidden")
    public Boolean hidden;

    @NameInMap("image_media_metadata")
    public ImageMediaMetadata imageMediaMetadata;

    @NameInMap("local_created_at")
    public String localCreatedAt;

    @NameInMap("local_modified_at")
    public String localModifiedAt;

    @NameInMap("name")
    public String name;

    @NameInMap("parallel_upload")
    public Boolean parallelUpload;

    @NameInMap("parent_file_id")
    public String parentFileId;

    @NameInMap("part_info_list")
    public java.util.List<CreateFileRequestPartInfoList> partInfoList;

    @NameInMap("pre_hash")
    public String preHash;

    @NameInMap("share_id")
    public String shareId;

    @NameInMap("size")
    public Long size;

    @NameInMap("type")
    public String type;

    @NameInMap("user_tags")
    public java.util.List<UserTag> userTags;

    @NameInMap("video_media_metadata")
    public VideoMediaMetadata videoMediaMetadata;

    public static CreateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileRequest self = new CreateFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileRequest setCheckNameMode(String checkNameMode) {
        this.checkNameMode = checkNameMode;
        return this;
    }
    public String getCheckNameMode() {
        return this.checkNameMode;
    }

    public CreateFileRequest setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public CreateFileRequest setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public CreateFileRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CreateFileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CreateFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateFileRequest setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    public Boolean getHidden() {
        return this.hidden;
    }

    public CreateFileRequest setImageMediaMetadata(ImageMediaMetadata imageMediaMetadata) {
        this.imageMediaMetadata = imageMediaMetadata;
        return this;
    }
    public ImageMediaMetadata getImageMediaMetadata() {
        return this.imageMediaMetadata;
    }

    public CreateFileRequest setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
        return this;
    }
    public String getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    public CreateFileRequest setLocalModifiedAt(String localModifiedAt) {
        this.localModifiedAt = localModifiedAt;
        return this;
    }
    public String getLocalModifiedAt() {
        return this.localModifiedAt;
    }

    public CreateFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFileRequest setParallelUpload(Boolean parallelUpload) {
        this.parallelUpload = parallelUpload;
        return this;
    }
    public Boolean getParallelUpload() {
        return this.parallelUpload;
    }

    public CreateFileRequest setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public CreateFileRequest setPartInfoList(java.util.List<CreateFileRequestPartInfoList> partInfoList) {
        this.partInfoList = partInfoList;
        return this;
    }
    public java.util.List<CreateFileRequestPartInfoList> getPartInfoList() {
        return this.partInfoList;
    }

    public CreateFileRequest setPreHash(String preHash) {
        this.preHash = preHash;
        return this;
    }
    public String getPreHash() {
        return this.preHash;
    }

    public CreateFileRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public CreateFileRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public CreateFileRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateFileRequest setUserTags(java.util.List<UserTag> userTags) {
        this.userTags = userTags;
        return this;
    }
    public java.util.List<UserTag> getUserTags() {
        return this.userTags;
    }

    public CreateFileRequest setVideoMediaMetadata(VideoMediaMetadata videoMediaMetadata) {
        this.videoMediaMetadata = videoMediaMetadata;
        return this;
    }
    public VideoMediaMetadata getVideoMediaMetadata() {
        return this.videoMediaMetadata;
    }

    public static class CreateFileRequestPartInfoListParallelSha1Ctx extends TeaModel {
        @NameInMap("h")
        public java.util.List<Long> h;

        @NameInMap("part_offset")
        public Long partOffset;

        public static CreateFileRequestPartInfoListParallelSha1Ctx build(java.util.Map<String, ?> map) throws Exception {
            CreateFileRequestPartInfoListParallelSha1Ctx self = new CreateFileRequestPartInfoListParallelSha1Ctx();
            return TeaModel.build(map, self);
        }

        public CreateFileRequestPartInfoListParallelSha1Ctx setH(java.util.List<Long> h) {
            this.h = h;
            return this;
        }
        public java.util.List<Long> getH() {
            return this.h;
        }

        public CreateFileRequestPartInfoListParallelSha1Ctx setPartOffset(Long partOffset) {
            this.partOffset = partOffset;
            return this;
        }
        public Long getPartOffset() {
            return this.partOffset;
        }

    }

    public static class CreateFileRequestPartInfoList extends TeaModel {
        @NameInMap("content_md5")
        public String contentMd5;

        @NameInMap("parallel_sha1_ctx")
        public CreateFileRequestPartInfoListParallelSha1Ctx parallelSha1Ctx;

        @NameInMap("part_number")
        public Integer partNumber;

        public static CreateFileRequestPartInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateFileRequestPartInfoList self = new CreateFileRequestPartInfoList();
            return TeaModel.build(map, self);
        }

        public CreateFileRequestPartInfoList setContentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }
        public String getContentMd5() {
            return this.contentMd5;
        }

        public CreateFileRequestPartInfoList setParallelSha1Ctx(CreateFileRequestPartInfoListParallelSha1Ctx parallelSha1Ctx) {
            this.parallelSha1Ctx = parallelSha1Ctx;
            return this;
        }
        public CreateFileRequestPartInfoListParallelSha1Ctx getParallelSha1Ctx() {
            return this.parallelSha1Ctx;
        }

        public CreateFileRequestPartInfoList setPartNumber(Integer partNumber) {
            this.partNumber = partNumber;
            return this;
        }
        public Integer getPartNumber() {
            return this.partNumber;
        }

    }

}
