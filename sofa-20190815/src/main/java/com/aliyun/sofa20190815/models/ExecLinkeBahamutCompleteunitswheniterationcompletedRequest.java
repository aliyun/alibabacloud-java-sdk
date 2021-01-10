// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutCompleteunitswheniterationcompletedRequest extends TeaModel {
    @NameInMap("ExternalIds")
    public String externalIds;

    public static ExecLinkeBahamutCompleteunitswheniterationcompletedRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutCompleteunitswheniterationcompletedRequest self = new ExecLinkeBahamutCompleteunitswheniterationcompletedRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutCompleteunitswheniterationcompletedRequest setExternalIds(String externalIds) {
        this.externalIds = externalIds;
        return this;
    }
    public String getExternalIds() {
        return this.externalIds;
    }

}
