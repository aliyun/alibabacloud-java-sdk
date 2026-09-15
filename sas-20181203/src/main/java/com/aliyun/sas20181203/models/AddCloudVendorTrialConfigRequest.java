// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCloudVendorTrialConfigRequest extends TeaModel {
    /**
     * <p>The unique ID of the AccessKey pair.</p>
     * <blockquote>
     * <h2>You can call <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> to obtain the AuthId.</h2>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2363</p>
     */
    @NameInMap("AuthId")
    public Long authId;

    /**
     * <p>The multi-cloud configuration information:</p>
     * <ul>
     * <li><em>AWS</em>: Input parameters sqsQueueName and sqsRegion.</li>
     * <li><em>Tencent</em>: Input parameters kafkaUserName, kafkaBootstrapServers, and kafkaTopic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;sqsRegion\&quot;:\&quot;us-west-2\&quot;,\&quot;sqsQueueName\&quot;:\&quot;****\&quot;}</p>
     */
    @NameInMap("AuthInfo")
    public String authInfo;

    /**
     * <p>The cloud asset vendor. Valid values:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Tencent Cloud.</li>
     * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud.</li>
     * <li><strong>Azure</strong>: Azure.</li>
     * <li><strong>AWS</strong>: AWS.</li>
     * <li><strong>VOLCENGINE</strong>: Volcengine.</li>
     * <li><strong>google</strong>: Google Cloud.</li>
     * <li><strong>CHAITIN</strong>: Chaitin Technology.</li>
     * <li><strong>FORTINET</strong>: Fortinet.</li>
     * <li><strong>THREATBOOK</strong>: ThreatBook.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static AddCloudVendorTrialConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCloudVendorTrialConfigRequest self = new AddCloudVendorTrialConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddCloudVendorTrialConfigRequest setAuthId(Long authId) {
        this.authId = authId;
        return this;
    }
    public Long getAuthId() {
        return this.authId;
    }

    public AddCloudVendorTrialConfigRequest setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

    public AddCloudVendorTrialConfigRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
