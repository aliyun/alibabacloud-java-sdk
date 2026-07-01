// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureRequest extends TeaModel {
    /**
     * <p>The list of features.</p>
     */
    @NameInMap("Features")
    public java.util.List<UpdateModelFeatureRequestFeatures> features;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LabelPriorityLevel")
    public Long labelPriorityLevel;

    /**
     * <p>The label table ID. You can call the ListLabelTables operation to obtain the label table ID.</p>
     * 
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

    public UpdateModelFeatureRequest setLabelPriorityLevel(Long labelPriorityLevel) {
        this.labelPriorityLevel = labelPriorityLevel;
        return this;
    }
    public Long getLabelPriorityLevel() {
        return this.labelPriorityLevel;
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
         * <p>The feature alias.</p>
         * 
         * <strong>example:</strong>
         * <p>sex</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The feature view ID. You can call the ListFeatureViews operation to obtain the feature view ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FeatureViewId")
        public String featureViewId;

        /**
         * <p>The feature name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gender</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cand_seq__</p>
         */
        @NameInMap("PrefixName")
        public String prefixName;

        /**
         * <p>The feature type. Valid values:</p>
         * <ul>
         * <li>INT32</li>
         * <li>INT64</li>
         * <li>FLOAT</li>
         * <li>DOUBLE</li>
         * <li>STRING</li>
         * <li>BOOLEAN</li>
         * <li>TIMESTAMP.</li>
         * </ul>
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

        public UpdateModelFeatureRequestFeatures setPrefixName(String prefixName) {
            this.prefixName = prefixName;
            return this;
        }
        public String getPrefixName() {
            return this.prefixName;
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
