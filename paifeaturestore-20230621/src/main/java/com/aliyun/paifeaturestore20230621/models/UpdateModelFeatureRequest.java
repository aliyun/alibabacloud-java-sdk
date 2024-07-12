// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureRequest extends TeaModel {
    @NameInMap("Features")
    public java.util.List<UpdateModelFeatureRequestFeatures> features;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LabelTableId")
    public String labelTableId;

    @NameInMap("SequenceFeatureViewIds")
    public java.util.List<String> sequenceFeatureViewIds;

    public static UpdateModelFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelFeatureRequest self = new UpdateModelFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelFeatureRequest setFeatures(java.util.List<UpdateModelFeatureRequestFeatures> features) {
        this.features = features;
        return this;
    }
    public java.util.List<UpdateModelFeatureRequestFeatures> getFeatures() {
        return this.features;
    }

    public UpdateModelFeatureRequest setLabelTableId(String labelTableId) {
        this.labelTableId = labelTableId;
        return this;
    }
    public String getLabelTableId() {
        return this.labelTableId;
    }

    public UpdateModelFeatureRequest setSequenceFeatureViewIds(java.util.List<String> sequenceFeatureViewIds) {
        this.sequenceFeatureViewIds = sequenceFeatureViewIds;
        return this;
    }
    public java.util.List<String> getSequenceFeatureViewIds() {
        return this.sequenceFeatureViewIds;
    }

    public static class UpdateModelFeatureRequestFeatures extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sex</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FeatureViewId")
        public String featureViewId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gender</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateModelFeatureRequestFeatures build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelFeatureRequestFeatures self = new UpdateModelFeatureRequestFeatures();
            return TeaModel.build(map, self);
        }

        public UpdateModelFeatureRequestFeatures setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public UpdateModelFeatureRequestFeatures setFeatureViewId(String featureViewId) {
            this.featureViewId = featureViewId;
            return this;
        }
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        public UpdateModelFeatureRequestFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateModelFeatureRequestFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
