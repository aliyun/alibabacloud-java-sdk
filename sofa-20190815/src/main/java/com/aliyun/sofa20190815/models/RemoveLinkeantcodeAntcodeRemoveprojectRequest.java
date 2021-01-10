// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeRemoveprojectRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static RemoveLinkeantcodeAntcodeRemoveprojectRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeRemoveprojectRequest self = new RemoveLinkeantcodeAntcodeRemoveprojectRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeRemoveprojectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RemoveLinkeantcodeAntcodeRemoveprojectRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
