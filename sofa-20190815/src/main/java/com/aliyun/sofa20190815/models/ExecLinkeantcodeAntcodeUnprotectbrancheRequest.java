// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeUnprotectbrancheRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProtectBranchId")
    public String protectBranchId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeUnprotectbrancheRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeUnprotectbrancheRequest self = new ExecLinkeantcodeAntcodeUnprotectbrancheRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheRequest setProtectBranchId(String protectBranchId) {
        this.protectBranchId = protectBranchId;
        return this;
    }
    public String getProtectBranchId() {
        return this.protectBranchId;
    }

    public ExecLinkeantcodeAntcodeUnprotectbrancheRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
