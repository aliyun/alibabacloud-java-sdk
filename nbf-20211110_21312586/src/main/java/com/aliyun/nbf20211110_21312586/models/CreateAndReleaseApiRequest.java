// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class CreateAndReleaseApiRequest extends TeaModel {
    @NameInMap("creatApiCmd")
    public String creatApiCmd;

    public static CreateAndReleaseApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndReleaseApiRequest self = new CreateAndReleaseApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndReleaseApiRequest setCreatApiCmd(String creatApiCmd) {
        this.creatApiCmd = creatApiCmd;
        return this;
    }
    public String getCreatApiCmd() {
        return this.creatApiCmd;
    }

}
