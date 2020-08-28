// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ChangeSetId")
    public String changeSetId;

    @NameInMap("TemplateId")
    public String templateId;

    public static GetTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRequest self = new GetTemplateRequest();
        return TeaModel.build(map, self);
    }

}
