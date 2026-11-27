// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RecipeSummary extends TeaModel {
    /**
     * <p>The list of algorithm labels.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;grpo&quot;]</p>
     */
    @NameInMap("AlgorithmLabel")
    public java.util.List<String> algorithmLabel;

    /**
     * <p>The user ID of the creator. This field is used for auditing and Owner=mine filtering, and is not used as a basis for permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The recipe description.</p>
     * 
     * <strong>example:</strong>
     * <p>GRPO training recipe for Qwen2.5-7B-Instruct</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The creation time in UTC RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T07:00:00Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The modification time in UTC RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T09:30:00Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <p>The default recipe indicator for the model. The list can return both the default recipe for the current workspace and the public official default recipe. Job parsing prioritizes the default recipe of the current workspace and falls back to the public official default if no match is found. All read operations still require RAM authentication in the current workspace. Other records with empty workspaces are not exposed simply because they have the default indicator.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDefaultRecipe")
    public Boolean isDefaultRecipe;

    /**
     * <p>The name of the associated model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The recipe name.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-grpo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The owner type derived from the source. A value of preset maps to platform, and custom maps to user. A recipe is considered a public official preset only when Source is preset, OwnerType is platform, and the persistent WorkspaceId is empty. The presence of OwnerType or an empty workspace alone is not sufficient to expose the record.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The recipe ID. This field is always returned.</p>
     * 
     * <strong>example:</strong>
     * <p>recipe-20260908-qwen-grpo</p>
     */
    @NameInMap("RecipeId")
    public String recipeId;

    /**
     * <p>The list of recipe types. Valid values: train and eval. A value of [&quot;train&quot;] indicates training, [&quot;eval&quot;] indicates independent evaluation, and [&quot;train&quot;,&quot;eval&quot;] indicates both.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;train&quot;]</p>
     */
    @NameInMap("RecipeType")
    public java.util.List<String> recipeType;

    /**
     * <p>The source of the recipe. Valid values: preset (platform preset) and custom (user-created).</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The persistent workspace to which the recipe belongs. Returns the actual workspace ID for custom recipes and an empty string for public official preset recipes. A public official preset recipe must simultaneously meet the following conditions: Source is preset, OwnerType is platform, and WorkspaceId is empty. Other records with empty workspaces are not exposed. Access to official items requires the RAM permissions of the current request workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-20210126170216-mtl37ge7gkvdz</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RecipeSummary build(java.util.Map<String, ?> map) throws Exception {
        RecipeSummary self = new RecipeSummary();
        return TeaModel.build(map, self);
    }

    public RecipeSummary setAlgorithmLabel(java.util.List<String> algorithmLabel) {
        this.algorithmLabel = algorithmLabel;
        return this;
    }
    public java.util.List<String> getAlgorithmLabel() {
        return this.algorithmLabel;
    }

    public RecipeSummary setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public RecipeSummary setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RecipeSummary setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public RecipeSummary setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public RecipeSummary setIsDefaultRecipe(Boolean isDefaultRecipe) {
        this.isDefaultRecipe = isDefaultRecipe;
        return this;
    }
    public Boolean getIsDefaultRecipe() {
        return this.isDefaultRecipe;
    }

    public RecipeSummary setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public RecipeSummary setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RecipeSummary setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public RecipeSummary setRecipeId(String recipeId) {
        this.recipeId = recipeId;
        return this;
    }
    public String getRecipeId() {
        return this.recipeId;
    }

    public RecipeSummary setRecipeType(java.util.List<String> recipeType) {
        this.recipeType = recipeType;
        return this;
    }
    public java.util.List<String> getRecipeType() {
        return this.recipeType;
    }

    public RecipeSummary setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public RecipeSummary setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
