// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProtectBranchId")
    public String protectBranchId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesRequest self = new QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesRequest setProtectBranchId(String protectBranchId) {
        this.protectBranchId = protectBranchId;
        return this;
    }
    public String getProtectBranchId() {
        return this.protectBranchId;
    }

    public QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
