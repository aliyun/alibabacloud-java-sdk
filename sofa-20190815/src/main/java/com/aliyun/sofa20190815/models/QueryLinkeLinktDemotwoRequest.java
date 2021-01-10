// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktDemotwoRequest extends TeaModel {
    @NameInMap("DemoJsonStr")
    public String demoJsonStr;

    @NameInMap("Other")
    public String other;

    public static QueryLinkeLinktDemotwoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktDemotwoRequest self = new QueryLinkeLinktDemotwoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktDemotwoRequest setDemoJsonStr(String demoJsonStr) {
        this.demoJsonStr = demoJsonStr;
        return this;
    }
    public String getDemoJsonStr() {
        return this.demoJsonStr;
    }

    public QueryLinkeLinktDemotwoRequest setOther(String other) {
        this.other = other;
        return this;
    }
    public String getOther() {
        return this.other;
    }

}
