// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateSummaryRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("ChangeSetId")
    public String changeSetId;

    public static GetTemplateSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateSummaryRequest self = new GetTemplateSummaryRequest();
        return TeaModel.build(map, self);
    }

}
