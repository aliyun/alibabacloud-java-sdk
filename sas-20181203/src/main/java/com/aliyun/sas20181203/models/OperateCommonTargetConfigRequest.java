// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateCommonTargetConfigRequest extends TeaModel {
    /**
     * <p>The type of the image. Valid values:</p>
     * <br>
     * <p>*   **repoName**: the name of the image repository</p>
     * <p>*   **repoNamespace**: the namespace of the image repository</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The name of the image repository or the namespace of the image repository.</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The configuration of proactive defense for your server. The value includes the following fields:</p>
     * <br>
     * <p>*   **targetType**: specifies the dimension from which you manage proactive defense. UUIDs are supported. Set the value to **uuid**.</p>
     * <p>*   **target**: specifies the UUID of the server for which you want to configure proactive defense.</p>
     * <p>*   **flag**: specifies whether to enable or disable proactive defense for your server. Valid values are **add** and **del**. The value add indicates that proactive defense will be enabled for your server. The value del indicates that proactive defense will be disabled for your server.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetOperations")
    public String targetOperations;

    /**
     * <p>The dimension based on which the asset is selected. Valid values:</p>
     * <br>
     * <p>*   **uuid**: the UUID of the server</p>
     * <p>*   **Cluster**: the ID of the cluster</p>
     * <p>*   **image_repo**: the name of the image repository</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <br>
     * <p>*   **alidetect-scan-enable**: local file detection</p>
     * <p>*   **ACTION-TRIAL-PERMISSION**: data delivery to ActionTrail</p>
     * <p>*   **alidetect**: local file detection engine</p>
     * <p>*   **container_prevent_escape**: container escape prevention</p>
     * <p>*   **image_repo**: repository image scan</p>
     * <p>*   **proc_filter_switch**: log filtering</p>
     * <p>*   **agentless**: agentless detection</p>
     * <p>*   **rasp**: application protection</p>
     * <p>*   **sensitiveFile**: sensitive file detection</p>
     * <p>*   **aliscriptengine**: in-depth detection engine</p>
     * <p>*   **containerNetwork**: container network visualization</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static OperateCommonTargetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateCommonTargetConfigRequest self = new OperateCommonTargetConfigRequest();
        return TeaModel.build(map, self);
    }

    public OperateCommonTargetConfigRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public OperateCommonTargetConfigRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public OperateCommonTargetConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public OperateCommonTargetConfigRequest setTargetOperations(String targetOperations) {
        this.targetOperations = targetOperations;
        return this;
    }
    public String getTargetOperations() {
        return this.targetOperations;
    }

    public OperateCommonTargetConfigRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public OperateCommonTargetConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
