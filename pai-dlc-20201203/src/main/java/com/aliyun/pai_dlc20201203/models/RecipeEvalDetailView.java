// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RecipeEvalDetailView extends TeaModel {
    /**
     * <p>The startup command for the evaluation.</p>
     * 
     * <strong>example:</strong>
     * <p>python -m verl.trainer.main_ppo val_only=true</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The ID of the evaluation child table row, which is always the specifically parsed row.</p>
     * 
     * <strong>example:</strong>
     * <p>3001</p>
     */
    @NameInMap("DetailId")
    public Long detailId;

    /**
     * <p>The template environment variables of the evaluation child table. The data type is map&lt;string,string&gt;. The values are fully echoed without masking. Therefore, credentials must not be stored in the template. Jobs with Mode=Eval use the values from this child table, which are independent of the training child table.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PYTHONPATH&quot;:&quot;/opt/eval/verl&quot;}</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <p>The evaluation image with a fixed digest.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.example.com/rls/verl@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>Indicates whether the child table is explicitly published by the platform as a shared default evaluation child table. The parsing process first checks the default of the current workspace and then falls back to the public default officially preset and published. A value of false indicates a private detail. Details in other empty workspaces are not automatically used as the public default. Inheritance still requires Resource Access Management (RAM) permissions for the current workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDefaultDetail")
    public Boolean isDefaultDetail;

    /**
     * <p>The name of the model to which the child table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The framework default parameter layer, which echoes the original JSON object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;data.val_files&quot;:[&quot;/mnt/input/gsm8k/test.parquet&quot;]}</p>
     */
    @NameInMap("ParamsJson")
    public java.util.Map<String, ?> paramsJson;

    /**
     * <p>The configuration renderer. Valid values: hydra.</p>
     * 
     * <strong>example:</strong>
     * <p>hydra</p>
     */
    @NameInMap("Renderer")
    public String renderer;

    /**
     * <p>The parsed evaluation resource pool.</p>
     */
    @NameInMap("Resource")
    public RecipeResourceView resource;

    /**
     * <p>The estimated runtime in minutes. A value of 0 indicates that the template does not specify a limit, and no upper limit is set for the job runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RuntimeMinutes")
    public Integer runtimeMinutes;

    public static RecipeEvalDetailView build(java.util.Map<String, ?> map) throws Exception {
        RecipeEvalDetailView self = new RecipeEvalDetailView();
        return TeaModel.build(map, self);
    }

    public RecipeEvalDetailView setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public RecipeEvalDetailView setDetailId(Long detailId) {
        this.detailId = detailId;
        return this;
    }
    public Long getDetailId() {
        return this.detailId;
    }

    public RecipeEvalDetailView setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public RecipeEvalDetailView setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public RecipeEvalDetailView setIsDefaultDetail(Boolean isDefaultDetail) {
        this.isDefaultDetail = isDefaultDetail;
        return this;
    }
    public Boolean getIsDefaultDetail() {
        return this.isDefaultDetail;
    }

    public RecipeEvalDetailView setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public RecipeEvalDetailView setParamsJson(java.util.Map<String, ?> paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public java.util.Map<String, ?> getParamsJson() {
        return this.paramsJson;
    }

    public RecipeEvalDetailView setRenderer(String renderer) {
        this.renderer = renderer;
        return this;
    }
    public String getRenderer() {
        return this.renderer;
    }

    public RecipeEvalDetailView setResource(RecipeResourceView resource) {
        this.resource = resource;
        return this;
    }
    public RecipeResourceView getResource() {
        return this.resource;
    }

    public RecipeEvalDetailView setRuntimeMinutes(Integer runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
        return this;
    }
    public Integer getRuntimeMinutes() {
        return this.runtimeMinutes;
    }

}
