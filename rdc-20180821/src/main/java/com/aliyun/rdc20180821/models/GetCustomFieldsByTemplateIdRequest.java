// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetCustomFieldsByTemplateIdRequest extends TeaModel {
    @NameInMap("AKProjectId")
    public Integer AKProjectId;

    @NameInMap("TemplateId")
    public Integer templateId;

    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    public static GetCustomFieldsByTemplateIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomFieldsByTemplateIdRequest self = new GetCustomFieldsByTemplateIdRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomFieldsByTemplateIdRequest setAKProjectId(Integer AKProjectId) {
        this.AKProjectId = AKProjectId;
        return this;
    }
    public Integer getAKProjectId() {
        return this.AKProjectId;
    }

    public GetCustomFieldsByTemplateIdRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

    public GetCustomFieldsByTemplateIdRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

}
