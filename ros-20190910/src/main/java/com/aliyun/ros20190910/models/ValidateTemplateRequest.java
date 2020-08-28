// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ValidateTemplateRequest extends TeaModel {
    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateBody")
    public String templateBody;

    public static ValidateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateRequest self = new ValidateTemplateRequest();
        return TeaModel.build(map, self);
    }

}
