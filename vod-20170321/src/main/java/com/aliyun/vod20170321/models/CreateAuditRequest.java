// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAuditRequest extends TeaModel {
    /**
     * <p>The review content. You can specify up to **100** audio or video files in a request. The value must be converted to a string.\</p>
     * <p>For more information about this parameter, see the **AuditContent** section of this topic.</p>
     */
    @NameInMap("AuditContent")
    public String auditContent;

    public static CreateAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuditRequest self = new CreateAuditRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuditRequest setAuditContent(String auditContent) {
        this.auditContent = auditContent;
        return this;
    }
    public String getAuditContent() {
        return this.auditContent;
    }

}
