// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeTenantlabelsRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeTenantlabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeTenantlabelsRequest self = new DeleteLinkeantcodeAntcodeTenantlabelsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeTenantlabelsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLinkeantcodeAntcodeTenantlabelsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
