// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ManualRunMailTaskRequest extends TeaModel {
    /**
     * <p>The ID of the email task in the subscription management interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3423423sdfa****sdadw</p>
     */
    @NameInMap("MailId")
    public String mailId;

    public static ManualRunMailTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ManualRunMailTaskRequest self = new ManualRunMailTaskRequest();
        return TeaModel.build(map, self);
    }

    public ManualRunMailTaskRequest setMailId(String mailId) {
        this.mailId = mailId;
        return this;
    }
    public String getMailId() {
        return this.mailId;
    }

}
