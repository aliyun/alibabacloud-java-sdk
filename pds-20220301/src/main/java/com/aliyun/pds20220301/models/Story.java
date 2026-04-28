// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Story extends TeaModel {
    /**
     * <p>The ID of the story cover file.</p>
     * 
     * <strong>example:</strong>
     * <p>63e5e4340f76cb3ead5f40f68163f0f967c1a7bf</p>
     */
    @NameInMap("cover_file_id")
    public String coverFileId;

    /**
     * <p>The URL of thumbnail of the story cover file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://pds-domain-bucket.oss-cn-hangzhou.aliyuncs.com/Bh1HqdAs%2F1001%2F642a88c26f99cad589904fc8a6b2db6021c6601f%2F642a88c29391c47f221e49e88a21fa9b0a9e5063?security-token=CAIS%2BgF1q6Ft5B2yfSjIr5eGE8nGtYZ59bSnbUODlmsjTttVhpbFpjz2IHpPfHdoBe0btvU%2BlWxX6fwZlq5rR4QAXlDfNXD6XXO2qFHPWZHInuDox55m4cTXNAr%2BIhr%2F29CoEIedZdjBe%2FCrRknZnytou9XTfimjWFrXWv%2Fgy%2BQQDLItUxK%2FcCBNCfpPOwJms7V6D3bKMuu3OROY6Qi5TmgQ41En1DIlt%2FXuk5DCtkqB12eXkLFF%2B97DRbG%2FdNRpMZtFVNO44fd7bKKp0lQLsUMSqv8q0fEcqGaW4o7CWQJLnzyCMvvJ9OVDFyN0aKEnH7J%2Bq%2FzxhTPrMnpkSlacGoABVgD3mIAeUoDYKTJrFTPdmAPIrlUUQ1HZstB0ZVHvYByygr3oeitG9FEQ8lcfaZYJOtWRchdgH8tsSwHj2jI1vMeAiLHgbW98SPA3yfN8OR1kLW73uq3LAvekc9Qldz33YTM4JA5MNJzR8x5O6Oe4rY5OMSSVU5F%2Ffr8bJZD%2FXMM%3D&x-oss-access-key-id=STS.NT3XsrXYXBvLoe2rkvBTyiSnD&x-oss-expires=1685966251&x-oss-process=image%2Fresize%2Cw_500&x-oss-signature=XimW6haBxYktKg4cstMfpd%2F2LSoMibj6A%2B7ZqBJcSbQ%3D&x-oss-signature-version=OSS2">https://pds-domain-bucket.oss-cn-hangzhou.aliyuncs.com/Bh1HqdAs%2F1001%2F642a88c26f99cad589904fc8a6b2db6021c6601f%2F642a88c29391c47f221e49e88a21fa9b0a9e5063?security-token=CAIS%2BgF1q6Ft5B2yfSjIr5eGE8nGtYZ59bSnbUODlmsjTttVhpbFpjz2IHpPfHdoBe0btvU%2BlWxX6fwZlq5rR4QAXlDfNXD6XXO2qFHPWZHInuDox55m4cTXNAr%2BIhr%2F29CoEIedZdjBe%2FCrRknZnytou9XTfimjWFrXWv%2Fgy%2BQQDLItUxK%2FcCBNCfpPOwJms7V6D3bKMuu3OROY6Qi5TmgQ41En1DIlt%2FXuk5DCtkqB12eXkLFF%2B97DRbG%2FdNRpMZtFVNO44fd7bKKp0lQLsUMSqv8q0fEcqGaW4o7CWQJLnzyCMvvJ9OVDFyN0aKEnH7J%2Bq%2FzxhTPrMnpkSlacGoABVgD3mIAeUoDYKTJrFTPdmAPIrlUUQ1HZstB0ZVHvYByygr3oeitG9FEQ8lcfaZYJOtWRchdgH8tsSwHj2jI1vMeAiLHgbW98SPA3yfN8OR1kLW73uq3LAvekc9Qldz33YTM4JA5MNJzR8x5O6Oe4rY5OMSSVU5F%2Ffr8bJZD%2FXMM%3D&amp;x-oss-access-key-id=STS.NT3XsrXYXBvLoe2rkvBTyiSnD&amp;x-oss-expires=1685966251&amp;x-oss-process=image%2Fresize%2Cw_500&amp;x-oss-signature=XimW6haBxYktKg4cstMfpd%2F2LSoMibj6A%2B7ZqBJcSbQ%3D&amp;x-oss-signature-version=OSS2</a></p>
     */
    @NameInMap("cover_file_thumbnail_url")
    public String coverFileThumbnailUrl;

    /**
     * <p>The time when the story was created. The time follows the RFC3339 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:17:18.102700407+08:00</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The custom tags. You can specify key-value pairs based on your business requirements to search for stories by calling the FindStories operation.</p>
     */
    @NameInMap("custom_labels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The information about face-based groups. This parameter is valid only if story_type is set to PeopleMemory. This parameter is invalid for stories of other types or custom stories.</p>
     */
    @NameInMap("face_group_ids")
    public java.util.List<String> faceGroupIds;

    /**
     * <p>The time when the story ends. The time follows the RFC3339 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:17:18.102700407+08:00</p>
     */
    @NameInMap("story_end_time")
    public String storyEndTime;

    /**
     * <p>The story files.</p>
     */
    @NameInMap("story_file_list")
    public java.util.List<File> storyFileList;

    /**
     * <p>The story ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
     */
    @NameInMap("story_id")
    public String storyId;

    /**
     * <p>The name of the story.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("story_name")
    public String storyName;

    /**
     * <p>The time when the story starts. The time follows the RFC3339 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T10:17:18.102700407+08:00</p>
     */
    @NameInMap("story_start_time")
    public String storyStartTime;

    /**
     * <p>The subtype of the story. It is specified when the story is created.</p>
     * 
     * <strong>example:</strong>
     * <p>Solo</p>
     */
    @NameInMap("story_sub_type")
    public String storySubType;

    /**
     * <p>The type of the story. It is specified when the story is created.</p>
     * 
     * <strong>example:</strong>
     * <p>PeopleMemory</p>
     */
    @NameInMap("story_type")
    public String storyType;

    /**
     * <p>The time when the story was updated. The time follows the RFC3339 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:17:18.102700407+08:00</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    public static Story build(java.util.Map<String, ?> map) throws Exception {
        Story self = new Story();
        return TeaModel.build(map, self);
    }

    public Story setCoverFileId(String coverFileId) {
        this.coverFileId = coverFileId;
        return this;
    }
    public String getCoverFileId() {
        return this.coverFileId;
    }

    public Story setCoverFileThumbnailUrl(String coverFileThumbnailUrl) {
        this.coverFileThumbnailUrl = coverFileThumbnailUrl;
        return this;
    }
    public String getCoverFileThumbnailUrl() {
        return this.coverFileThumbnailUrl;
    }

    public Story setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Story setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public Story setFaceGroupIds(java.util.List<String> faceGroupIds) {
        this.faceGroupIds = faceGroupIds;
        return this;
    }
    public java.util.List<String> getFaceGroupIds() {
        return this.faceGroupIds;
    }

    public Story setStoryEndTime(String storyEndTime) {
        this.storyEndTime = storyEndTime;
        return this;
    }
    public String getStoryEndTime() {
        return this.storyEndTime;
    }

    public Story setStoryFileList(java.util.List<File> storyFileList) {
        this.storyFileList = storyFileList;
        return this;
    }
    public java.util.List<File> getStoryFileList() {
        return this.storyFileList;
    }

    public Story setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

    public Story setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public Story setStoryStartTime(String storyStartTime) {
        this.storyStartTime = storyStartTime;
        return this;
    }
    public String getStoryStartTime() {
        return this.storyStartTime;
    }

    public Story setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public Story setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

    public Story setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
