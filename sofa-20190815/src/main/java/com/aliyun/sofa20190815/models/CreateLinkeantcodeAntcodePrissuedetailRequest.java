// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodePrissuedetailRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("IssuesJsonStr")
    public String issuesJsonStr;

    @NameInMap("PrId")
    public String prId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodePrissuedetailRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodePrissuedetailRequest self = new CreateLinkeantcodeAntcodePrissuedetailRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodePrissuedetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodePrissuedetailRequest setIssuesJsonStr(String issuesJsonStr) {
        this.issuesJsonStr = issuesJsonStr;
        return this;
    }
    public String getIssuesJsonStr() {
        return this.issuesJsonStr;
    }

    public CreateLinkeantcodeAntcodePrissuedetailRequest setPrId(String prId) {
        this.prId = prId;
        return this;
    }
    public String getPrId() {
        return this.prId;
    }

    public CreateLinkeantcodeAntcodePrissuedetailRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
