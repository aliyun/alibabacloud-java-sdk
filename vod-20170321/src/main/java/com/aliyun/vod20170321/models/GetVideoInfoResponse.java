// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AI")
    @Validation(required = true)
    public String AI;

    @NameInMap("Video")
    @Validation(required = true)
    public GetVideoInfoResponseVideo video;

    public static GetVideoInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfoResponse self = new GetVideoInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetVideoInfoResponseVideoThumbnailListThumbnail extends TeaModel {
        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        public static GetVideoInfoResponseVideoThumbnailListThumbnail build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfoResponseVideoThumbnailListThumbnail self = new GetVideoInfoResponseVideoThumbnailListThumbnail();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoInfoResponseVideoThumbnailList extends TeaModel {
        @NameInMap("Thumbnail")
        @Validation(required = true)
        public java.util.List<GetVideoInfoResponseVideoThumbnailListThumbnail> thumbnail;

        public static GetVideoInfoResponseVideoThumbnailList build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfoResponseVideoThumbnailList self = new GetVideoInfoResponseVideoThumbnailList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoInfoResponseVideoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static GetVideoInfoResponseVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfoResponseVideoSnapshots self = new GetVideoInfoResponseVideoSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoInfoResponseVideo extends TeaModel {
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

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

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

        @NameInMap("AuditStatus")
        @Validation(required = true)
        public String auditStatus;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("ThumbnailList")
        @Validation(required = true)
        public GetVideoInfoResponseVideoThumbnailList thumbnailList;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public GetVideoInfoResponseVideoSnapshots snapshots;

        public static GetVideoInfoResponseVideo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfoResponseVideo self = new GetVideoInfoResponseVideo();
            return TeaModel.build(map, self);
        }

    }

}
