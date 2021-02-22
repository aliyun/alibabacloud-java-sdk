// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class GetMessageDetailRequest extends TeaModel {
    // 舆情文章Id
    @NameInMap("docId")
    public String docId;

    // 舆情团队HashId
    @NameInMap("teamHashId")
    public String teamHashId;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    public static GetMessageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageDetailRequest self = new GetMessageDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageDetailRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public GetMessageDetailRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

    public GetMessageDetailRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
