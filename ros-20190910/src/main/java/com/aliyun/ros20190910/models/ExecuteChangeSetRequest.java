// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ExecuteChangeSetRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ChangeSetId")
    @Validation(required = true)
    public String changeSetId;

    public static ExecuteChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteChangeSetRequest self = new ExecuteChangeSetRequest();
        return TeaModel.build(map, self);
    }

}
