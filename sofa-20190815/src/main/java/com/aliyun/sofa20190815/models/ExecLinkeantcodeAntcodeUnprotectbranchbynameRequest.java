// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeUnprotectbranchbynameRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeUnprotectbranchbynameRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeUnprotectbranchbynameRequest self = new ExecLinkeantcodeAntcodeUnprotectbranchbynameRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeUnprotectbranchbynameRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public ExecLinkeantcodeAntcodeUnprotectbranchbynameRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeUnprotectbranchbynameRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
