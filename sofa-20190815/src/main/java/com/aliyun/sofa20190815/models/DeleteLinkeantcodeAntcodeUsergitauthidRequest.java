// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeUsergitauthidRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeUsergitauthidRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeUsergitauthidRequest self = new DeleteLinkeantcodeAntcodeUsergitauthidRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeUsergitauthidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeUsergitauthidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
