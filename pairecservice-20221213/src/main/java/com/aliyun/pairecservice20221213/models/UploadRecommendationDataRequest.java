// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UploadRecommendationDataRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Content")
    public java.util.List<UploadRecommendationDataRequestContent> content;

    @NameInMap("DataType")
    public String dataType;

    public static UploadRecommendationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadRecommendationDataRequest self = new UploadRecommendationDataRequest();
        return TeaModel.build(map, self);
    }

    public UploadRecommendationDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadRecommendationDataRequest setContent(java.util.List<UploadRecommendationDataRequestContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<UploadRecommendationDataRequestContent> getContent() {
        return this.content;
    }

    public UploadRecommendationDataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public static class UploadRecommendationDataRequestContent extends TeaModel {
        @NameInMap("Fields")
        public String fields;

        @NameInMap("OperationType")
        public String operationType;

        public static UploadRecommendationDataRequestContent build(java.util.Map<String, ?> map) throws Exception {
            UploadRecommendationDataRequestContent self = new UploadRecommendationDataRequestContent();
            return TeaModel.build(map, self);
        }

        public UploadRecommendationDataRequestContent setFields(String fields) {
            this.fields = fields;
            return this;
        }
        public String getFields() {
            return this.fields;
        }

        public UploadRecommendationDataRequestContent setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

    }

}
