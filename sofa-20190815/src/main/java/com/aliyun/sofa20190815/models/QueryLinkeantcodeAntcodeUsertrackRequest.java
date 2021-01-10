// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeUsertrackRequest extends TeaModel {
    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("TrackJsonStr")
    public String trackJsonStr;

    public static QueryLinkeantcodeAntcodeUsertrackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeUsertrackRequest self = new QueryLinkeantcodeAntcodeUsertrackRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeUsertrackRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public QueryLinkeantcodeAntcodeUsertrackRequest setTrackJsonStr(String trackJsonStr) {
        this.trackJsonStr = trackJsonStr;
        return this;
    }
    public String getTrackJsonStr() {
        return this.trackJsonStr;
    }

}
