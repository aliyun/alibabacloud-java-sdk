// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeleteChangeRequest extends TeaModel {
    @NameInMap("ChangeId")
    public String changeId;

    public static DeleteChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChangeRequest self = new DeleteChangeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChangeRequest setChangeId(String changeId) {
        this.changeId = changeId;
        return this;
    }
    public String getChangeId() {
        return this.changeId;
    }

}
