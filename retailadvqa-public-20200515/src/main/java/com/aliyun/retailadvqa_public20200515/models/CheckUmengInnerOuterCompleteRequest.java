// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckUmengInnerOuterCompleteRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AudienceId")
    public String audienceId;

    @NameInMap("Status")
    public Long status;

    @NameInMap("Message")
    public String message;

    @NameInMap("TaskId")
    public String taskId;

    public static CheckUmengInnerOuterCompleteRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUmengInnerOuterCompleteRequest self = new CheckUmengInnerOuterCompleteRequest();
        return TeaModel.build(map, self);
    }

    public CheckUmengInnerOuterCompleteRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CheckUmengInnerOuterCompleteRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CheckUmengInnerOuterCompleteRequest setAudienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }
    public String getAudienceId() {
        return this.audienceId;
    }

    public CheckUmengInnerOuterCompleteRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CheckUmengInnerOuterCompleteRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckUmengInnerOuterCompleteRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
