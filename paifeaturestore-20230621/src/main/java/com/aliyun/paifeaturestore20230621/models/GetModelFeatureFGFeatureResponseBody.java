// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetModelFeatureFGFeatureResponseBody extends TeaModel {
    @NameInMap("LookupFeatures")
    public java.util.List<GetModelFeatureFGFeatureResponseBodyLookupFeatures> lookupFeatures;

    @NameInMap("RawFeatures")
    public java.util.List<GetModelFeatureFGFeatureResponseBodyRawFeatures> rawFeatures;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Reserves")
    public java.util.List<String> reserves;

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
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("FeatureName")
        public String featureName;

        @NameInMap("KeyFeatureDomain")
        public String keyFeatureDomain;

        @NameInMap("KeyFeatureName")
        public String keyFeatureName;

        @NameInMap("MapFeatureDomain")
        public String mapFeatureDomain;

        @NameInMap("MapFeatureName")
        public String mapFeatureName;

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
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("FeatureDomain")
        public String featureDomain;

        @NameInMap("FeatureName")
        public String featureName;

        @NameInMap("FeatureType")
        public String featureType;

        @NameInMap("InputFeatureName")
        public String inputFeatureName;

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
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("FeatureDomain")
        public String featureDomain;

        @NameInMap("FeatureName")
        public String featureName;

        @NameInMap("FeatureType")
        public String featureType;

        @NameInMap("InputFeatureName")
        public String inputFeatureName;

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
        @NameInMap("AttributeDelim")
        public String attributeDelim;

        @NameInMap("FeatureName")
        public String featureName;

        @NameInMap("SequenceDelim")
        public String sequenceDelim;

        @NameInMap("SequenceLength")
        public Long sequenceLength;

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
