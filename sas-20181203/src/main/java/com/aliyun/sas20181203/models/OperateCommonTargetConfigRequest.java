// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateCommonTargetConfigRequest extends TeaModel {
    /**
     * <p>The target type of the image switch. Valid values:</p>
     * <ul>
     * <li><strong>repoName</strong>: repository name.</li>
     * <li><strong>repoNamespace</strong>: repository namespace name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>repoName</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The repository name or repository namespace name.</p>
     * 
     * <strong>example:</strong>
     * <p>cafcmc-dev</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>182.92.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The parameters for configuring proactive defense on servers. The following parameters are included:</p>
     * <ul>
     * <li><strong>targetType</strong>: the dimension of the defense configuration. Currently, only the UUID dimension is supported. Fixed value: <strong>uuid</strong>.</li>
     * <li><strong>target</strong>: the UUID of the server for which you want to configure proactive defense.</li>
     * <li><strong>flag</strong>: specifies whether to enable or disable proactive defense for the server. Valid values: <strong>add</strong> (enable) and <strong>del</strong> (disable).</li>
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
     * <p>The Asset Type of the target. Valid values:</p>
     * <ul>
     * <li><strong>uuid</strong>: server UUID.</li>
     * <li><strong>Cluster</strong>: cluster ID.</li>
     * <li><strong>image_repo</strong>: image repository name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The switch type. Valid values:</p>
     * <ul>
     * <li><strong>alidetect-scan-enable</strong>: local file detection that performs detection only locally.</li>
     * <li><strong>ACTION-TRIAL-PERMISSION</strong>: ActionTrail data delivery.</li>
     * <li><strong>alidetect</strong>: local file detection engine.</li>
     * <li><strong>container_prevent_escape</strong>: container escape prevention.</li>
     * <li><strong>image_repo</strong>: repository image scanning.</li>
     * <li><strong>proc_filter_switch</strong>: log filtering.</li>
     * <li><strong>agentless</strong>: agentless detection.</li>
     * <li><strong>rasp</strong>: application protection.</li>
     * <li><strong>sensitiveFile</strong>: sensitive information scanning.</li>
     * <li><strong>aliscriptengine</strong>: deep detection engine.</li>
     * <li><strong>containerNetwork</strong>: container visualization.</li>
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
