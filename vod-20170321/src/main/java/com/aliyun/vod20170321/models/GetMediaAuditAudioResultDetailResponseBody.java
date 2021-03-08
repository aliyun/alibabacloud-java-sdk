// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditAudioResultDetailResponseBody extends TeaModel {
    @NameInMap("MediaAuditAudioResultDetail")
    public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail mediaAuditAudioResultDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaAuditAudioResultDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditAudioResultDetailResponseBody self = new GetMediaAuditAudioResultDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditAudioResultDetailResponseBody setMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail mediaAuditAudioResultDetail) {
        this.mediaAuditAudioResultDetail = mediaAuditAudioResultDetail;
        return this;
    }
    public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail getMediaAuditAudioResultDetail() {
        return this.mediaAuditAudioResultDetail;
    }

    public GetMediaAuditAudioResultDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Text")
        public String text;

        @NameInMap("Label")
        public String label;

        public static GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList self = new GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList> list;

        @NameInMap("PageTotal")
        public Integer pageTotal;

        @NameInMap("Total")
        public Integer total;

        public static GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail self = new GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail setList(java.util.List<GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList> getList() {
            return this.list;
        }

        public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
