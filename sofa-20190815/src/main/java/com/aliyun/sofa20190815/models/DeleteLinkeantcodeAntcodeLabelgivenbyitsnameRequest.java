// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeLabelgivenbyitsnameRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("IdOrName")
    public String idOrName;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeLabelgivenbyitsnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeLabelgivenbyitsnameRequest self = new DeleteLinkeantcodeAntcodeLabelgivenbyitsnameRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeLabelgivenbyitsnameRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeLabelgivenbyitsnameRequest setIdOrName(String idOrName) {
        this.idOrName = idOrName;
        return this;
    }
    public String getIdOrName() {
        return this.idOrName;
    }

    public DeleteLinkeantcodeAntcodeLabelgivenbyitsnameRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
