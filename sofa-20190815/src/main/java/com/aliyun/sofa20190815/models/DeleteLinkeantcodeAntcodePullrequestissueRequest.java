// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodePullrequestissueRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PrId")
    public String prId;

    @NameInMap("PrIssueId")
    public String prIssueId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodePullrequestissueRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodePullrequestissueRequest self = new DeleteLinkeantcodeAntcodePullrequestissueRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodePullrequestissueRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodePullrequestissueRequest setPrId(String prId) {
        this.prId = prId;
        return this;
    }
    public String getPrId() {
        return this.prId;
    }

    public DeleteLinkeantcodeAntcodePullrequestissueRequest setPrIssueId(String prIssueId) {
        this.prIssueId = prIssueId;
        return this;
    }
    public String getPrIssueId() {
        return this.prIssueId;
    }

    public DeleteLinkeantcodeAntcodePullrequestissueRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
