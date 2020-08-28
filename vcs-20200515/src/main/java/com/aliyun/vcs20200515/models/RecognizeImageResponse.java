// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RecognizeImageResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeImageResponseData data;

    public static RecognizeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageResponse self = new RecognizeImageResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeImageResponseDataBodyList extends TeaModel {
        @NameInMap("Feature")
        @Validation(required = true)
        public String feature;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("ImageBaseSixFour")
        @Validation(required = true)
        public String imageBaseSixFour;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public String leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public String leftTopY;

        @NameInMap("LocalFeature")
        @Validation(required = true)
        public String localFeature;

        @NameInMap("RespiratorColor")
        @Validation(required = true)
        public String respiratorColor;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public String rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public String rightBottomY;

        public static RecognizeImageResponseDataBodyList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseDataBodyList self = new RecognizeImageResponseDataBodyList();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeImageResponseDataFaceList extends TeaModel {
        @NameInMap("Feature")
        @Validation(required = true)
        public String feature;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("ImageBaseSixFour")
        @Validation(required = true)
        public String imageBaseSixFour;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public String leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public String leftTopY;

        @NameInMap("LocalFeature")
        @Validation(required = true)
        public String localFeature;

        @NameInMap("RespiratorColor")
        @Validation(required = true)
        public String respiratorColor;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public String rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public String rightBottomY;

        public static RecognizeImageResponseDataFaceList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseDataFaceList self = new RecognizeImageResponseDataFaceList();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeImageResponseData extends TeaModel {
        @NameInMap("BodyList")
        @Validation(required = true)
        public java.util.List<RecognizeImageResponseDataBodyList> bodyList;

        @NameInMap("FaceList")
        @Validation(required = true)
        public java.util.List<RecognizeImageResponseDataFaceList> faceList;

        public static RecognizeImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseData self = new RecognizeImageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
