// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppquerybranchcommitRequest extends TeaModel {
    @NameInMap("CodeUrl")
    public String codeUrl;

    public static QueryLinkedeploycoreDeploycoreAppquerybranchcommitRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppquerybranchcommitRequest self = new QueryLinkedeploycoreDeploycoreAppquerybranchcommitRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchcommitRequest setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }
    public String getCodeUrl() {
        return this.codeUrl;
    }

}
