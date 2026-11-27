// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RecipeEvalDetail extends TeaModel {
    /**
     * <p>The evaluation startup command in argv format. This parameter is optional. If left empty, the template does not specify a command, and the caller must provide it when creating the job. The string-type pai.entrypoint parameter at the parameter level takes precedence over this field. In this case, the command is stored but does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>python -m verl.trainer.main_ppo val_only=true</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The template environment variables, in the format of map&lt;string,string&gt;. Evaluation jobs use the values from this child table, which are independent of the training child table because the images on both sides are different. When creating a job, these variables are merged with the environment variables in the request by key. If a key exists in both, the value in the request takes precedence. Do not include credentials. Names starting with <em>PAI_PRIVATE_ENV</em> are rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PYTHONPATH&quot;:&quot;/opt/eval/verl&quot;}</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <p>The evaluation image. This parameter is optional. If left empty, the template does not specify an image, and the caller must provide it when creating the job. If specified, the value must be pinned to a SHA-256 digest in the format of name@sha256:&lt;64-character hexadecimal string&gt; or an explicit tag in the format of name:tag. Bare image names with an implicit :latest tag are rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.example.com/rls/verl@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>Only platform callers can set this parameter to true, and they must still pass Resource Access Management (RAM) authentication for the current workspace ID. Defaults published by custom recipes are limited to their workspaces. Defaults published by official preset recipes are not bound to a user workspace and serve as a public official fallback. The inheritance mechanism first checks the default of the current workspace and then falls back to the public official default. If set to false, the record is a normal detail and does not participate in default inheritance. However, it can still be referenced by ID after passing the read authentication of the source recipe. Details in other empty workspaces are not automatically made public.</p>
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
     * <p>The framework default parameter layer, which is a raw JSON object. As the default value layer, reserved key validation is not performed during creation. If specified, the value must be valid JSON.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;data.val_files&quot;:[&quot;/mnt/input/gsm8k/test.parquet&quot;]}</p>
     */
    @NameInMap("ParamsJson")
    public java.util.Map<String, ?> paramsJson;

    /**
     * <p>The configuration renderer. Valid values: hydra. In the first phase, only hydra is implemented. If left empty, the default value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>hydra</p>
     */
    @NameInMap("Renderer")
    public String renderer;

    /**
     * <p>The inline resource pool. This parameter and ResourceId are mutually exclusive. The inline resource must be of the eval type. When referencing an existing pool, the workspace scope and read permissions of the source recipe must be met.</p>
     */
    @NameInMap("Resource")
    public RecipeResource resource;

    /**
     * <p>The ID of the existing evaluation resource pool row to reference. This parameter and Resource are mutually exclusive. If the specified row does not exist, the Recipe.InvalidParameter (400) error is returned, and the original resource type validation is retained. The row must be reachable from the source recipe of the current tenant and workspace or a public official source recipe. It must also pass the current paidlc:CreateRecipe and source paidlc:GetRecipe authentication. Any readable source for the same row is sufficient, and SourceRecipeId is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002</p>
     */
    @NameInMap("ResourceId")
    public Long resourceId;

    /**
     * <p>The estimated runtime in minutes. The value must be greater than or equal to 0. A value of 0 or the default value indicates that the template does not specify a runtime, and no upper limit is set for the job runtime. The platform does not provide a default value.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RuntimeMinutes")
    public Integer runtimeMinutes;

    public static RecipeEvalDetail build(java.util.Map<String, ?> map) throws Exception {
        RecipeEvalDetail self = new RecipeEvalDetail();
        return TeaModel.build(map, self);
    }

    public RecipeEvalDetail setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public RecipeEvalDetail setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public RecipeEvalDetail setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public RecipeEvalDetail setIsDefaultDetail(Boolean isDefaultDetail) {
        this.isDefaultDetail = isDefaultDetail;
        return this;
    }
    public Boolean getIsDefaultDetail() {
        return this.isDefaultDetail;
    }

    public RecipeEvalDetail setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public RecipeEvalDetail setParamsJson(java.util.Map<String, ?> paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public java.util.Map<String, ?> getParamsJson() {
        return this.paramsJson;
    }

    public RecipeEvalDetail setRenderer(String renderer) {
        this.renderer = renderer;
        return this;
    }
    public String getRenderer() {
        return this.renderer;
    }

    public RecipeEvalDetail setResource(RecipeResource resource) {
        this.resource = resource;
        return this;
    }
    public RecipeResource getResource() {
        return this.resource;
    }

    public RecipeEvalDetail setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
    }

    public RecipeEvalDetail setRuntimeMinutes(Integer runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
        return this;
    }
    public Integer getRuntimeMinutes() {
        return this.runtimeMinutes;
    }

}
