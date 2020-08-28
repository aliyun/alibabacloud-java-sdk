// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("Description")
    public String description;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

}
