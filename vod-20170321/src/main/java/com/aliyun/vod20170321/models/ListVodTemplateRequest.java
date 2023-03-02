// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the application. Set the value to **app-1000000**. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The type of the template. Set the value to **Snapshot**.</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static ListVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVodTemplateRequest self = new ListVodTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListVodTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListVodTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
