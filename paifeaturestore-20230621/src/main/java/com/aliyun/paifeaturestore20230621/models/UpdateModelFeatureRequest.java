// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureRequest extends TeaModel {
    @NameInMap("Features")
    public java.util.List<UpdateModelFeatureRequestFeatures> features;

    @NameInMap("LabelTableId")
    public String labelTableId;

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

    public static class UpdateModelFeatureRequestFeatures extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("FeatureViewId")
        public String featureViewId;

        @NameInMap("Name")
        public String name;

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
