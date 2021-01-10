// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaGrouphistoryRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    public static QueryLinkeLinkaGrouphistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaGrouphistoryRequest self = new QueryLinkeLinkaGrouphistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaGrouphistoryRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

}
