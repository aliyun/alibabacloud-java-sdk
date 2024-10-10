// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetMailTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d5a59a898b634d75be5584f8dc159c62</p>
     */
    @NameInMap("MailId")
    public String mailId;

    /**
     * <strong>example:</strong>
     * <p>7218865303929605212</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static GetMailTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMailTaskStatusRequest self = new GetMailTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetMailTaskStatusRequest setMailId(String mailId) {
        this.mailId = mailId;
        return this;
    }
    public String getMailId() {
        return this.mailId;
    }

    public GetMailTaskStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
