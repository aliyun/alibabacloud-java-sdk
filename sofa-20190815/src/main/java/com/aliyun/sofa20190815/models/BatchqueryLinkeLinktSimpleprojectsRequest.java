// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryLinkeLinktSimpleprojectsRequest extends TeaModel {
    @NameInMap("Signs")
    public String signs;

    public static BatchqueryLinkeLinktSimpleprojectsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryLinkeLinktSimpleprojectsRequest self = new BatchqueryLinkeLinktSimpleprojectsRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryLinkeLinktSimpleprojectsRequest setSigns(String signs) {
        this.signs = signs;
        return this;
    }
    public String getSigns() {
        return this.signs;
    }

}
