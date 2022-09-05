// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class UpdateTaskWorkforceRequest extends TeaModel {
    @NameInMap("Workforce")
    public java.util.List<SimpleWorkforce> workforce;

    public static UpdateTaskWorkforceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskWorkforceRequest self = new UpdateTaskWorkforceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskWorkforceRequest setWorkforce(java.util.List<SimpleWorkforce> workforce) {
        this.workforce = workforce;
        return this;
    }
    public java.util.List<SimpleWorkforce> getWorkforce() {
        return this.workforce;
    }

}
