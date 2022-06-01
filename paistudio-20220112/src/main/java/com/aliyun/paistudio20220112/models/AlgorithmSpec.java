// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class AlgorithmSpec extends TeaModel {
    // The command used for submit the job.
    @NameInMap("Command")
    public java.util.List<String> command;

    // The hype parameter used by the algorithm.
    @NameInMap("HyperParameters")
    public java.util.List<HyperParameterDefinition> hyperParameters;

    // The docker image used by the job of this algorithm.
    @NameInMap("Image")
    public String image;

    // The input for the algorithm.
    @NameInMap("InputChannels")
    public java.util.List<Channel> inputChannels;

    // Job type of the training job while running the algorithm.
    @NameInMap("JobType")
    public String jobType;

    // The output metrics of the algorithm.
    @NameInMap("MetricDefinitions")
    public java.util.List<MetricDefinition> metricDefinitions;

    // The outputs of the algorithm.
    @NameInMap("OutputChannels")
    public java.util.List<Channel> outputChannels;

    // A list of ECS instances that the algorithm can use to submit training job.
    @NameInMap("SupportedInstanceTypes")
    public java.util.List<String> supportedInstanceTypes;

    // Indicates whether the algorithm support distributed training.
    @NameInMap("SupportsDistributedTraining")
    public Boolean supportsDistributedTraining;

    public static AlgorithmSpec build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmSpec self = new AlgorithmSpec();
        return TeaModel.build(map, self);
    }

    public AlgorithmSpec setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public AlgorithmSpec setHyperParameters(java.util.List<HyperParameterDefinition> hyperParameters) {
        this.hyperParameters = hyperParameters;
        return this;
    }
    public java.util.List<HyperParameterDefinition> getHyperParameters() {
        return this.hyperParameters;
    }

    public AlgorithmSpec setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public AlgorithmSpec setInputChannels(java.util.List<Channel> inputChannels) {
        this.inputChannels = inputChannels;
        return this;
    }
    public java.util.List<Channel> getInputChannels() {
        return this.inputChannels;
    }

    public AlgorithmSpec setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public AlgorithmSpec setMetricDefinitions(java.util.List<MetricDefinition> metricDefinitions) {
        this.metricDefinitions = metricDefinitions;
        return this;
    }
    public java.util.List<MetricDefinition> getMetricDefinitions() {
        return this.metricDefinitions;
    }

    public AlgorithmSpec setOutputChannels(java.util.List<Channel> outputChannels) {
        this.outputChannels = outputChannels;
        return this;
    }
    public java.util.List<Channel> getOutputChannels() {
        return this.outputChannels;
    }

    public AlgorithmSpec setSupportedInstanceTypes(java.util.List<String> supportedInstanceTypes) {
        this.supportedInstanceTypes = supportedInstanceTypes;
        return this;
    }
    public java.util.List<String> getSupportedInstanceTypes() {
        return this.supportedInstanceTypes;
    }

    public AlgorithmSpec setSupportsDistributedTraining(Boolean supportsDistributedTraining) {
        this.supportsDistributedTraining = supportsDistributedTraining;
        return this;
    }
    public Boolean getSupportsDistributedTraining() {
        return this.supportsDistributedTraining;
    }

}
