// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class UpdatePropagationRequest extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("teamHashId")
    public String teamHashId;

    @NameInMap("weiboUrls")
    public java.util.List<String> weiboUrls;

    public static UpdatePropagationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePropagationRequest self = new UpdatePropagationRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePropagationRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePropagationRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

    public UpdatePropagationRequest setWeiboUrls(java.util.List<String> weiboUrls) {
        this.weiboUrls = weiboUrls;
        return this;
    }
    public java.util.List<String> getWeiboUrls() {
        return this.weiboUrls;
    }

}
