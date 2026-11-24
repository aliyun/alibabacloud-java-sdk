// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAuditRequest extends TeaModel {
    /**
     * <p>The array of review content. A maximum of <strong>100</strong> audio or video review items are supported at a time. You must convert the array to a string and use it as the parameter value. For the specific parameter structure, see the <strong>AuditContent</strong> table below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;VideoId&quot;:&quot;93ab850b4f<em><strong><strong>b54b6e91d24d81d4&quot;,&quot;Status&quot;:&quot;Normal&quot;},{&quot;VideoId&quot;:&quot;f867fbfb58</strong></strong></em>8bbab65c4480ae1d&quot;,&quot;Status&quot;:&quot;Blocked&quot;,&quot;Reason&quot;:&quot;Pornographic video&quot;,&quot;Comment&quot;:&quot;Contains nudity&quot;}]</p>
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
