// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSearchtagRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("ProjectSign")
    public String projectSign;

    public static ExecLinkeLinktSearchtagRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSearchtagRequest self = new ExecLinkeLinktSearchtagRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSearchtagRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ExecLinkeLinktSearchtagRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
