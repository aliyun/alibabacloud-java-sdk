// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("BusinessUserIdList")
    public String businessUserIdList;

    @NameInMap("GatherUserIdList")
    public String gatherUserIdList;

    @NameInMap("BuilderUserIdList")
    public String builderUserIdList;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

}
