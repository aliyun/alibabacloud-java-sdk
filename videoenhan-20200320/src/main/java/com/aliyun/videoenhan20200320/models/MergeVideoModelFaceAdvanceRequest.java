// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoModelFaceAdvanceRequest extends TeaModel {
    @NameInMap("AddWatermark")
    public Boolean addWatermark;

    @NameInMap("Enhance")
    public Boolean enhance;

    @NameInMap("FaceImageURL")
    public java.io.InputStream faceImageURLObject;

    @NameInMap("MergeInfos")
    public java.util.List<MergeVideoModelFaceAdvanceRequestMergeInfos> mergeInfos;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("WatermarkType")
    public String watermarkType;

    public static MergeVideoModelFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoModelFaceAdvanceRequest self = new MergeVideoModelFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public MergeVideoModelFaceAdvanceRequest setAddWatermark(Boolean addWatermark) {
        this.addWatermark = addWatermark;
        return this;
    }
    public Boolean getAddWatermark() {
        return this.addWatermark;
    }

    public MergeVideoModelFaceAdvanceRequest setEnhance(Boolean enhance) {
        this.enhance = enhance;
        return this;
    }
    public Boolean getEnhance() {
        return this.enhance;
    }

    public MergeVideoModelFaceAdvanceRequest setFaceImageURLObject(java.io.InputStream faceImageURLObject) {
        this.faceImageURLObject = faceImageURLObject;
        return this;
    }
    public java.io.InputStream getFaceImageURLObject() {
        return this.faceImageURLObject;
    }

    public MergeVideoModelFaceAdvanceRequest setMergeInfos(java.util.List<MergeVideoModelFaceAdvanceRequestMergeInfos> mergeInfos) {
        this.mergeInfos = mergeInfos;
        return this;
    }
    public java.util.List<MergeVideoModelFaceAdvanceRequestMergeInfos> getMergeInfos() {
        return this.mergeInfos;
    }

    public MergeVideoModelFaceAdvanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public MergeVideoModelFaceAdvanceRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public static class MergeVideoModelFaceAdvanceRequestMergeInfos extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("TemplateFaceID")
        public String templateFaceID;

        @NameInMap("TemplateFaceURL")
        public String templateFaceURL;

        public static MergeVideoModelFaceAdvanceRequestMergeInfos build(java.util.Map<String, ?> map) throws Exception {
            MergeVideoModelFaceAdvanceRequestMergeInfos self = new MergeVideoModelFaceAdvanceRequestMergeInfos();
            return TeaModel.build(map, self);
        }

        public MergeVideoModelFaceAdvanceRequestMergeInfos setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public MergeVideoModelFaceAdvanceRequestMergeInfos setTemplateFaceID(String templateFaceID) {
            this.templateFaceID = templateFaceID;
            return this;
        }
        public String getTemplateFaceID() {
            return this.templateFaceID;
        }

        public MergeVideoModelFaceAdvanceRequestMergeInfos setTemplateFaceURL(String templateFaceURL) {
            this.templateFaceURL = templateFaceURL;
            return this;
        }
        public String getTemplateFaceURL() {
            return this.templateFaceURL;
        }

    }

}
