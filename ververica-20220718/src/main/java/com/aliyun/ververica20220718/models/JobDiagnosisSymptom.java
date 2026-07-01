// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobDiagnosisSymptom extends TeaModel {
    /**
     * <p>The diagnostic result.</p>
     * 
     * <strong>example:</strong>
     * <p>JM资源配置过低导致作业启动慢</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The diagnostic task name.</p>
     * 
     * <strong>example:</strong>
     * <p>启动速度分析</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The fixing suggestions.</p>
     * 
     * <strong>example:</strong>
     * <p>将 JOBManager 内存从 1Gi 改为 4Gi</p>
     */
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
