// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeTenantrecoverytaskRequest extends TeaModel {
    @NameInMap("AntcodeTarget")
    public String antcodeTarget;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeTenantrecoverytaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeTenantrecoverytaskRequest self = new CreateLinkeantcodeAntcodeTenantrecoverytaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeTenantrecoverytaskRequest setAntcodeTarget(String antcodeTarget) {
        this.antcodeTarget = antcodeTarget;
        return this;
    }
    public String getAntcodeTarget() {
        return this.antcodeTarget;
    }

    public CreateLinkeantcodeAntcodeTenantrecoverytaskRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateLinkeantcodeAntcodeTenantrecoverytaskRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
