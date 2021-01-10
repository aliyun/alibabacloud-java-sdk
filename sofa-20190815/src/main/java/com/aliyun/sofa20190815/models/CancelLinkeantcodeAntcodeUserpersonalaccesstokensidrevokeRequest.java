// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeRequest self = new CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeRequest();
        return TeaModel.build(map, self);
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
