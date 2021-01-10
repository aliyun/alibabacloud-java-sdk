// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetallappsRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("CommitId")
    public String commitId;

    public static GetLinkeBahamutWebapigetallappsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetallappsRequest self = new GetLinkeBahamutWebapigetallappsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetallappsRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public GetLinkeBahamutWebapigetallappsRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

}
