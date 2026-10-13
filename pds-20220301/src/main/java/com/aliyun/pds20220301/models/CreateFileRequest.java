// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    /**
     * <p>The mode for handling files with duplicate names. Valid values:</p>
     * <ul>
     * <li>ignore: allows files with duplicate names.</li>
     * <li>auto_rename: automatically renames the file when a file with the same name exists. By default, the current timestamp is appended, such as xxx_20060102_150405.</li>
     * <li>refuse: rejects the creation of a new file when a file with the same name exists on the server, and returns the details of the existing file to the client.</li>
     * </ul>
     * <p>Default value: ignore.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("check_name_mode")
    public String checkNameMode;

    /**
     * <p>The hash value of the file content. The value is calculated based on the algorithm specified by content_hash_name.</p>
     * 
     * <strong>example:</strong>
     * <p>7C4A8D09CA3762AF61E59520943DC26494F8941B</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("content_hash")
    public String contentHash;

    /**
     * <p>The hash algorithm name for the file content. Currently, only sha1 is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>sha1</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("content_hash_name")
    public String contentHashName;

    /**
     * <p>The file content type. Default value: application/oct-stream.&lt;props=&quot;china&quot;&gt; For common content_type values, refer to OSS <a href="https://help.aliyun.com/document_detail/39522.htm?spm=a2c4g.11186623.0.0.5a0b7dbb1TPnWF#concept-5041">How do I set Content-Type (MIME)?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>application/json</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("content_type")
    public String contentType;

    /**
     * <p>The file description. The description can be up to 1024 characters. Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Team file.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The drive ID. This parameter is required unless the upload is performed through a share link.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID. This parameter is required for overwrite operations.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>Specifies whether the file is hidden. Default value: not hidden.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("hidden")
    public Boolean hidden;

    /**
     * <p>The local creation time of the file. Default value: empty. Format: yyyy-MM-ddTHH:mm:ssZ, in UTC+0 time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-04T14:30:00Z</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("local_created_at")
    public String localCreatedAt;

    /**
     * <p>The local modification time of the file. Default value: empty. Format: yyyy-MM-ddTHH:mm:ssZ, in UTC+0 time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-04T14:30:00Z</p>
     */
    @NameInMap("local_modified_at")
    public String localModifiedAt;

    /**
     * <p>The file name. The name can be up to 1024 bytes in UTF-8 encoding and cannot contain forward slashes (/).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a.txt</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether to enable the parallel part upload feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("parallel_upload")
    public Boolean parallelUpload;

    /**
     * <p>The parent folder ID. Set this parameter to root to upload to the root directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fileid1</p>
     */
    @NameInMap("parent_file_id")
    public String parentFileId;

    /**
     * <p>The list of part information. A maximum of 10000 parts are supported. If this parameter is not specified, one part is returned by default.</p>
     */
    @NameInMap("part_info_list")
    public java.util.List<CreateFileRequestPartInfoList> partInfoList;

    /**
     * <p>The SHA1 value of the first 1 KB of the file. Specify this parameter when using the pre-rapid-upload feature. If no match is found on the server, the client does not need to calculate the full SHA1 of the file for rapid upload.</p>
     * 
     * <strong>example:</strong>
     * <p>7C4A8D09CA3762AF61E59520943DC26494F89411</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pre_hash")
    public String preHash;

    /**
     * <p>The share ID. This parameter is required when uploading through a share link.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The file size, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The file type. Valid values:</p>
     * <ul>
     * <li>file: file.</li>
     * <li>folder: folder.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The upload type. Valid values: multipart and form. Default value: multipart.</p>
     * 
     * <strong>example:</strong>
     * <p>multipart</p>
     */
    @NameInMap("upload_type")
    public String uploadType;

    /**
     * <p>The custom user tags. A maximum of 1000 tags are supported.</p>
     */
    @NameInMap("user_tags")
    public java.util.List<UserTag> userTags;

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

    public CreateFileRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

    public CreateFileRequest setUserTags(java.util.List<UserTag> userTags) {
        this.userTags = userTags;
        return this;
    }
    public java.util.List<UserTag> getUserTags() {
        return this.userTags;
    }

    public static class CreateFileRequestPartInfoListParallelSha1Ctx extends TeaModel {
        /**
         * <p>The first through fifth 32-bit variables of the contextual SHA1 value of all data before this part. This field is valid only in the concurrent multi-part upload pattern.</p>
         */
        @NameInMap("h")
        public java.util.List<Long> h;

        /**
         * <p>The total length in bytes up to the previous data block. The value must be a multiple of 64. This field is valid only in the concurrent multi-part upload mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
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
         * <p>The MD5 value of the part. Specify this parameter when you need to verify the MD5 of the part during upload.</p>
         * 
         * <strong>example:</strong>
         * <p>ASKJDJSKDJJSJDJS</p>
         */
        @NameInMap("content_md5")
        public String contentMd5;

        /**
         * <p>The Content-Type value that the client must set when uploading a part by using PUT. If the Content-Type specified by the client during upload does not match this value, a signature error occurs. Default value: empty. The client does not need to specify Content-Type during PUT.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("content_type")
        public String contentType;

        /**
         * <p>The SHA1 context of all data before this part. This field is valid only in the concurrent multi-part upload mode.</p>
         */
        @NameInMap("parallel_sha1_ctx")
        public CreateFileRequestPartInfoListParallelSha1Ctx parallelSha1Ctx;

        /**
         * <p>The part sequence number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public CreateFileRequestPartInfoList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
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
