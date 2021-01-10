// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktKanbancolumninfoRequest extends TeaModel {
    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Stamp")
    public String stamp;

    public static QueryLinkeLinktKanbancolumninfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktKanbancolumninfoRequest self = new QueryLinkeLinktKanbancolumninfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktKanbancolumninfoRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public QueryLinkeLinktKanbancolumninfoRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public QueryLinkeLinktKanbancolumninfoRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

}
