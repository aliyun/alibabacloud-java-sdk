// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateCommonTargetConfigRequest extends TeaModel {
    /**
     * <p>The type of the image. Valid values:</p>
     * <ul>
     * <li><strong>repoName</strong>: the name of the image repository</li>
     * <li><strong>repoNamespace</strong>: the namespace of the image repository</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>repoName</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The name of the image repository or the namespace of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>cafcmc-dev</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>182.92.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The configuration of proactive defense for your server. The value includes the following fields:</p>
     * <ul>
     * <li><strong>targetType</strong>: specifies the dimension from which you manage proactive defense. UUIDs are supported. Set the value to <strong>uuid</strong>.</li>
     * <li><strong>target</strong>: specifies the UUID of the server for which you want to configure proactive defense.</li>
     * <li><strong>flag</strong>: specifies whether to enable or disable proactive defense for your server. Valid values are <strong>add</strong> and <strong>del</strong>. The value add indicates that proactive defense will be enabled for your server. The value del indicates that proactive defense will be disabled for your server.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;targetType&quot;: &quot;uuid&quot;,
     *             &quot;target&quot;: &quot;f329a044-6a2f-49a0-9d33-352f6c1d****&quot;,
     *             &quot;flag&quot;: &quot;del&quot;
     *       }
     * ]</p>
     */
    @NameInMap("TargetOperations")
    public String targetOperations;

    /**
     * <p>The dimension based on which the asset is selected. Valid values:</p>
     * <ul>
     * <li><strong>uuid</strong>: the UUID of the server</li>
     * <li><strong>Cluster</strong>: the ID of the cluster</li>
     * <li><strong>image_repo</strong>: the name of the image repository</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <ul>
     * <li><strong>alidetect-scan-enable</strong>: local file detection</li>
     * <li><strong>ACTION-TRIAL-PERMISSION</strong>: data delivery to ActionTrail</li>
     * <li><strong>alidetect</strong>: local file detection engine</li>
     * <li><strong>container_prevent_escape</strong>: container escape prevention</li>
     * <li><strong>image_repo</strong>: repository image scan</li>
     * <li><strong>proc_filter_switch</strong>: log filtering</li>
     * <li><strong>agentless</strong>: agentless detection</li>
     * <li><strong>rasp</strong>: application protection</li>
     * <li><strong>sensitiveFile</strong>: sensitive file detection</li>
     * <li><strong>aliscriptengine</strong>: in-depth detection engine</li>
     * <li><strong>containerNetwork</strong>: container network visualization</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alidetect</p>
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
