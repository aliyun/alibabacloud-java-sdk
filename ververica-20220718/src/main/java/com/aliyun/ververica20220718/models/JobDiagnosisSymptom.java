// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobDiagnosisSymptom extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("recommendation")
    public String recommendation;

    public static JobDiagnosisSymptom build(java.util.Map<String, ?> map) throws Exception {
        JobDiagnosisSymptom self = new JobDiagnosisSymptom();
        return TeaModel.build(map, self);
    }

    public JobDiagnosisSymptom setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public JobDiagnosisSymptom setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public JobDiagnosisSymptom setRecommendation(String recommendation) {
        this.recommendation = recommendation;
        return this;
    }
    public String getRecommendation() {
        return this.recommendation;
    }

}
