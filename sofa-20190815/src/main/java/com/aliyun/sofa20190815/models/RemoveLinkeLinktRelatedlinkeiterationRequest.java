// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktRelatedlinkeiterationRequest extends TeaModel {
    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("LinkEIterationKey")
    public String linkEIterationKey;

    public static RemoveLinkeLinktRelatedlinkeiterationRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktRelatedlinkeiterationRequest self = new RemoveLinkeLinktRelatedlinkeiterationRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktRelatedlinkeiterationRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public RemoveLinkeLinktRelatedlinkeiterationRequest setLinkEIterationKey(String linkEIterationKey) {
        this.linkEIterationKey = linkEIterationKey;
        return this;
    }
    public String getLinkEIterationKey() {
        return this.linkEIterationKey;
    }

}
