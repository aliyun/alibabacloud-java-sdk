// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeAccountPageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeAccountPageResponseData data;

    public static RecognizeAccountPageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAccountPageResponse self = new RecognizeAccountPageResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeAccountPageResponseDataInvalidStampAreas extends TeaModel {
        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeAccountPageResponseDataInvalidStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseDataInvalidStampAreas self = new RecognizeAccountPageResponseDataInvalidStampAreas();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeAccountPageResponseDataUndertakeStampAreas extends TeaModel {
        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeAccountPageResponseDataUndertakeStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseDataUndertakeStampAreas self = new RecognizeAccountPageResponseDataUndertakeStampAreas();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeAccountPageResponseDataRegisterStampAreas extends TeaModel {
        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeAccountPageResponseDataRegisterStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseDataRegisterStampAreas self = new RecognizeAccountPageResponseDataRegisterStampAreas();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeAccountPageResponseDataOtherStampAreas extends TeaModel {
        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeAccountPageResponseDataOtherStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseDataOtherStampAreas self = new RecognizeAccountPageResponseDataOtherStampAreas();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeAccountPageResponseDataTitleArea extends TeaModel {
        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeAccountPageResponseDataTitleArea build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseDataTitleArea self = new RecognizeAccountPageResponseDataTitleArea();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeAccountPageResponseData extends TeaModel {
        @NameInMap("Angle")
        @Validation(required = true)
        public Double angle;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("Relation")
        @Validation(required = true)
        public String relation;

        @NameInMap("BirthPlace")
        @Validation(required = true)
        public String birthPlace;

        @NameInMap("Nationality")
        @Validation(required = true)
        public String nationality;

        @NameInMap("NativePlace")
        @Validation(required = true)
        public String nativePlace;

        @NameInMap("BirthDate")
        @Validation(required = true)
        public String birthDate;

        @NameInMap("IDNumber")
        @Validation(required = true)
        public String IDNumber;

        @NameInMap("InvalidStampAreas")
        @Validation(required = true)
        public java.util.List<RecognizeAccountPageResponseDataInvalidStampAreas> invalidStampAreas;

        @NameInMap("UndertakeStampAreas")
        @Validation(required = true)
        public java.util.List<RecognizeAccountPageResponseDataUndertakeStampAreas> undertakeStampAreas;

        @NameInMap("RegisterStampAreas")
        @Validation(required = true)
        public java.util.List<RecognizeAccountPageResponseDataRegisterStampAreas> registerStampAreas;

        @NameInMap("OtherStampAreas")
        @Validation(required = true)
        public java.util.List<RecognizeAccountPageResponseDataOtherStampAreas> otherStampAreas;

        @NameInMap("TitleArea")
        @Validation(required = true)
        public RecognizeAccountPageResponseDataTitleArea titleArea;

        public static RecognizeAccountPageResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseData self = new RecognizeAccountPageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
