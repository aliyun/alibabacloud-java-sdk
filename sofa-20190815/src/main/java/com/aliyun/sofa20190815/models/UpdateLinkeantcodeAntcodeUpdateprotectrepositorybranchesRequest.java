// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ParamJsonStr")
    public String paramJsonStr;

    @NameInMap("ProtectBranchId")
    public String protectBranchId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesRequest self = new UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesRequest setParamJsonStr(String paramJsonStr) {
        this.paramJsonStr = paramJsonStr;
        return this;
    }
    public String getParamJsonStr() {
        return this.paramJsonStr;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesRequest setProtectBranchId(String protectBranchId) {
        this.protectBranchId = protectBranchId;
        return this;
    }
    public String getProtectBranchId() {
        return this.protectBranchId;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
