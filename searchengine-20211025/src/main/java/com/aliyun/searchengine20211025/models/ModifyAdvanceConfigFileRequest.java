// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyAdvanceConfigFileRequest extends TeaModel {
    /**
     * <p>The file content.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;ha3&quot;</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The variables.</p>
     */
    @NameInMap("variables")
    public java.util.Map<String, VariablesValue> variables;

    /**
     * <p>The name of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/qrs.json</p>
     */
    @NameInMap("fileName")
    public String fileName;

    public static ModifyAdvanceConfigFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvanceConfigFileRequest self = new ModifyAdvanceConfigFileRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAdvanceConfigFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ModifyAdvanceConfigFileRequest setVariables(java.util.Map<String, VariablesValue> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, VariablesValue> getVariables() {
        return this.variables;
    }

    public ModifyAdvanceConfigFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
