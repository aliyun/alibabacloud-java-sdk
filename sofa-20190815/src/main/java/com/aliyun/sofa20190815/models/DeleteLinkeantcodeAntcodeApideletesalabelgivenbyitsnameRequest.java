// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("IdOrName")
    public String idOrName;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameRequest self = new DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameRequest setIdOrName(String idOrName) {
        this.idOrName = idOrName;
        return this;
    }
    public String getIdOrName() {
        return this.idOrName;
    }

    public DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
