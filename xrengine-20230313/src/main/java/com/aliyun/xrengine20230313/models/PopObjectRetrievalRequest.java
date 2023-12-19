// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopObjectRetrievalRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("TopK")
    public Integer topK;

    public static PopObjectRetrievalRequest build(java.util.Map<String, ?> map) throws Exception {
        PopObjectRetrievalRequest self = new PopObjectRetrievalRequest();
        return TeaModel.build(map, self);
    }

    public PopObjectRetrievalRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PopObjectRetrievalRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopObjectRetrievalRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public PopObjectRetrievalRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

}
