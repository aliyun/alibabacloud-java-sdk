// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameRequest self = new QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
