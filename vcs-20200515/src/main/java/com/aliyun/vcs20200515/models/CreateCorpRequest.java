// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateCorpRequest extends TeaModel {
    @NameInMap("CorpName")
    @Validation(required = true)
    public String corpName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("ParentCorpId")
    public String parentCorpId;

    @NameInMap("Description")
    public String description;

    public static CreateCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCorpRequest self = new CreateCorpRequest();
        return TeaModel.build(map, self);
    }

}
