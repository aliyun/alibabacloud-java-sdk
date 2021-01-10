// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktRelatedlinkeiterationRequest extends TeaModel {
    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("LinkEIterationKey")
    public String linkEIterationKey;

    public static AddLinkeLinktRelatedlinkeiterationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktRelatedlinkeiterationRequest self = new AddLinkeLinktRelatedlinkeiterationRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktRelatedlinkeiterationRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public AddLinkeLinktRelatedlinkeiterationRequest setLinkEIterationKey(String linkEIterationKey) {
        this.linkEIterationKey = linkEIterationKey;
        return this;
    }
    public String getLinkEIterationKey() {
        return this.linkEIterationKey;
    }

}
