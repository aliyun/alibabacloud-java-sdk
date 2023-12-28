// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeletePublicPatchBaselineRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DeletePublicPatchBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicPatchBaselineRequest self = new DeletePublicPatchBaselineRequest();
        return TeaModel.build(map, self);
    }

    public DeletePublicPatchBaselineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
