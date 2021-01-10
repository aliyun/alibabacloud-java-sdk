// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest self = new DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
