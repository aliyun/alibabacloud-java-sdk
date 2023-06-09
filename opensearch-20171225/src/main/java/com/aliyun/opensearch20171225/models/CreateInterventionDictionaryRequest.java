// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateInterventionDictionaryRequest extends TeaModel {
    @NameInMap("analyzerType")
    public String analyzerType;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateInterventionDictionaryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInterventionDictionaryRequest self = new CreateInterventionDictionaryRequest();
        return TeaModel.build(map, self);
    }

    public CreateInterventionDictionaryRequest setAnalyzerType(String analyzerType) {
        this.analyzerType = analyzerType;
        return this;
    }
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    public CreateInterventionDictionaryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateInterventionDictionaryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateInterventionDictionaryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
