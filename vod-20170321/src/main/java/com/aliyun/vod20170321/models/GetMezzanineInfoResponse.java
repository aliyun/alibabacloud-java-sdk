// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Mezzanine")
    @Validation(required = true)
    public GetMezzanineInfoResponseMezzanine mezzanine;

    public static GetMezzanineInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMezzanineInfoResponse self = new GetMezzanineInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMezzanineInfoResponseMezzanineAudioStreamList extends TeaModel {
        @NameInMap("Index")
        @Validation(required = true)
        public String index;

        @NameInMap("CodecName")
        @Validation(required = true)
        public String codecName;

        @NameInMap("CodecLongName")
        @Validation(required = true)
        public String codecLongName;

        @NameInMap("CodecTimeBase")
        @Validation(required = true)
        public String codecTimeBase;

        @NameInMap("CodecTagString")
        @Validation(required = true)
        public String codecTagString;

        @NameInMap("CodecTag")
        @Validation(required = true)
        public String codecTag;

        @NameInMap("SampleFmt")
        @Validation(required = true)
        public String sampleFmt;

        @NameInMap("SampleRate")
        @Validation(required = true)
        public String sampleRate;

        @NameInMap("Channels")
        @Validation(required = true)
        public String channels;

        @NameInMap("ChannelLayout")
        @Validation(required = true)
        public String channelLayout;

        @NameInMap("Timebase")
        @Validation(required = true)
        public String timebase;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("Bitrate")
        @Validation(required = true)
        public String bitrate;

        @NameInMap("NumFrames")
        @Validation(required = true)
        public String numFrames;

        @NameInMap("Lang")
        @Validation(required = true)
        public String lang;

        public static GetMezzanineInfoResponseMezzanineAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            GetMezzanineInfoResponseMezzanineAudioStreamList self = new GetMezzanineInfoResponseMezzanineAudioStreamList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMezzanineInfoResponseMezzanineVideoStreamList extends TeaModel {
        @NameInMap("Index")
        @Validation(required = true)
        public String index;

        @NameInMap("CodecName")
        @Validation(required = true)
        public String codecName;

        @NameInMap("CodecLongName")
        @Validation(required = true)
        public String codecLongName;

        @NameInMap("Profile")
        @Validation(required = true)
        public String profile;

        @NameInMap("CodecTimeBase")
        @Validation(required = true)
        public String codecTimeBase;

        @NameInMap("CodecTagString")
        @Validation(required = true)
        public String codecTagString;

        @NameInMap("CodecTag")
        @Validation(required = true)
        public String codecTag;

        @NameInMap("Width")
        @Validation(required = true)
        public String width;

        @NameInMap("Height")
        @Validation(required = true)
        public String height;

        @NameInMap("HasBFrames")
        @Validation(required = true)
        public String hasBFrames;

        @NameInMap("Sar")
        @Validation(required = true)
        public String sar;

        @NameInMap("Dar")
        @Validation(required = true)
        public String dar;

        @NameInMap("PixFmt")
        @Validation(required = true)
        public String pixFmt;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Fps")
        @Validation(required = true)
        public String fps;

        @NameInMap("AvgFPS")
        @Validation(required = true)
        public String avgFPS;

        @NameInMap("Timebase")
        @Validation(required = true)
        public String timebase;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("NumFrames")
        @Validation(required = true)
        public String numFrames;

        @NameInMap("Lang")
        @Validation(required = true)
        public String lang;

        @NameInMap("Rotate")
        @Validation(required = true)
        public String rotate;

        public static GetMezzanineInfoResponseMezzanineVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            GetMezzanineInfoResponseMezzanineVideoStreamList self = new GetMezzanineInfoResponseMezzanineVideoStreamList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMezzanineInfoResponseMezzanine extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("Bitrate")
        @Validation(required = true)
        public String bitrate;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("Fps")
        @Validation(required = true)
        public String fps;

        @NameInMap("Height")
        @Validation(required = true)
        public Long height;

        @NameInMap("Width")
        @Validation(required = true)
        public Long width;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FileURL")
        @Validation(required = true)
        public String fileURL;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("CRC64")
        @Validation(required = true)
        public String CRC64;

        @NameInMap("PreprocessStatus")
        @Validation(required = true)
        public String preprocessStatus;

        @NameInMap("OutputType")
        @Validation(required = true)
        public String outputType;

        @NameInMap("AudioStreamList")
        @Validation(required = true)
        public java.util.List<GetMezzanineInfoResponseMezzanineAudioStreamList> audioStreamList;

        @NameInMap("VideoStreamList")
        @Validation(required = true)
        public java.util.List<GetMezzanineInfoResponseMezzanineVideoStreamList> videoStreamList;

        public static GetMezzanineInfoResponseMezzanine build(java.util.Map<String, ?> map) throws Exception {
            GetMezzanineInfoResponseMezzanine self = new GetMezzanineInfoResponseMezzanine();
            return TeaModel.build(map, self);
        }

    }

}
