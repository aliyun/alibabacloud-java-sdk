// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewOnlineFeaturesResponseBody extends TeaModel {
    @NameInMap("OnlineFeatures")
    public java.util.List<String> onlineFeatures;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFeatureViewOnlineFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewOnlineFeaturesResponseBody self = new ListFeatureViewOnlineFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewOnlineFeaturesResponseBody setOnlineFeatures(java.util.List<String> onlineFeatures) {
        this.onlineFeatures = onlineFeatures;
        return this;
    }
    public java.util.List<String> getOnlineFeatures() {
        return this.onlineFeatures;
    }

    public ListFeatureViewOnlineFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
