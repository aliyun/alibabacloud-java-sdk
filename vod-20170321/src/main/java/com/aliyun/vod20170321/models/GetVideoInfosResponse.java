// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VideoList")
    @Validation(required = true)
    public java.util.List<GetVideoInfosResponseVideoList> videoList;

    @NameInMap("NonExistVideoIds")
    @Validation(required = true)
    public java.util.List<String> nonExistVideoIds;

    public static GetVideoInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfosResponse self = new GetVideoInfosResponse();
        return TeaModel.build(map, self);
    }

    public static class GetVideoInfosResponseVideoListThumbnailList extends TeaModel {
        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        public static GetVideoInfosResponseVideoListThumbnailList build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfosResponseVideoListThumbnailList self = new GetVideoInfosResponseVideoListThumbnailList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoInfosResponseVideoList extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

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

        @NameInMap("TemplateGroupId")
        @Validation(required = true)
        public String templateGroupId;

        @NameInMap("PreprocessStatus")
        @Validation(required = true)
        public String preprocessStatus;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("CustomMediaInfo")
        @Validation(required = true)
        public String customMediaInfo;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("ThumbnailList")
        @Validation(required = true)
        public java.util.List<GetVideoInfosResponseVideoListThumbnailList> thumbnailList;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public java.util.List<String> snapshots;

        public static GetVideoInfosResponseVideoList build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfosResponseVideoList self = new GetVideoInfosResponseVideoList();
            return TeaModel.build(map, self);
        }

    }

}
