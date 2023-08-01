// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ComponentSpec extends TeaModel {
    @NameInMap("CodeDir")
    public Location codeDir;

    @NameInMap("Command")
    public String command;

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

    @NameInMap("ResourceRequirements")
    public java.util.List<ConditionExpression> resourceRequirements;

    public static ComponentSpec build(java.util.Map<String, ?> map) throws Exception {
        ComponentSpec self = new ComponentSpec();
        return TeaModel.build(map, self);
    }

    public ComponentSpec setCodeDir(Location codeDir) {
        this.codeDir = codeDir;
        return this;
    }
    public Location getCodeDir() {
        return this.codeDir;
    }

    public ComponentSpec setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public ComponentSpec setHyperParameters(java.util.List<HyperParameterDefinition> hyperParameters) {
        this.hyperParameters = hyperParameters;
        return this;
    }
    public java.util.List<HyperParameterDefinition> getHyperParameters() {
        return this.hyperParameters;
    }

    public ComponentSpec setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ComponentSpec setInputChannels(java.util.List<Channel> inputChannels) {
        this.inputChannels = inputChannels;
        return this;
    }
    public java.util.List<Channel> getInputChannels() {
        return this.inputChannels;
    }

    public ComponentSpec setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ComponentSpec setMetricDefinitions(java.util.List<MetricDefinition> metricDefinitions) {
        this.metricDefinitions = metricDefinitions;
        return this;
    }
    public java.util.List<MetricDefinition> getMetricDefinitions() {
        return this.metricDefinitions;
    }

    public ComponentSpec setOutputChannels(java.util.List<Channel> outputChannels) {
        this.outputChannels = outputChannels;
        return this;
    }
    public java.util.List<Channel> getOutputChannels() {
        return this.outputChannels;
    }

    public ComponentSpec setResourceRequirements(java.util.List<ConditionExpression> resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }
    public java.util.List<ConditionExpression> getResourceRequirements() {
        return this.resourceRequirements;
    }

}
