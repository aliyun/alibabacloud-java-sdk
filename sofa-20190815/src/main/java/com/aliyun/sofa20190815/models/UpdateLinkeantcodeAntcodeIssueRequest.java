// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeIssueRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Site")
    public String site;

    @NameInMap("Type")
    public String type;

    public static UpdateLinkeantcodeAntcodeIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeIssueRequest self = new UpdateLinkeantcodeAntcodeIssueRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeIssueRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeIssueRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public UpdateLinkeantcodeAntcodeIssueRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeIssueRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public UpdateLinkeantcodeAntcodeIssueRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
