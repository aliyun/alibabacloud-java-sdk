// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class CheckWhiteBoardHostRequest extends TeaModel {
    @NameInMap("DocKey")
    public String docKey;

    @NameInMap("OriginHost")
    public String originHost;

    public static CheckWhiteBoardHostRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckWhiteBoardHostRequest self = new CheckWhiteBoardHostRequest();
        return TeaModel.build(map, self);
    }

    public CheckWhiteBoardHostRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public CheckWhiteBoardHostRequest setOriginHost(String originHost) {
        this.originHost = originHost;
        return this;
    }
    public String getOriginHost() {
        return this.originHost;
    }

}
