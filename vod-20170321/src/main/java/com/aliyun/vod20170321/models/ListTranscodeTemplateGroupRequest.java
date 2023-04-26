// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTemplateGroupRequest extends TeaModel {
    /**
     * <p>The name of the template group.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeTemplateGroupRequest self = new ListTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListTranscodeTemplateGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
