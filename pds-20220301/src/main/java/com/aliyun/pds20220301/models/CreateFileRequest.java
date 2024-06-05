// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    /**
     * <p>The processing method that is used if the file that you want to create has the same name as an existing file in the cloud. Valid values:</p>
     * <br>
     * <p>ignore: allows you to create the file by using the same name as an existing file in the cloud.</p>
     * <br>
     * <p>auto_rename: automatically renames the file that you want to create. By default, the current point in time is added to the end of the file name. Example: xxx_20060102_150405.</p>
     * <br>
     * <p>refuse: does not create the file that you want to create but returns the information about the file that has the same name in the cloud.</p>
     * <br>
     * <p>Default value: ignore.</p>
     */
    @NameInMap("check_name_mode")
    public String checkNameMode;

    /**
     * <p>The hash value of the file content. The value is calculated based on the algorithm specified by content_hash_name.</p>
     */
    @NameInMap("content_hash")
    public String contentHash;

    /**
     * <p>The name of the algorithm that is used to calculate the hash value of the file content. Only SHA1 is supported.</p>
     */
    @NameInMap("content_hash_name")
    public String contentHashName;

    /**
     * <p>The type of the file content. Default value: application/oct-stream.</p>
     */
    @NameInMap("content_type")
    public String contentType;

    /**
     * <p>The description of the file. The description can be up to 1,024 characters in length. By default, this parameter is left empty.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The drive ID. This parameter is required if the file is not uploaded by using the share URL of the file.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID. This parameter is required if check_name_mode is set to ignore.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>Specifies whether to hide the file or folder. By default, the file or folder is not hidden.</p>
     */
    @NameInMap("hidden")
    public Boolean hidden;

    /**
     * <p>The information about the image specified by the client.</p>
     */
    @NameInMap("image_media_metadata")
    public ImageMediaMetadata imageMediaMetadata;

    /**
     * <p>The time when the local file was created. By default, this parameter is left empty. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format based on the UTC+0 time zone.</p>
     */
    @NameInMap("local_created_at")
    public String localCreatedAt;

    /**
     * <p>The time when the local file was modified. By default, this parameter is left empty. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format based on the UTC+0 time zone.</p>
     */
    @NameInMap("local_modified_at")
    public String localModifiedAt;

    /**
     * <p>The name of the file. The name can be up to 1,024 bytes in length based on the UTF-8 encoding rule and cannot end with a forward slash (/).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether to enable the parallel upload feature.</p>
     */
    @NameInMap("parallel_upload")
    public Boolean parallelUpload;

    /**
     * <p>The ID of the parent directory. If you want to create a file or folder in the root directory, set this parameter to root.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("parent_file_id")
    public String parentFileId;

    /**
     * <p>The information about the file parts. You can specify up to 10,000 parts. By default, if you do not specify this parameter, only one part is returned.</p>
     */
    @NameInMap("part_info_list")
    public java.util.List<CreateFileRequestPartInfoList> partInfoList;

    /**
     * <p>The SHA-1 hash value of the first 1 KB data of the file. This parameter is required if you perform instant file upload by using the pre-hashing feature. If the SHA-1 hash value is not matched on the cloud, the client does not need to calculate the SHA-1 hash value of the entire file.</p>
     */
    @NameInMap("pre_hash")
    public String preHash;

    /**
     * <p>The share ID. This parameter is required if the file is uploaded by using the share URL of the file.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The size of the file. Unit: bytes.</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The type of the file. Valid values:</p>
     * <br>
     * <p>file folder</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The custom tags. You can specify up to 1,000 tags.</p>
     */
    @NameInMap("user_tags")
    public java.util.List<UserTag> userTags;

    /**
     * <p>The information about the video specified by the client.</p>
     */
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
        /**
         * <p>The first to fifth 32-bit variables of the SHA-1 hash value of the file content before the file part. This parameter takes effect only if the parallel upload feature is enabled.</p>
         */
        @NameInMap("h")
        public java.util.List<Long> h;

        /**
         * <p>The size of the file content before the file part. Unit: bytes. The value must be a multiple of 64. This parameter takes effect only if the parallel upload feature is enabled.</p>
         */
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
        /**
         * <p>The MD5 hash value of the file part. This parameter is required when the MD5 hash value of the file part needs to be verified during part upload.</p>
         */
        @NameInMap("content_md5")
        public String contentMd5;

        /**
         * <p>The SHA-1 hash value of the file content before the file part. This parameter takes effect only if the parallel upload feature is enabled.</p>
         */
        @NameInMap("parallel_sha1_ctx")
        public CreateFileRequestPartInfoListParallelSha1Ctx parallelSha1Ctx;

        /**
         * <p>The serial number of a file part. The number starts from 1.</p>
         */
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
