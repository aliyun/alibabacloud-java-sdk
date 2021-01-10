// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeBroadcastmessageRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeBroadcastmessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeBroadcastmessageRequest self = new DeleteLinkeantcodeAntcodeBroadcastmessageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeBroadcastmessageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeBroadcastmessageRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
