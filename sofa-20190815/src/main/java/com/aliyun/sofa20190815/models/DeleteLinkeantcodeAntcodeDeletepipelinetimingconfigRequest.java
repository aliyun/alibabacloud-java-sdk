// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigRequest extends TeaModel {
    @NameInMap("CronId")
    public String cronId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigRequest self = new DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigRequest setCronId(String cronId) {
        this.cronId = cronId;
        return this;
    }
    public String getCronId() {
        return this.cronId;
    }

    public DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
