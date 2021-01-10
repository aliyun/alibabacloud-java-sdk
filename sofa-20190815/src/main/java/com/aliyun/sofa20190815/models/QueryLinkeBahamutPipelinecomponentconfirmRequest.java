// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPipelinecomponentconfirmRequest extends TeaModel {
    @NameInMap("FormJsonStr")
    public String formJsonStr;

    @NameInMap("Id")
    public String id;

    public static QueryLinkeBahamutPipelinecomponentconfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPipelinecomponentconfirmRequest self = new QueryLinkeBahamutPipelinecomponentconfirmRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPipelinecomponentconfirmRequest setFormJsonStr(String formJsonStr) {
        this.formJsonStr = formJsonStr;
        return this;
    }
    public String getFormJsonStr() {
        return this.formJsonStr;
    }

    public QueryLinkeBahamutPipelinecomponentconfirmRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
