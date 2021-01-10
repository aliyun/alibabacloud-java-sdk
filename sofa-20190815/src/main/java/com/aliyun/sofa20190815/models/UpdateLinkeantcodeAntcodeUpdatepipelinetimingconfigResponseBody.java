// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("Cron")
    public String cron;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Id")
    public String id;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Yml")
    public String yml;

    public static UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody self = new UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody setYml(String yml) {
        this.yml = yml;
        return this;
    }
    public String getYml() {
        return this.yml;
    }

}
