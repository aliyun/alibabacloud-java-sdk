// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreateprojectbranchRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("Id")
    public String id;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeCreateprojectbranchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreateprojectbranchRequest self = new CreateLinkeantcodeAntcodeCreateprojectbranchRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreateprojectbranchRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public CreateLinkeantcodeAntcodeCreateprojectbranchRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeCreateprojectbranchRequest setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public CreateLinkeantcodeAntcodeCreateprojectbranchRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
