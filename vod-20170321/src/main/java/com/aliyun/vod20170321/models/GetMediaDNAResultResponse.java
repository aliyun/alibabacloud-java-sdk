// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaDNAResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DNAResult")
    @Validation(required = true)
    public GetMediaDNAResultResponseDNAResult DNAResult;

    public static GetMediaDNAResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaDNAResultResponse self = new GetMediaDNAResultResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMediaDNAResultResponseDNAResultVideoDNADetailInput extends TeaModel {
        @NameInMap("Start")
        @Validation(required = true)
        public String start;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        public static GetMediaDNAResultResponseDNAResultVideoDNADetailInput build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseDNAResultVideoDNADetailInput self = new GetMediaDNAResultResponseDNAResultVideoDNADetailInput();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaDNAResultResponseDNAResultVideoDNADetailDuplication extends TeaModel {
        @NameInMap("Start")
        @Validation(required = true)
        public String start;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        public static GetMediaDNAResultResponseDNAResultVideoDNADetailDuplication build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseDNAResultVideoDNADetailDuplication self = new GetMediaDNAResultResponseDNAResultVideoDNADetailDuplication();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaDNAResultResponseDNAResultVideoDNADetail extends TeaModel {
        @NameInMap("Input")
        @Validation(required = true)
        public GetMediaDNAResultResponseDNAResultVideoDNADetailInput input;

        @NameInMap("Duplication")
        @Validation(required = true)
        public GetMediaDNAResultResponseDNAResultVideoDNADetailDuplication duplication;

        public static GetMediaDNAResultResponseDNAResultVideoDNADetail build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseDNAResultVideoDNADetail self = new GetMediaDNAResultResponseDNAResultVideoDNADetail();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaDNAResultResponseDNAResultVideoDNA extends TeaModel {
        @NameInMap("PrimaryKey")
        @Validation(required = true)
        public String primaryKey;

        @NameInMap("Similarity")
        @Validation(required = true)
        public String similarity;

        @NameInMap("Detail")
        @Validation(required = true)
        public java.util.List<GetMediaDNAResultResponseDNAResultVideoDNADetail> detail;

        public static GetMediaDNAResultResponseDNAResultVideoDNA build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseDNAResultVideoDNA self = new GetMediaDNAResultResponseDNAResultVideoDNA();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaDNAResultResponseDNAResult extends TeaModel {
        @NameInMap("VideoDNA")
        @Validation(required = true)
        public java.util.List<GetMediaDNAResultResponseDNAResultVideoDNA> videoDNA;

        public static GetMediaDNAResultResponseDNAResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseDNAResult self = new GetMediaDNAResultResponseDNAResult();
            return TeaModel.build(map, self);
        }

    }

}
