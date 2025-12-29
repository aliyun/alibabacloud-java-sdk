// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSortScriptRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    /**
     * <p>The sort phase to which the script applies.</p>
     * 
     * <strong>example:</strong>
     * <p>second_rank</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The script name.</p>
     * 
     * <strong>example:</strong>
     * <p>rank_cava_20230606_v7</p>
     */
    @NameInMap("scriptName")
    public String scriptName;

    /**
     * <p>The script type. Set the value to cava_script.</p>
     * 
     * <strong>example:</strong>
     * <p>cava_script</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateSortScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSortScriptRequest self = new CreateSortScriptRequest();
        return TeaModel.build(map, self);
    }

    public CreateSortScriptRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSortScriptRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateSortScriptRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public CreateSortScriptRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
