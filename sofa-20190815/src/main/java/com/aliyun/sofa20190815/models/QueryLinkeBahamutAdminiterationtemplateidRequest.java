// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAdminiterationtemplateidRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static QueryLinkeBahamutAdminiterationtemplateidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAdminiterationtemplateidRequest self = new QueryLinkeBahamutAdminiterationtemplateidRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAdminiterationtemplateidRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
