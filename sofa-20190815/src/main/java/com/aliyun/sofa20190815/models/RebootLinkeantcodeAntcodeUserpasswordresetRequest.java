// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RebootLinkeantcodeAntcodeUserpasswordresetRequest extends TeaModel {
    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static RebootLinkeantcodeAntcodeUserpasswordresetRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootLinkeantcodeAntcodeUserpasswordresetRequest self = new RebootLinkeantcodeAntcodeUserpasswordresetRequest();
        return TeaModel.build(map, self);
    }

    public RebootLinkeantcodeAntcodeUserpasswordresetRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
