// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLiveRecordVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("LiveRecordVideoList")
    @Validation(required = true)
    public ListLiveRecordVideoResponseLiveRecordVideoList liveRecordVideoList;

    public static ListLiveRecordVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordVideoResponse self = new ListLiveRecordVideoResponse();
        return TeaModel.build(map, self);
    }

    public static class ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoPlayInfoListPlayInfo extends TeaModel {
        @NameInMap("Width")
        @Validation(required = true)
        public Long width;

        @NameInMap("Height")
        @Validation(required = true)
        public Long height;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("PlayURL")
        @Validation(required = true)
        public String playURL;

        @NameInMap("Bitrate")
        @Validation(required = true)
        public String bitrate;

        @NameInMap("Definition")
        @Validation(required = true)
        public String definition;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("Fps")
        @Validation(required = true)
        public String fps;

        @NameInMap("Encrypt")
        @Validation(required = true)
        public Long encrypt;

        @NameInMap("Plaintext")
        @Validation(required = true)
        public String plaintext;

        @NameInMap("Complexity")
        @Validation(required = true)
        public String complexity;

        @NameInMap("StreamType")
        @Validation(required = true)
        public String streamType;

        @NameInMap("Rand")
        @Validation(required = true)
        public String rand;

        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        public static ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoPlayInfoListPlayInfo build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoPlayInfoListPlayInfo self = new ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoPlayInfoListPlayInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoPlayInfoList extends TeaModel {
        @NameInMap("PlayInfo")
        @Validation(required = true)
        public java.util.List<ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoPlayInfoListPlayInfo> playInfo;

        public static ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoPlayInfoList self = new ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoPlayInfoList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoVideoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoVideoSnapshots self = new ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoVideoSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoVideo extends TeaModel {
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

        @NameInMap("Privilege")
        @Validation(required = true)
        public Integer privilege;

        @NameInMap("Duration")
        @Validation(required = true)
        public Double duration;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CustomerId")
        @Validation(required = true)
        public Long customerId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("CateId")
        @Validation(required = true)
        public Integer cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("DownloadSwitch")
        @Validation(required = true)
        public String downloadSwitch;

        @NameInMap("TemplateGroupId")
        @Validation(required = true)
        public String templateGroupId;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoVideoSnapshots snapshots;

        public static ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoVideo build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoVideo self = new ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoVideo();
            return TeaModel.build(map, self);
        }

    }

    public static class ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideo extends TeaModel {
        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("PlaylistId")
        @Validation(required = true)
        public String playlistId;

        @NameInMap("RecordStartTime")
        @Validation(required = true)
        public String recordStartTime;

        @NameInMap("RecordEndTime")
        @Validation(required = true)
        public String recordEndTime;

        @NameInMap("PlayInfoList")
        @Validation(required = true)
        public ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoPlayInfoList playInfoList;

        @NameInMap("Video")
        @Validation(required = true)
        public ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideoVideo video;

        public static ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideo build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideo self = new ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideo();
            return TeaModel.build(map, self);
        }

    }

    public static class ListLiveRecordVideoResponseLiveRecordVideoList extends TeaModel {
        @NameInMap("LiveRecordVideo")
        @Validation(required = true)
        public java.util.List<ListLiveRecordVideoResponseLiveRecordVideoListLiveRecordVideo> liveRecordVideo;

        public static ListLiveRecordVideoResponseLiveRecordVideoList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordVideoResponseLiveRecordVideoList self = new ListLiveRecordVideoResponseLiveRecordVideoList();
            return TeaModel.build(map, self);
        }

    }

}
