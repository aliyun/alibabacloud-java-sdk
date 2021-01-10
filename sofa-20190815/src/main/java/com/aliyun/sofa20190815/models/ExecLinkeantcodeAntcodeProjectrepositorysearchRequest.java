// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeProjectrepositorysearchRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Limit")
    public String limit;

    @NameInMap("Query")
    public String query;

    @NameInMap("RefName")
    public String refName;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeProjectrepositorysearchRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeProjectrepositorysearchRequest self = new ExecLinkeantcodeAntcodeProjectrepositorysearchRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeProjectrepositorysearchRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeProjectrepositorysearchRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ExecLinkeantcodeAntcodeProjectrepositorysearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ExecLinkeantcodeAntcodeProjectrepositorysearchRequest setRefName(String refName) {
        this.refName = refName;
        return this;
    }
    public String getRefName() {
        return this.refName;
    }

    public ExecLinkeantcodeAntcodeProjectrepositorysearchRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
