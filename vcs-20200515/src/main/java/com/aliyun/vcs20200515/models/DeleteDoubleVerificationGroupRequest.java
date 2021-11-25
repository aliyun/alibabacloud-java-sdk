// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDoubleVerificationGroupRequest extends TeaModel {
    @NameInMap("DoubleVerificationGroupId")
    public String doubleVerificationGroupId;

    @NameInMap("Id")
    public String id;

    public static DeleteDoubleVerificationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDoubleVerificationGroupRequest self = new DeleteDoubleVerificationGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDoubleVerificationGroupRequest setDoubleVerificationGroupId(String doubleVerificationGroupId) {
        this.doubleVerificationGroupId = doubleVerificationGroupId;
        return this;
    }
    public String getDoubleVerificationGroupId() {
        return this.doubleVerificationGroupId;
    }

    public DeleteDoubleVerificationGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
