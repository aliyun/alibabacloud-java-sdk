// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteFileProtectRuleRequest extends TeaModel {
    @NameInMap("Id")
    public java.util.List<Long> id;

    public static DeleteFileProtectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileProtectRuleRequest self = new DeleteFileProtectRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFileProtectRuleRequest setId(java.util.List<Long> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Long> getId() {
        return this.id;
    }

}
