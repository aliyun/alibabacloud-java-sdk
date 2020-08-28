// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetChangeSetRequest extends TeaModel {
    @NameInMap("ShowTemplate")
    public Boolean showTemplate;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ChangeSetId")
    @Validation(required = true)
    public String changeSetId;

    public static GetChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChangeSetRequest self = new GetChangeSetRequest();
        return TeaModel.build(map, self);
    }

}
