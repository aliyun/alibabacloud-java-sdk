// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PlayInfoList")
    @Validation(required = true)
    public GetPlayInfoResponsePlayInfoList playInfoList;

    @NameInMap("VideoBase")
    @Validation(required = true)
    public GetPlayInfoResponseVideoBase videoBase;

    public static GetPlayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlayInfoResponse self = new GetPlayInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetPlayInfoResponsePlayInfoListPlayInfo extends TeaModel {
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

        @NameInMap("PreprocessStatus")
        @Validation(required = true)
        public String preprocessStatus;

        @NameInMap("WatermarkId")
        @Validation(required = true)
        public String watermarkId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("EncryptType")
        @Validation(required = true)
        public String encryptType;

        @NameInMap("NarrowBandType")
        @Validation(required = true)
        public String narrowBandType;

        @NameInMap("Specification")
        @Validation(required = true)
        public String specification;

        public static GetPlayInfoResponsePlayInfoListPlayInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponsePlayInfoListPlayInfo self = new GetPlayInfoResponsePlayInfoListPlayInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetPlayInfoResponsePlayInfoList extends TeaModel {
        @NameInMap("PlayInfo")
        @Validation(required = true)
        public java.util.List<GetPlayInfoResponsePlayInfoListPlayInfo> playInfo;

        public static GetPlayInfoResponsePlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponsePlayInfoList self = new GetPlayInfoResponsePlayInfoList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetPlayInfoResponseVideoBaseThumbnailListThumbnail extends TeaModel {
        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        public static GetPlayInfoResponseVideoBaseThumbnailListThumbnail build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponseVideoBaseThumbnailListThumbnail self = new GetPlayInfoResponseVideoBaseThumbnailListThumbnail();
            return TeaModel.build(map, self);
        }

    }

    public static class GetPlayInfoResponseVideoBaseThumbnailList extends TeaModel {
        @NameInMap("Thumbnail")
        @Validation(required = true)
        public java.util.List<GetPlayInfoResponseVideoBaseThumbnailListThumbnail> thumbnail;

        public static GetPlayInfoResponseVideoBaseThumbnailList build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponseVideoBaseThumbnailList self = new GetPlayInfoResponseVideoBaseThumbnailList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetPlayInfoResponseVideoBase extends TeaModel {
        @NameInMap("OutputType")
        @Validation(required = true)
        public String outputType;

        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("MediaType")
        @Validation(required = true)
        public String mediaType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("TranscodeMode")
        @Validation(required = true)
        public String transcodeMode;

        @NameInMap("ThumbnailList")
        @Validation(required = true)
        public GetPlayInfoResponseVideoBaseThumbnailList thumbnailList;

        public static GetPlayInfoResponseVideoBase build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponseVideoBase self = new GetPlayInfoResponseVideoBase();
            return TeaModel.build(map, self);
        }

    }

}
