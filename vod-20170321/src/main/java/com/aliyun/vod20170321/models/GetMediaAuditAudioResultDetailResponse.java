// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditAudioResultDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaAuditAudioResultDetail")
    @Validation(required = true)
    public GetMediaAuditAudioResultDetailResponseMediaAuditAudioResultDetail mediaAuditAudioResultDetail;

    public static GetMediaAuditAudioResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditAudioResultDetailResponse self = new GetMediaAuditAudioResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMediaAuditAudioResultDetailResponseMediaAuditAudioResultDetailList extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static GetMediaAuditAudioResultDetailResponseMediaAuditAudioResultDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditAudioResultDetailResponseMediaAuditAudioResultDetailList self = new GetMediaAuditAudioResultDetailResponseMediaAuditAudioResultDetailList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditAudioResultDetailResponseMediaAuditAudioResultDetail extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageTotal")
        @Validation(required = true)
        public Integer pageTotal;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<GetMediaAuditAudioResultDetailResponseMediaAuditAudioResultDetailList> list;

        public static GetMediaAuditAudioResultDetailResponseMediaAuditAudioResultDetail build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditAudioResultDetailResponseMediaAuditAudioResultDetail self = new GetMediaAuditAudioResultDetailResponseMediaAuditAudioResultDetail();
            return TeaModel.build(map, self);
        }

    }

}
