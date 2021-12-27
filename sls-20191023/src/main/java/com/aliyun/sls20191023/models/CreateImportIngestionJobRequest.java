// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class CreateImportIngestionJobRequest extends TeaModel {
    @NameInMap("Args")
    public String args;

    @NameInMap("CallerId")
    public String callerId;

    @NameInMap("Completions")
    public Integer completions;

    @NameInMap("EnvFromSecret")
    public String envFromSecret;

    @NameInMap("EnvVars")
    public String envVars;

    @NameInMap("Image")
    public String image;

    @NameInMap("ImagePullSecret")
    public String imagePullSecret;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Parallelism")
    public Integer parallelism;

    @NameInMap("Region")
    public String region;

    @NameInMap("RestartPolicy")
    public String restartPolicy;

    public static CreateImportIngestionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImportIngestionJobRequest self = new CreateImportIngestionJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateImportIngestionJobRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public CreateImportIngestionJobRequest setCallerId(String callerId) {
        this.callerId = callerId;
        return this;
    }
    public String getCallerId() {
        return this.callerId;
    }

    public CreateImportIngestionJobRequest setCompletions(Integer completions) {
        this.completions = completions;
        return this;
    }
    public Integer getCompletions() {
        return this.completions;
    }

    public CreateImportIngestionJobRequest setEnvFromSecret(String envFromSecret) {
        this.envFromSecret = envFromSecret;
        return this;
    }
    public String getEnvFromSecret() {
        return this.envFromSecret;
    }

    public CreateImportIngestionJobRequest setEnvVars(String envVars) {
        this.envVars = envVars;
        return this;
    }
    public String getEnvVars() {
        return this.envVars;
    }

    public CreateImportIngestionJobRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CreateImportIngestionJobRequest setImagePullSecret(String imagePullSecret) {
        this.imagePullSecret = imagePullSecret;
        return this;
    }
    public String getImagePullSecret() {
        return this.imagePullSecret;
    }

    public CreateImportIngestionJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateImportIngestionJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateImportIngestionJobRequest setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Integer getParallelism() {
        return this.parallelism;
    }

    public CreateImportIngestionJobRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateImportIngestionJobRequest setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

}
