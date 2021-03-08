// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchMediaResponseBody extends TeaModel {
    @NameInMap("MediaList")
    public java.util.List<SearchMediaResponseBodyMediaList> mediaList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScrollToken")
    public String scrollToken;

    @NameInMap("Total")
    public Long total;

    public static SearchMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaResponseBody self = new SearchMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaResponseBody setMediaList(java.util.List<SearchMediaResponseBodyMediaList> mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public java.util.List<SearchMediaResponseBodyMediaList> getMediaList() {
        return this.mediaList;
    }

    public SearchMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaResponseBody setScrollToken(String scrollToken) {
        this.scrollToken = scrollToken;
        return this;
    }
    public String getScrollToken() {
        return this.scrollToken;
    }

    public SearchMediaResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class SearchMediaResponseBodyMediaListVideo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("MediaSource")
        public String mediaSource;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("DownloadSwitch")
        public String downloadSwitch;

        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        @NameInMap("TranscodeMode")
        public String transcodeMode;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("PreprocessStatus")
        public String preprocessStatus;

        @NameInMap("SpriteSnapshots")
        public java.util.List<String> spriteSnapshots;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Title")
        public String title;

        public static SearchMediaResponseBodyMediaListVideo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListVideo self = new SearchMediaResponseBodyMediaListVideo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListVideo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaListVideo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaListVideo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchMediaResponseBodyMediaListVideo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaListVideo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public SearchMediaResponseBodyMediaListVideo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public SearchMediaResponseBodyMediaListVideo setMediaSource(String mediaSource) {
            this.mediaSource = mediaSource;
            return this;
        }
        public String getMediaSource() {
            return this.mediaSource;
        }

        public SearchMediaResponseBodyMediaListVideo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaListVideo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchMediaResponseBodyMediaListVideo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchMediaResponseBodyMediaListVideo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public SearchMediaResponseBodyMediaListVideo setDownloadSwitch(String downloadSwitch) {
            this.downloadSwitch = downloadSwitch;
            return this;
        }
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        public SearchMediaResponseBodyMediaListVideo setSnapshots(java.util.List<String> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        public SearchMediaResponseBodyMediaListVideo setTranscodeMode(String transcodeMode) {
            this.transcodeMode = transcodeMode;
            return this;
        }
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

        public SearchMediaResponseBodyMediaListVideo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public SearchMediaResponseBodyMediaListVideo setPreprocessStatus(String preprocessStatus) {
            this.preprocessStatus = preprocessStatus;
            return this;
        }
        public String getPreprocessStatus() {
            return this.preprocessStatus;
        }

        public SearchMediaResponseBodyMediaListVideo setSpriteSnapshots(java.util.List<String> spriteSnapshots) {
            this.spriteSnapshots = spriteSnapshots;
            return this;
        }
        public java.util.List<String> getSpriteSnapshots() {
            return this.spriteSnapshots;
        }

        public SearchMediaResponseBodyMediaListVideo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public SearchMediaResponseBodyMediaListVideo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public SearchMediaResponseBodyMediaListVideo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SearchMediaResponseBodyMediaListAttachedMediaCategories extends TeaModel {
        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Level")
        public Long level;

        public static SearchMediaResponseBodyMediaListAttachedMediaCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAttachedMediaCategories self = new SearchMediaResponseBodyMediaListAttachedMediaCategories();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAttachedMediaCategories setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public SearchMediaResponseBodyMediaListAttachedMediaCategories setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public SearchMediaResponseBodyMediaListAttachedMediaCategories setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaListAttachedMediaCategories setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

    }

    public static class SearchMediaResponseBodyMediaListAttachedMedia extends TeaModel {
        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Categories")
        public java.util.List<SearchMediaResponseBodyMediaListAttachedMediaCategories> categories;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("URL")
        public String URL;

        @NameInMap("Title")
        public String title;

        public static SearchMediaResponseBodyMediaListAttachedMedia build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAttachedMedia self = new SearchMediaResponseBodyMediaListAttachedMedia();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setCategories(java.util.List<SearchMediaResponseBodyMediaListAttachedMediaCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaListAttachedMediaCategories> getCategories() {
            return this.categories;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SearchMediaResponseBodyMediaListImage extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("URL")
        public String URL;

        @NameInMap("Title")
        public String title;

        @NameInMap("ImageId")
        public String imageId;

        public static SearchMediaResponseBodyMediaListImage build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListImage self = new SearchMediaResponseBodyMediaListImage();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaListImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaListImage setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchMediaResponseBodyMediaListImage setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaListImage setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public SearchMediaResponseBodyMediaListImage setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public SearchMediaResponseBodyMediaListImage setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public SearchMediaResponseBodyMediaListImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaListImage setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchMediaResponseBodyMediaListImage setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public SearchMediaResponseBodyMediaListImage setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchMediaResponseBodyMediaListImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

    public static class SearchMediaResponseBodyMediaListAudio extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("MediaSource")
        public String mediaSource;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("AudioId")
        public String audioId;

        @NameInMap("DownloadSwitch")
        public String downloadSwitch;

        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        @NameInMap("TranscodeMode")
        public String transcodeMode;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("PreprocessStatus")
        public String preprocessStatus;

        @NameInMap("SpriteSnapshots")
        public java.util.List<String> spriteSnapshots;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Title")
        public String title;

        public static SearchMediaResponseBodyMediaListAudio build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAudio self = new SearchMediaResponseBodyMediaListAudio();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAudio setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaListAudio setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaListAudio setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchMediaResponseBodyMediaListAudio setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaListAudio setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public SearchMediaResponseBodyMediaListAudio setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public SearchMediaResponseBodyMediaListAudio setMediaSource(String mediaSource) {
            this.mediaSource = mediaSource;
            return this;
        }
        public String getMediaSource() {
            return this.mediaSource;
        }

        public SearchMediaResponseBodyMediaListAudio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaListAudio setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchMediaResponseBodyMediaListAudio setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchMediaResponseBodyMediaListAudio setAudioId(String audioId) {
            this.audioId = audioId;
            return this;
        }
        public String getAudioId() {
            return this.audioId;
        }

        public SearchMediaResponseBodyMediaListAudio setDownloadSwitch(String downloadSwitch) {
            this.downloadSwitch = downloadSwitch;
            return this;
        }
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        public SearchMediaResponseBodyMediaListAudio setSnapshots(java.util.List<String> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        public SearchMediaResponseBodyMediaListAudio setTranscodeMode(String transcodeMode) {
            this.transcodeMode = transcodeMode;
            return this;
        }
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

        public SearchMediaResponseBodyMediaListAudio setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public SearchMediaResponseBodyMediaListAudio setPreprocessStatus(String preprocessStatus) {
            this.preprocessStatus = preprocessStatus;
            return this;
        }
        public String getPreprocessStatus() {
            return this.preprocessStatus;
        }

        public SearchMediaResponseBodyMediaListAudio setSpriteSnapshots(java.util.List<String> spriteSnapshots) {
            this.spriteSnapshots = spriteSnapshots;
            return this;
        }
        public java.util.List<String> getSpriteSnapshots() {
            return this.spriteSnapshots;
        }

        public SearchMediaResponseBodyMediaListAudio setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public SearchMediaResponseBodyMediaListAudio setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public SearchMediaResponseBodyMediaListAudio setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SearchMediaResponseBodyMediaList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Video")
        public SearchMediaResponseBodyMediaListVideo video;

        @NameInMap("AttachedMedia")
        public SearchMediaResponseBodyMediaListAttachedMedia attachedMedia;

        @NameInMap("Image")
        public SearchMediaResponseBodyMediaListImage image;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("Audio")
        public SearchMediaResponseBodyMediaListAudio audio;

        @NameInMap("MediaId")
        public String mediaId;

        public static SearchMediaResponseBodyMediaList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaList self = new SearchMediaResponseBodyMediaList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaList setVideo(SearchMediaResponseBodyMediaListVideo video) {
            this.video = video;
            return this;
        }
        public SearchMediaResponseBodyMediaListVideo getVideo() {
            return this.video;
        }

        public SearchMediaResponseBodyMediaList setAttachedMedia(SearchMediaResponseBodyMediaListAttachedMedia attachedMedia) {
            this.attachedMedia = attachedMedia;
            return this;
        }
        public SearchMediaResponseBodyMediaListAttachedMedia getAttachedMedia() {
            return this.attachedMedia;
        }

        public SearchMediaResponseBodyMediaList setImage(SearchMediaResponseBodyMediaListImage image) {
            this.image = image;
            return this;
        }
        public SearchMediaResponseBodyMediaListImage getImage() {
            return this.image;
        }

        public SearchMediaResponseBodyMediaList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SearchMediaResponseBodyMediaList setAudio(SearchMediaResponseBodyMediaListAudio audio) {
            this.audio = audio;
            return this;
        }
        public SearchMediaResponseBodyMediaListAudio getAudio() {
            return this.audio;
        }

        public SearchMediaResponseBodyMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
