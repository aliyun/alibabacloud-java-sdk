// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronDraftRecordUpdateCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>app版本</p>
     */
    @NameInMap("name")
    public String name;

    public static NeuronDraftRecordUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        NeuronDraftRecordUpdateCmd self = new NeuronDraftRecordUpdateCmd();
        return TeaModel.build(map, self);
    }

    public NeuronDraftRecordUpdateCmd setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public NeuronDraftRecordUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public NeuronDraftRecordUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
