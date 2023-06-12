// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoModelFaceRequest extends TeaModel {
    @NameInMap("FaceImageURL")
    public String faceImageURL;

    @NameInMap("MergeInfos")
    public java.util.List<MergeVideoModelFaceRequestMergeInfos> mergeInfos;

    @NameInMap("TemplateId")
    public String templateId;

    public static MergeVideoModelFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoModelFaceRequest self = new MergeVideoModelFaceRequest();
        return TeaModel.build(map, self);
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
