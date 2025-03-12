// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCloudVendorTrialConfigRequest extends TeaModel {
    /**
     * <p>The ID of the audit log configuration to be modified.</p>
     * <blockquote>
     * <p>The ID can be queried via <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23**</p>
     */
    @NameInMap("AuthId")
    public Long authId;

    /**
     * <p>Enter the multi-cloud configuration information:</p>
     * <ul>
     * <li>AWS: parameters sqsQueueName, sqsRegion</li>
     * <li>Tencent: parameters kafkaUserName, kafkaBootstrapServers, kafkaTopic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;sqsRegion\&quot;:\&quot;us-west-2\&quot;,\&quot;sqsQueueName\&quot;:\&quot;****\&quot;}</p>
     */
    @NameInMap("AuthInfo")
    public String authInfo;

    /**
     * <p>Whether to delete this audit log configuration:</p>
     * <ul>
     * <li>true: Delete</li>
     * <li>false: Do not delete</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteTrail")
    public Boolean deleteTrail;

    /**
     * <p>Cloud asset vendor. Values:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Tencent Cloud</li>
     * <li><strong>AWS</strong>: AWS</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static ModifyCloudVendorTrialConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudVendorTrialConfigRequest self = new ModifyCloudVendorTrialConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudVendorTrialConfigRequest setAuthId(Long authId) {
        this.authId = authId;
        return this;
    }
    public Long getAuthId() {
        return this.authId;
    }

    public ModifyCloudVendorTrialConfigRequest setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

    public ModifyCloudVendorTrialConfigRequest setDeleteTrail(Boolean deleteTrail) {
        this.deleteTrail = deleteTrail;
        return this;
    }
    public Boolean getDeleteTrail() {
        return this.deleteTrail;
    }

    public ModifyCloudVendorTrialConfigRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
