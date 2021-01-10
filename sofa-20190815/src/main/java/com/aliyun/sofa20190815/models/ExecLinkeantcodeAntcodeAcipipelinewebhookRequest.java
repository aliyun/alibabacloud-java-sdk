// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeAcipipelinewebhookRequest extends TeaModel {
    @NameInMap("BodyJsonStr")
    public String bodyJsonStr;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeAcipipelinewebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeAcipipelinewebhookRequest self = new ExecLinkeantcodeAntcodeAcipipelinewebhookRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeAcipipelinewebhookRequest setBodyJsonStr(String bodyJsonStr) {
        this.bodyJsonStr = bodyJsonStr;
        return this;
    }
    public String getBodyJsonStr() {
        return this.bodyJsonStr;
    }

    public ExecLinkeantcodeAntcodeAcipipelinewebhookRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeAcipipelinewebhookRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
