// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCeasingaoneblocknetresultRequest extends TeaModel {
    @NameInMap("ReleaseId")
    public String releaseId;

    public static GetLinkeBahamutCeasingaoneblocknetresultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCeasingaoneblocknetresultRequest self = new GetLinkeBahamutCeasingaoneblocknetresultRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCeasingaoneblocknetresultRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
