// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class HotNewsRecommendRequest extends TeaModel {
    @NameInMap("prompt")
    public String prompt;

    public static HotNewsRecommendRequest build(java.util.Map<String, ?> map) throws Exception {
        HotNewsRecommendRequest self = new HotNewsRecommendRequest();
        return TeaModel.build(map, self);
    }

    public HotNewsRecommendRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
