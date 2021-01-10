// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodePullrequestissueRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Issue")
    public String issue;

    @NameInMap("PrId")
    public String prId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodePullrequestissueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodePullrequestissueRequest self = new CreateLinkeantcodeAntcodePullrequestissueRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodePullrequestissueRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodePullrequestissueRequest setIssue(String issue) {
        this.issue = issue;
        return this;
    }
    public String getIssue() {
        return this.issue;
    }

    public CreateLinkeantcodeAntcodePullrequestissueRequest setPrId(String prId) {
        this.prId = prId;
        return this;
    }
    public String getPrId() {
        return this.prId;
    }

    public CreateLinkeantcodeAntcodePullrequestissueRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
