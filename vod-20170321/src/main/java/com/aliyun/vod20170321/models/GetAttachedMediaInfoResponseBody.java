// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAttachedMediaInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the media asset.</p>
     */
    @NameInMap("AttachedMediaList")
    public java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaList> attachedMediaList;

    /**
     * <p>The IDs of the auxiliary media assets that do not exist.</p>
     */
    @NameInMap("NonExistMediaIds")
    public java.util.List<String> nonExistMediaIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>221BCB57-B217-42BF-619BD13378F9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAttachedMediaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAttachedMediaInfoResponseBody self = new GetAttachedMediaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAttachedMediaInfoResponseBody setAttachedMediaList(java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaList> attachedMediaList) {
        this.attachedMediaList = attachedMediaList;
        return this;
    }
    public java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaList> getAttachedMediaList() {
        return this.attachedMediaList;
    }

    public GetAttachedMediaInfoResponseBody setNonExistMediaIds(java.util.List<String> nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public java.util.List<String> getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    public GetAttachedMediaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAttachedMediaInfoResponseBodyAttachedMediaListCategories extends TeaModel {
        /**
         * <p>The ID of the video category.</p>
         * 
         * <strong>example:</strong>
         * <p>1000224338</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         * <ul>
         * <li>The value can be up to 64 bytes in length.</li>
         * <li>The string must be encoded in the UTF-8 format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>category test</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The level of the category. A value of 0 indicates a level 1 category.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <p>The ID of the parent category. The parent category ID of a level 1 category is -1.</p>
         * 
         * <strong>example:</strong>
         * <p>1000224336</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        public static GetAttachedMediaInfoResponseBodyAttachedMediaListCategories build(java.util.Map<String, ?> map) throws Exception {
            GetAttachedMediaInfoResponseBodyAttachedMediaListCategories self = new GetAttachedMediaInfoResponseBodyAttachedMediaListCategories();
            return TeaModel.build(map, self);
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaListCategories setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaListCategories setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaListCategories setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaListCategories setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class GetAttachedMediaInfoResponseBodyAttachedMediaList extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-*****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The list of categories.</p>
         */
        @NameInMap("Categories")
        public java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaListCategories> categories;

        /**
         * <p>The time when the auxiliary media asset was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T10:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the auxiliary media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>description test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the auxiliary media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>0222e203cf80f9c22870a4d2c****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The time when the auxiliary media asset was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-31T11:42:20Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The status of the auxiliary media asset. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong>: The auxiliary media asset is being uploaded. This is the initial status.</li>
         * <li><strong>Normal</strong>: The auxiliary media asset is uploaded.</li>
         * <li><strong>UploadFail</strong>: The auxiliary media asset fails to be uploaded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The OSS bucket where the auxiliary media asset is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>outin-bfefbb9*****c7426.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the auxiliary media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1,tag2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the auxiliary media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>subtitle test</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The type of the auxiliary media asset. Valid values:</p>
         * <ul>
         * <li><strong>watermark</strong></li>
         * <li><strong>subtitle</strong></li>
         * <li><strong>material</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>subtitle</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the auxiliary media asset.</p>
         * <blockquote>
         * <p>If a CDN domain name is specified, a CDN URL is returned. Otherwise, an OSS URL is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://al*****.cn/subtitle/9843C2*****4E186F19B6.vtt?auth_key=159099f60e0b7fd59">https://al*****.cn/subtitle/9843C2*****4E186F19B6.vtt?auth_key=159099f60e0b7fd59</a>****</p>
         */
        @NameInMap("URL")
        public String URL;

        public static GetAttachedMediaInfoResponseBodyAttachedMediaList build(java.util.Map<String, ?> map) throws Exception {
            GetAttachedMediaInfoResponseBodyAttachedMediaList self = new GetAttachedMediaInfoResponseBodyAttachedMediaList();
            return TeaModel.build(map, self);
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setCategories(java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaListCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaListCategories> getCategories() {
            return this.categories;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
