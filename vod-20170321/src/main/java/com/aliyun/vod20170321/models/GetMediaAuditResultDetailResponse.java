// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaAuditResultDetail")
    @Validation(required = true)
    public GetMediaAuditResultDetailResponseMediaAuditResultDetail mediaAuditResultDetail;

    public static GetMediaAuditResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultDetailResponse self = new GetMediaAuditResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMediaAuditResultDetailResponseMediaAuditResultDetailList extends TeaModel {
        @NameInMap("PornLabel")
        @Validation(required = true)
        public String pornLabel;

        @NameInMap("PornScore")
        @Validation(required = true)
        public String pornScore;

        @NameInMap("TerrorismLabel")
        @Validation(required = true)
        public String terrorismLabel;

        @NameInMap("TerrorismScore")
        @Validation(required = true)
        public String terrorismScore;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("AdLabel")
        @Validation(required = true)
        public String adLabel;

        @NameInMap("AdScore")
        @Validation(required = true)
        public String adScore;

        @NameInMap("LiveLabel")
        @Validation(required = true)
        public String liveLabel;

        @NameInMap("LiveScore")
        @Validation(required = true)
        public String liveScore;

        @NameInMap("LogoLabel")
        @Validation(required = true)
        public String logoLabel;

        @NameInMap("LogoScore")
        @Validation(required = true)
        public String logoScore;

        public static GetMediaAuditResultDetailResponseMediaAuditResultDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultDetailResponseMediaAuditResultDetailList self = new GetMediaAuditResultDetailResponseMediaAuditResultDetailList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultDetailResponseMediaAuditResultDetail extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultDetailResponseMediaAuditResultDetailList> list;

        public static GetMediaAuditResultDetailResponseMediaAuditResultDetail build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultDetailResponseMediaAuditResultDetail self = new GetMediaAuditResultDetailResponseMediaAuditResultDetail();
            return TeaModel.build(map, self);
        }

    }

}
