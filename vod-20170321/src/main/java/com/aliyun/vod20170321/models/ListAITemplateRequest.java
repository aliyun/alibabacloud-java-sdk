// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAITemplateRequest extends TeaModel {
    /**
     * <p>Indicates whether the template is the default AI template. Valid values:</p>
     * <br>
     * <p>*   **Default**</p>
     * <p>*   **NotDefault**</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static ListAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAITemplateRequest self = new ListAITemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListAITemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
