// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class AlgorithmSpec extends TeaModel {
    @NameInMap("CodeDir")
    public Location codeDir;

    @NameInMap("Command")
    public java.util.List<String> command;

    @NameInMap("ComputeResource")
    public AlgorithmSpecComputeResource computeResource;

    @NameInMap("Customization")
    public AlgorithmSpecCustomization customization;

    @NameInMap("HyperParameters")
    public java.util.List<HyperParameterDefinition> hyperParameters;

    @NameInMap("Image")
    public String image;

    @NameInMap("InputChannels")
    public java.util.List<Channel> inputChannels;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("MetricDefinitions")
    public java.util.List<MetricDefinition> metricDefinitions;

    @NameInMap("OutputChannels")
    public java.util.List<Channel> outputChannels;

    @NameInMap("ProgressDefinitions")
    public AlgorithmSpecProgressDefinitions progressDefinitions;

    @NameInMap("ResourceRequirements")
    public java.util.List<ConditionExpression> resourceRequirements;

    @NameInMap("SupportedInstanceTypes")
    @Deprecated
    public java.util.List<String> supportedInstanceTypes;

    @NameInMap("SupportsDistributedTraining")
    public Boolean supportsDistributedTraining;

    public static AlgorithmSpec build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmSpec self = new AlgorithmSpec();
        return TeaModel.build(map, self);
    }

    public AlgorithmSpec setCodeDir(Location codeDir) {
        this.codeDir = codeDir;
        return this;
    }
    public Location getCodeDir() {
        return this.codeDir;
    }

    public AlgorithmSpec setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public AlgorithmSpec setComputeResource(AlgorithmSpecComputeResource computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public AlgorithmSpecComputeResource getComputeResource() {
        return this.computeResource;
    }

    public AlgorithmSpec setCustomization(AlgorithmSpecCustomization customization) {
        this.customization = customization;
        return this;
    }
    public AlgorithmSpecCustomization getCustomization() {
        return this.customization;
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

    public AlgorithmSpec setProgressDefinitions(AlgorithmSpecProgressDefinitions progressDefinitions) {
        this.progressDefinitions = progressDefinitions;
        return this;
    }
    public AlgorithmSpecProgressDefinitions getProgressDefinitions() {
        return this.progressDefinitions;
    }

    public AlgorithmSpec setResourceRequirements(java.util.List<ConditionExpression> resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }
    public java.util.List<ConditionExpression> getResourceRequirements() {
        return this.resourceRequirements;
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

    public static class AlgorithmSpecComputeResourcePolicy extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Version")
        public String version;

        public static AlgorithmSpecComputeResourcePolicy build(java.util.Map<String, ?> map) throws Exception {
            AlgorithmSpecComputeResourcePolicy self = new AlgorithmSpecComputeResourcePolicy();
            return TeaModel.build(map, self);
        }

        public AlgorithmSpecComputeResourcePolicy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public AlgorithmSpecComputeResourcePolicy setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class AlgorithmSpecComputeResource extends TeaModel {
        @NameInMap("Policy")
        public AlgorithmSpecComputeResourcePolicy policy;

        public static AlgorithmSpecComputeResource build(java.util.Map<String, ?> map) throws Exception {
            AlgorithmSpecComputeResource self = new AlgorithmSpecComputeResource();
            return TeaModel.build(map, self);
        }

        public AlgorithmSpecComputeResource setPolicy(AlgorithmSpecComputeResourcePolicy policy) {
            this.policy = policy;
            return this;
        }
        public AlgorithmSpecComputeResourcePolicy getPolicy() {
            return this.policy;
        }

    }

    public static class AlgorithmSpecCustomization extends TeaModel {
        @NameInMap("CodeDir")
        public Boolean codeDir;

        public static AlgorithmSpecCustomization build(java.util.Map<String, ?> map) throws Exception {
            AlgorithmSpecCustomization self = new AlgorithmSpecCustomization();
            return TeaModel.build(map, self);
        }

        public AlgorithmSpecCustomization setCodeDir(Boolean codeDir) {
            this.codeDir = codeDir;
            return this;
        }
        public Boolean getCodeDir() {
            return this.codeDir;
        }

    }

    public static class AlgorithmSpecProgressDefinitionsOverallProgress extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Regex")
        public String regex;

        public static AlgorithmSpecProgressDefinitionsOverallProgress build(java.util.Map<String, ?> map) throws Exception {
            AlgorithmSpecProgressDefinitionsOverallProgress self = new AlgorithmSpecProgressDefinitionsOverallProgress();
            return TeaModel.build(map, self);
        }

        public AlgorithmSpecProgressDefinitionsOverallProgress setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AlgorithmSpecProgressDefinitionsOverallProgress setRegex(String regex) {
            this.regex = regex;
            return this;
        }
        public String getRegex() {
            return this.regex;
        }

    }

    public static class AlgorithmSpecProgressDefinitionsRemainingTime extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Regex")
        public String regex;

        public static AlgorithmSpecProgressDefinitionsRemainingTime build(java.util.Map<String, ?> map) throws Exception {
            AlgorithmSpecProgressDefinitionsRemainingTime self = new AlgorithmSpecProgressDefinitionsRemainingTime();
            return TeaModel.build(map, self);
        }

        public AlgorithmSpecProgressDefinitionsRemainingTime setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AlgorithmSpecProgressDefinitionsRemainingTime setRegex(String regex) {
            this.regex = regex;
            return this;
        }
        public String getRegex() {
            return this.regex;
        }

    }

    public static class AlgorithmSpecProgressDefinitions extends TeaModel {
        @NameInMap("OverallProgress")
        public AlgorithmSpecProgressDefinitionsOverallProgress overallProgress;

        @NameInMap("RemainingTime")
        public AlgorithmSpecProgressDefinitionsRemainingTime remainingTime;

        public static AlgorithmSpecProgressDefinitions build(java.util.Map<String, ?> map) throws Exception {
            AlgorithmSpecProgressDefinitions self = new AlgorithmSpecProgressDefinitions();
            return TeaModel.build(map, self);
        }

        public AlgorithmSpecProgressDefinitions setOverallProgress(AlgorithmSpecProgressDefinitionsOverallProgress overallProgress) {
            this.overallProgress = overallProgress;
            return this;
        }
        public AlgorithmSpecProgressDefinitionsOverallProgress getOverallProgress() {
            return this.overallProgress;
        }

        public AlgorithmSpecProgressDefinitions setRemainingTime(AlgorithmSpecProgressDefinitionsRemainingTime remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public AlgorithmSpecProgressDefinitionsRemainingTime getRemainingTime() {
            return this.remainingTime;
        }

    }

}
