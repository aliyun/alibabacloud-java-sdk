// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("Description")
    public String description;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateName")
    @Validation(required = true)
    public String templateName;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

}
