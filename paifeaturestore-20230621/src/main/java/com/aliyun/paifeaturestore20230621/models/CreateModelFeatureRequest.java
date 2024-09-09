// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateModelFeatureRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Features")
    public java.util.List<CreateModelFeatureRequestFeatures> features;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LabelPriorityLevel")
    public Long labelPriorityLevel;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LabelTableId")
    public String labelTableId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>model_feature_1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SequenceFeatureViewIds")
    public java.util.List<String> sequenceFeatureViewIds;

    public static CreateModelFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelFeatureRequest self = new CreateModelFeatureRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelFeatureRequest setFeatures(java.util.List<CreateModelFeatureRequestFeatures> features) {
        this.features = features;
        return this;
    }
    public java.util.List<CreateModelFeatureRequestFeatures> getFeatures() {
        return this.features;
    }

    public CreateModelFeatureRequest setLabelPriorityLevel(Long labelPriorityLevel) {
        this.labelPriorityLevel = labelPriorityLevel;
        return this;
    }
    public Long getLabelPriorityLevel() {
        return this.labelPriorityLevel;
    }

    public CreateModelFeatureRequest setLabelTableId(String labelTableId) {
        this.labelTableId = labelTableId;
        return this;
    }
    public String getLabelTableId() {
        return this.labelTableId;
    }

    public CreateModelFeatureRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelFeatureRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateModelFeatureRequest setSequenceFeatureViewIds(java.util.List<String> sequenceFeatureViewIds) {
        this.sequenceFeatureViewIds = sequenceFeatureViewIds;
        return this;
    }
    public java.util.List<String> getSequenceFeatureViewIds() {
        return this.sequenceFeatureViewIds;
    }

    public static class CreateModelFeatureRequestFeatures extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>userid</p>
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
         * <p>user_id</p>
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

        public static CreateModelFeatureRequestFeatures build(java.util.Map<String, ?> map) throws Exception {
            CreateModelFeatureRequestFeatures self = new CreateModelFeatureRequestFeatures();
            return TeaModel.build(map, self);
        }

        public CreateModelFeatureRequestFeatures setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public CreateModelFeatureRequestFeatures setFeatureViewId(String featureViewId) {
            this.featureViewId = featureViewId;
            return this;
        }
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        public CreateModelFeatureRequestFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateModelFeatureRequestFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
