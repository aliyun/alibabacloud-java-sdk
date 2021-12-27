// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class CreateIngestionJobRequest extends TeaModel {
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

    public static CreateIngestionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIngestionJobRequest self = new CreateIngestionJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateIngestionJobRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public CreateIngestionJobRequest setCallerId(String callerId) {
        this.callerId = callerId;
        return this;
    }
    public String getCallerId() {
        return this.callerId;
    }

    public CreateIngestionJobRequest setCompletions(Integer completions) {
        this.completions = completions;
        return this;
    }
    public Integer getCompletions() {
        return this.completions;
    }

    public CreateIngestionJobRequest setEnvFromSecret(String envFromSecret) {
        this.envFromSecret = envFromSecret;
        return this;
    }
    public String getEnvFromSecret() {
        return this.envFromSecret;
    }

    public CreateIngestionJobRequest setEnvVars(String envVars) {
        this.envVars = envVars;
        return this;
    }
    public String getEnvVars() {
        return this.envVars;
    }

    public CreateIngestionJobRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CreateIngestionJobRequest setImagePullSecret(String imagePullSecret) {
        this.imagePullSecret = imagePullSecret;
        return this;
    }
    public String getImagePullSecret() {
        return this.imagePullSecret;
    }

    public CreateIngestionJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateIngestionJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateIngestionJobRequest setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Integer getParallelism() {
        return this.parallelism;
    }

    public CreateIngestionJobRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateIngestionJobRequest setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

}
