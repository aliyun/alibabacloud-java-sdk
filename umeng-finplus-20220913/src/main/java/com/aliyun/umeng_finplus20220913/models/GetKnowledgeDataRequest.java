// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetKnowledgeDataRequest extends TeaModel {
    @NameInMap("body")
    public GetKnowledgeDataRequestBody body;

    public static GetKnowledgeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeDataRequest self = new GetKnowledgeDataRequest();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeDataRequest setBody(GetKnowledgeDataRequestBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeDataRequestBody getBody() {
        return this.body;
    }

    public static class GetKnowledgeDataRequestBody extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("knowledgeIdList")
        public java.util.List<String> knowledgeIdList;

        public static GetKnowledgeDataRequestBody build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeDataRequestBody self = new GetKnowledgeDataRequestBody();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeDataRequestBody setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetKnowledgeDataRequestBody setKnowledgeIdList(java.util.List<String> knowledgeIdList) {
            this.knowledgeIdList = knowledgeIdList;
            return this;
        }
        public java.util.List<String> getKnowledgeIdList() {
            return this.knowledgeIdList;
        }

    }

}
