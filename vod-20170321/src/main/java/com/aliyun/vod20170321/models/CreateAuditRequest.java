// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAuditRequest extends TeaModel {
    /**
     * <p>The array of the review content.</p>
     * <br>
     * <p>You can specify a maximum of **20** videos to be reviewed. The array must be converted into a string as the value of this parameter.</p>
     * <br>
     * <p>For more information about the parameters in AuditContent, see the **AuditContent** section of this topic.</p>
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
