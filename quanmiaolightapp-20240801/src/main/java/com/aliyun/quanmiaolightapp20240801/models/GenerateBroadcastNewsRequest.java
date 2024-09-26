// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GenerateBroadcastNewsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("prompt")
    public String prompt;

    public static GenerateBroadcastNewsRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateBroadcastNewsRequest self = new GenerateBroadcastNewsRequest();
        return TeaModel.build(map, self);
    }

    public GenerateBroadcastNewsRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
