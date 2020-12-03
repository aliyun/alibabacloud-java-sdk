// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class ExtractFaceAttributeCROResponseBody extends TeaModel {
    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    // 错误code	
    @NameInMap("ErrCode")
    public String errCode;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 返回结果
    @NameInMap("Result")
    public java.util.List<ExtractFaceAttributeCROResponseBodyResult> result;

    @NameInMap("RequestId")
    public String requestId;

    public static ExtractFaceAttributeCROResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractFaceAttributeCROResponseBody self = new ExtractFaceAttributeCROResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractFaceAttributeCROResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExtractFaceAttributeCROResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExtractFaceAttributeCROResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExtractFaceAttributeCROResponseBody setResult(java.util.List<ExtractFaceAttributeCROResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExtractFaceAttributeCROResponseBodyResult> getResult() {
        return this.result;
    }

    public ExtractFaceAttributeCROResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExtractFaceAttributeCROResponseBodyResultGender extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("Value")
        public String value;

        public static ExtractFaceAttributeCROResponseBodyResultGender build(java.util.Map<String, ?> map) throws Exception {
            ExtractFaceAttributeCROResponseBodyResultGender self = new ExtractFaceAttributeCROResponseBodyResultGender();
            return TeaModel.build(map, self);
        }

        public ExtractFaceAttributeCROResponseBodyResultGender setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public ExtractFaceAttributeCROResponseBodyResultGender setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExtractFaceAttributeCROResponseBodyResultHeadpose extends TeaModel {
        // 上下角度
        @NameInMap("PitchAngle")
        public Float pitchAngle;

        // 旋转角度
        @NameInMap("RollAngle")
        public Float rollAngle;

        // 左右角度
        @NameInMap("YawAngle")
        public Float yawAngle;

        public static ExtractFaceAttributeCROResponseBodyResultHeadpose build(java.util.Map<String, ?> map) throws Exception {
            ExtractFaceAttributeCROResponseBodyResultHeadpose self = new ExtractFaceAttributeCROResponseBodyResultHeadpose();
            return TeaModel.build(map, self);
        }

        public ExtractFaceAttributeCROResponseBodyResultHeadpose setPitchAngle(Float pitchAngle) {
            this.pitchAngle = pitchAngle;
            return this;
        }
        public Float getPitchAngle() {
            return this.pitchAngle;
        }

        public ExtractFaceAttributeCROResponseBodyResultHeadpose setRollAngle(Float rollAngle) {
            this.rollAngle = rollAngle;
            return this;
        }
        public Float getRollAngle() {
            return this.rollAngle;
        }

        public ExtractFaceAttributeCROResponseBodyResultHeadpose setYawAngle(Float yawAngle) {
            this.yawAngle = yawAngle;
            return this;
        }
        public Float getYawAngle() {
            return this.yawAngle;
        }

    }

    public static class ExtractFaceAttributeCROResponseBodyResultFaceRect extends TeaModel {
        // 上
        @NameInMap("Top")
        public Integer top;

        // 左
        @NameInMap("Left")
        public Integer left;

        // 宽
        @NameInMap("Width")
        public Integer width;

        // 高
        @NameInMap("Height")
        public Integer height;

        public static ExtractFaceAttributeCROResponseBodyResultFaceRect build(java.util.Map<String, ?> map) throws Exception {
            ExtractFaceAttributeCROResponseBodyResultFaceRect self = new ExtractFaceAttributeCROResponseBodyResultFaceRect();
            return TeaModel.build(map, self);
        }

        public ExtractFaceAttributeCROResponseBodyResultFaceRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ExtractFaceAttributeCROResponseBodyResultFaceRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ExtractFaceAttributeCROResponseBodyResultFaceRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public ExtractFaceAttributeCROResponseBodyResultFaceRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class ExtractFaceAttributeCROResponseBodyResultMask extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("Value")
        public String value;

        public static ExtractFaceAttributeCROResponseBodyResultMask build(java.util.Map<String, ?> map) throws Exception {
            ExtractFaceAttributeCROResponseBodyResultMask self = new ExtractFaceAttributeCROResponseBodyResultMask();
            return TeaModel.build(map, self);
        }

        public ExtractFaceAttributeCROResponseBodyResultMask setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public ExtractFaceAttributeCROResponseBodyResultMask setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExtractFaceAttributeCROResponseBodyResult extends TeaModel {
        // 性别
        @NameInMap("Gender")
        public ExtractFaceAttributeCROResponseBodyResultGender gender;

        // 性别置信度
        @NameInMap("GenderScore")
        public Float genderScore;

        // 人脸角度
        @NameInMap("Headpose")
        public ExtractFaceAttributeCROResponseBodyResultHeadpose headpose;

        // 人脸类型
        @NameInMap("Facetype")
        public String facetype;

        // 人脸模糊分
        @NameInMap("Blur")
        public Float blur;

        // 年龄
        @NameInMap("Age")
        public Float age;

        // 人脸矩形框的位置
        @NameInMap("FaceRect")
        public ExtractFaceAttributeCROResponseBodyResultFaceRect faceRect;

        // 质量分
        @NameInMap("Facequal")
        public Float facequal;

        // 质量分
        @NameInMap("Facerank")
        public Float facerank;

        // 性别值
        @NameInMap("GenderValue")
        public Integer genderValue;

        @NameInMap("Mask")
        public ExtractFaceAttributeCROResponseBodyResultMask mask;

        public static ExtractFaceAttributeCROResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExtractFaceAttributeCROResponseBodyResult self = new ExtractFaceAttributeCROResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExtractFaceAttributeCROResponseBodyResult setGender(ExtractFaceAttributeCROResponseBodyResultGender gender) {
            this.gender = gender;
            return this;
        }
        public ExtractFaceAttributeCROResponseBodyResultGender getGender() {
            return this.gender;
        }

        public ExtractFaceAttributeCROResponseBodyResult setGenderScore(Float genderScore) {
            this.genderScore = genderScore;
            return this;
        }
        public Float getGenderScore() {
            return this.genderScore;
        }

        public ExtractFaceAttributeCROResponseBodyResult setHeadpose(ExtractFaceAttributeCROResponseBodyResultHeadpose headpose) {
            this.headpose = headpose;
            return this;
        }
        public ExtractFaceAttributeCROResponseBodyResultHeadpose getHeadpose() {
            return this.headpose;
        }

        public ExtractFaceAttributeCROResponseBodyResult setFacetype(String facetype) {
            this.facetype = facetype;
            return this;
        }
        public String getFacetype() {
            return this.facetype;
        }

        public ExtractFaceAttributeCROResponseBodyResult setBlur(Float blur) {
            this.blur = blur;
            return this;
        }
        public Float getBlur() {
            return this.blur;
        }

        public ExtractFaceAttributeCROResponseBodyResult setAge(Float age) {
            this.age = age;
            return this;
        }
        public Float getAge() {
            return this.age;
        }

        public ExtractFaceAttributeCROResponseBodyResult setFaceRect(ExtractFaceAttributeCROResponseBodyResultFaceRect faceRect) {
            this.faceRect = faceRect;
            return this;
        }
        public ExtractFaceAttributeCROResponseBodyResultFaceRect getFaceRect() {
            return this.faceRect;
        }

        public ExtractFaceAttributeCROResponseBodyResult setFacequal(Float facequal) {
            this.facequal = facequal;
            return this;
        }
        public Float getFacequal() {
            return this.facequal;
        }

        public ExtractFaceAttributeCROResponseBodyResult setFacerank(Float facerank) {
            this.facerank = facerank;
            return this;
        }
        public Float getFacerank() {
            return this.facerank;
        }

        public ExtractFaceAttributeCROResponseBodyResult setGenderValue(Integer genderValue) {
            this.genderValue = genderValue;
            return this;
        }
        public Integer getGenderValue() {
            return this.genderValue;
        }

        public ExtractFaceAttributeCROResponseBodyResult setMask(ExtractFaceAttributeCROResponseBodyResultMask mask) {
            this.mask = mask;
            return this;
        }
        public ExtractFaceAttributeCROResponseBodyResultMask getMask() {
            return this.mask;
        }

    }

}
