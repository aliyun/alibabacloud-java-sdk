// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class File extends TeaModel {
    /**
     * <p>The permissions.</p>
     */
    @NameInMap("action_list")
    public java.util.List<String> actionList;

    /**
     * <p>The remaining time until the file is automatically deleted from the recycle bin (if in it).</p>
     */
    @NameInMap("auto_delete_left_sec")
    public Long autoDeleteLeftSec;

    /**
     * <p>The category. Drive and Photo Service (PDS) classifies files based on their extensions and mime-type. The supported categories include doc, image, audio, and video.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The hash value of the content.</p>
     * 
     * <strong>example:</strong>
     * <p>EA4942AA8761213890A5C386F88E6464D2C31CA3</p>
     */
    @NameInMap("content_hash")
    public String contentHash;

    /**
     * <p>The name of the hash algorithm. Set the value to sha1.</p>
     * 
     * <strong>example:</strong>
     * <p>sha1</p>
     */
    @NameInMap("content_hash_name")
    public String contentHashName;

    /**
     * <p>The type of the content.</p>
     * 
     * <strong>example:</strong>
     * <p>application/json</p>
     */
    @NameInMap("content_type")
    public String contentType;

    /**
     * <p>crc64</p>
     * 
     * <strong>example:</strong>
     * <p>3574582125365864471</p>
     */
    @NameInMap("crc64_hash")
    public String crc64Hash;

    /**
     * <p>The time when the file was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The description of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>image file</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The information about the folder structure. This parameter is returned only if you include the dir_size field in the fields parameter by calling the ListFile or GetFile operation.</p>
     */
    @NameInMap("dir_size_info")
    public FileDirSizeInfo dirSizeInfo;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The download URL. The default validity period of the download URL is 15 minutes. If the URL expires, you can obtain the URL by calling the GetFile operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
     */
    @NameInMap("download_url")
    public String downloadUrl;

    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file name extension.</p>
     * 
     * <strong>example:</strong>
     * <p>txt</p>
     */
    @NameInMap("file_extension")
    public String fileExtension;

    /**
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5d79206586bb5dd69fb34c349282718146c55da7</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>Specifies whether to hide the file.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hidden")
    public Boolean hidden;

    /**
     * <p>The file ID path.</p>
     * 
     * <strong>example:</strong>
     * <p>id1/id2</p>
     */
    @NameInMap("id_path")
    public String idPath;

    /**
     * <p>The image metadata. This parameter takes effect only if the value-added image processing feature is enabled.</p>
     */
    @NameInMap("image_media_metadata")
    public ImageMediaMetadata imageMediaMetadata;

    /**
     * <p>The labels of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;label1:1&quot;, &quot;label2:2&quot;]</p>
     */
    @NameInMap("labels")
    public java.util.List<String> labels;

    /**
     * <p>The time when the local file was created. The time refers to the local time when the file was uploaded. This parameter helps identify the local upload time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("local_created_at")
    public String localCreatedAt;

    /**
     * <p>The time when the local file was modified. The time refers to the local time when the modified file was uploaded. This parameter helps identify the local update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("local_modified_at")
    public String localModifiedAt;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>1.mov</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The file path.</p>
     * 
     * <strong>example:</strong>
     * <p>root/f1/f2</p>
     */
    @NameInMap("name_path")
    public String namePath;

    /**
     * <p>The parent folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3d5b846942cf94fa72324c8a4bda34e81da635a</p>
     */
    @NameInMap("parent_file_id")
    public String parentFileId;

    /**
     * <p>The version ID. If a file that has the same file ID with an existing one is uploaded, a new version ID is generated for the file.</p>
     * 
     * <strong>example:</strong>
     * <p>5d5b846942cf94fa72324c14a4bda34e81da635d</p>
     */
    @NameInMap("revision_id")
    public String revisionId;

    /**
     * <p>The file size</p>
     * <p>or folder size. The folder size is calculated based on all descendant files and folders in the folder. Note: The folder size can be returned only when you call the ListFile or GetFile operation and include the dir_size field in the fields parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>Specifies whether to add the file to favorites.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("starred")
    public Boolean starred;

    /**
     * <p>The status of the file. Only files and directories in the available state can be accessed. If you call the GetFile operation to obtain a file that is in the uploading state, a response indicating that the file does not exist is returned. If you call the ListFile operation to query files, files in the uploading state are not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The URL of the thumbnail. This parameter is deprecated and we recommend that you use thumbnail_urls.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
     */
    @NameInMap("thumbnail")
    public String thumbnail;

    /**
     * <p>The information about the returned thumbnail. The value corresponds to the key that is specified by thumbnail_processes.</p>
     */
    @NameInMap("thumbnail_urls")
    public java.util.Map<String, String> thumbnailUrls;

    /**
     * <p>The time when the file was put into the recycle bin.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("trashed_at")
    public String trashedAt;

    /**
     * <p>The file type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>file</li>
     * <li>folder</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The time when the file was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    /**
     * <p>The upload ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C9DCFE5A82644AC7A02DB74C30C934A6</p>
     */
    @NameInMap("upload_id")
    public String uploadId;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("user_tags")
    public java.util.Map<String, String> userTags;

    /**
     * <p>The audio and video information.</p>
     */
    @NameInMap("video_media_metadata")
    public VideoMediaMetadata videoMediaMetadata;

    public static File build(java.util.Map<String, ?> map) throws Exception {
        File self = new File();
        return TeaModel.build(map, self);
    }

    public File setActionList(java.util.List<String> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    public File setAutoDeleteLeftSec(Long autoDeleteLeftSec) {
        this.autoDeleteLeftSec = autoDeleteLeftSec;
        return this;
    }
    public Long getAutoDeleteLeftSec() {
        return this.autoDeleteLeftSec;
    }

    public File setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public File setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public File setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public File setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public File setCrc64Hash(String crc64Hash) {
        this.crc64Hash = crc64Hash;
        return this;
    }
    public String getCrc64Hash() {
        return this.crc64Hash;
    }

    public File setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public File setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public File setDirSizeInfo(FileDirSizeInfo dirSizeInfo) {
        this.dirSizeInfo = dirSizeInfo;
        return this;
    }
    public FileDirSizeInfo getDirSizeInfo() {
        return this.dirSizeInfo;
    }

    public File setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public File setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public File setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public File setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public File setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public File setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    public Boolean getHidden() {
        return this.hidden;
    }

    public File setIdPath(String idPath) {
        this.idPath = idPath;
        return this;
    }
    public String getIdPath() {
        return this.idPath;
    }

    public File setImageMediaMetadata(ImageMediaMetadata imageMediaMetadata) {
        this.imageMediaMetadata = imageMediaMetadata;
        return this;
    }
    public ImageMediaMetadata getImageMediaMetadata() {
        return this.imageMediaMetadata;
    }

    public File setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public File setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
        return this;
    }
    public String getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    public File setLocalModifiedAt(String localModifiedAt) {
        this.localModifiedAt = localModifiedAt;
        return this;
    }
    public String getLocalModifiedAt() {
        return this.localModifiedAt;
    }

    public File setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public File setNamePath(String namePath) {
        this.namePath = namePath;
        return this;
    }
    public String getNamePath() {
        return this.namePath;
    }

    public File setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public File setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public File setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public File setStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }
    public Boolean getStarred() {
        return this.starred;
    }

    public File setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public File setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public File setThumbnailUrls(java.util.Map<String, String> thumbnailUrls) {
        this.thumbnailUrls = thumbnailUrls;
        return this;
    }
    public java.util.Map<String, String> getThumbnailUrls() {
        return this.thumbnailUrls;
    }

    public File setTrashedAt(String trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    public String getTrashedAt() {
        return this.trashedAt;
    }

    public File setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public File setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public File setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public File setUserTags(java.util.Map<String, String> userTags) {
        this.userTags = userTags;
        return this;
    }
    public java.util.Map<String, String> getUserTags() {
        return this.userTags;
    }

    public File setVideoMediaMetadata(VideoMediaMetadata videoMediaMetadata) {
        this.videoMediaMetadata = videoMediaMetadata;
        return this;
    }
    public VideoMediaMetadata getVideoMediaMetadata() {
        return this.videoMediaMetadata;
    }

    public static class FileDirSizeInfo extends TeaModel {
        /**
         * <p>The number of all descendant folders in the folder, which is calculated recursively.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dir_count")
        public Long dirCount;

        /**
         * <p>The number of all descendant files in the folder, which is calculated recursively.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("file_count")
        public Long fileCount;

        public static FileDirSizeInfo build(java.util.Map<String, ?> map) throws Exception {
            FileDirSizeInfo self = new FileDirSizeInfo();
            return TeaModel.build(map, self);
        }

        public FileDirSizeInfo setDirCount(Long dirCount) {
            this.dirCount = dirCount;
            return this;
        }
        public Long getDirCount() {
            return this.dirCount;
        }

        public FileDirSizeInfo setFileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Long getFileCount() {
            return this.fileCount;
        }

    }

}
