// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUserlimitsettingsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("LimitRateKbytesPerSec")
    public String limitRateKbytesPerSec;

    @NameInMap("LimitReqPerSec")
    public String limitReqPerSec;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static UpdateLinkeantcodeAntcodeUserlimitsettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUserlimitsettingsRequest self = new UpdateLinkeantcodeAntcodeUserlimitsettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsRequest setLimitRateKbytesPerSec(String limitRateKbytesPerSec) {
        this.limitRateKbytesPerSec = limitRateKbytesPerSec;
        return this;
    }
    public String getLimitRateKbytesPerSec() {
        return this.limitRateKbytesPerSec;
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsRequest setLimitReqPerSec(String limitReqPerSec) {
        this.limitReqPerSec = limitReqPerSec;
        return this;
    }
    public String getLimitReqPerSec() {
        return this.limitReqPerSec;
    }

    public UpdateLinkeantcodeAntcodeUserlimitsettingsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
