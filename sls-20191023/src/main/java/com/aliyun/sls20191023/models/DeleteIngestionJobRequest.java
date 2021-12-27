// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class DeleteIngestionJobRequest extends TeaModel {
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Region")
    public String region;

    public static DeleteIngestionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIngestionJobRequest self = new DeleteIngestionJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIngestionJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DeleteIngestionJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteIngestionJobRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
