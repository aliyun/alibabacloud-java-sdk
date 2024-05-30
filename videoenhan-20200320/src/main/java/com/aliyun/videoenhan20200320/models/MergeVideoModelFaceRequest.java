// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoModelFaceRequest extends TeaModel {
    @NameInMap("AddWatermark")
    public Boolean addWatermark;

    @NameInMap("Enhance")
    public Boolean enhance;

    @NameInMap("FaceImageURL")
    public String faceImageURL;

    @NameInMap("MergeInfos")
    public java.util.List<MergeVideoModelFaceRequestMergeInfos> mergeInfos;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("WatermarkType")
    public String watermarkType;

    public static MergeVideoModelFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoModelFaceRequest self = new MergeVideoModelFaceRequest();
        return TeaModel.build(map, self);
    }

    public MergeVideoModelFaceRequest setAddWatermark(Boolean addWatermark) {
        this.addWatermark = addWatermark;
        return this;
    }
    public Boolean getAddWatermark() {
        return this.addWatermark;
    }

    public MergeVideoModelFaceRequest setEnhance(Boolean enhance) {
        this.enhance = enhance;
        return this;
    }
    public Boolean getEnhance() {
        return this.enhance;
    }

    public MergeVideoModelFaceRequest setFaceImageURL(String faceImageURL) {
        this.faceImageURL = faceImageURL;
        return this;
    }
    public String getFaceImageURL() {
        return this.faceImageURL;
    }

    public MergeVideoModelFaceRequest setMergeInfos(java.util.List<MergeVideoModelFaceRequestMergeInfos> mergeInfos) {
        this.mergeInfos = mergeInfos;
        return this;
    }
    public java.util.List<MergeVideoModelFaceRequestMergeInfos> getMergeInfos() {
        return this.mergeInfos;
    }

    public MergeVideoModelFaceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public MergeVideoModelFaceRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public static class MergeVideoModelFaceRequestMergeInfos extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("TemplateFaceID")
        public String templateFaceID;

        @NameInMap("TemplateFaceURL")
        public String templateFaceURL;

        public static MergeVideoModelFaceRequestMergeInfos build(java.util.Map<String, ?> map) throws Exception {
            MergeVideoModelFaceRequestMergeInfos self = new MergeVideoModelFaceRequestMergeInfos();
            return TeaModel.build(map, self);
        }

        public MergeVideoModelFaceRequestMergeInfos setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public MergeVideoModelFaceRequestMergeInfos setTemplateFaceID(String templateFaceID) {
            this.templateFaceID = templateFaceID;
            return this;
        }
        public String getTemplateFaceID() {
            return this.templateFaceID;
        }

        public MergeVideoModelFaceRequestMergeInfos setTemplateFaceURL(String templateFaceURL) {
            this.templateFaceURL = templateFaceURL;
            return this;
        }
        public String getTemplateFaceURL() {
            return this.templateFaceURL;
        }

    }

}
