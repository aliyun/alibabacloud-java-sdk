// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchMediaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ScrollToken")
    @Validation(required = true)
    public String scrollToken;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("MediaList")
    @Validation(required = true)
    public java.util.List<SearchMediaResponseMediaList> mediaList;

    public static SearchMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaResponse self = new SearchMediaResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchMediaResponseMediaListVideo extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("MediaSource")
        @Validation(required = true)
        public String mediaSource;

        @NameInMap("MediaType")
        @Validation(required = true)
        public String mediaType;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("Duration")
        @Validation(required = true)
        public Double duration;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("CateId")
        @Validation(required = true)
        public Long cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("DownloadSwitch")
        @Validation(required = true)
        public String downloadSwitch;

        @NameInMap("PreprocessStatus")
        @Validation(required = true)
        public String preprocessStatus;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("TranscodeMode")
        @Validation(required = true)
        public String transcodeMode;

        @NameInMap("AuditStatus")
        @Validation(required = true)
        public String auditStatus;

        @NameInMap("AuditAIStatus")
        @Validation(required = true)
        public String auditAIStatus;

        @NameInMap("AuditManualStatus")
        @Validation(required = true)
        public String auditManualStatus;

        @NameInMap("AuditAIResult")
        @Validation(required = true)
        public String auditAIResult;

        @NameInMap("AuditTemplateId")
        @Validation(required = true)
        public String auditTemplateId;

        @NameInMap("CustomMediaInfo")
        @Validation(required = true)
        public String customMediaInfo;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public java.util.List<String> snapshots;

        @NameInMap("SpriteSnapshots")
        @Validation(required = true)
        public java.util.List<String> spriteSnapshots;

        public static SearchMediaResponseMediaListVideo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaListVideo self = new SearchMediaResponseMediaListVideo();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaResponseMediaListAudio extends TeaModel {
        @NameInMap("AudioId")
        @Validation(required = true)
        public String audioId;

        @NameInMap("MediaSource")
        @Validation(required = true)
        public String mediaSource;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("Duration")
        @Validation(required = true)
        public Double duration;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("CateId")
        @Validation(required = true)
        public Long cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("DownloadSwitch")
        @Validation(required = true)
        public String downloadSwitch;

        @NameInMap("PreprocessStatus")
        @Validation(required = true)
        public String preprocessStatus;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("TranscodeMode")
        @Validation(required = true)
        public String transcodeMode;

        @NameInMap("AuditStatus")
        @Validation(required = true)
        public String auditStatus;

        @NameInMap("AuditAIStatus")
        @Validation(required = true)
        public String auditAIStatus;

        @NameInMap("AuditManualStatus")
        @Validation(required = true)
        public String auditManualStatus;

        @NameInMap("AuditAIResult")
        @Validation(required = true)
        public String auditAIResult;

        @NameInMap("AuditTemplateId")
        @Validation(required = true)
        public String auditTemplateId;

        @NameInMap("CustomMediaInfo")
        @Validation(required = true)
        public String customMediaInfo;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public java.util.List<String> snapshots;

        @NameInMap("SpriteSnapshots")
        @Validation(required = true)
        public java.util.List<String> spriteSnapshots;

        public static SearchMediaResponseMediaListAudio build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaListAudio self = new SearchMediaResponseMediaListAudio();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaResponseMediaListImage extends TeaModel {
        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("CateId")
        @Validation(required = true)
        public Long cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("Ext")
        @Validation(required = true)
        public String ext;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        public static SearchMediaResponseMediaListImage build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaListImage self = new SearchMediaResponseMediaListImage();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaResponseMediaListAttachedMediaCategories extends TeaModel {
        @NameInMap("CateId")
        @Validation(required = true)
        public Long cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("Level")
        @Validation(required = true)
        public Long level;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        public static SearchMediaResponseMediaListAttachedMediaCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaListAttachedMediaCategories self = new SearchMediaResponseMediaListAttachedMediaCategories();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaResponseMediaListAttachedMedia extends TeaModel {
        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Ext")
        @Validation(required = true)
        public String ext;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("BusinessType")
        @Validation(required = true)
        public String businessType;

        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("Icon")
        @Validation(required = true)
        public String icon;

        @NameInMap("OnlineStatus")
        @Validation(required = true)
        public String onlineStatus;

        @NameInMap("Categories")
        @Validation(required = true)
        public java.util.List<SearchMediaResponseMediaListAttachedMediaCategories> categories;

        public static SearchMediaResponseMediaListAttachedMedia build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaListAttachedMedia self = new SearchMediaResponseMediaListAttachedMedia();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaResponseMediaList extends TeaModel {
        @NameInMap("MediaType")
        @Validation(required = true)
        public String mediaType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Video")
        @Validation(required = true)
        public SearchMediaResponseMediaListVideo video;

        @NameInMap("Audio")
        @Validation(required = true)
        public SearchMediaResponseMediaListAudio audio;

        @NameInMap("Image")
        @Validation(required = true)
        public SearchMediaResponseMediaListImage image;

        @NameInMap("AttachedMedia")
        @Validation(required = true)
        public SearchMediaResponseMediaListAttachedMedia attachedMedia;

        public static SearchMediaResponseMediaList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaList self = new SearchMediaResponseMediaList();
            return TeaModel.build(map, self);
        }

    }

}
