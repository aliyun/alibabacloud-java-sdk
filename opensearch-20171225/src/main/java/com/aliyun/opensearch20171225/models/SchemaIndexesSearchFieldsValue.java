// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class SchemaIndexesSearchFieldsValue extends TeaModel {
    @NameInMap("analyzer")
    public String analyzer;

    @NameInMap("analyzerType")
    public String analyzerType;

    @NameInMap("analyzerGeneration")
    public String analyzerGeneration;

    @NameInMap("fields")
    public java.util.List<String> fields;

    @NameInMap("label")
    public String label;

    public static SchemaIndexesSearchFieldsValue build(java.util.Map<String, ?> map) throws Exception {
        SchemaIndexesSearchFieldsValue self = new SchemaIndexesSearchFieldsValue();
        return TeaModel.build(map, self);
    }

    public SchemaIndexesSearchFieldsValue setAnalyzer(String analyzer) {
        this.analyzer = analyzer;
        return this;
    }
    public String getAnalyzer() {
        return this.analyzer;
    }

    public SchemaIndexesSearchFieldsValue setAnalyzerType(String analyzerType) {
        this.analyzerType = analyzerType;
        return this;
    }
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    public SchemaIndexesSearchFieldsValue setAnalyzerGeneration(String analyzerGeneration) {
        this.analyzerGeneration = analyzerGeneration;
        return this;
    }
    public String getAnalyzerGeneration() {
        return this.analyzerGeneration;
    }

    public SchemaIndexesSearchFieldsValue setFields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<String> getFields() {
        return this.fields;
    }

    public SchemaIndexesSearchFieldsValue setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

}
