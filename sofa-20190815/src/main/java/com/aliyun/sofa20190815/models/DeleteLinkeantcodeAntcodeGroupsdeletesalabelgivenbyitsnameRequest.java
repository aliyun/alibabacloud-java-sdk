// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameRequest self = new DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
