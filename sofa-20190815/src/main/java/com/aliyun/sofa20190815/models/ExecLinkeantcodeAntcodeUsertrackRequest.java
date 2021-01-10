// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeUsertrackRequest extends TeaModel {
    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("TrackJsonStr")
    public String trackJsonStr;

    public static ExecLinkeantcodeAntcodeUsertrackRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeUsertrackRequest self = new ExecLinkeantcodeAntcodeUsertrackRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeUsertrackRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public ExecLinkeantcodeAntcodeUsertrackRequest setTrackJsonStr(String trackJsonStr) {
        this.trackJsonStr = trackJsonStr;
        return this;
    }
    public String getTrackJsonStr() {
        return this.trackJsonStr;
    }

}
