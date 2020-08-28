// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateCorpRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ParentCorpId")
    public String parentCorpId;

    @NameInMap("Description")
    public String description;

    public static UpdateCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCorpRequest self = new UpdateCorpRequest();
        return TeaModel.build(map, self);
    }

}
