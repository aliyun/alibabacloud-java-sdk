// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckInstanceResultRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the check item ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The list of check item IDs.</p>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of instance IDs of the affected assets under the check item.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The task source. Valid values:</p>
     * <ul>
     * <li><strong>YAO_CHI</strong>: ApsaraDB console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>YAO_CHI</p>
     */
    @NameInMap("TaskSource")
    public String taskSource;

    public static VerifyCheckInstanceResultRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckInstanceResultRequest self = new VerifyCheckInstanceResultRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCheckInstanceResultRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public VerifyCheckInstanceResultRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    public VerifyCheckInstanceResultRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public VerifyCheckInstanceResultRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public VerifyCheckInstanceResultRequest setTaskSource(String taskSource) {
        this.taskSource = taskSource;
        return this;
    }
    public String getTaskSource() {
        return this.taskSource;
    }

}
