// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotRequest extends TeaModel {
    @NameInMap("HoneypotId")
    public String honeypotId;

    public static DeleteHoneypotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotRequest self = new DeleteHoneypotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotRequest setHoneypotId(String honeypotId) {
        this.honeypotId = honeypotId;
        return this;
    }
    public String getHoneypotId() {
        return this.honeypotId;
    }

}
