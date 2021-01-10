// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSearchusersRequest extends TeaModel {
    @NameInMap("Query")
    public String query;

    public static ExecLinkeLinktSearchusersRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSearchusersRequest self = new ExecLinkeLinktSearchusersRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSearchusersRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
