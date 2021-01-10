// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreatepipelinetimingconfigRequest extends TeaModel {
    @NameInMap("CronJsonStr")
    public String cronJsonStr;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeCreatepipelinetimingconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreatepipelinetimingconfigRequest self = new CreateLinkeantcodeAntcodeCreatepipelinetimingconfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreatepipelinetimingconfigRequest setCronJsonStr(String cronJsonStr) {
        this.cronJsonStr = cronJsonStr;
        return this;
    }
    public String getCronJsonStr() {
        return this.cronJsonStr;
    }

    public CreateLinkeantcodeAntcodeCreatepipelinetimingconfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeCreatepipelinetimingconfigRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
