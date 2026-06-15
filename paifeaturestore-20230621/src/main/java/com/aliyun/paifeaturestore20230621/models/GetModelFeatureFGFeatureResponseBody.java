// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetModelFeatureFGFeatureResponseBody extends TeaModel {
    /**
     * <p>The information about the lookup features.</p>
     */
    @NameInMap("LookupFeatures")
    public java.util.List<GetModelFeatureFGFeatureResponseBodyLookupFeatures> lookupFeatures;

    /**
     * <p>The information about the raw features.</p>
     */
    @NameInMap("RawFeatures")
    public java.util.List<GetModelFeatureFGFeatureResponseBodyRawFeatures> rawFeatures;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E23EFF09-58AA-5420-934F-8453AE01548D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The reserved fields.</p>
     */
    @NameInMap("Reserves")
    public java.util.List<String> reserves;

    /**
     * <p>The information about the sequence features.</p>
     */
    @NameInMap("SequenceFeatures")
    public java.util.List<GetModelFeatureFGFeatureResponseBodySequenceFeatures> sequenceFeatures;

    public static GetModelFeatureFGFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelFeatureFGFeatureResponseBody self = new GetModelFeatureFGFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelFeatureFGFeatureResponseBody setLookupFeatures(java.util.List<GetModelFeatureFGFeatureResponseBodyLookupFeatures> lookupFeatures) {
        this.lookupFeatures = lookupFeatures;
        return this;
    }
    public java.util.List<GetModelFeatureFGFeatureResponseBodyLookupFeatures> getLookupFeatures() {
        return this.lookupFeatures;
    }

    public GetModelFeatureFGFeatureResponseBody setRawFeatures(java.util.List<GetModelFeatureFGFeatureResponseBodyRawFeatures> rawFeatures) {
        this.rawFeatures = rawFeatures;
        return this;
    }
    public java.util.List<GetModelFeatureFGFeatureResponseBodyRawFeatures> getRawFeatures() {
        return this.rawFeatures;
    }

    public GetModelFeatureFGFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelFeatureFGFeatureResponseBody setReserves(java.util.List<String> reserves) {
        this.reserves = reserves;
        return this;
    }
    public java.util.List<String> getReserves() {
        return this.reserves;
    }

    public GetModelFeatureFGFeatureResponseBody setSequenceFeatures(java.util.List<GetModelFeatureFGFeatureResponseBodySequenceFeatures> sequenceFeatures) {
        this.sequenceFeatures = sequenceFeatures;
        return this;
    }
    public java.util.List<GetModelFeatureFGFeatureResponseBodySequenceFeatures> getSequenceFeatures() {
        return this.sequenceFeatures;
    }

    public static class GetModelFeatureFGFeatureResponseBodyLookupFeatures extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>-1024</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The name of the generated feature.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <p>The domain of the key feature.</p>
         * <ul>
         * <li><p>User: The user side.</p>
         * </li>
         * <li><p>Item: The item side.</p>
         * </li>
         * <li><p>Context: The context.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Item</p>
         */
        @NameInMap("KeyFeatureDomain")
        public String keyFeatureDomain;

        /**
         * <p>The name of the key feature.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeyFeatureName")
        public String keyFeatureName;

        /**
         * <p>The domain of the map feature.</p>
         * <ul>
         * <li><p>User: The user side.</p>
         * </li>
         * <li><p>Item: The item side.</p>
         * </li>
         * <li><p>Context: The context.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("MapFeatureDomain")
        public String mapFeatureDomain;

        /**
         * <p>The name of the map feature.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("MapFeatureName")
        public String mapFeatureName;

        /**
         * <p>The value type of the feature.</p>
         * <ul>
         * <li><p>INTEGER</p>
         * </li>
         * <li><p>DOUBLE</p>
         * </li>
         * <li><p>STRING</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static GetModelFeatureFGFeatureResponseBodyLookupFeatures build(java.util.Map<String, ?> map) throws Exception {
            GetModelFeatureFGFeatureResponseBodyLookupFeatures self = new GetModelFeatureFGFeatureResponseBodyLookupFeatures();
            return TeaModel.build(map, self);
        }

        public GetModelFeatureFGFeatureResponseBodyLookupFeatures setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetModelFeatureFGFeatureResponseBodyLookupFeatures setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public GetModelFeatureFGFeatureResponseBodyLookupFeatures setKeyFeatureDomain(String keyFeatureDomain) {
            this.keyFeatureDomain = keyFeatureDomain;
            return this;
        }
        public String getKeyFeatureDomain() {
            return this.keyFeatureDomain;
        }

        public GetModelFeatureFGFeatureResponseBodyLookupFeatures setKeyFeatureName(String keyFeatureName) {
            this.keyFeatureName = keyFeatureName;
            return this;
        }
        public String getKeyFeatureName() {
            return this.keyFeatureName;
        }

        public GetModelFeatureFGFeatureResponseBodyLookupFeatures setMapFeatureDomain(String mapFeatureDomain) {
            this.mapFeatureDomain = mapFeatureDomain;
            return this;
        }
        public String getMapFeatureDomain() {
            return this.mapFeatureDomain;
        }

        public GetModelFeatureFGFeatureResponseBodyLookupFeatures setMapFeatureName(String mapFeatureName) {
            this.mapFeatureName = mapFeatureName;
            return this;
        }
        public String getMapFeatureName() {
            return this.mapFeatureName;
        }

        public GetModelFeatureFGFeatureResponseBodyLookupFeatures setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class GetModelFeatureFGFeatureResponseBodyRawFeatures extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>-1024</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The domain of the original feature.</p>
         * <ul>
         * <li><p>User: The user side.</p>
         * </li>
         * <li><p>Item: The item side.</p>
         * </li>
         * <li><p>Context: The context.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("FeatureDomain")
        public String featureDomain;

        /**
         * <p>The name of the generated feature.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <p>The type of the raw FG feature.</p>
         * <ul>
         * <li><p>IdFeature: The primary key.</p>
         * </li>
         * <li><p>RawFeature: The raw feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IdFeature</p>
         */
        @NameInMap("FeatureType")
        public String featureType;

        /**
         * <p>The name of the original feature.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("InputFeatureName")
        public String inputFeatureName;

        /**
         * <p>The value type of the feature.</p>
         * <ul>
         * <li><p>INTEGER</p>
         * </li>
         * <li><p>DOUBLE</p>
         * </li>
         * <li><p>STRING</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static GetModelFeatureFGFeatureResponseBodyRawFeatures build(java.util.Map<String, ?> map) throws Exception {
            GetModelFeatureFGFeatureResponseBodyRawFeatures self = new GetModelFeatureFGFeatureResponseBodyRawFeatures();
            return TeaModel.build(map, self);
        }

        public GetModelFeatureFGFeatureResponseBodyRawFeatures setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetModelFeatureFGFeatureResponseBodyRawFeatures setFeatureDomain(String featureDomain) {
            this.featureDomain = featureDomain;
            return this;
        }
        public String getFeatureDomain() {
            return this.featureDomain;
        }

        public GetModelFeatureFGFeatureResponseBodyRawFeatures setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public GetModelFeatureFGFeatureResponseBodyRawFeatures setFeatureType(String featureType) {
            this.featureType = featureType;
            return this;
        }
        public String getFeatureType() {
            return this.featureType;
        }

        public GetModelFeatureFGFeatureResponseBodyRawFeatures setInputFeatureName(String inputFeatureName) {
            this.inputFeatureName = inputFeatureName;
            return this;
        }
        public String getInputFeatureName() {
            return this.inputFeatureName;
        }

        public GetModelFeatureFGFeatureResponseBodyRawFeatures setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>-1024</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The domain of the original feature.</p>
         * <ul>
         * <li><p>User: The user side.</p>
         * </li>
         * <li><p>Item: The item side.</p>
         * </li>
         * <li><p>Context: The context.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("FeatureDomain")
        public String featureDomain;

        /**
         * <p>The name of the generated feature.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <p>The type of the FG feature.</p>
         * <ul>
         * <li><p>IdFeature: The primary key.</p>
         * </li>
         * <li><p>RawFeature: The raw feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IdFeature</p>
         */
        @NameInMap("FeatureType")
        public String featureType;

        /**
         * <p>The name of the original feature.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("InputFeatureName")
        public String inputFeatureName;

        /**
         * <p>The value type of the feature.</p>
         * <ul>
         * <li><p>INTEGER</p>
         * </li>
         * <li><p>DOUBLE</p>
         * </li>
         * <li><p>STRING</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures build(java.util.Map<String, ?> map) throws Exception {
            GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures self = new GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures();
            return TeaModel.build(map, self);
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures setFeatureDomain(String featureDomain) {
            this.featureDomain = featureDomain;
            return this;
        }
        public String getFeatureDomain() {
            return this.featureDomain;
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures setFeatureType(String featureType) {
            this.featureType = featureType;
            return this;
        }
        public String getFeatureType() {
            return this.featureType;
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures setInputFeatureName(String inputFeatureName) {
            this.inputFeatureName = inputFeatureName;
            return this;
        }
        public String getInputFeatureName() {
            return this.inputFeatureName;
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class GetModelFeatureFGFeatureResponseBodySequenceFeatures extends TeaModel {
        /**
         * <p>The separator for feature attributes.</p>
         * 
         * <strong>example:</strong>
         * <h1></h1>
         */
        @NameInMap("AttributeDelim")
        public String attributeDelim;

        /**
         * <p>The name of the sequence feature.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <p>The separator for the sequence feature.</p>
         * 
         * <strong>example:</strong>
         * <p>;</p>
         */
        @NameInMap("SequenceDelim")
        public String sequenceDelim;

        /**
         * <p>The maximum length of the sequence feature.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("SequenceLength")
        public Long sequenceLength;

        /**
         * <p>A list of sub-features for the sequence feature.</p>
         */
        @NameInMap("SubFeatures")
        public java.util.List<GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures> subFeatures;

        public static GetModelFeatureFGFeatureResponseBodySequenceFeatures build(java.util.Map<String, ?> map) throws Exception {
            GetModelFeatureFGFeatureResponseBodySequenceFeatures self = new GetModelFeatureFGFeatureResponseBodySequenceFeatures();
            return TeaModel.build(map, self);
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeatures setAttributeDelim(String attributeDelim) {
            this.attributeDelim = attributeDelim;
            return this;
        }
        public String getAttributeDelim() {
            return this.attributeDelim;
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeatures setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeatures setSequenceDelim(String sequenceDelim) {
            this.sequenceDelim = sequenceDelim;
            return this;
        }
        public String getSequenceDelim() {
            return this.sequenceDelim;
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeatures setSequenceLength(Long sequenceLength) {
            this.sequenceLength = sequenceLength;
            return this;
        }
        public Long getSequenceLength() {
            return this.sequenceLength;
        }

        public GetModelFeatureFGFeatureResponseBodySequenceFeatures setSubFeatures(java.util.List<GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures> subFeatures) {
            this.subFeatures = subFeatures;
            return this;
        }
        public java.util.List<GetModelFeatureFGFeatureResponseBodySequenceFeaturesSubFeatures> getSubFeatures() {
            return this.subFeatures;
        }

    }

}
