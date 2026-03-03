// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppInfoContent extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1343424</p>
     */
    @NameInMap("title")
    public String title;

    public static NeuronAppInfoContent build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppInfoContent self = new NeuronAppInfoContent();
        return TeaModel.build(map, self);
    }

    public NeuronAppInfoContent setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public NeuronAppInfoContent setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
