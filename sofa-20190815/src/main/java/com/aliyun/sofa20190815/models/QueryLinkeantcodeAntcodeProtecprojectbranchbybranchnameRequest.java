// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameRequest self = new QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
