// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSortScriptRequest extends TeaModel {
    /**
     * <p>脚本的作用范围</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>脚本名称</p>
     */
    @NameInMap("scriptName")
    public String scriptName;

    /**
     * <p>脚本的类型，目前只支持cava_script</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateSortScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSortScriptRequest self = new CreateSortScriptRequest();
        return TeaModel.build(map, self);
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
