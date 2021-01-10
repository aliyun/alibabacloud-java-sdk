// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigRequest extends TeaModel {
    @NameInMap("CronJsonStr")
    public String cronJsonStr;

    @NameInMap("CronId")
    public String cronId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigRequest self = new UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigRequest setCronJsonStr(String cronJsonStr) {
        this.cronJsonStr = cronJsonStr;
        return this;
    }
    public String getCronJsonStr() {
        return this.cronJsonStr;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigRequest setCronId(String cronId) {
        this.cronId = cronId;
        return this;
    }
    public String getCronId() {
        return this.cronId;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
