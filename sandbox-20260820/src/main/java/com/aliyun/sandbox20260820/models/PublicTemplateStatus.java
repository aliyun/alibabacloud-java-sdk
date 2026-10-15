// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplateStatus extends TeaModel {
    /**
     * <p>The time when the template reached the current desired state, in UTC and RFC 3339 format. This parameter is empty when the template is still being built or updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-20T08:35:12Z</p>
     */
    @NameInMap("finishedAt")
    public String finishedAt;

    /**
     * <p>The reason why the template entered a failure state. This parameter is returned only when state is error or updateFailed.</p>
     */
    @NameInMap("reason")
    public PublicTemplateStatusReason reason;

    /**
     * <p>The template status. Valid values:</p>
     * <ul>
     * <li>building: The template is being built.</li>
     * <li>ready: The template is active.</li>
     * <li>updating: The template is being updated.</li>
     * <li>updateFailed: The template failed to be updated.</li>
     * <li>error: The template failed to be built.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ready</p>
     */
    @NameInMap("state")
    public String state;

    public static PublicTemplateStatus build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateStatus self = new PublicTemplateStatus();
        return TeaModel.build(map, self);
    }

    public PublicTemplateStatus setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public PublicTemplateStatus setReason(PublicTemplateStatusReason reason) {
        this.reason = reason;
        return this;
    }
    public PublicTemplateStatusReason getReason() {
        return this.reason;
    }

    public PublicTemplateStatus setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
