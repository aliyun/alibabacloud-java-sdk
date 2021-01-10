// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameRequest self = new QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
