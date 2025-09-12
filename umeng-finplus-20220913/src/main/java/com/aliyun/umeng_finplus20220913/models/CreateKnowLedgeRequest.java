// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateKnowLedgeRequest extends TeaModel {
    @NameInMap("body")
    public CreateKnowLedgeRequestBody body;

    public static CreateKnowLedgeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowLedgeRequest self = new CreateKnowLedgeRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowLedgeRequest setBody(CreateKnowLedgeRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowLedgeRequestBody getBody() {
        return this.body;
    }

    public static class CreateKnowLedgeRequestBody extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("internalKnowledgeId")
        public String internalKnowledgeId;

        @NameInMap("knowledgeName")
        public String knowledgeName;

        public static CreateKnowLedgeRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowLedgeRequestBody self = new CreateKnowLedgeRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateKnowLedgeRequestBody setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateKnowLedgeRequestBody setInternalKnowledgeId(String internalKnowledgeId) {
            this.internalKnowledgeId = internalKnowledgeId;
            return this;
        }
        public String getInternalKnowledgeId() {
            return this.internalKnowledgeId;
        }

        public CreateKnowLedgeRequestBody setKnowledgeName(String knowledgeName) {
            this.knowledgeName = knowledgeName;
            return this;
        }
        public String getKnowledgeName() {
            return this.knowledgeName;
        }

    }

}
