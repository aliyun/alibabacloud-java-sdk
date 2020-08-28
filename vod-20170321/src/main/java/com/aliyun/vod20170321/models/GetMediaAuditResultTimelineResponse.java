// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultTimelineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaAuditResultTimeline")
    @Validation(required = true)
    public GetMediaAuditResultTimelineResponseMediaAuditResultTimeline mediaAuditResultTimeline;

    public static GetMediaAuditResultTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultTimelineResponse self = new GetMediaAuditResultTimelineResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMediaAuditResultTimelineResponseMediaAuditResultTimelinePorn extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        public static GetMediaAuditResultTimelineResponseMediaAuditResultTimelinePorn build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseMediaAuditResultTimelinePorn self = new GetMediaAuditResultTimelineResponseMediaAuditResultTimelinePorn();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultTimelineResponseMediaAuditResultTimelineTerrorism extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        public static GetMediaAuditResultTimelineResponseMediaAuditResultTimelineTerrorism build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseMediaAuditResultTimelineTerrorism self = new GetMediaAuditResultTimelineResponseMediaAuditResultTimelineTerrorism();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultTimelineResponseMediaAuditResultTimelineLogo extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        public static GetMediaAuditResultTimelineResponseMediaAuditResultTimelineLogo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseMediaAuditResultTimelineLogo self = new GetMediaAuditResultTimelineResponseMediaAuditResultTimelineLogo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultTimelineResponseMediaAuditResultTimelineLive extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        public static GetMediaAuditResultTimelineResponseMediaAuditResultTimelineLive build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseMediaAuditResultTimelineLive self = new GetMediaAuditResultTimelineResponseMediaAuditResultTimelineLive();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultTimelineResponseMediaAuditResultTimelineAd extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        public static GetMediaAuditResultTimelineResponseMediaAuditResultTimelineAd build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseMediaAuditResultTimelineAd self = new GetMediaAuditResultTimelineResponseMediaAuditResultTimelineAd();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultTimelineResponseMediaAuditResultTimeline extends TeaModel {
        @NameInMap("Porn")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultTimelineResponseMediaAuditResultTimelinePorn> porn;

        @NameInMap("Terrorism")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultTimelineResponseMediaAuditResultTimelineTerrorism> terrorism;

        @NameInMap("Logo")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultTimelineResponseMediaAuditResultTimelineLogo> logo;

        @NameInMap("Live")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultTimelineResponseMediaAuditResultTimelineLive> live;

        @NameInMap("Ad")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultTimelineResponseMediaAuditResultTimelineAd> ad;

        public static GetMediaAuditResultTimelineResponseMediaAuditResultTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseMediaAuditResultTimeline self = new GetMediaAuditResultTimelineResponseMediaAuditResultTimeline();
            return TeaModel.build(map, self);
        }

    }

}
