// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureFGFeatureRequest extends TeaModel {
    @NameInMap("LookupFeatures")
    public java.util.List<UpdateModelFeatureFGFeatureRequestLookupFeatures> lookupFeatures;

    @NameInMap("RawFeatures")
    public java.util.List<UpdateModelFeatureFGFeatureRequestRawFeatures> rawFeatures;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Reserves")
    public java.util.List<String> reserves;

    @NameInMap("SequenceFeatures")
    public java.util.List<UpdateModelFeatureFGFeatureRequestSequenceFeatures> sequenceFeatures;

    public static UpdateModelFeatureFGFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelFeatureFGFeatureRequest self = new UpdateModelFeatureFGFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelFeatureFGFeatureRequest setLookupFeatures(java.util.List<UpdateModelFeatureFGFeatureRequestLookupFeatures> lookupFeatures) {
        this.lookupFeatures = lookupFeatures;
        return this;
    }
    public java.util.List<UpdateModelFeatureFGFeatureRequestLookupFeatures> getLookupFeatures() {
        return this.lookupFeatures;
    }

    public UpdateModelFeatureFGFeatureRequest setRawFeatures(java.util.List<UpdateModelFeatureFGFeatureRequestRawFeatures> rawFeatures) {
        this.rawFeatures = rawFeatures;
        return this;
    }
    public java.util.List<UpdateModelFeatureFGFeatureRequestRawFeatures> getRawFeatures() {
        return this.rawFeatures;
    }

    public UpdateModelFeatureFGFeatureRequest setReserves(java.util.List<String> reserves) {
        this.reserves = reserves;
        return this;
    }
    public java.util.List<String> getReserves() {
        return this.reserves;
    }

    public UpdateModelFeatureFGFeatureRequest setSequenceFeatures(java.util.List<UpdateModelFeatureFGFeatureRequestSequenceFeatures> sequenceFeatures) {
        this.sequenceFeatures = sequenceFeatures;
        return this;
    }
    public java.util.List<UpdateModelFeatureFGFeatureRequestSequenceFeatures> getSequenceFeatures() {
        return this.sequenceFeatures;
    }

    public static class UpdateModelFeatureFGFeatureRequestLookupFeatures extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("KeyFeatureDomain")
        public String keyFeatureDomain;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("KeyFeatureName")
        public String keyFeatureName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MapFeatureDomain")
        public String mapFeatureDomain;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MapFeatureName")
        public String mapFeatureName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static UpdateModelFeatureFGFeatureRequestLookupFeatures build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelFeatureFGFeatureRequestLookupFeatures self = new UpdateModelFeatureFGFeatureRequestLookupFeatures();
            return TeaModel.build(map, self);
        }

        public UpdateModelFeatureFGFeatureRequestLookupFeatures setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateModelFeatureFGFeatureRequestLookupFeatures setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public UpdateModelFeatureFGFeatureRequestLookupFeatures setKeyFeatureDomain(String keyFeatureDomain) {
            this.keyFeatureDomain = keyFeatureDomain;
            return this;
        }
        public String getKeyFeatureDomain() {
            return this.keyFeatureDomain;
        }

        public UpdateModelFeatureFGFeatureRequestLookupFeatures setKeyFeatureName(String keyFeatureName) {
            this.keyFeatureName = keyFeatureName;
            return this;
        }
        public String getKeyFeatureName() {
            return this.keyFeatureName;
        }

        public UpdateModelFeatureFGFeatureRequestLookupFeatures setMapFeatureDomain(String mapFeatureDomain) {
            this.mapFeatureDomain = mapFeatureDomain;
            return this;
        }
        public String getMapFeatureDomain() {
            return this.mapFeatureDomain;
        }

        public UpdateModelFeatureFGFeatureRequestLookupFeatures setMapFeatureName(String mapFeatureName) {
            this.mapFeatureName = mapFeatureName;
            return this;
        }
        public String getMapFeatureName() {
            return this.mapFeatureName;
        }

        public UpdateModelFeatureFGFeatureRequestLookupFeatures setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateModelFeatureFGFeatureRequestRawFeatures extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FeatureDomain")
        public String featureDomain;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FeatureType")
        public String featureType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("InputFeatureName")
        public String inputFeatureName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static UpdateModelFeatureFGFeatureRequestRawFeatures build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelFeatureFGFeatureRequestRawFeatures self = new UpdateModelFeatureFGFeatureRequestRawFeatures();
            return TeaModel.build(map, self);
        }

        public UpdateModelFeatureFGFeatureRequestRawFeatures setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateModelFeatureFGFeatureRequestRawFeatures setFeatureDomain(String featureDomain) {
            this.featureDomain = featureDomain;
            return this;
        }
        public String getFeatureDomain() {
            return this.featureDomain;
        }

        public UpdateModelFeatureFGFeatureRequestRawFeatures setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public UpdateModelFeatureFGFeatureRequestRawFeatures setFeatureType(String featureType) {
            this.featureType = featureType;
            return this;
        }
        public String getFeatureType() {
            return this.featureType;
        }

        public UpdateModelFeatureFGFeatureRequestRawFeatures setInputFeatureName(String inputFeatureName) {
            this.inputFeatureName = inputFeatureName;
            return this;
        }
        public String getInputFeatureName() {
            return this.inputFeatureName;
        }

        public UpdateModelFeatureFGFeatureRequestRawFeatures setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FeatureDomain")
        public String featureDomain;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FeatureType")
        public String featureType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("InputFeatureName")
        public String inputFeatureName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures self = new UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures();
            return TeaModel.build(map, self);
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures setFeatureDomain(String featureDomain) {
            this.featureDomain = featureDomain;
            return this;
        }
        public String getFeatureDomain() {
            return this.featureDomain;
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures setFeatureType(String featureType) {
            this.featureType = featureType;
            return this;
        }
        public String getFeatureType() {
            return this.featureType;
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures setInputFeatureName(String inputFeatureName) {
            this.inputFeatureName = inputFeatureName;
            return this;
        }
        public String getInputFeatureName() {
            return this.inputFeatureName;
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateModelFeatureFGFeatureRequestSequenceFeatures extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributeDelim")
        public String attributeDelim;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SequenceDelim")
        public String sequenceDelim;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SequenceLength")
        public Long sequenceLength;

        @NameInMap("SubFeatures")
        public java.util.List<UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures> subFeatures;

        public static UpdateModelFeatureFGFeatureRequestSequenceFeatures build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelFeatureFGFeatureRequestSequenceFeatures self = new UpdateModelFeatureFGFeatureRequestSequenceFeatures();
            return TeaModel.build(map, self);
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeatures setAttributeDelim(String attributeDelim) {
            this.attributeDelim = attributeDelim;
            return this;
        }
        public String getAttributeDelim() {
            return this.attributeDelim;
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeatures setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeatures setSequenceDelim(String sequenceDelim) {
            this.sequenceDelim = sequenceDelim;
            return this;
        }
        public String getSequenceDelim() {
            return this.sequenceDelim;
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeatures setSequenceLength(Long sequenceLength) {
            this.sequenceLength = sequenceLength;
            return this;
        }
        public Long getSequenceLength() {
            return this.sequenceLength;
        }

        public UpdateModelFeatureFGFeatureRequestSequenceFeatures setSubFeatures(java.util.List<UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures> subFeatures) {
            this.subFeatures = subFeatures;
            return this;
        }
        public java.util.List<UpdateModelFeatureFGFeatureRequestSequenceFeaturesSubFeatures> getSubFeatures() {
            return this.subFeatures;
        }

    }

}
