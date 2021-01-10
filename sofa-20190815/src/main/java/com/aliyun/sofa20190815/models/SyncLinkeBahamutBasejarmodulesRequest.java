// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutBasejarmodulesRequest extends TeaModel {
    @NameInMap("RepoName")
    public String repoName;

    public static SyncLinkeBahamutBasejarmodulesRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutBasejarmodulesRequest self = new SyncLinkeBahamutBasejarmodulesRequest();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutBasejarmodulesRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

}
