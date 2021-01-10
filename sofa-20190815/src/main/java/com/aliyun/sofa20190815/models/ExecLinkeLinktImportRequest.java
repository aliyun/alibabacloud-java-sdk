// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktImportRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    public static ExecLinkeLinktImportRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktImportRequest self = new ExecLinkeLinktImportRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktImportRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
