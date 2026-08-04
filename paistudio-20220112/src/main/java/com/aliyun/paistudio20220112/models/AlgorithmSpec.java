// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class AlgorithmSpec extends TeaModel {
    /**
     * <p>The custom code configuration.</p>
     */
    @NameInMap("CodeDir")
    public Location codeDir;

    /**
     * <p>The list of commands to run the training task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Command")
    public java.util.List<String> command;

    /**
     * <p>The compute resource definition.</p>
     */
    @NameInMap("ComputeResource")
    public AlgorithmSpecComputeResource computeResource;

    /**
     * <p>The custom configuration.</p>
     */
    @NameInMap("Customization")
    public AlgorithmSpecCustomization customization;

    /**
     * <p>The list of hyperparameter definitions.</p>
     */
    @NameInMap("HyperParameters")
    public java.util.List<HyperParameterDefinition> hyperParameters;

    /**
     * <p>The training runtime image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-shanghai.aliyuncs.com/pai-training/kmeans:v1.0.0</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The list of input channels for the algorithm.</p>
     */
    @NameInMap("InputChannels")
    public java.util.List<Channel> inputChannels;

    /**
     * <p>The job type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TFJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The list of metric definitions for the training task.</p>
     */
    @NameInMap("MetricDefinitions")
    public java.util.List<MetricDefinition> metricDefinitions;

    /**
     * <p>The list of output channels for the algorithm.</p>
     */
    @NameInMap("OutputChannels")
    public java.util.List<Channel> outputChannels;

    /**
     * <p>You can use this feature to monitor the training progress.</p>
     */
    @NameInMap("ProgressDefinitions")
    public AlgorithmSpecProgressDefinitions progressDefinitions;

    /**
     * <p>The resource requirements.</p>
     */
    @NameInMap("ResourceRequirements")
    public java.util.List<ConditionExpression> resourceRequirements;

    /**
     * <p>The list of supported elastic computing instance types for training.</p>
     */
    @NameInMap("SupportedInstanceTypes")
    public java.util.List<String> supportedInstanceTypes;

    /**
     * <p>Indicates whether distributed training is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Policy content, serialized from a JSON array.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;MinTotalCount\&quot;:1,\&quot;MaxTotalCount\&quot;:4,\&quot;RolePolicies\&quot;:{\&quot;chief\&quot;:{\&quot;Count\&quot;:1},\&quot;ps\&quot;:{\&quot;Count\&quot;:1},\&quot;worker\&quot;:{\&quot;Percentage\&quot;:100}}},{\&quot;MinTotalCount\&quot;:5,\&quot;MaxTotalCount\&quot;:10,\&quot;RolePolicies\&quot;:{\&quot;chief\&quot;:{\&quot;Count\&quot;:1},\&quot;ps\&quot;:{\&quot;Percentage\&quot;:20},\&quot;worker\&quot;:{\&quot;Percentage\&quot;:80}}},{\&quot;MinTotalCount\&quot;:11,\&quot;RolePolicies\&quot;:{\&quot;chief\&quot;:{\&quot;Count\&quot;:1},\&quot;ps\&quot;:{\&quot;Percentage\&quot;:40},\&quot;worker\&quot;:{\&quot;Percentage\&quot;:60}}}]</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>Policy version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
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
        /**
         * <p>Computing resource configuration policy for the algorithm.</p>
         * <p>This parameter is required.</p>
         */
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
        /**
         * <p>Indicates whether custom-mounted code is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The description of the monitoring definition.</p>
         * 
         * <strong>example:</strong>
         * <p>training progress</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The regular expression for monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>^[0-9]+([.][0-9]+){0,1}$</p>
         */
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
        /**
         * <p>The description of the monitoring definition.</p>
         * 
         * <strong>example:</strong>
         * <p>training remaining time</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The regular expression for monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>^[0-9]+([.][0-9]+){0,1}$</p>
         */
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
        /**
         * <p>Monitors training progress.</p>
         */
        @NameInMap("OverallProgress")
        public AlgorithmSpecProgressDefinitionsOverallProgress overallProgress;

        /**
         * <p>The definition for monitoring the remaining training time.</p>
         */
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
