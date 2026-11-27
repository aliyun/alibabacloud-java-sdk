// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RecipeTrainDetailView extends TeaModel {
    /**
     * <p>The training start command.</p>
     * 
     * <strong>example:</strong>
     * <p>python -m verl.trainer.main_ppo</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The ID of the training detail row, which is always the specifically resolved row.</p>
     * 
     * <strong>example:</strong>
     * <p>2001</p>
     */
    @NameInMap("DetailId")
    public Long detailId;

    /**
     * <p>The template environment variables of the training detail table, in map&lt;string,string&gt; format. Values are fully echoed without desensitization, so credentials must not be stored in the template. An empty value indicates that the template does not set environment variables. When creating a job, it is merged with the requested Envs by key, and the requested values take precedence for identical keys.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PYTHONPATH&quot;:&quot;/workspace/verl&quot;}</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <p>The training image with a fixed digest.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.example.com/rls/verl@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The inference-side rollout image with a fixed digest. It is consumed by created jobs only when TrainerMode is set to SeparateAsync. An empty value indicates that the template does not provide an inference-side image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.example.com/rls/sglang@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("InferenceImage")
    public String inferenceImage;

    /**
     * <p>The default parameter layer of the inference-side framework, which echoes the original JSON object. It participates in merging and overrides TrainingParamsJson only when TrainerMode is set to SeparateAsync. In other modes, it is echoed but does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;actor_rollout_ref.rollout.name&quot;:&quot;sglang&quot;,&quot;trainer.disaggregated.enable&quot;:true}</p>
     */
    @NameInMap("InferenceParamsJson")
    public java.util.Map<String, ?> inferenceParamsJson;

    /**
     * <p>The resolved inference-side resource pool of the inference type. It is consumed by created jobs only when TrainerMode is set to SeparateAsync. An empty value indicates that the template does not provide inference-side resources.</p>
     */
    @NameInMap("InferenceResource")
    public RecipeResourceView inferenceResource;

    /**
     * <p>Specifies whether the detail table is explicitly published by the platform as a shared default training detail table. The resolution first checks the default of the current workspace, and then falls back to the public default published by official presets. A value of false indicates a private detail. Details in other empty workspaces are not automatically used as public defaults. Inheritance still requires RAM permissions for the current operating workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDefaultDetail")
    public Boolean isDefaultDetail;

    /**
     * <p>The name of the model to which the detail table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The configuration renderer. Valid values: hydra.</p>
     * 
     * <strong>example:</strong>
     * <p>hydra</p>
     */
    @NameInMap("Renderer")
    public String renderer;

    /**
     * <p>The estimated runtime in minutes. A value of 0 indicates that the template does not specify a duration, and the job does not have a runtime limit.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("RuntimeMinutes")
    public Integer runtimeMinutes;

    /**
     * <p>The default checkpoint save interval in steps. A value of -1 indicates that checkpoints are not saved.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SaveIntervalStepsDefault")
    public Integer saveIntervalStepsDefault;

    /**
     * <p>The resolved training-side resource pool.</p>
     */
    @NameInMap("TrainResource")
    public RecipeResourceView trainResource;

    /**
     * <p>The training and inference execution mode. Valid values: Sync, ColocateAsync, and SeparateAsync.</p>
     * 
     * <strong>example:</strong>
     * <p>Sync</p>
     */
    @NameInMap("TrainerMode")
    public String trainerMode;

    /**
     * <p>The default parameter layer of the training-side framework, which echoes the original JSON object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;algorithm.adv_estimator&quot;:&quot;gae&quot;}</p>
     */
    @NameInMap("TrainingParamsJson")
    public java.util.Map<String, ?> trainingParamsJson;

    public static RecipeTrainDetailView build(java.util.Map<String, ?> map) throws Exception {
        RecipeTrainDetailView self = new RecipeTrainDetailView();
        return TeaModel.build(map, self);
    }

    public RecipeTrainDetailView setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public RecipeTrainDetailView setDetailId(Long detailId) {
        this.detailId = detailId;
        return this;
    }
    public Long getDetailId() {
        return this.detailId;
    }

    public RecipeTrainDetailView setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public RecipeTrainDetailView setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public RecipeTrainDetailView setInferenceImage(String inferenceImage) {
        this.inferenceImage = inferenceImage;
        return this;
    }
    public String getInferenceImage() {
        return this.inferenceImage;
    }

    public RecipeTrainDetailView setInferenceParamsJson(java.util.Map<String, ?> inferenceParamsJson) {
        this.inferenceParamsJson = inferenceParamsJson;
        return this;
    }
    public java.util.Map<String, ?> getInferenceParamsJson() {
        return this.inferenceParamsJson;
    }

    public RecipeTrainDetailView setInferenceResource(RecipeResourceView inferenceResource) {
        this.inferenceResource = inferenceResource;
        return this;
    }
    public RecipeResourceView getInferenceResource() {
        return this.inferenceResource;
    }

    public RecipeTrainDetailView setIsDefaultDetail(Boolean isDefaultDetail) {
        this.isDefaultDetail = isDefaultDetail;
        return this;
    }
    public Boolean getIsDefaultDetail() {
        return this.isDefaultDetail;
    }

    public RecipeTrainDetailView setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public RecipeTrainDetailView setRenderer(String renderer) {
        this.renderer = renderer;
        return this;
    }
    public String getRenderer() {
        return this.renderer;
    }

    public RecipeTrainDetailView setRuntimeMinutes(Integer runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
        return this;
    }
    public Integer getRuntimeMinutes() {
        return this.runtimeMinutes;
    }

    public RecipeTrainDetailView setSaveIntervalStepsDefault(Integer saveIntervalStepsDefault) {
        this.saveIntervalStepsDefault = saveIntervalStepsDefault;
        return this;
    }
    public Integer getSaveIntervalStepsDefault() {
        return this.saveIntervalStepsDefault;
    }

    public RecipeTrainDetailView setTrainResource(RecipeResourceView trainResource) {
        this.trainResource = trainResource;
        return this;
    }
    public RecipeResourceView getTrainResource() {
        return this.trainResource;
    }

    public RecipeTrainDetailView setTrainerMode(String trainerMode) {
        this.trainerMode = trainerMode;
        return this;
    }
    public String getTrainerMode() {
        return this.trainerMode;
    }

    public RecipeTrainDetailView setTrainingParamsJson(java.util.Map<String, ?> trainingParamsJson) {
        this.trainingParamsJson = trainingParamsJson;
        return this;
    }
    public java.util.Map<String, ?> getTrainingParamsJson() {
        return this.trainingParamsJson;
    }

}
