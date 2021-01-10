// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationsupdateiterationpersonsRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationManager")
    public String iterationManager;

    @NameInMap("PrePubOwner")
    public String prePubOwner;

    @NameInMap("TestOwner")
    public String testOwner;

    public static QueryLinkeBahamutIterationsupdateiterationpersonsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationsupdateiterationpersonsRequest self = new QueryLinkeBahamutIterationsupdateiterationpersonsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationsupdateiterationpersonsRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public QueryLinkeBahamutIterationsupdateiterationpersonsRequest setIterationManager(String iterationManager) {
        this.iterationManager = iterationManager;
        return this;
    }
    public String getIterationManager() {
        return this.iterationManager;
    }

    public QueryLinkeBahamutIterationsupdateiterationpersonsRequest setPrePubOwner(String prePubOwner) {
        this.prePubOwner = prePubOwner;
        return this;
    }
    public String getPrePubOwner() {
        return this.prePubOwner;
    }

    public QueryLinkeBahamutIterationsupdateiterationpersonsRequest setTestOwner(String testOwner) {
        this.testOwner = testOwner;
        return this;
    }
    public String getTestOwner() {
        return this.testOwner;
    }

}
