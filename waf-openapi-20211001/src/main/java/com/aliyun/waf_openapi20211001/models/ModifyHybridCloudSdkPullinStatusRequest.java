// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudSdkPullinStatusRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-7pp2le***01</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the SDK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b3dbc5153317c79d8ca9f9***ea</p>
     */
    @NameInMap("Mid")
    public String mid;

    /**
     * <p>The status of traffic redirection. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("PullinStatus")
    public String pullinStatus;

    public static ModifyHybridCloudSdkPullinStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudSdkPullinStatusRequest self = new ModifyHybridCloudSdkPullinStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudSdkPullinStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHybridCloudSdkPullinStatusRequest setMid(String mid) {
        this.mid = mid;
        return this;
    }
    public String getMid() {
        return this.mid;
    }

    public ModifyHybridCloudSdkPullinStatusRequest setPullinStatus(String pullinStatus) {
        this.pullinStatus = pullinStatus;
        return this;
    }
    public String getPullinStatus() {
        return this.pullinStatus;
    }

}
