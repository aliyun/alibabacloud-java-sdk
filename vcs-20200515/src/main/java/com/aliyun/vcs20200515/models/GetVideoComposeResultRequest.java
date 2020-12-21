// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetVideoComposeResultRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("TaskRequestId")
    public String taskRequestId;

    public static GetVideoComposeResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoComposeResultRequest self = new GetVideoComposeResultRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoComposeResultRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetVideoComposeResultRequest setTaskRequestId(String taskRequestId) {
        this.taskRequestId = taskRequestId;
        return this;
    }
    public String getTaskRequestId() {
        return this.taskRequestId;
    }

}
