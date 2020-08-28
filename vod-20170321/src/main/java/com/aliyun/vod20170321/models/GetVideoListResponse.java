// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("VideoList")
    @Validation(required = true)
    public GetVideoListResponseVideoList videoList;

    public static GetVideoListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoListResponse self = new GetVideoListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetVideoListResponseVideoListVideoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static GetVideoListResponseVideoListVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetVideoListResponseVideoListVideoSnapshots self = new GetVideoListResponseVideoListVideoSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoListResponseVideoListVideo extends TeaModel {
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

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public GetVideoListResponseVideoListVideoSnapshots snapshots;

        public static GetVideoListResponseVideoListVideo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoListResponseVideoListVideo self = new GetVideoListResponseVideoListVideo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoListResponseVideoList extends TeaModel {
        @NameInMap("Video")
        @Validation(required = true)
        public java.util.List<GetVideoListResponseVideoListVideo> video;

        public static GetVideoListResponseVideoList build(java.util.Map<String, ?> map) throws Exception {
            GetVideoListResponseVideoList self = new GetVideoListResponseVideoList();
            return TeaModel.build(map, self);
        }

    }

}
