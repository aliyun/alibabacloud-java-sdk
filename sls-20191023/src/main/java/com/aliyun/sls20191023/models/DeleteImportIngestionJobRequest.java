// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class DeleteImportIngestionJobRequest extends TeaModel {
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Region")
    public String region;

    public static DeleteImportIngestionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImportIngestionJobRequest self = new DeleteImportIngestionJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImportIngestionJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DeleteImportIngestionJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteImportIngestionJobRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
