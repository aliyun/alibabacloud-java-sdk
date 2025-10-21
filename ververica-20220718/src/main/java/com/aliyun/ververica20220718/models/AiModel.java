// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class AiModel extends TeaModel {
    @NameInMap("comment")
    public String comment;

    @NameInMap("inputSchema")
    public Schema inputSchema;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("options")
    public java.util.Map<String, String> options;

    @NameInMap("outputSchema")
    public Schema outputSchema;

    public static AiModel build(java.util.Map<String, ?> map) throws Exception {
        AiModel self = new AiModel();
        return TeaModel.build(map, self);
    }

    public AiModel setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AiModel setInputSchema(Schema inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }
    public Schema getInputSchema() {
        return this.inputSchema;
    }

    public AiModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AiModel setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public AiModel setOutputSchema(Schema outputSchema) {
        this.outputSchema = outputSchema;
        return this;
    }
    public Schema getOutputSchema() {
        return this.outputSchema;
    }

}
