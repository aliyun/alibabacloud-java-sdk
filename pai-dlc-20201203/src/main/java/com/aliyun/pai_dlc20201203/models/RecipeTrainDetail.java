// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RecipeTrainDetail extends TeaModel {
    /**
     * <p>The training startup command in argv format. This parameter is optional. If left empty, the template does not specify a command, and the command is provided by the pai.entrypoint of TrainingConfig or the string-type pai.entrypoint in TrainingParamsJson (module format) when the job is created. If all are missing, the job creation returns a 400 error with the message &quot;configuration.pai.entrypoint: nonempty argv required&quot;. If specified, it serves as the source of the job&quot;s pai.entrypoint. However, the string-type pai.entrypoint at the parameter level takes precedence (module format). In this case, the command is stored but does not take effect. Templates in module format should be left empty instead of filling in a placeholder command that is never executed.</p>
     * 
     * <strong>example:</strong>
     * <p>python -m verl.trainer.main_ppo</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The template environment variables, represented as a map&lt;string,string&gt;. When a job is created, these variables are merged with the Envs in the request by key. If a key exists in both, the value in the request takes precedence. Credentials are prohibited. Names starting with <em>PAI_PRIVATE_ENV</em> are rejected. Both the default value and an empty object indicate that the template does not set environment variables. Names reserved by the platform, such as HF_HOME, TMPDIR, and prefixes starting with RLS_, are not blocked during creation but are rejected during job creation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PYTHONPATH&quot;:&quot;/workspace/verl&quot;}</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <p>The training image. This parameter is optional. If left empty, the template does not specify an image, and the image is provided by JobSpecs[].Image when the job is created. If both are missing, the job creation returns a 400 error with the message &quot;JobSpecs.Image: must not be blank&quot;. If specified, the image must be pinned to a sha256 digest (name@sha256:&lt;64-character hexadecimal&gt;) or an explicit tag (name:tag). Bare image names with an implicit :latest tag are rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.example.com/rls/verl@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The inference rollout image. If specified, the image must be pinned to a sha256 digest (name@sha256:&lt;64-character hexadecimal&gt;) or an explicit tag (name:tag). This image is consumed only when TrainerMode is set to DisaggregateAsync to build the rollout pool. In other modes, it is stored but does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.example.com/rls/sglang@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("InferenceImage")
    public String inferenceImage;

    /**
     * <p>The default parameter layer for the inference framework, represented as a raw JSON object. It always participates in merging in all Train modes, although the rollout pool itself is built only in DisaggregateAsync mode. Keys with the same name override those in TrainingParamsJson, which is consistent with the priority of TrainingConfig &lt; RolloutConfig on the request side. In other modes, it is stored but does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;actor_rollout_ref.rollout.name&quot;:&quot;sglang&quot;,&quot;trainer.disaggregated.enable&quot;:true,&quot;trainer.disaggregated.mode&quot;:&quot;full&quot;,&quot;trainer.train_mode&quot;:&quot;rl_training&quot;}</p>
     */
    @NameInMap("InferenceParamsJson")
    public java.util.Map<String, ?> inferenceParamsJson;

    /**
     * <p>The inline resource pool for inference. You must specify either this parameter or InferenceResourceId. The resource must be of the inference type and is consumed only when TrainerMode is set to SeparateAsync. The specification shape is consistent with the training side, where the pod_count in Specs represents the number of rollout replicas. It must not contain a quota_id. The quota is provided by CreateRLJob.ResourceId. When referencing an existing pool, the workspace scope and read permissions of the source recipe must be met.</p>
     */
    @NameInMap("InferenceResource")
    public RecipeResource inferenceResource;

    /**
     * <p>The ID of the row in an existing inference resource pool. You must specify either this parameter or InferenceResource. It is consumed only when TrainerMode is set to SeparateAsync. If the ID does not exist, a Recipe.InvalidParameter (400) error is returned, and the original resource type validation is maintained. The row must be reachable from the source recipe of the current tenant and workspace or a public official source recipe. It must also pass the current paidlc:CreateRecipe and source paidlc:GetRecipe authentication. Any readable source for the same row is sufficient, and SourceRecipeId is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002</p>
     */
    @NameInMap("InferenceResourceId")
    public Long inferenceResourceId;

    /**
     * <p>Specifies whether to publish the child table as the shared default training child table for the model. Only platform callers can set this parameter to true, and they must still pass the RAM authentication for the current WorkspaceId. Defaults published by custom recipes are limited to their workspaces. Defaults published by official preset recipes are not bound to user workspaces and serve as public official fallbacks. Inheritance first checks the default of the current workspace, and then falls back to the public official default. If set to false, the child table is a regular detail and does not participate in default inheritance, but can still be referenced by ID after passing the read authentication of the source recipe. Details in other empty workspaces are not automatically made public.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDefaultDetail")
    public Boolean isDefaultDetail;

    /**
     * <p>The name of the model to which the child table belongs. If left empty, the model of the main row is inherited.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The configuration renderer. Valid values: hydra. Only hydra is implemented in the first phase. If left empty, the default value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>hydra</p>
     */
    @NameInMap("Renderer")
    public String renderer;

    /**
     * <p>The estimated runtime in minutes. The value must be greater than or equal to 0. Both 0 and the default value indicate that the template does not specify a runtime, and the job does not have a runtime limit. The platform does not provide a default value.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("RuntimeMinutes")
    public Integer runtimeMinutes;

    /**
     * <p>The default checkpoint save interval in steps. The value must be greater than or equal to -1. A value of -1 indicates that checkpoints are not saved.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SaveIntervalStepsDefault")
    public Integer saveIntervalStepsDefault;

    /**
     * <p>The inline resource pool for training. You must specify either this parameter or TrainResourceId. The inline resource must be of the train type. When referencing an existing pool, the workspace scope and read permissions of the source recipe must be met.</p>
     */
    @NameInMap("TrainResource")
    public RecipeResource trainResource;

    /**
     * <p>The ID of the row in an existing training resource pool. You must specify either this parameter or TrainResource. If the ID does not exist, a Recipe.InvalidParameter (400) error is returned, and the original resource type validation is maintained. The row must be reachable from the source recipe of the current tenant and workspace or a public official source recipe. It must also pass the current paidlc:CreateRecipe and source paidlc:GetRecipe authentication. Any readable source for the same row is sufficient, and SourceRecipeId is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("TrainResourceId")
    public Long trainResourceId;

    /**
     * <p>The training and inference execution mode. Valid values: ColocateSync and DisaggregateAsync. The legacy spellings Sync and ColocateAsync are normalized to ColocateSync, and SeparateAsync is normalized to DisaggregateAsync. For DisaggregateAsync, the rollout side is provided by InferenceImage and InferenceResource. This parameter is not mandatory when creating a template. If missing, the error is attributed to RecipeId or JobSpecs based on actionability during job creation. This parameter is specified by the caller and is not overridden by the platform.</p>
     * 
     * <strong>example:</strong>
     * <p>ColocateSync</p>
     */
    @NameInMap("TrainerMode")
    public String trainerMode;

    /**
     * <p>The default parameter layer for the training framework, represented as a raw JSON object. It serves as the default value layer. Reserved key validation is not performed during creation. If specified, it must be a valid JSON object. If it does not contain the path and experiment name, the job creation request must include these keys.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;algorithm.adv_estimator&quot;:&quot;gae&quot;,&quot;data.train_files&quot;:[&quot;/mnt/input/gsm8k/train.parquet&quot;]}</p>
     */
    @NameInMap("TrainingParamsJson")
    public java.util.Map<String, ?> trainingParamsJson;

    public static RecipeTrainDetail build(java.util.Map<String, ?> map) throws Exception {
        RecipeTrainDetail self = new RecipeTrainDetail();
        return TeaModel.build(map, self);
    }

    public RecipeTrainDetail setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public RecipeTrainDetail setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public RecipeTrainDetail setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public RecipeTrainDetail setInferenceImage(String inferenceImage) {
        this.inferenceImage = inferenceImage;
        return this;
    }
    public String getInferenceImage() {
        return this.inferenceImage;
    }

    public RecipeTrainDetail setInferenceParamsJson(java.util.Map<String, ?> inferenceParamsJson) {
        this.inferenceParamsJson = inferenceParamsJson;
        return this;
    }
    public java.util.Map<String, ?> getInferenceParamsJson() {
        return this.inferenceParamsJson;
    }

    public RecipeTrainDetail setInferenceResource(RecipeResource inferenceResource) {
        this.inferenceResource = inferenceResource;
        return this;
    }
    public RecipeResource getInferenceResource() {
        return this.inferenceResource;
    }

    public RecipeTrainDetail setInferenceResourceId(Long inferenceResourceId) {
        this.inferenceResourceId = inferenceResourceId;
        return this;
    }
    public Long getInferenceResourceId() {
        return this.inferenceResourceId;
    }

    public RecipeTrainDetail setIsDefaultDetail(Boolean isDefaultDetail) {
        this.isDefaultDetail = isDefaultDetail;
        return this;
    }
    public Boolean getIsDefaultDetail() {
        return this.isDefaultDetail;
    }

    public RecipeTrainDetail setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public RecipeTrainDetail setRenderer(String renderer) {
        this.renderer = renderer;
        return this;
    }
    public String getRenderer() {
        return this.renderer;
    }

    public RecipeTrainDetail setRuntimeMinutes(Integer runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
        return this;
    }
    public Integer getRuntimeMinutes() {
        return this.runtimeMinutes;
    }

    public RecipeTrainDetail setSaveIntervalStepsDefault(Integer saveIntervalStepsDefault) {
        this.saveIntervalStepsDefault = saveIntervalStepsDefault;
        return this;
    }
    public Integer getSaveIntervalStepsDefault() {
        return this.saveIntervalStepsDefault;
    }

    public RecipeTrainDetail setTrainResource(RecipeResource trainResource) {
        this.trainResource = trainResource;
        return this;
    }
    public RecipeResource getTrainResource() {
        return this.trainResource;
    }

    public RecipeTrainDetail setTrainResourceId(Long trainResourceId) {
        this.trainResourceId = trainResourceId;
        return this;
    }
    public Long getTrainResourceId() {
        return this.trainResourceId;
    }

    public RecipeTrainDetail setTrainerMode(String trainerMode) {
        this.trainerMode = trainerMode;
        return this;
    }
    public String getTrainerMode() {
        return this.trainerMode;
    }

    public RecipeTrainDetail setTrainingParamsJson(java.util.Map<String, ?> trainingParamsJson) {
        this.trainingParamsJson = trainingParamsJson;
        return this;
    }
    public java.util.Map<String, ?> getTrainingParamsJson() {
        return this.trainingParamsJson;
    }

}
