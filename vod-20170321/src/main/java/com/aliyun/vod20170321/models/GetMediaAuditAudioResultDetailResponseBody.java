// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditAudioResultDetailResponseBody extends TeaModel {
    /**
     * <p>The review results.</p>
     */
    @NameInMap("MediaAuditAudioResultDetail")
    public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail mediaAuditAudioResultDetail;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB7D7232-1AB2-40FE-B8D3-****</p>
     */
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
        /**
         * <p>The end time of the problematic audio segment. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The category of the audio review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>spam</strong>: Contains spam.</li>
         * <li><strong>ad</strong>: Advertisement.</li>
         * <li><strong>politics</strong>: Political content.</li>
         * <li><strong>terrorism</strong>: Terrorist content.</li>
         * <li><strong>abuse</strong>: Abusive content.</li>
         * <li><strong>porn</strong>: Pornographic content.</li>
         * <li><strong>flood</strong>: Junk content.</li>
         * <li><strong>contraband</strong>: Prohibited content.</li>
         * <li><strong>meaningless</strong>: Meaningless content.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>abuse</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The start time of the problematic audio segment. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The text content corresponding to the audio.</p>
         * 
         * <strong>example:</strong>
         * <p>Tiananmen</p>
         */
        @NameInMap("Text")
        public String text;

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

        public GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

    }

    public static class GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetail extends TeaModel {
        /**
         * <p>The result list.</p>
         */
        @NameInMap("List")
        public java.util.List<GetMediaAuditAudioResultDetailResponseBodyMediaAuditAudioResultDetailList> list;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageTotal")
        public Integer pageTotal;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
