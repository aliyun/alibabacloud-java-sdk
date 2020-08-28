// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackTemplateByResourcesRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TemplateFormat")
    public String templateFormat;

    @NameInMap("LogicalResourceId")
    public java.util.List<String> logicalResourceId;

    public static UpdateStackTemplateByResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackTemplateByResourcesRequest self = new UpdateStackTemplateByResourcesRequest();
        return TeaModel.build(map, self);
    }

}
