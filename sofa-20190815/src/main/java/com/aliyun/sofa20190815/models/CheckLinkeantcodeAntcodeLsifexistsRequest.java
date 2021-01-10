// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeantcodeAntcodeLsifexistsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Sha")
    public String sha;

    public static CheckLinkeantcodeAntcodeLsifexistsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeantcodeAntcodeLsifexistsRequest self = new CheckLinkeantcodeAntcodeLsifexistsRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeantcodeAntcodeLsifexistsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CheckLinkeantcodeAntcodeLsifexistsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CheckLinkeantcodeAntcodeLsifexistsRequest setSha(String sha) {
        this.sha = sha;
        return this;
    }
    public String getSha() {
        return this.sha;
    }

}
