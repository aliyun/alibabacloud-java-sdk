// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTemplateRequest extends TeaModel {
    /**
     * <p>The snapshot templates.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Indicates whether the template is the default one. Valid values:</p>
     * <br>
     * <p>*   **Default**: The template is the default one.</p>
     * <p>*   **NotDefault**: The template is not the default one.</p>
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
